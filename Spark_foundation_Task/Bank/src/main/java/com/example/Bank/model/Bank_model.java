package com.example.Bank.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Bank_model {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String account;
	private String staffs;
	
	public Bank_model() {
		
	}
	
	public Bank_model(int id, String name, String account, String staffs) {
		this.id=id;
		this.name=name;
		this.account=account;
		this.staffs=staffs;
	}

	public int getId() {
		return this.id;
	}
	
	public String getname() {
		return this.name;
	}
	
	public String getaccount() {
		return this.account;
	}
	
	public String getstaffs() {
		return this.staffs;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public void setaccount(String account) {
		this.account=account;
	}
	
	public void setstaffs(String staffs) {
		this.staffs=staffs;
	}
}

