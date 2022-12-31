package com.bvilela.spring.graphql.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bvilela.spring.graphql.demo.entity.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

	List<State> findByAbbreviation(String abbreviation);
	List<State> findByFullName(String fullName);
	List<State> findByCapital(String capital);
	
}
