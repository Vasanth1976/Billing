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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;




@Entity
public class Bill {
	
	@Id
	@Column(name="billNumber")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billNumber;
	@Column(name="billDate")
	private Date billDate;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true,mappedBy="bill")
	private List<BillDetails> billDetails=new ArrayList<BillDetails>();
	@Column(name="billAmount")
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
		
		for(BillDetails billDetail:billDetails) {
			System.out.println("Item Name:"+billDetail.getItemName());
			System.out.println("Item Price:"+billDetail.getPrice());
			System.out.println("Item Quantity:"+billDetail.getQuantity());
					
		}
		this.billDetails=billDetails;
		for(BillDetails billDetail:this.billDetails) {
			System.out.println("Item Name:"+billDetail.getItemName());
			System.out.println("Item Price:"+billDetail.getPrice());
			System.out.println("Item Quantity:"+billDetail.getQuantity());
					
		}
		
		
		
	
	}
	
	
	
	

}
