package com.sixdee.hibernate.services;

import com.sixdee.hibernate.dto.BankSystemDto;
import com.sixdee.hibernate.entity.Account;

public interface BankSystemService {

	Account customerDetails(BankSystemDto bs);

}
