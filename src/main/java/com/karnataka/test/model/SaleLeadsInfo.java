package com.karnataka.test.model;

import java.io.Serializable;

public class SaleLeadsInfo implements Serializable {
	private static final long serialVersionUID = -8492996205001026452L;

	private String origin;
	private Long quantity;

	public SaleLeadsInfo(final String origin, final Long quantity) {
		this.origin = origin;
		this.quantity = quantity;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
}
