package com.sixdee.hibernteApplication.service.impl;


import org.springframework.stereotype.Service;

import com.sixdee.hibernteApplication.entity.Customer;
import com.sixdee.hibernteApplication.repository.CustomerRepository;
import com.sixdee.hibernteApplication.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{

	private CustomerRepository repo;

	public CustomerServiceImpl(CustomerRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Customer saveCustomer(Customer cust) {
		return repo.save(cust);
	}

	
	@Override
	public Customer addMoney(int customerId, int balance) {
		Customer cust = repo.findById(customerId).orElseThrow(null);
		int newbal = cust.getBalance()+balance;
		cust.setBalance(newbal);
		repo.save(cust);
		return cust;
	}

	@Override
	public Customer withDrawMoney(int balance, int customerId) {
		Customer cust = repo.findById(customerId).orElseThrow(null);
		int newbal = cust.getBalance()-balance;
		cust.setBalance(newbal);
		repo.save(cust);
		return cust;
	}

	@Override
	public void deleteAccount(int customerId) {
		repo.findById(customerId).orElseThrow(null);
		repo.deleteById(customerId);
	}

	@Override
	public Customer getCustomerById(int customerId ) {
		return repo.findById(customerId).orElseThrow(null);
	}


}
