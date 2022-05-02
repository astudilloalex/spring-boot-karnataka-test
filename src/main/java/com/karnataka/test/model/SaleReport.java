package com.karnataka.test.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"REP_VENTA_DETAL_COL_PRUE_VW\"")
public class SaleReport implements Serializable {
	private static final long serialVersionUID = 3336698478612569774L;

	@Column(name = "\"CON_PRC_CODIGO\"")
	private Integer prcCode;

	@Column(name = "\"CON_FECHA_VENTA\"")
	private Timestamp saleDate;

	@Column(name = "\"CON_FECHA_VENTA_PRUEBA\"")
	private Timestamp saleTestDate;

	@Column(name = "\"CON_NRO_COMPROBANTE\"")
	private String receiptNumber;

	@Column(name = "\"CON_COD_EMPRESA\"")
	private Short companyCode;

	@Column(name = "\"CON_NOM_EMPRESA\"")
	private String companyName;

	@Column(name = "\"CON_COD_ALMACEN\"")
	private Byte warehouseCode;

	@Column(name = "\"CON_NOM_ALMACEN\"")
	private String warehouseName;

	@Column(name = "\"CON_COD_USUARIO\"")
	private Integer userCode;

	@Column(name = "\"CON_NOM_USUARIO\"")
	private String username;

	@Column(name = "\"CON_USUARIO_CEDULA_RUC\"")
	private String userIdCard;

	@Column(name = "\"CON_ESTADO_ACTIVO\"")
	private Byte status;

	@Id
	@Column(name = "\"CON_COD_PRODUCTO\"")
	private Integer productCode;

	@Column(name = "\"CON_CHASIS\"")
	private String chassis;

	@Column(name = "\"CON_CANTIDAD\"")
	private Byte quantity;

	@Column(name = "\"CON_TIPO_FACTURA\"")
	private Integer invoiceType;

	@Column(name = "\"CON_NOM_TIPO_FACTURA\"")
	private String invoiceTypeName;

	@Column(name = "\"CON_COD_CLIENTE\"")
	private Integer customerCode;

	@Column(name = "\"CON_NOM_CLIENTE\"")
	private String customerName;

	@Column(name = "\"CON_CEDULA_RUC_CLIENTE\"")
	private String customerIdCard;

	@Column(name = "\"CON_MAIL_CLIENTE\"")
	private String customerEmail;

	@Column(name = "\"CON_TELEFONO_CLIENTE\"")
	private String customerPhone;

	@Column(name = "\"CON_TOTAL_FACTURA\"")
	private Double invoiceTotal;

	@Column(name = "\"CON_FORMA_PAGO\"")
	private String paymentMethod;

	@Column(name = "\"CON_COD_FORMA_PAGO\"")
	private Byte paymentMethodCode;

	@Column(name = "\"CON_ESTADO_FACTURA\"")
	private Byte invoiceStatus;

	@Column(name = "\"CON_NOM_ESTADO_FACTURA\"")
	private String invoiceStatusName;

	@Column(name = "\"CON_VALOR_MATRICULA\"")
	private Double registrationFee;

	@Column(name = "\"CON_FECHA_REG_MATRICULA\"")
	private Timestamp registrationDate;

	@Column(name = "\"CON_TIPO_USO_VEHICULO\"")
	private Byte carType;

	@Column(name = "\"CON_NOM_TIPO_USO_VEHICULO\"")
	private String carTypeName;

	@Column(name = "\"CON_TIPO_CLIENTE\"")
	private Byte customerType;

	@Column(name = "\"CON_NOM_TIPO_CLIENTE\"")
	private String customerTypeName;

	@Column(name = "\"CON_TIPO_ESTADO_REG\"")
	private Byte registrationTypeStatus;

	@Column(name = "\"CON_NOM_TIPO_ESTADO_REG\"")
	private String resgistrationTypeStatusName;

	@Column(name = "\"CON_ESTADO_CIERRE\"")
	private Byte closeStatus;

	@Column(name = "\"CON_NOMBRE_ESTADO_CIERRE\"")
	private String closeStatusName;

	@Column(name = "\"CON_TRAMITE_PROFORMA\"")
	private String proformaDate;

	@Column(name = "\"CON_COD_PROCESO_PROFORMA\"")
	private Byte proformaProcessCode;

	@Column(name = "\"CON_NOM_PROCESO_PROFORMA\"")
	private String proformaProcessName;

	@Column(name = "\"CON_COD_CATEGORIA_PROFORMA\"")
	private Byte proformaCategoryCode;

	@Column(name = "\"CON_FECHA_CREACION_PROFORMA\"")
	private Timestamp proformaCreationDate;	
	
	@Column(name = "\"CON_PERIODO_CREACION_PROF\"")
	private Integer proformaCreationPeriod;

	@Column(name = "\"CON_MES_CREACION_PROF\"")
	private Byte proformaCreationMonth;
	
	@Column(name = "\"CON_CALIDAD_CLIENTE\"")
	private Byte customerQuality;

	@Column(name = "\"VEN_COD_EST_COMPLETO\"")
	private Byte completeStatusCode;

	@Column(name = "\"CON_NOM_ESTADO_COMPLO_FACT\"")
	private String invoiceCompleteStatusName;

	@Column(name = "\"CON_FSC_ORIGEN\"")
	private String fscOrigin;

	@Column(name = "\"CON_COD_MODELO\"")
	private Integer modelCode;

	@Column(name = "\"CON_NOM_MODELO\"")
	private String modelName;

	@Column(name = "\"CON_COD_MARCA\"")
	private Integer brandCode;

	@Column(name = "\"CON_NOM_MARCA\"")
	private String brandName;

	@Column(name = "\"CON_COD_VERSION\"")
	private Integer versionCode;

	@Column(name = "\"CON_VERSION\"")
	private String version;

	@Column(name = "\"CON_COLOR\"")
	private String color;

	@Column(name = "\"CON_ANIO\"")
	private Integer year;

	@Column(name = "\"CON_PROD_MOTOR\"")
	private String motorCode;

	@Column(name = "\"CON_CLASE\"")
	private String carClass;

	@Column(name = "\"CON_CATEGORIA_PRODUCTO\"")
	private String productCategory;

	@Column(name = "\"CON_FAMILIA_PRODUCTO\"")
	private String productFamily;

	@Column(name = "\"CON_TRANSMISION\"")
	private String transmission;

	@Column(name = "\"CON_COD_SEGMETO_VEH\"")
	private Byte carSegmentCode;

	@Column(name = "\"CON_NOM_SEGMENTO_VEH\"")
	private String carSegmentName;

	@Column(name = "\"CON_EMPRESA_ASIG_ACT\"")
	private Short companyAsign;

	@Column(name = "\"CON_ESTADO_MARCA\"")
	private String brandStatus;

	@Column(name = "\"CON_ESTADO_CONCESIONARIO\"")
	private String concessionaireStatus;

	@Column(name = "\"CON_ESTADO_ACTUAL_PRODUCTO\"")
	private String productActualStatus;

	@Column(name = "\"CON_ESTADO_ALMACEN\"")
	private String warehouseStatus;

	@Column(name = "\"CON_COD_ESTADO_RESERVA\"")
	private Byte bookingStatus;

	@Column(name = "\"CON_NOM_ESTADO_RESERVA\"")
	private String bookingStatusName;

	@Column(name = "\"CON_COD_ESTADO_TEST_DRIVE\"")
	private Byte testDriveStatus;

	@Column(name = "\"CON_NOM_ESTADO_TESTDRIVE\"")
	private String testDriveStatusName;

	@Column(name = "\"CON_COD_ESTADO_DISPONIBLE\"")
	private Byte availableStatus;

	@Column(name = "\"CON_NOM_ESTADO_DISPONIBLE\"")
	private String availableStatusName;

	@Column(name = "\"CON_NRO_FACTURA_BISS\"")
	private String invoiceNumberBiss;

	@Column(name = "\"CON_FECHA_FACT_BISS\"")
	private Timestamp invoiceDateBiss;

	@Column(name = "\"CON_FECHA_HOMOLOGADO\"")
	private Timestamp approvalDate;

	@Column(name = "\"CON_FECHA_CREACION_PRODUCTO\"")
	private Timestamp productCreationDate;

	@Column(name = "\"CON_NOM_CIUDAD_ALMACEN\"")
	private String warehouseCityName;

	@Column(name = "\"CON_FECHA_REPORTE_CIERRE\"")
	private Timestamp closeReportDate;

	@Column(name = "\"CON_COD_CANAL\"")
	private Short channelCode;

	@Column(name = "\"CON_NOM_CANAL\"")
	private String channelName;

	@Column(name = "\"CON_COD_MEDIO\"")
	private Integer middleCode;

	@Column(name = "\"CON_NOM_MEDIO\"")
	private String middleName;

	@Column(name = "\"CON_COD_CAMPANIA_PROFORMA\"")
	private String proformaCompanyCode;

	@Column(name = "\"CON_LEAD_ID\"")
	private String leadId;

	@Column(name = "\"CON_COD_CANAL_LEAD\"")
	private Byte channelLeadCode;

	@Column(name = "\"CON_COD_MEDIO_LEAD\"")
	private Byte leadMiddleCode;

	@Column(name = "\"CON_PLATAFORMA\"")
	private String platform;

	@Column(name = "\"CON_COD_CAMPANIA_ID\"")
	private String campaignId;

	@Column(name = "\"CON_COD_TOKEN\"")
	private String tokenCode;

	@Column(name = "\"CON_NOM_CAMPANIA\"")
	private String campaignName;

	@Column(name = "\"CON_NOM_TIPOCONTACTO\"")
	private String contactTypeName;

	@Column(name = "\"CON_CAMPANIA_PERTENECE\"")
	private String campaignBelongs;

	@Column(name = "\"CON_LEAD_ORIGEN\"")
	private String leadOrigin;

	@Column(name = "\"CON_FECDESDE_CAMPANIA\"")
	private Timestamp campaignFromDate;

	@Column(name = "\"CON_FECHASTA_CAMPANIA\"")
	private Timestamp campaignToDate;

	@Column(name = "\"CON_SEGMENTACION\"")
	private String segment;

	@Column(name = "\"CON_SUBSEGMENTACION\"")
	private String subSegment;

	@Column(name = "\"CON_COD_SUB_CATEGORIA_VEHICULO\"")
	private Byte carSubCategory;

	@Column(name = "\"CON_NOM_SUB_CATEGORIA_VEHICULO\"")
	private String carSubCategoryName;

	@Column(name = "\"CON_MES_CIERRE\"")
	private String closeMonth;

	@Column(name = "\"CON_PERIODO_CIERRE\"")
	private String closeYear;

	@Column(name = "\"CON_PERIODO_REPORTE_CIERRE\"")
	private String closeReportYear;

	@Column(name = "\"CON_MES_REPORTE_CIERRE\"")
	private String closeReportMonth;

	@Column(name = "\"VEN_CANTIDAD_SUGERIDA\"")
	private Integer suggestedQuantity;

	@Column(name = "\"VEN_TIPO_CLIENTE\"")
	private Integer customerTypeSell;

	@Column(name = "\"VEN_NOM_TIPO_CLIENTE\"")
	private String customerTypeNameSell;

	@Column(name = "\"CON_CODIGO_CONFIGURACION\"")
	private String settingsCode;

	public Integer getPrcCode() {
		return prcCode;
	}

	public void setPrcCode(Integer prcCode) {
		this.prcCode = prcCode;
	}

	public Timestamp getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Timestamp saleDate) {
		this.saleDate = saleDate;
	}

	public Timestamp getSaleTestDate() {
		return saleTestDate;
	}

	public void setSaleTestDate(Timestamp saleTestDate) {
		this.saleTestDate = saleTestDate;
	}

	public String getReceiptNumber() {
		return receiptNumber;
	}

	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}

	public Short getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(Short companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Byte getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(Byte warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public Integer getUserCode() {
		return userCode;
	}

	public void setUserCode(Integer userCode) {
		this.userCode = userCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserIdCard() {
		return userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public Byte getQuantity() {
		return quantity;
	}

	public void setQuantity(Byte quantity) {
		this.quantity = quantity;
	}

	public Integer getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(Integer invoiceType) {
		this.invoiceType = invoiceType;
	}

	public String getInvoiceTypeName() {
		return invoiceTypeName;
	}

	public void setInvoiceTypeName(String invoiceTypeName) {
		this.invoiceTypeName = invoiceTypeName;
	}

	public Integer getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(Integer customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerIdCard() {
		return customerIdCard;
	}

	public void setCustomerIdCard(String customerIdCard) {
		this.customerIdCard = customerIdCard;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public Double getInvoiceTotal() {
		return invoiceTotal;
	}

	public void setInvoiceTotal(Double invoiceTotal) {
		this.invoiceTotal = invoiceTotal;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Byte getPaymentMethodCode() {
		return paymentMethodCode;
	}

	public void setPaymentMethodCode(Byte paymentMethodCode) {
		this.paymentMethodCode = paymentMethodCode;
	}

	public Byte getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(Byte invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public String getInvoiceStatusName() {
		return invoiceStatusName;
	}

	public void setInvoiceStatusName(String invoiceStatusName) {
		this.invoiceStatusName = invoiceStatusName;
	}

	public Double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(Double registrationFee) {
		this.registrationFee = registrationFee;
	}

	public Timestamp getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Timestamp registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Byte getCarType() {
		return carType;
	}

	public void setCarType(Byte carType) {
		this.carType = carType;
	}

	public String getCarTypeName() {
		return carTypeName;
	}

	public void setCarTypeName(String carTypeName) {
		this.carTypeName = carTypeName;
	}

	public Byte getCustomerType() {
		return customerType;
	}

	public void setCustomerType(Byte customerType) {
		this.customerType = customerType;
	}

	public String getCustomerTypeName() {
		return customerTypeName;
	}

	public void setCustomerTypeName(String customerTypeName) {
		this.customerTypeName = customerTypeName;
	}

	public Byte getRegistrationTypeStatus() {
		return registrationTypeStatus;
	}

	public void setRegistrationTypeStatus(Byte registrationTypeStatus) {
		this.registrationTypeStatus = registrationTypeStatus;
	}

	public String getResgistrationTypeStatusName() {
		return resgistrationTypeStatusName;
	}

	public void setResgistrationTypeStatusName(String resgistrationTypeStatusName) {
		this.resgistrationTypeStatusName = resgistrationTypeStatusName;
	}

	public Byte getCloseStatus() {
		return closeStatus;
	}

	public void setCloseStatus(Byte closeStatus) {
		this.closeStatus = closeStatus;
	}

	public String getCloseStatusName() {
		return closeStatusName;
	}

	public void setCloseStatusName(String closeStatusName) {
		this.closeStatusName = closeStatusName;
	}

	public String getProformaDate() {
		return proformaDate;
	}

	public void setProformaDate(String proformaDate) {
		this.proformaDate = proformaDate;
	}

	public Byte getProformaProcessCode() {
		return proformaProcessCode;
	}

	public void setProformaProcessCode(Byte proformaProcessCode) {
		this.proformaProcessCode = proformaProcessCode;
	}

	public String getProformaProcessName() {
		return proformaProcessName;
	}

	public void setProformaProcessName(String proformaProcessName) {
		this.proformaProcessName = proformaProcessName;
	}

	public Byte getProformaCategoryCode() {
		return proformaCategoryCode;
	}

	public void setProformaCategoryCode(Byte proformaCategoryCode) {
		this.proformaCategoryCode = proformaCategoryCode;
	}

	public Timestamp getProformaCreationDate() {
		return proformaCreationDate;
	}

	public void setProformaCreationDate(Timestamp proformaCreationDate) {
		this.proformaCreationDate = proformaCreationDate;
	}

	public Byte getCustomerQuality() {
		return customerQuality;
	}

	public void setCustomerQuality(Byte customerQuality) {
		this.customerQuality = customerQuality;
	}

	public Byte getCompleteStatusCode() {
		return completeStatusCode;
	}

	public void setCompleteStatusCode(Byte completeStatusCode) {
		this.completeStatusCode = completeStatusCode;
	}

	public String getInvoiceCompleteStatusName() {
		return invoiceCompleteStatusName;
	}

	public void setInvoiceCompleteStatusName(String invoiceCompleteStatusName) {
		this.invoiceCompleteStatusName = invoiceCompleteStatusName;
	}

	public String getFscOrigin() {
		return fscOrigin;
	}

	public void setFscOrigin(String fscOrigin) {
		this.fscOrigin = fscOrigin;
	}

	public Integer getModelCode() {
		return modelCode;
	}

	public void setModelCode(Integer modelCode) {
		this.modelCode = modelCode;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(Integer brandCode) {
		this.brandCode = brandCode;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Integer getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getMotorCode() {
		return motorCode;
	}

	public void setMotorCode(String motorCode) {
		this.motorCode = motorCode;
	}

	public String getCarClass() {
		return carClass;
	}

	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductFamily() {
		return productFamily;
	}

	public void setProductFamily(String productFamily) {
		this.productFamily = productFamily;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public Byte getCarSegmentCode() {
		return carSegmentCode;
	}

	public void setCarSegmentCode(Byte carSegmentCode) {
		this.carSegmentCode = carSegmentCode;
	}

	public String getCarSegmentName() {
		return carSegmentName;
	}

	public void setCarSegmentName(String carSegmentName) {
		this.carSegmentName = carSegmentName;
	}

	public Short getCompanyAsign() {
		return companyAsign;
	}

	public void setCompanyAsign(Short companyAsign) {
		this.companyAsign = companyAsign;
	}

	public String getBrandStatus() {
		return brandStatus;
	}

	public void setBrandStatus(String brandStatus) {
		this.brandStatus = brandStatus;
	}

	public String getConcessionaireStatus() {
		return concessionaireStatus;
	}

	public void setConcessionaireStatus(String concessionaireStatus) {
		this.concessionaireStatus = concessionaireStatus;
	}

	public String getProductActualStatus() {
		return productActualStatus;
	}

	public void setProductActualStatus(String productActualStatus) {
		this.productActualStatus = productActualStatus;
	}

	public String getWarehouseStatus() {
		return warehouseStatus;
	}

	public void setWarehouseStatus(String warehouseStatus) {
		this.warehouseStatus = warehouseStatus;
	}

	public Byte getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(Byte bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getBookingStatusName() {
		return bookingStatusName;
	}

	public void setBookingStatusName(String bookingStatusName) {
		this.bookingStatusName = bookingStatusName;
	}

	public Byte getTestDriveStatus() {
		return testDriveStatus;
	}

	public void setTestDriveStatus(Byte testDriveStatus) {
		this.testDriveStatus = testDriveStatus;
	}

	public String getTestDriveStatusName() {
		return testDriveStatusName;
	}

	public void setTestDriveStatusName(String testDriveStatusName) {
		this.testDriveStatusName = testDriveStatusName;
	}

	public Byte getAvailableStatus() {
		return availableStatus;
	}

	public void setAvailableStatus(Byte availableStatus) {
		this.availableStatus = availableStatus;
	}

	public String getAvailableStatusName() {
		return availableStatusName;
	}

	public void setAvailableStatusName(String availableStatusName) {
		this.availableStatusName = availableStatusName;
	}

	public String getInvoiceNumberBiss() {
		return invoiceNumberBiss;
	}

	public void setInvoiceNumberBiss(String invoiceNumberBiss) {
		this.invoiceNumberBiss = invoiceNumberBiss;
	}

	public Timestamp getInvoiceDateBiss() {
		return invoiceDateBiss;
	}

	public void setInvoiceDateBiss(Timestamp invoiceDateBiss) {
		this.invoiceDateBiss = invoiceDateBiss;
	}

	public Timestamp getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(Timestamp approvalDate) {
		this.approvalDate = approvalDate;
	}

	public Timestamp getProductCreationDate() {
		return productCreationDate;
	}

	public void setProductCreationDate(Timestamp productCreationDate) {
		this.productCreationDate = productCreationDate;
	}

	public String getWarehouseCityName() {
		return warehouseCityName;
	}

	public void setWarehouseCityName(String warehouseCityName) {
		this.warehouseCityName = warehouseCityName;
	}

	public Timestamp getCloseReportDate() {
		return closeReportDate;
	}

	public void setCloseReportDate(Timestamp closeReportDate) {
		this.closeReportDate = closeReportDate;
	}

	public Short getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(Short channelCode) {
		this.channelCode = channelCode;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public Integer getMiddleCode() {
		return middleCode;
	}

	public void setMiddleCode(Integer middleCode) {
		this.middleCode = middleCode;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getProformaCompanyCode() {
		return proformaCompanyCode;
	}

	public void setProformaCompanyCode(String proformaCompanyCode) {
		this.proformaCompanyCode = proformaCompanyCode;
	}

	public String getLeadId() {
		return leadId;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public Byte getChannelLeadCode() {
		return channelLeadCode;
	}

	public void setChannelLeadCode(Byte channelLeadCode) {
		this.channelLeadCode = channelLeadCode;
	}

	public Byte getLeadMiddleCode() {
		return leadMiddleCode;
	}

	public void setLeadMiddleCode(Byte leadMiddleCode) {
		this.leadMiddleCode = leadMiddleCode;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getTokenCode() {
		return tokenCode;
	}

	public void setTokenCode(String tokenCode) {
		this.tokenCode = tokenCode;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getContactTypeName() {
		return contactTypeName;
	}

	public void setContactTypeName(String contactTypeName) {
		this.contactTypeName = contactTypeName;
	}

	public String getCampaignBelongs() {
		return campaignBelongs;
	}

	public void setCampaignBelongs(String campaignBelongs) {
		this.campaignBelongs = campaignBelongs;
	}

	public String getLeadOrigin() {
		return leadOrigin;
	}

	public void setLeadOrigin(String leadOrigin) {
		this.leadOrigin = leadOrigin;
	}

	public Timestamp getCampaignFromDate() {
		return campaignFromDate;
	}

	public void setCampaignFromDate(Timestamp campaignFromDate) {
		this.campaignFromDate = campaignFromDate;
	}

	public Timestamp getCampaignToDate() {
		return campaignToDate;
	}

	public void setCampaignToDate(Timestamp campaignToDate) {
		this.campaignToDate = campaignToDate;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getSubSegment() {
		return subSegment;
	}

	public void setSubSegment(String subSegment) {
		this.subSegment = subSegment;
	}

	public Byte getCarSubCategory() {
		return carSubCategory;
	}

	public void setCarSubCategory(Byte carSubCategory) {
		this.carSubCategory = carSubCategory;
	}

	public String getCarSubCategoryName() {
		return carSubCategoryName;
	}

	public void setCarSubCategoryName(String carSubCategoryName) {
		this.carSubCategoryName = carSubCategoryName;
	}

	public String getCloseMonth() {
		return closeMonth;
	}

	public void setCloseMonth(String closeMonth) {
		this.closeMonth = closeMonth;
	}

	public String getCloseYear() {
		return closeYear;
	}

	public void setCloseYear(String closeYear) {
		this.closeYear = closeYear;
	}

	public String getCloseReportYear() {
		return closeReportYear;
	}

	public void setCloseReportYear(String closeReportYear) {
		this.closeReportYear = closeReportYear;
	}

	public String getCloseReportMonth() {
		return closeReportMonth;
	}

	public void setCloseReportMonth(String closeReportMonth) {
		this.closeReportMonth = closeReportMonth;
	}

	public Integer getSuggestedQuantity() {
		return suggestedQuantity;
	}

	public void setSuggestedQuantity(Integer suggestedQuantity) {
		this.suggestedQuantity = suggestedQuantity;
	}

	public Integer getCustomerTypeSell() {
		return customerTypeSell;
	}

	public void setCustomerTypeSell(Integer customerTypeSell) {
		this.customerTypeSell = customerTypeSell;
	}

	public String getCustomerTypeNameSell() {
		return customerTypeNameSell;
	}

	public void setCustomerTypeNameSell(String customerTypeNameSell) {
		this.customerTypeNameSell = customerTypeNameSell;
	}

	public String getSettingsCode() {
		return settingsCode;
	}

	public void setSettingsCode(String settingsCode) {
		this.settingsCode = settingsCode;
	}

}
