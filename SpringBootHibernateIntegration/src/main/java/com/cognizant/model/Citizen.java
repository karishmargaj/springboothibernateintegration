package com.cognizant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
	
	@Id
	@GeneratedValue
	private int id;

	private String nameVaccine;


	
	
	
	
	
	
	

}
