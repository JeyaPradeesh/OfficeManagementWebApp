package com.officemanagement.model;

public class Dept {
	private String id;
	private String name;
	public Dept() {
		super();
	}
	public Dept(String name) {
		super();
		this.name = name;
	}
	public Dept(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
