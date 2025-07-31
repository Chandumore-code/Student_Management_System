package com.example.main.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String quali;
	@Column
	private String address;
	@Column
	private String phno;
	public Student(int id, String name, String email, String quali, String address, String phno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.quali = quali;
		this.address = address;
		this.phno = phno;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQuali() {
		return quali;
	}
	public void setQuali(String quali) {
		this.quali = quali;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", quali=" + quali + ", address=" + address
				+ ", phno=" + phno + "]";
	}
	
	
	
	
	
		

}

