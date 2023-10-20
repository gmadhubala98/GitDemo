package com.omrbranch.Stepdefenition;

import com.omebranch.endpoints.EndPoints;
import com.omrbranch.Pojo.login.Login_Output_Pojo;
import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.globaldatas.GlobalDatas;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC1_Loginstep extends BaseClass{
	static  GlobalDatas globalDatas= new GlobalDatas();
	
	Response response;

	@Given("User add header")
	public void userAddHeader() {
		addHeader("accept","application/json");
		System.out.println();
	}
	@When("User add basic authentication for login")
	public void userAddBasicAuthenticationForLogin() {
		addBasicAuth(getpropertyfilevalue("username"),getpropertyfilevalue("password"));
	}
	
	@When("User send {string} request for login endpoint")
	public void userSendRequestForLoginEndpoint(String type) {
		response = reqType(type,EndPoints.LOGIN);
			int StatusCode =  getStatusCode(response);
		globalDatas.setStatusCode(StatusCode);
		
	}
	
	@Then("User should verify the login response body firstname present as {string} and get the logtokens saved.")
	public void userShouldVerifyTheLoginResponseBodyFirstnamePresentAsAndGetTheLogtokensSaved(String expfirstName, String firstName) {
	Login_Output_Pojo Login	Output_Pojo
	}


	


	

}
