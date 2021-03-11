package com.demo.core;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestRegistration {

	@Test (dataProvider = "registrationDetails")
	public void testRegiatration (RegisterationDetails details) {
		// arrange
		String registrationEndpoint  = "https://harness.io/wp-json/api/signup?url=https://app.harness.io/gateway/api/users/new-trial";
		
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.body((String)new Gson().toJson(details));
		
		// act
		Response response = request.post(registrationEndpoint);
		System.out.println("Response is: " + response.getBody().asString());
		
		// assert
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@DataProvider(name = "registrationDetails")
	public Object[][] registrationDetails() {

		 return new Object[][]{ 
			 { new RegisterationDetails("Robert1@google.com", "Robert1", "Robert@123", "Roberto Services", "Royal Robert")},
			 { new RegisterationDetails("Robert2@google.com", "Robert2", "Robert@123", "Roberto Services", "Royal Robert")},
			 { new RegisterationDetails("Robert3@google.com", "Robert3", "Robert@123", "Roberto Services", "Royal Robert")},
			 { new RegisterationDetails("Robert4@google.com", "Robert4", "Robert@123", "Roberto Services", "Royal Robert")},
			 { new RegisterationDetails("Robert5@google.com", "Robert5", "Robert@123", "Roberto Services", "Royal Robert")},
			 
		 };
	}
	
}
