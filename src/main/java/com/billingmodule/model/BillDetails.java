package com.billingmodule.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class BillDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="item_number")
	private int itemNumber;	
	@Column(name="item_name")
	private String itemName;
	@Column(name="item_quantity")
	private int quantity;
	@Column(name="item_price")
	private float price;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(foreignKey=@ForeignKey(name="bill_bill_number"),nullable=false)
	private Bill bill;
	
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
		return null;
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
