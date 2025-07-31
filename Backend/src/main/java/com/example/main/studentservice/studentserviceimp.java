package com.example.main.studentservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.main.dao.StudentRepo;
import com.example.main.entity.Student;

@Service
public class studentserviceimp  implements studentservice{

	@Autowired
	private StudentRepo studentRepo;
	@Override
	public List<Student> getalldata() {
		
		return studentRepo.findAll();
	}
	@Override
	public Student savedata(Student student) {
		
		return studentRepo.save(student) ;
	}
	@Override
	public void deletestudent(int id) {
		
	  studentRepo.deleteById((int) id);
		
	}
	
	

	@Override
	public Student updateStudent(Student std, int id) {
		 Student existStudent = studentRepo.findById(id);
		    
		    if (existStudent != null) {
		        existStudent.setName(std.getName());
		        existStudent.setAddress(std.getAddress());
		        existStudent.setEmail(std.getEmail());
		        existStudent.setPhno(std.getPhno());
		        existStudent.setQuali(std.getQuali());
		        return studentRepo.save(existStudent);
		    }
		return null;
	}
	
	
	@Override
	public  Student  getalldataid(int id) {
	    return  studentRepo.findById(id);
	}

	
	

}
