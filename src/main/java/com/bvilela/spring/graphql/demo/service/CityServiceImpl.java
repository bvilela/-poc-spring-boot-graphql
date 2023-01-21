package com.bvilela.spring.graphql.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bvilela.spring.graphql.demo.entity.City;
import com.bvilela.spring.graphql.demo.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService {
	
	private CityRepository repository;
	
	public CityServiceImpl(CityRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<City> findAll() {
		return repository.findAll();
	}

	@Override
	public City findByName(String name) {
		var list = repository.findByName(name);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public List<City> findCities(String abbreviation, String citySize) {
		var list = repository.findByStateAbbreviationAndSize(abbreviation, citySize);
		return list.isEmpty() ? null : list;
	}

	@Override
	public City save(City city) {
		return repository.save(city);
	}

}
