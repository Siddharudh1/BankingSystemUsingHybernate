package com.sixdee.hibernate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.hibernate.dto.BankSystemDto;
import com.sixdee.hibernate.entity.Account;
import com.sixdee.hibernate.services.BankSystemService;

@RestController
public class AccountController{
    @Autowired
    private BankSystemService bss;
    @PostMapping("/createcustomerdetails")
	public Account createcustomerdetails(@RequestBody BankSystemDto bs) {
		Account acc = bss.customerDetails(bs);
		return acc;
    }
}