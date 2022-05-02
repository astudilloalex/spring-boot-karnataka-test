package com.karnataka.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karnataka.test.interfaces.Warehouse;
import com.karnataka.test.repository.SalesReportRepository;

@RestController
public class WarehouseController {

	private final SalesReportRepository repository;

	public WarehouseController(final SalesReportRepository repository) {
		this.repository = repository;
	}

	@GetMapping(value = "/api/v1/warehouses")
	public List<Warehouse> getWarehouses() {
		System.out.println(repository.getWarehouses().size());
		return repository.getWarehouses();
	}
}
