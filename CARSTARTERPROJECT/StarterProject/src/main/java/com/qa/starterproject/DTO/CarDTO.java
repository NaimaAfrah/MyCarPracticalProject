package com.qa.starterproject.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarDTO {
	private Long id;
	private String make;
	private String model;
	private Integer cost;
//	private Driver driver;
}
