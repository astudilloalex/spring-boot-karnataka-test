package com.karnataka.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.karnataka.test.interfaces.CarType;
import com.karnataka.test.interfaces.Company;
import com.karnataka.test.interfaces.Warehouse;
import com.karnataka.test.model.SaleLeadsInfo;
import com.karnataka.test.model.SalePlatformsInfo;
import com.karnataka.test.model.SaleReport;

public interface SalesReportRepository extends JpaRepository<SaleReport, Integer> {

	@Query(value = "SELECT DISTINCT \"CON_COD_SUB_CATEGORIA_VEHICULO\" as carSubCategory, \"CON_NOM_SUB_CATEGORIA_VEHICULO\" as carSubCategoryName FROM \"REP_VENTA_DETAL_COL_PRUE_VW\" ORDER BY \"CON_COD_SUB_CATEGORIA_VEHICULO\"", nativeQuery = true)
	public List<CarType> getCarTypes();

	@Query(value = "SELECT DISTINCT \"CON_COD_EMPRESA\" as companyCode, \"CON_NOM_EMPRESA\" as companyName FROM \"REP_VENTA_DETAL_COL_PRUE_VW\" ORDER BY \"CON_NOM_EMPRESA\"", nativeQuery = true)
	public List<Company> getCompanies();

	@Query(value = "SELECT DISTINCT ON (\"CON_NOM_ALMACEN\") \"CON_NOM_ALMACEN\" as warehouseName, \"CON_COD_ALMACEN\" as warehouseCode  FROM \"REP_VENTA_DETAL_COL_PRUE_VW\" ORDER BY warehouseName", nativeQuery = true)
	public List<Warehouse> getWarehouses();

	@Query(value = "SELECT DISTINCT \"CON_PERIODO_CREACION_PROF\" FROM \"REP_VENTA_DETAL_COL_PRUE_VW\" ORDER BY \"CON_PERIODO_CREACION_PROF\"", nativeQuery = true)
	public List<Integer> getProformaPeriods();

	@Query(value = "SELECT DISTINCT \"CON_NOM_CIUDAD_ALMACEN\" FROM \"REP_VENTA_DETAL_COL_PRUE_VW\" ORDER BY \"CON_NOM_CIUDAD_ALMACEN\"", nativeQuery = true)
	public List<String> getCities();

	@Query(value = "SELECT DISTINCT ON (\"CON_COD_EMPRESA\") \"CON_COD_EMPRESA\" as companyCode, \"CON_NOM_EMPRESA\" as companyName FROM \"REP_VENTA_DETAL_COL_PRUE_VW\" WHERE \"CON_COD_EMPRESA\" IN (:codes) ORDER BY companyCode", nativeQuery = true)
	public List<Company> getCompanies(@Param("codes") final List<Integer> codes);

	@Query(value = "SELECT new com.karnataka.test.model.SaleLeadsInfo(sr.campaignBelongs, SUM(sr.suggestedQuantity)) FROM SaleReport sr WHERE sr.campaignBelongs=:ori AND sr.proformaCreationPeriod IN (:years) AND sr.proformaCreationMonth=:month AND sr.carSubCategory IN (:cars) AND sr.companyCode IN (:companies) AND sr.warehouseName IN (:warehouses) AND sr.warehouseCityName IN (:cities) GROUP BY sr.campaignBelongs")
	public SaleLeadsInfo getSaleLeads(@Param("ori") final String origin, @Param("years") final List<Integer> years,
			@Param("month") final Byte month, @Param("cars") final List<Byte> cars,
			@Param("companies") final List<Short> companies, @Param("warehouses") final List<String> warehouses,
			@Param("cities") final List<String> cities);
	
	@Query(value = "SELECT new com.karnataka.test.model.SalePlatformsInfo(sr.platform, SUM(sr.suggestedQuantity)) FROM SaleReport sr WHERE sr.platform=:platf AND sr.proformaCreationPeriod IN (:years) AND sr.proformaCreationMonth=:month AND sr.carSubCategory IN (:cars) AND sr.companyCode IN (:companies) AND sr.warehouseName IN (:warehouses) AND sr.warehouseCityName IN (:cities) GROUP BY sr.platform")
	public SalePlatformsInfo getSalePlatforms(@Param("platf") final String platform, @Param("years") final List<Integer> years,
			@Param("month") final Byte month, @Param("cars") final List<Byte> cars,
			@Param("companies") final List<Short> companies, @Param("warehouses") final List<String> warehouses,
			@Param("cities") final List<String> cities);

	@Query(value = "SELECT DISTINCT \"CON_CAMPANIA_PERTENECE\" FROM \"REP_VENTA_DETAL_COL_PRUE_VW\"", nativeQuery = true)
	public List<String> getCampaigns();
	
	@Query(value="SELECT DISTINCT \"CON_PLATAFORMA\" FROM \"REP_VENTA_DETAL_COL_PRUE_VW\"", nativeQuery=true)
	public List<String> getPlatforms();
}
