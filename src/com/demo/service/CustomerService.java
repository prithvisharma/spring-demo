package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Customer;
import com.demo.model.Subscription;

public class CustomerService {
	
	private List<Customer> list;
	
	private void populate() {			//creating customers and their list 
		list = new ArrayList<>();
		Customer c1 = new Customer(1,"Disha","Goregaon");
		Customer c2 = new Customer(2,"Prithvi","Naigaon");
		Customer c3 = new Customer(3,"Ananya","Germany");
		
		//adding plan for customer
		Subscription subscription = new Subscription();
		subscription.setId(1L);
		subscription.setPlan("Basic");
		//set subscription for each customer
		c1.setSubscription(subscription);
		c2.setSubscription(subscription);
		c3.setSubscription(subscription);
		//adding customers to list
		list.add(c1);
		list.add(c2);
		list.add(c3);
	}

	public List<Customer> fetchCustomers() {
		populate();		//calling create the list send to controller
		return this.list;
	}
	
}
