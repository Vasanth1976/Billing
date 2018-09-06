package com.billingmodule.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {
	@Id	
	private int id;
	private String name;
	private float price;
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(int itemId, String name, float price) {
		super();
		this.id= itemId;
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	

}
