package com.ems.jsonschema;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;





public class NetworkNtJsonSchemaValidator {
	
	@Test
	public void validateJsonSchema() throws IOException {
		
//		#1.Object Mapper
		ObjectMapper mapper = new ObjectMapper();
		
//		#2. json schema factory
		JsonSchemaFactory factory = JsonSchemaFactory.getInstance(VersionFlag.V4);
		
//		#3. read tree
		File inputJson =new File("src/test/resources/input.json");
		InputStream inputschema = new FileInputStream("src/test/resources/schema.json");
		JsonNode jsonnode = mapper.readTree(inputJson);
		
//		#4. get schema
		JsonSchema schema = factory.getSchema(inputschema);
		
//		#5. validate
		Set<ValidationMessage> result = schema.validate(jsonnode);
		
		if(result.isEmpty()) { System.out.println("Nice job daa..!! No validation error.");}
		else
		{
			for(ValidationMessage message : result) {
				System.out.println(message);
			}
		}
		

}
}