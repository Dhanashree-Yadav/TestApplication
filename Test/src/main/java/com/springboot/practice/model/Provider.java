package com.springboot.practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "provider")
public class Provider {
	@Id
	private String id;
	private String fname;
	private String lname;
	private String city;
	private String phone;
	private boolean isblock;

	public Provider(String id, String fname, String lname, String city, String phone, boolean isblock) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.phone = phone;
		this.isblock = isblock;
	}

	public Provider() {
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

	public boolean isIsblock() {
		return isblock;
	}

	public void setIsblock(boolean isblock) {
		this.isblock = isblock;
	}

}
