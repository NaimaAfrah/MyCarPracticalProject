package com.qa.starterproject.DTO;

import java.util.ArrayList;
import java.util.List;

import com.qa.demo.dao.Car;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DriverDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private List<Car> cars = new ArrayList<>();
}

    