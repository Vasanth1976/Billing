package com.billingmodule.dao;

import org.springframework.data.repository.CrudRepository;

import com.billingmodule.model.Bill;

public interface BillingRepository extends CrudRepository<Bill, Integer> {
	
	public Bill findByBillNumber(int id);
}
