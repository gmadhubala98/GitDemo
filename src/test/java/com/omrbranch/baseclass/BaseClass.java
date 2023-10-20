package com.omrbranch.baseclass;


	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class BaseClass {
		RequestSpecification reqspec;
		public Response response;
		public void addBasicAuth(String username, String password) {
			reqspec = reqspec.auth().preemptive().basic(username, password);


		}
		
		public void addHeader(String key, String value) {
			reqspec = RestAssured.given().header(key,value);

		}
		
		
		public void addBody(String body) {
			reqspec = reqspec.body( body);

			}
		public Response reqType(String type ,String endpoint) {
			switch(type){
			case "Get":
				response = reqspec.log().all().get(endpoint);
				break;
			case "Post":
				response = reqspec.log().all().post(endpoint);
				break;

			case "Put":
				response = reqspec.log().all().put(endpoint);
				break;

			case "Patch":
				response = reqspec.log().all().patch(endpoint);
				break;

			case "Delete":
				response = reqspec.log().all().delete(endpoint);
				break;	
			default:
				break;
			}
			return response;

		}
		public int getStatusCode(Response response) {
			int StatusCode = response.getStatusCode();
			return StatusCode;

		}
		public String getpropertyfilevalue(String string) {
			String asString = string.toString();

			return asString;
		}
		
		public String getresBodyasString(Response response) {
			String asString = response.asString();
			return asString;

		}
		
		public String getResAsPrettyString(Response response) {
			String asPreetyString = response.asPrettyString();
			return asPreetyString;


		}
		  

	}