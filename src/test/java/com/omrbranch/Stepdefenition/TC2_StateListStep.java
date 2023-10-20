package com.omrbranch.Stepdefenition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_StateListStep {

	@Given("User add headers for to stateList")
	public void userAddHeadersForToStateList() {
	}
	@When("User send {string} request for stateList endpoint")
	public void userSendRequestForStateListEndpoint(String string) {
	}
	@Then("User should verify the status code is {int}")
	public void userShouldVerifyTheStatusCodeIs(Integer int1) {
	}
	@Then("User should verify the stateList response message matches {string} and saved stateId.")
	public void userShouldVerifyTheStateListResponseMessageMatchesAndSavedStateId(String string) {
	}




}
