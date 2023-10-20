package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)

	@CucumberOptions (tags ="@Login",snippets = SnippetType.CAMELCASE,publish=true,monochrome = false,dryRun = true, features = "src\\test\\resources",glue="com.omrbranch.stepdefenition")
	public class TestRunnerClass extends BaseClass {
	
	@AfterClass
	public static void afterclass() {
	
	


	
}
}	