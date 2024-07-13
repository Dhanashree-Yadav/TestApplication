package com.springboot.practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity(name = "pqueue")
public class Pqueue {
	@Id
	private String id;
	private String sid;
	private String pid;

	public Pqueue() {
	}

	public Pqueue(String id, String sid, String pid) {
		super();
		this.id = id;
		this.sid = sid;
		this.pid = pid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

}
