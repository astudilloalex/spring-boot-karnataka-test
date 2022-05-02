package com.karnataka.test.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karnataka.test.model.SaleLeadsInfo;
import com.karnataka.test.model.SalePlatformsInfo;
import com.karnataka.test.model.SaleReport;
import com.karnataka.test.repository.SalesReportRepository;

@RestController
public class SalesReportController {
	private final SalesReportRepository repository;

	public SalesReportController(final SalesReportRepository repository) {
		this.repository = repository;
	}

	public List<SaleReport> saleReports() {
		return repository.findAll();
	}

	@GetMapping(value = "/api/v1/sale-reports", params = { "page", "size" })
	public Page<SaleReport> getByPage(@RequestParam("page") int page, @RequestParam("size") int size) {
		return repository.findAll(PageRequest.of(page, size));
	}

	@GetMapping(value = "/api/v1/proforma-periods")
	public List<Integer> getProformaPeriods() {
		return repository.getProformaPeriods();
	}

	@GetMapping(value = "/api/v1/cities")
	public List<String> getCities() {
		return repository.getCities();
	}

	@GetMapping(value = "/api/v1/campaigns")
	public List<String> getCampaigns() {
		return repository.getCampaigns();
	}

	@GetMapping(value = "/api/v1/platforms")
	public List<String> getPlatforms() {
		return repository.getPlatforms();
	}

	@GetMapping(value = "/api/v1/sale-leads", params = { "origin", "years", "month", "cars", "companies", "warehouses",
			"cities" }, produces = "application/json;charset=UTF-8")
	public SaleLeadsInfo getSaleLeadsInfo(@RequestParam("origin") final String origin,
			@RequestParam("years") final List<Integer> years, @RequestParam("month") final Byte month,
			@RequestParam("cars") final List<Byte> cars, @RequestParam("companies") final List<Short> companies,
			@RequestParam("warehouses") final List<String> warehouses,
			@RequestParam("cities") final List<String> cities) {
		return repository.getSaleLeads(origin, years, month, cars, companies, warehouses, cities);
	}

	@GetMapping(value = "/api/v1/sale-platforms", params = { "platform", "years", "month", "cars", "companies",
			"warehouses", "cities" }, produces = "application/json;charset=UTF-8")
	public SalePlatformsInfo getSalePlatformsInfo(@RequestParam("platform") final String platform,
			@RequestParam("years") final List<Integer> years, @RequestParam("month") final Byte month,
			@RequestParam("cars") final List<Byte> cars, @RequestParam("companies") final List<Short> companies,
			@RequestParam("warehouses") final List<String> warehouses,
			@RequestParam("cities") final List<String> cities) {
		return repository.getSalePlatforms(platform, years, month, cars, companies, warehouses, cities);
	}
}
