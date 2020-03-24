package com.jpet.steps;

import java.io.IOException;

import com.jpet.pages.jpet_register_and_addtocart_page;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class jpet_register_and_addtocart_steps {
	jpet_register_and_addtocart_page register = new jpet_register_and_addtocart_page();

	@Given("^Launch application home page for register$")
	public void launchapplicationforregister() {
		register.launchapplication();
	}
	@Then("^To check for registeration$")
	public void register() throws InterruptedException, IOException  {
		register.register();
	}
		
			
	@Then("^select product category$")
	public void select_catogory() {
		register.selectcategory();
	}
	@Then("^select product$")
	public void select_product() {
		register.selectproduct();
	}
	@Then("^To check for add to cart$")
	public void addtocart() throws IOException, InterruptedException {
		 
		register.addtocart();
		register.takescreenshot1("C:\\Users\\Lenovo\\Desktop\\nirmala\\Jpet_Application\\src\\test\\resources\\screenshot\\addtocart.png");
	}
	@And("^close browser$")
	public void close() {
		register.quit();
	}
	
}
