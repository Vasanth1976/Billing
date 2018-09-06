package com.billingmodule.dao;

import org.springframework.data.repository.CrudRepository;

import com.billingmodule.model.Items;


public interface ItemRepository extends CrudRepository<Items, Integer>{
	public int findById(int itemId);
	public String findByName(String name);	
}
