package com.sixdee.hibernate.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixdee.hibernate.dto.BankSystemDto;
import com.sixdee.hibernate.entity.Account;
import com.sixdee.hibernate.repo.BankSystemDao;

@Service
public class BankSystemServiceimplement implements BankSystemService {
    @Autowired
    private BankSystemDao dao;
	@Override
	public Account customerDetails(BankSystemDto bs) {
	Account acc = new Account();
	System.out.println("..........."+ bs.toString());
	BeanUtils.copyProperties(bs, acc);
	System.out.println("..........."+ acc.toString());
	return dao.createcustomerDetails(acc);
	}
}
    