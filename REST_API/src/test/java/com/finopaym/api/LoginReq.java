package com.finopaym.api;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class LoginReq 
{
	//simple get request for 
	@Test
	public void test_01()
	{
		Response resp = given().
				get("http://samples.openweathermap.org/data/2.5/weather?q=London&appid=b1b15e88fa797225412429c1c50c122a1");
		
		//Response resp = given().
				get("http://beta.finopaymentbank.in:8003/#");
		
		System.out.println(resp.getStatusCode());
		
		//System.out.println(resp.asString());
		
		Assert.assertEquals(resp.getStatusCode(), 200);
		
	}
	
	
	@Test
	public void test_02()
	{
		Response resp = given().
					get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=b1b15e88fa797225412429c1c50c122a1");
		
		System.out.println(resp.getStatusCode());
		
		Assert.assertEquals(resp.getStatusCode(), 401);
	}
}
