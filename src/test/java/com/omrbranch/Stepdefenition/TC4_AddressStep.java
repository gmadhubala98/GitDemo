package com.omrbranch.Stepdefenition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_AddressStep {

	@Given("User add header and bearer authorization for accessing address endpoint")
	public void userAddHeaderAndBearerAuthorizationForAccessingAddressEndpoint() {
	}
	@When("User add request body for add new address {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void userAddRequestBodyForAddNewAddress(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10) {
	}
	@When("User send {string} request for adduser address endpoint")
	public void userSendRequestForAdduserAddressEndpoint(String string) {
	}
	@Then("User should verify the status code is {int}")
	public void userShouldVerifyTheStatusCodeIs(Integer int1) {
	}
	@Then("User should verify the add user address response message matches {string}")
	public void userShouldVerifyTheAddUserAddressResponseMessageMatches(String string) {
	}




}
