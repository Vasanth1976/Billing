package com.billingmodule.model;
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
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REFRESH},mappedBy="bill")
	private List<BillDetails> billDetails;
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
		this.billDetails = billDetails;
		
	
	}
	
	
	
	

}
