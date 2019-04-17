package com.example.Grocery_shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Grocery_shop_model {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String items;
	private String type;
	private String staffs;
	
	public Grocery_shop_model() {
		
	}
	
	public Grocery_shop_model(int id, String items, String type, String staffs) {
		this.id=id;
		this.items=items;
		this.type=type;
		this.staffs=staffs;
	}

	public int getId() {
		return this.id;
	}
	
	public String getitems() {
		return this.items;
	}
	
	public String gettype() {
		return this.type;
	}
	
	public String getstaffs() {
		return this.staffs;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setitems(String items) {
		this.items=items;
	}
	
	public void settype(String type) {
		this.type=type;
	}
	
	public void setstaffs(String staffs) {
		this.staffs=staffs;
	}
}


