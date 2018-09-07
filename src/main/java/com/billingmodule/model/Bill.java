package com.billingmodule.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
public class Bill {
	
	@Id
	@Column(name="bill_number")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billNumber;
	@Column(name="bill_date")
	private Date billDate;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true,mappedBy="bill")
	private List<BillDetails> billDetails;
	@Column(name="bill_amount")
	private float billAmount;
	
	
	
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public float getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}
	public List<BillDetails> getBillDetails() {
		return billDetails;
	}
	public void setBillDetails(List<BillDetails> billDetails) {
		
		
		this.billDetails=billDetails;
		//Setting the foreign key...
		for(BillDetails billDetail:this.billDetails) {
			billDetail.setBill(this);
					
		}
		
		
		
	
	}
	
	
	
	

}
