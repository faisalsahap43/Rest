package com.ems.jsonoperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Obj. ref. name can not be a class name
 */

public class jsonWritingexamples {
	
	public static void main (String[] args) throws IOException {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("Name", "Umar Efaz");
		jsonObj.put("Age", 1);
		JSONArray jArray = new JSONArray();
		jArray.add("magical smile");
		jArray.add("Happy Fa");
		jsonObj.put("special", jArray);
		
		FileWriter fWriter = new FileWriter("faisal.json");
		fWriter.write(jsonObj.toJSONString());
		fWriter.close();
		
			
	
	}
	
	

}
