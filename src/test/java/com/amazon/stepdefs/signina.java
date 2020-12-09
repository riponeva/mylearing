package com.amazon.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.pageobjectmodel.SigninPOM;
import com.amazon.pageobjectmodel.SigninaPOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signina {
	WebDriver driver;

	@Given("^User visits home page of amazon$")
	public void user_visits_home_page_of_amazon() throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  
	       driver = new ChromeDriver();
	       
	       
	       
	       driver.get("https://www.amazon.com");
		
		
	    
	}	    

	@When("^User insert valid “<E-mail address>” and valid “<password>”$")
	public void user_insert_valid_E_mail_address_and_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		SigninaPOM obj=new SigninaPOM(driver);
		obj.email().clear();
		
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		

		SigninaPOM obj=new SigninaPOM(driver);
		obj.signin().click();
		
		
	}

	@Then("^User can successfully Login to Facebook$")
	public void user_can_successfully_Login_to_Facebook() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	
		
		
		
	}


	
	
	
	
	
	
	
	
}
