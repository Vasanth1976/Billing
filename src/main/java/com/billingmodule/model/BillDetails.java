package com.billingmodule.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class BillDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemNumber;	
	private String itemName;
	private int quantity;
	private float price;
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(foreignKey=@ForeignKey(name="billNumber"),insertable=false, updatable=false)
	private Bill bill;
	
	
	public BillDetails() {
		
		super();
		System.out.println("In default constructor");
		this.itemName = "Hi";
		this.quantity = 50;
		this.price = 650;
	}
	
	
	
	
	public BillDetails(String itemName, int quantity, float price) {
		
		super();
		System.out.println("In Parameterised constructor");
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
