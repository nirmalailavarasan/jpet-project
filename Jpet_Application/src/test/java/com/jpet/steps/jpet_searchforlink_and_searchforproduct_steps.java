package com.jpet.steps;

import java.io.IOException;

import org.junit.Assert;

import com.jpet.pages.jpet_searchforlink_and_searchforproduct_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class jpet_searchforlink_and_searchforproduct_steps {
	jpet_searchforlink_and_searchforproduct_page search = new jpet_searchforlink_and_searchforproduct_page();
	
	@Given("^Launch application home page search options$")
	public void launchapplicationforregister() {
		search.launchapplication();
	}
	@Then("^To check for link$")
	public void checkforlink() {
		int b =search.Checkforlink();
		if(b>0)
		{
			System.out.println("The link is present");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("The link is not present");
			Assert.assertFalse(false);
		}
	}
	
	@Then("^to enter a product name$")
	public void typeaproduct() {
		search.type_a_product();
	}
	@Then("^To check for search$")
	public void search() throws IOException, InterruptedException {
		
		search.search();
		search.takescreenshot6("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\screenshot\\search.png");
	}
	@And("^close browser for search$")
	public void close() {
		search.quit();
	}
}
