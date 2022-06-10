package com.qa.starterproject.DAO;

import java.sql.Driver;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CarDAO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String model;
	private Integer cost;
	private String make;
	private String plateNumber;
	@ManyToOne(targetEntity = Driver.class)
	private Driver driver;
}

