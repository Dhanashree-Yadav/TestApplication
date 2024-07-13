package com.springboot.practice.response;

public class ProviderResponse {
	String id;
	String fname;
	String lname;
	String city;
	String phone;

	public ProviderResponse(String id, String fname, String lname, String city, String phone) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.phone = phone;
	}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
