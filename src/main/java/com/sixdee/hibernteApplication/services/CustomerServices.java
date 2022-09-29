package com.sixdee.hibernteApplication.services;



import com.sixdee.hibernteApplication.entity.Customer;

public interface CustomerServices {
	Customer saveCustomer(Customer cust);//Account
	Customer addMoney(int balance,int customerId);
	Customer withDrawMoney(int balance,int customerId);
	void deleteAccount(int customerId);
}
