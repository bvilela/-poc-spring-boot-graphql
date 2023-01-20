package com.bvilela.spring.graphql.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "city")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CitySequence")
	@SequenceGenerator(name = "CitySequence", sequenceName = "CITY_SEQ", allocationSize = 1, initialValue = 1)
	private Long id;
	
	private String name;
	
	@ManyToOne
	private State state;
	
	private String size;
	
	@Column(name = "active")
	private boolean active;
	
}
