package com.example.main.dao;




import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.entity.Student;

public interface StudentRepo extends JpaRepository<Student , Integer>{

	
	Student findById(int id); 
}
