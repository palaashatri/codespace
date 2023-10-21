package com.example.demoMovieDB.model;

public class Productions {
	private int productionID;
	private String productionName;
	private String address;
	private int startYear;
	private String ownerName;
	
	
	public Productions() {
		super();
	}
	public Productions(int productionID, String productionName, String address, int startYear, String ownerName) {
		super();
		this.productionID = productionID;
		this.productionName = productionName;
		this.address = address;
		this.startYear = startYear;
		this.ownerName = ownerName;
	}
	public int getProductionID() {
		return productionID;
	}
	public void setProductionID(int productionID) {
		this.productionID = productionID;
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
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "Productions ID=" + productionID + ", productionName=" + productionName + ", address="
				+ address + ", startYear=" + startYear + ", ownerName=" + ownerName;
	}
	
	
}
