package com.example.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.main.entity.Student;
import com.example.main.studentservice.studentservice;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/api/students") 
public class mycontroller {

    @Autowired
    private studentservice stdservice;

    
    @GetMapping
    public List<Student> getAllStudents() {
        return stdservice.getalldata();
    }

    
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return stdservice.savedata(student);
    }
    
    @DeleteMapping("/{id}")
    public void deletestudentdata(@PathVariable int id) {
    	stdservice.deletestudent(id);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudentData(@PathVariable int id, @RequestBody Student std) {
        Student updatedStudent = stdservice.updateStudent(std, id);
        if (updatedStudent != null) {
            return ResponseEntity.ok(updatedStudent);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public  Student getStudentById(@PathVariable int id) {
        return   stdservice.getalldataid(id);
        
    }


}
