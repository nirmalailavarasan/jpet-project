package com.jpet.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature/jpet_application.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@TC01_Register_and_Addtocart,@TC02_Searchforlink_and_Product,@TC03_Printproducttable"},
		glue = {"com.jpet.steps"},
		monochrome = true	
		)
public class jpet_application_runner {

}
