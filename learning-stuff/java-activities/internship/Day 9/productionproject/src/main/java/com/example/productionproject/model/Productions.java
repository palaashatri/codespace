package com.example.productionproject.model;

public class Productions {
	
 	private int Productionid;
	private String Productionname;
	private String Address;
	private String Startyear;
	private String Ownername;
	
	public Productions() {
		super();
	}

	public Productions(int productionid, String productionname, String address, String startyear, String ownername) {
		super();
		Productionid = productionid;
		Productionname = productionname;
		Address = address;
		Startyear = startyear;
		Ownername = ownername;
	}

	public int getProductionid() {
		return Productionid;
	}
	
	public void setProductionid(int productionid) {
		Productionid = productionid;
	}
	
	public String getProductionname() {
		return Productionname;
	}
	
	public void setProductionname(String productionname) {
		Productionname = productionname;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String address) {
		Address = address;
	}
	public String getStartyear() {
		return Startyear;
	}
	
	public void setStartyear(String startyear) {
		Startyear = startyear;
	}
	
	public String getOwnername() {
		return Ownername;
	}
	
	public void setOwnername(String ownername) {
		Ownername = ownername;
	}

	@Override
	public String toString() {
		return "Productions [Productionid=" + Productionid + ", Productionname=" + Productionname + ", Address="
				+ Address + ", Startyear=" + Startyear + ", Ownername=" + Ownername + "]";
	}
	
	
}
