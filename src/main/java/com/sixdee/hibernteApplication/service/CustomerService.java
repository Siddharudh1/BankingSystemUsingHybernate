package com.sixdee.hibernteApplication.service;



import com.sixdee.hibernteApplication.entity.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer cust);//Account
	Customer addMoney(int balance,int customerId);
	Customer withDrawMoney(int balance,int customerId);
	void deleteAccount(int customerId);
	
	Customer getCustomerById(int customerId);

}
