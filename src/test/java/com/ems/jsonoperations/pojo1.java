package com.ems.jsonoperations;

import java.util.List;

public class pojo1 {
	
	private String firstName;
	private String lastName;
	private String email;
	private List skills;
	
	/**
	 * UI -> Form Data -> Business logic -> Java obj (pojoEmp) -> set and get
	 * pojo - Plain Old Java Object
	 * @return
	 */
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLattName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List getSkills() {
		return skills;
	}
	public void setSkills(List skills) {
		this.skills = skills;
	}
	
	
	
	
	


}
