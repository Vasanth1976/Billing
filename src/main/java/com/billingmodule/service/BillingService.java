package com.billingmodule.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billingmodule.dao.BillingRepository;
import com.billingmodule.dao.ItemRepository;
import com.billingmodule.model.Bill;
import com.billingmodule.model.BillDetails;
import com.billingmodule.model.Items;

@Service
public class BillingService {
	Logger logger=LoggerFactory.getLogger(getClass());
	
	@Autowired
	ItemRepository itemRepository;
	@Autowired
	BillingRepository billingRepository;
	
	
	public List<Items> getItems() {
		List<Items> items=new ArrayList<>();
		itemRepository.findAll().forEach(items::add);
		return items;
	}
	
	
	
	public void deleteBill(int id) {
		billingRepository.deleteById(id);
	}
	
	public void setBill(Bill bill) {
		billingRepository.save(bill);
	}
	
	public Bill getBill(int id) {
		return billingRepository.findByBillNumber(id);
	}
	
	public List<Bill> getBills() {
		List<Bill> bills=new ArrayList<>();
		billingRepository.findAll().forEach(bills::add);
		
		return bills;
	}

}
 