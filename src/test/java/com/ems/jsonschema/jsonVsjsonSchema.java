package com.ems.jsonschema;

public class jsonVsjsonSchema {

	/**
	 * JSON - Key value pair JS Object Notations.
	 * {
	 	"id": 1,
  		"firstName" : "Faisal",
  		"lastName" : "Sahap",
  		"email" : "faisalsahap@gmail.com",
  		"skills" : [ "Java", "Selenium" ]
		}
		
		
	 * JSON Schema - plan/representation of how json will look like. (like wireframe)
	 * { 
	 	"id": number, integer
	 	"firstName" : String,
	 	"lastName" : String,
	 	"email" : String, 
	 	"skills" : List 
	 	}
	 	
	 *JSON schema generation and validation
	 *Go to : https://www.liquid-technologies.com/online-json-to-schema-converter
	 *
	 *Converted JSON schema:
	 * 
	 *Below are meta data. It does not involve in validations

{
  "$schema": "http://json-schema.org/draft-04/schema#", -> schema type: draft-04
  "type": "object", -> type: json object
  "title": "Employee Management System", -> title (as like Allure annotations) 
  "description": "EMS", -> description (as like Allure annotations)
  "properties": {
    "id": {
      "type": "integer" -> key, value -> type -> data type of the value
    },
    "firstName": {
      "type": "string"
    },
    "lastName": {
      "type": "string"
    },
    "email": {
      "type": "string"
    },
    "skills": {
      "type": "array",
      "items": [
        {
          "type": "string"
        },
        {
          "type": "string"
        }
      ]
    }
  },
  "required": [ -> required/non-required fields
    "id",
    "firstName",
    "lastName",
    "email",
    "skills"
  ]
}


	 *
	 */

}
