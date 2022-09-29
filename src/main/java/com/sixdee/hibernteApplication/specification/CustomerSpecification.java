package com.sixdee.hibernteApplication.specification;

import java.util.function.Predicate;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public interface CustomerSpecification<Customer> {
	Predicate toPredicate(Root<Customer> root, CriteriaQuery query, CriteriaBuilder cb);		
}
