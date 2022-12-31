package com.bvilela.spring.graphql.demo.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.bvilela.spring.graphql.demo.entity.City;
import com.bvilela.spring.graphql.demo.service.CityService;
import com.bvilela.spring.graphql.demo.service.StateService;

@Controller
public class CityController {
	
	private CityService cityService;
	private StateService stateService;
	
	public CityController(CityService cityService, StateService stateService) {
		this.cityService = cityService;
		this.stateService = stateService;
	}
	
	@QueryMapping
	public List<City> findCities(@Argument String abbreviation, @Argument String citySize) {
		return cityService.findCities(abbreviation, citySize);
	}
	
	@QueryMapping
	public List<City> allCities() {
		return cityService.findAll();
	}
	
	@MutationMapping
	public City createCity(@Argument String name, @Argument String size, @Argument Integer stateId) {
		
		City city = new City();
		city.setName(name);
		city.setSize(size);
		
		var state = stateService.findById(stateId.longValue());
		city.setState(state);
		city.setActive(true);
		
		cityService.save(city);
		
		return city;
	}
	
}
