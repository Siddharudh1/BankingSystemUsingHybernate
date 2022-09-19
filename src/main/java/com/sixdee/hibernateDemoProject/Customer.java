package com.sixdee.hibernateDemoProject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	private int customerid;
	private String username;
	private String firstname;
	private String lastname;
	private int age;
	private String address;
	private String mobileNumber;
	private String dateOfBirth;
	private int balance;
	//@OneToOne
	//@OneToMany(mappedBy = "customer")
	@ManyToMany(mappedBy = "customer")
	private List<Laptop> laptop = new ArrayList<Laptop>();
	
	public int getBalance(){
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCustomerid(){
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> l) {
		this.laptop = l;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", username=" + username + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", age=" + age + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", dateOfBirth=" + dateOfBirth + ", balance=" + balance + "]";
	}
	
	
}
