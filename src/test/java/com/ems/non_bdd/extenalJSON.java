package com.ems.non_bdd;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

public class extenalJSON {
	
	@Test
	public void createEmployeeFromJsonFile() {
		
		File jsonFile = new File("postData.json");
		given()
			.baseUri("http://localhost:3000")
				.header("Content-Type", "application/json") //if it's .xml file "application/xml"
					.body(jsonFile)
						.when()
							.post("/employees")
								.prettyPrint();
	}

}
