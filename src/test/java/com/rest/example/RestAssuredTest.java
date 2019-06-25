package com.rest.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/**
 * Unit test for Rest API Demo
 */
public class RestAssuredTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public RestAssuredTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(RestAssuredTest.class);
	}

	/**
	 * Validate Response Test :-)
	 */
	public void testResponseCode() {
		get("https://swapi.co/api/people/10/").then().assertThat().statusCode(200);
	}

	public void testResponseCode2() {
		given().
			get("https://swapi.co/api/people/10/").
		then().
			assertThat().statusCode(200);
	}

	public void testResponseContentType() {

		get("https://swapi.co/api/people/10/").then().assertThat().contentType("application/json");
	}

	public void testResponse() {
		get("https://swapi.co/api/people/10/").then().body("name", equalTo("Obi-Wan Kenobi"));
	}

	public void testHeadRequest() {
		head("https://swapi.co/api/people/10/").then().assertThat().statusCode(200);
	}

	public void testOptionsRequest() {
		options("https://swapi.co/api/people/10/").then().assertThat().statusCode(200);
	}

	public void testGetRequest() {
		get("http://ip.jsontest.com/").then().body("ip", equalTo("70.48.38.187"));
	}
	
	public void testNoOfFilms(){
		get("https://swapi.co/api/people/10/").then().body("films.size()",equalTo(6));
	}
}
