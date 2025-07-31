package com.example.main.studentservice;

import java.util.List;
import java.util.Optional;

import com.example.main.entity.Student;

public interface studentservice {

	public List<Student> getalldata();
	
	public Student getalldataid(int id);

    public Student savedata(Student student);
     void deletestudent(int  id);
     public Student updateStudent(Student std, int id);

   
}
