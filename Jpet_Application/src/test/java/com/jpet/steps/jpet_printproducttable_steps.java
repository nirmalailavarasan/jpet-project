package com.jpet.steps;

import com.jpet.pages.jpet_printproducttable_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class jpet_printproducttable_steps {
	jpet_printproducttable_page product = new jpet_printproducttable_page();
	@Given("^Launch application home page for print product table$")
	public void launchapplicationforregister() {
		product.launchapplication();
	}
	
	@Then("^To select category$")
	public void selectcategoryprint() {
		product.selectcategorytoprint();
	}
	@Then ("^To check for print table$")
	public void printproducttable() {	
		product.printproducttable();
	}
	@And("^close browser for print$")
	public void close() {
		product.quit();
	}
}
