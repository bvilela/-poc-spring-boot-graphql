package com.bvilela.spring.graphql.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bvilela.spring.graphql.demo.entity.State;
import com.bvilela.spring.graphql.demo.repository.StateRepository;

@Service
public class StateServiceImpl implements StateService {
	
	private StateRepository repository;
	
	public StateServiceImpl(StateRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<State> findAll() {
		return repository.findAll();
	}

	@Override
	public State findByAbbreviation(String abbreviation) {
		var list = repository.findByAbbreviation(abbreviation);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public State findByFullName(String fullName) {
		var list = repository.findByFullName(fullName);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public State findByCapital(String capital) {
		var list = repository.findByCapital(capital);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public State findById(Long id) {
		var optional = repository.findById(id);
		return optional.isEmpty() ? null : optional.get();
	}

}
