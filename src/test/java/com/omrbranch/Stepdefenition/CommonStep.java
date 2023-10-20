package com.omrbranch.Stepdefenition;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class CommonStep {
	@Then("user should verify the status Code is {int}")
	
	 public void usershouldverifythestatusCodeis(int expstatusCode) {
		int actStatusCode = TC1_Loginstep.globalDatas.getStatusCode();
		Assert.assertEquals("verify status Code",expstatusCode, actStatusCode);
			
	}

} 
    