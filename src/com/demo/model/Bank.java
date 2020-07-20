package com.demo.model;

import java.util.List;

public class Bank{
	
	private Long id;
	private String Name;
	private List<Customer> customerList;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", Name=" + Name + ", customerList=" + customerList + "]";
	}

}