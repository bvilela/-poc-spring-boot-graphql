package com.bvilela.spring.graphql.demo.service;

import java.util.List;

import com.bvilela.spring.graphql.demo.entity.City;

public interface CityService {

	List<City> findAll();
	City findByName(String name);
	List<City> findCities(String abbreviation, String citySize);
	City save(City city);
	
}
