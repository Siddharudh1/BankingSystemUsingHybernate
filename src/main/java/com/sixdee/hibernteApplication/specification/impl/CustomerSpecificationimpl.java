package com.sixdee.hibernteApplication.specification.impl;

import javax.persistence.criteria.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.sixdee.hibernteApplication.entity.Customer;

public class CustomerSpecificationimpl{
	public static Specification<Customer> findByuserName(String userName) {
	    return new Specification<Customer>() {

		@Override
		public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query,
				CriteriaBuilder criteriaBuilder) {
			return  criteriaBuilder.equal(root.get(userName),userName);
		}
	    };
	  }
	
}
