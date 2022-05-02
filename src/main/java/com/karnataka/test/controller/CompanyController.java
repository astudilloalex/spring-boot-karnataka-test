package com.karnataka.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karnataka.test.interfaces.Company;
import com.karnataka.test.repository.SalesReportRepository;

@RestController
public class CompanyController {

	private final SalesReportRepository repository;

	public CompanyController(final SalesReportRepository repository) {
		this.repository = repository;
	}

	@GetMapping(value = "/api/v1/companies")
	public List<Company> getCompanies() {
		return repository.getCompanies();
	}
	@GetMapping(value = "/api/v1/company-by-code", params = {"codes"})
	public List<Company> getCompanies(@RequestParam("codes")final List<Integer> codes){
		return repository.getCompanies(codes);
	}
}
