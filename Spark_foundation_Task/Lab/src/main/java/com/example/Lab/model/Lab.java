package com.example.Lab.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lab {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String subject;
	private String teacher;
	
	public Lab() {
		
	}
	
	public Lab(int id, String name, String subject, String teacher) {
		this.id=id;
		this.name=name;
		this.subject=subject;
		this.teacher=teacher;
	}

	public int getId() {
		return this.id;
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getsubject() {
		return this.subject;
	}
	
	public String getteacher() {
		return this.teacher;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public void setsubject(String subject) {
		this.subject=subject;
	}
	
	public void setteacher(String teacher) {
		this.teacher=teacher;
	}
}


