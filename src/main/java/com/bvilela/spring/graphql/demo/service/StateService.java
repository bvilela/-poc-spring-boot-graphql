package com.bvilela.spring.graphql.demo.service;

import java.util.List;

import com.bvilela.spring.graphql.demo.entity.State;

public interface StateService {

	List<State> findAll();
	State findByAbbreviation(String abbreviation);
	State findByFullName(String fullName);
	State findByCapital(String capital);
	State findById(Long id);
	
}
