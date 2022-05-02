package com.karnataka.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karnataka.test.interfaces.CarType;
import com.karnataka.test.repository.SalesReportRepository;

@RestController
public class CarTypeController {

	private final SalesReportRepository repository;

	public CarTypeController(final SalesReportRepository repository) {
		this.repository = repository;
	}

	@GetMapping(value = "/api/v1/car-types")
	public List<CarType> getCarTypes() {
		return repository.getCarTypes();
	}
}
