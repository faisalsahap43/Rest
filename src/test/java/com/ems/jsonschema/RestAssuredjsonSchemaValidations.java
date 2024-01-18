package com.ems.jsonschema;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredjsonSchemaValidations {
	
//	@Test(enabled=false)
//	public void validatingusingJsonSchemaInClassPath() {
//		
//		File inputjson = new File("src/test/resources/input.json");
////		File schemajson = new File("/src/test/resources/schema.json"); once you define in file under resource,
////		no need to mention path in schema validations
//		
//
//		
//		RestAssured
//		
//		.given().baseUri("http://localhost:3000")
//		.header("Content-Type", "application/json")
//			.body(inputjson)
//			  .when()
//				.post("/employees")
//					.then()
//						    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
//	
//	
//
//
//	}
	
	@Test
	public void validatingusingJsonSchema() throws FileNotFoundException {
		
		File inputjson = new File("src/test/resources/input.json");
		Reader inputschema = new FileReader("src/test/resources/schema.json");

//		File schemajson = new File("/src/test/resources/schema.json"); once you define in file under resource,
//		no need to mention path in schema validations
		

		
		RestAssured
		.given().baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
			.body(inputjson)
			  .when()
				.post("/employees")
					.then()
					//provide variable(input json or whole json value. Not the path) 
//				    .body(JsonSchemaValidator.matchesJsonSchema(inputjson)); //provide input id as a string ("")
					//below, provide input id as a integer ()
		.body(JsonSchemaValidator.matchesJsonSchema("\n"
				+ "\n"
				+ "{\n"
				+ "  \"$schema\": \"http://json-schema.org/draft-04/schema#\",\n"
				+ "  \"type\": \"object\",\n"
				+ "  \"properties\": {\n"
				+ "    \"id\": {\n"
				+ "      \"type\": \"integer\"\n"
				+ "    },\n"
				+ "    \"firstName\": {\n"
				+ "      \"type\": \"string\"\n"
				+ "    },\n"
				+ "    \"lastName\": {\n"
				+ "      \"type\": \"string\"\n"
				+ "    },\n"
				+ "    \"email\": {\n"
				+ "      \"type\": \"string\"\n"
				+ "    },\n"
				+ "    \"skills\": {\n"
				+ "      \"type\": \"array\",\n"
				+ "      \"items\": [\n"
				+ "        {\n"
				+ "          \"type\": \"string\"\n"
				+ "        },\n"
				+ "        {\n"
				+ "          \"type\": \"string\"\n"
				+ "        }\n"
				+ "      ]\n"
				+ "    }\n"
				+ "  },\n"
				+ "  \"required\": [\n"
				+ "    \"id\",\n"
				+ "    \"firstName\",\n"
				+ "    \"lastName\",\n"
				+ "    \"email\",\n"
				+ "    \"skills\"\n"
				+ "  ]\n"
				+ "}\n"
				+ "\n"
				+ "\n"
				+ "")); //provide input id ("")
	  

	
	


	}


}
