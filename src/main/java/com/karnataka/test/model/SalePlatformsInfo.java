package com.karnataka.test.model;

import java.io.Serializable;

public class SalePlatformsInfo implements Serializable {
	private static final long serialVersionUID = -8492996205001026452L;

	private String platform;
	private Long quantity;

	public SalePlatformsInfo(final String platform, final Long quantity) {
		this.platform = platform;
		this.quantity = quantity;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
}
