package com.ems.jsonoperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Serialization {
	
	/**
	 * Json writing -> json simple object -. put -> Json
	 * serialization -> Java Collections (DS, DT -> map and list) -> put -> not a json
	 * Frontend UI -> Backend Business Logic (contex based(manipulation) -> serialize 
	 */
	
	@Test
	public void serialization() {
		
		List<String> teamList = new ArrayList<>();
		
		Map<String, Object> jsonBody = new HashMap<String, Object>();
		
		jsonBody.put("Tournament", "Olymbics");
		jsonBody.put("Event_Type", "Hockey");
		
		teamList.add("India");
		teamList.add("Australia");
		teamList.add("Netherland");
		teamList.add("France");
		
		jsonBody.put("teamListKey", teamList);
		
		System.out.println(jsonBody);
		
		//can not convert java collections to JSON.
		//Cannot serialize object because no JSON serializer found in classpath. 
		//Please put Jackson (Databind), Gson, Johnzon, or Yasson in the classpath.
		
		RestAssured.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
		.body(jsonBody)
		.log()
		.all()
		.when()
		.post("/employees")
		.then()
		.log()
		.all();
		
	}

}


//{Event_Type=Hockey, Tournament=Olymbics, teamListKey=[India, Australia, Netherland, France]}
//Request method:	POST
//Request URI:	http://localhost:3000/employees
//Proxy:			<none>
//Request params:	<none>
//Query params:	<none>
//Form params:	<none>
//Path params:	<none>
//Headers:		Accept=*/*
//				Content-Type=application/json
//Cookies:		<none>
//Multiparts:		<none>
//Body:
//{
//    "Event_Type": "Hockey",
//    "Tournament": "Olymbics",
//    "teamListKey": [
//        "India",
//        "Australia",
//        "Netherland",
//        "France"
//    ]
//}
//HTTP/1.1 201 Created
//X-Powered-By: Express
//Vary: Origin, X-HTTP-Method-Override, Accept-Encoding
//Access-Control-Allow-Credentials: true
//Cache-Control: no-cache
//Pragma: no-cache
//Expires: -1
//Access-Control-Expose-Headers: Location
//Location: http://localhost:3000/employees/16
//X-Content-Type-Options: nosniff
//Content-Type: application/json; charset=utf-8
//Content-Length: 153
//ETag: W/"99-Bu9fTvhtnjJOztz6VwbnA7qjRso"
//Date: Tue, 14 Nov 2023 01:08:37 GMT
//Connection: keep-alive
//Keep-Alive: timeout=5
//
//{
//    "Event_Type": "Hockey",
//    "Tournament": "Olymbics",
//    "teamListKey": [
//        "India",
//        "Australia",
//        "Netherland",
//        "France"
//    ],
//    "id": 16
//}
//PASSED: serialization
//
//===============================================
//    Default test
//    Tests run: 1, Failures: 0, Skips: 0
//===============================================
//
//
//===============================================
//Default suite
//Total tests run: 1, Failures: 0, Skips: 0
//===============================================
//
