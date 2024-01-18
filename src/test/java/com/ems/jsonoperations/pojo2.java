package com.ems.jsonoperations;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class pojo2 {
	
	public static void main(String[] args) throws JsonProcessingException {
		
		/**
		 * UI -> Form Data -> Business logic -> Java obj (pojoEmp) -> set and get
		 * pojo - Plain Old Java Object
		 * @return
		 */
		
		pojo1 pojoEmp = new pojo1();
		
		pojoEmp.setFirstName("Faisal");
		pojoEmp.setLattName("Sahap");
		pojoEmp.setEmail("faisalsahap@gmail.com");
		pojoEmp.setSkills(Arrays.asList("Java", "Selenium"));
		
		System.out.println("Before object mapper (pojo):");
		System.out.println("--------------------------------");
		System.out.println(pojoEmp.getFirstName());
		System.out.println(pojoEmp.getLastName());
		System.out.println(pojoEmp.getEmail());
		System.out.println(pojoEmp.getSkills());
		System.out.println("===============================");

		

		ObjectMapper objMapper = new ObjectMapper();
		String jsonValue = objMapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojoEmp);
		System.out.println("After object mapper (json):");
		System.out.println("--------------------------------");
		System.out.println(jsonValue);
		
		
		
		
	}

}
