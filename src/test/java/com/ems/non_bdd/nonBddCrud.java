package com.ems.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * GET ALL
 */
public class nonBddCrud {
	
	@Test(enabled=false)
	public void getAllEmployees() {
		
		/**
		 * 1. Base URI
		 * 2. Request + Specifications
		 * 3. Response
		 */
		
		//1. Base URI -> Along with that We can use path also. But we have to skip while specify the request
		RestAssured.baseURI="http://localhost:3000";
//		RestAssured.baseURI="https://localhost:3000"; //Unsupported or unrecognized SSL message

		
		//2. Request Specifications
		RequestSpecification RequestSpecification = RestAssured.given();//for dummy api, no specification needed.
		
		//3. Response
		Response response = RequestSpecification.request(Method.GET, "/employees");
//		RequestSpecification.request(Method.GET); // if basesURI = "https://localhost:3000/employees"
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
		
//		Run TestNG -> Build path -> Library -> Add Library -> TetsNG or add TestNG dependency 
//		Add @Test annotation
 		
	}
	
	
	
	/**
	 * POST
	 */
	@Test(enabled=false)
	public void createAnEmployee() {
		
		RestAssured.baseURI = "http://localhost:3000";
		
		RequestSpecification RequestSpecification = RestAssured.given()
				.header("Content-Type", "application/json")//postman automatically create a header(Content Type)
				.body("[\n"
						+ "{\n"
						+ "	\"first_name\" : \"Virat\",\n"
						+ "	\"last_name\" : \"Kohli\",\n"
						+ "	\"email\": \"virat@gmail.com\",\n"
						+ "	\"age\": \"35\"\n"
						+ "\n"
						+ "},\n"
						+ "\n"
						+ "{\n"
						+ "	\"first_name\" : \"MS\",\n"
						+ "	\"last_name\" : \"Dhoni\",\n"
						+ "	\"email\": \"dhoni@gmail.com\",\n"
						+ "	\"age\": \"42\"\n"
						+ "},\n"
						+ "\n"
						+ "{\n"
						+ "	\"first_name\" : \"Sachin\",\n"
						+ "	\"last_name\" : \"Tendulkar\",\n"
						+ "	\"email\": \"sachin@gmail.com\",\n"
						+ "	\"age\": \"48\"\n"
						+ "}\n"
						+ "\n"
						+ "]");
		
		Response response = RequestSpecification.request(Method.POST, "/employees");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
				
	}
	
	

	/**
	 * PUT
	 */
	@Test(enabled=false)
	public void updateAnEmployee() {
		
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification RequestSpecification = RestAssured
				.given().header("Content-Type", "application/json").body("{\n"
						+ "	\"first_name\" : \"Hardik\",\n"
						+ "	\"last_name\" : \"Pandya\",\n"
						+ "	\"email\": \"hardik@gmail.com\",\n"
						+ "	\"age\": \"33\"\n"
						+ "}");
		
		Response response = RequestSpecification.request(Method.PUT, "/employees/5");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}
	
	/**
	 * DELETE
	 */
	@Test(enabled=false)
	public void deleteAnEmployee() {
		
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification RequestSpecification = RestAssured.given();
		Response response = RequestSpecification.request(Method.DELETE, "/employees/6");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}
	
	/**
	 * GET A SINGLE EMPLOYEE
	 */
	@Test
	public void GetAnEmployee() {
		
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification RequestSpecification = RestAssured.given();
		Response response = RequestSpecification.request(Method.GET, "/employees/2");
		System.out.println(response.asPrettyString());
		System.out.println(response.statusLine());
	}
}
