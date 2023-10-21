package com.example.productionproject.model;

public class Member {
	private String name;
	private String password;
	private String email;
	private String location;
	
	
	public Member() {
		super();
	}
	
	public Member(String name, String password, String email, String location) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.location = location;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", password=" + password + ", email=" + email + ", location=" + location + "]";
	}
	
}
