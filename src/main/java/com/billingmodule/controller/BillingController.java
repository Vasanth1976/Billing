package com.billingmodule.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.billingmodule.model.Bill;
import com.billingmodule.model.Items;
import com.billingmodule.service.BillingService;

@RestController
public class BillingController {
	@Autowired
	BillingService billingService;
	Logger logger=LoggerFactory.getLogger(getClass());	

	@RequestMapping(value="/bill",method=RequestMethod.POST)
	public void setBill(@RequestBody Bill bill) {

		billingService.setBill(bill);

	}
	
	@RequestMapping(value="/bill/{id}",method=RequestMethod.GET)
	public Bill getBill(@PathVariable("id") int id) {
		
		Bill bill=billingService.getBill(id);
		
				
		return bill;
		

	}

	@RequestMapping(value="/bills",method=RequestMethod.GET)
	public List<Bill> getBills() {
		List<Bill> bills;

		bills=billingService.getBills();

		return bills;

	}
	
	@RequestMapping(value="/bill/{id}",method=RequestMethod.DELETE)
	public void deleteBill(@PathVariable("id") int id) {

		billingService.deleteBill(id);

	}



	@RequestMapping(value="/items",method=RequestMethod.GET)
	public List<Items> getItems() {
		List<Items> items =null;
		items=billingService.getItems();

		return items;

	}




}
