package com.bvilela.spring.graphql.demo.controller;

import java.util.Objects;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.bvilela.spring.graphql.demo.entity.State;
import com.bvilela.spring.graphql.demo.service.StateService;

@Controller
public class StateController {

	private StateService service;
	
	public StateController(StateService service) {
		this.service = service;
	}
	
	@QueryMapping
	public State stateByAbbreviation(@Argument String abbreviation) {
		return service.findByAbbreviation(abbreviation);
	}
	
	@QueryMapping
	public State findState(@Argument String abbreviation, @Argument String fullName, @Argument String capital, @Argument Long id) {
		if (Objects.nonNull(abbreviation)) {
			return service.findByAbbreviation(abbreviation);
		}
		
		if (Objects.nonNull(fullName)) {
			return service.findByFullName(fullName);
		}
		
		if (Objects.nonNull(capital)) {
			return service.findByCapital(capital);
		}
		
		if (Objects.nonNull(id)) {
			return service.findById(id);
		}
		
		return null;
	}
	
}
