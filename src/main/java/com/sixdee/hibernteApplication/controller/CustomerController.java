package com.sixdee.hibernteApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.hibernteApplication.entity.Customer;
import com.sixdee.hibernteApplication.repository.CustomerRepository;
import com.sixdee.hibernteApplication.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private  CustomerRepository repo;
	private CustomerService css;

	public CustomerController(CustomerService css) {
		super();
		this.css = css;
	}
	
	@PostMapping("/addCustomer")
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer cust){
		System.out.println("Account created..........");
		return new ResponseEntity<Customer>(css.saveCustomer(cust),HttpStatus.CREATED);
	}
	
	@PutMapping("/{customerId}/{balance}")
	public ResponseEntity<Customer> addMoney(@PathVariable("customerId") int customerId,@PathVariable("balance") int balance){
		System.out.println("Money added......");
		return new ResponseEntity<Customer>(css.addMoney(customerId, balance), HttpStatus.OK);
	}
	@PutMapping("/withdrawMoney/{customerId}/{balance}")
	public ResponseEntity<Customer> withDrawMoney(@PathVariable("customerId") int customerId,@PathVariable("balance") int balance){
		System.out.println("Money wuthDraw successfully......");
		return new ResponseEntity<Customer>(css.withDrawMoney(balance, customerId), HttpStatus.OK);
	}
		
	@DeleteMapping("{customerId}")
	public ResponseEntity<Customer> deleteAccount(@PathVariable("customerId") int customerId){
		css.deleteAccount(customerId);
		System.out.println("Account Deleted");
		return new ResponseEntity<Customer>(HttpStatus.OK);
	}
	@GetMapping("/getCustomerById/{customerId}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") int customerId){
		System.out.println("Customer found by id");
		return new ResponseEntity<Customer>(css.getCustomerById(customerId), HttpStatus.OK);
	}
    @GetMapping(value = "/pagination/{customerId}")
    Page pagination(Pageable pageable,@PathVariable() int customerId) {
    	return repo.findAll(pageable);
	  } 

}