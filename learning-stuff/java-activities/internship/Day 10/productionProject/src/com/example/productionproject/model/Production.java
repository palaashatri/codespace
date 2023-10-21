package com.example.productionproject.model;

import java.time.LocalDate;

public class Production {

	private int productionId;
	private String productionName;
	private String address;
	private int dateOfStarted;
	private LocalDate dateStarted;
	private String ownerName;
	public int getProductionId() {
		return productionId;
	}
	public void setProductionId(int productionId) {
		this.productionId = productionId;
	}
	public String getProductionName() {
		return productionName;
	}
	public void setProductionName(String productionName) {
		this.productionName = productionName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDateOfStarted() {
		return dateOfStarted;
	}
	public void setDateOfStarted(int dateOfStarted) {
		this.dateOfStarted = dateOfStarted;
	}
	public LocalDate getDateStarted() {
		return dateStarted;
	}
	public void setDateStarted(LocalDate dateStarted) {
		this.dateStarted = dateStarted;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Production(int productionId, String productionName, String address, int dateOfStarted,String ownerName, LocalDate dateStarted)
	{
		super();
		this.productionId = productionId;
		this.productionName = productionName;
		this.address = address;
		this.dateOfStarted = dateOfStarted;
		this.dateStarted = dateStarted;
		this.ownerName = ownerName;
	}
	public Production() {
		super();
	}
	@Override
	public String toString() {
		return "productionId=" + productionId + ", productionName=" + productionName + ", address="
				+ address + ", dateOfStarted=" + dateOfStarted + ", ownerName="	+ ownerName + ", dateStarted=" + dateStarted;
	}
	
}
