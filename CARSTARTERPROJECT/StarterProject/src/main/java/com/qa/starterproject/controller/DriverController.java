package com.qa.starterproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.demo.dao.Driver;
import com.qa.demo.dto.DriverDto;
import com.qa.demo.service.DriverService;

@RestController()
@RequestMapping("/driver")
@CrossOrigin
public class DriverController {

	private DriverService service;

	@Autowired
	public DriverController(DriverService service) {
		this.service = service;
	}

	@PostMapping("/create")
	public ResponseEntity<DriverDTO> create(@RequestBody Driver driver) {
		return new ResponseEntity<>(this.service.create(driver), HttpStatus.CREATED);
	}

	@PostMapping("/createMany")
	public ResponseEntity<List<DriverDTO>> createMany(@RequestBody List<Driver> drivers) {
		return new ResponseEntity<>(this.service.createMany(drivers), HttpStatus.CREATED);
	}

	@GetMapping("/readAll")
	public ResponseEntity<List<DriverDTO>> readAll() {
		return new ResponseEntity<>(this.service.readAll(), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<DriverDTO> update(@RequestBody Driver newDriver) {
		return new ResponseEntity<>(this.service.update(newDriver), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable Long id) {
		return this.service.delete(id) ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
				: new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@GetMapping("/readBy/id:{id}")
	public ResponseEntity<List<DriverDTO>> readId(@PathVariable Long id) {
		List<DriverDTO> Driver = this.service.readId(id);
		return new ResponseEntity<>(Driver, HttpStatus.OK);
	}

	@GetMapping("/readBy/first-name:{firstName}")
	public ResponseEntity<List<DriverDTO>> readMake(@PathVariable String firstName) {
		List<DriverDTO> drivers = this.service.readFirstName(firstName);
		return new ResponseEntity<>(drivers, HttpStatus.OK);
	}

	@GetMapping("/readBy/last-name:{lastName}")
	public ResponseEntity<List<DriverDTO>> readModel(@PathVariable String lastName) {
		List<DriverDTO> Drivers = this.service.readLastName(lastName);
		return new ResponseEntity<>(Drivers, HttpStatus.OK);
	}

}