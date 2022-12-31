package com.bvilela.spring.graphql.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bvilela.spring.graphql.demo.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {

	List<City> findByName(String name);
	List<City> findByStateAbbreviationAndSize(String abbreviation, String citySize);
	
}
