package com.ems.bdd;

import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;// No need to write RestAssured, go with given, when, then

public class getAllEmployees {

	/**
	 * BDD Style -> Given, When, Then  -> Jira, Cucumber
	 * GET
	 */
	@Test(enabled = false)
	public void getEmployeesBDD() {

//		RestAssured
//			.given().baseUri("http://localhost:3000")
			given().baseUri("http://localhost:3000")
				.when().get("/employees")
					.prettyPrint();
	}
	
	
	/**
	 * CREATE
	 */
	@Test(enabled=false)
	public void createAnEmployeeBDD() {
		given().baseUri("http://localhost:3000")
			.header("Content-Type", "application/json")
				.body("{\n"
						+ "	\"first_name\" : \"Ricky\",\n"
						+ "	\"last_name\" : \"Ponting\",\n"
						+ "	\"email\": \"ricky@gmail.com\",\n"
						+ "	\"age\": \"45\"\n"
						+ "}")
				.when()
					.post("/employees")
						.prettyPrint();
		
	}
	
	
	/**
	 * PUT
	 */
	@Test(enabled=false)
	public void updateAnEmployeeBDD() {
		given().baseUri("http://localhost:3000/employees/15")
			.header("Content-Type", "application/json")
				.body("{\n"
						+ "	\"first_name\" : \"Ricky\",\n"
						+ "	\"last_name\" : \"Ponting\",\n"
						+ "	\"email\": \"ricky@gmail.com\",\n"
						+ "	\"team\": \"Australia\"\n"
						+ "}")
				.when()
					.put()
						.prettyPrint();
		
	}
	
	/**
	 * DELETE
	 */
	@Test(enabled=false)
	public void deleteAnEmployeeBDD() {
		given().baseUri("http://localhost:3000/employees")
				.when()
					.delete("/8")
						.prettyPrint();
		
	}
}
