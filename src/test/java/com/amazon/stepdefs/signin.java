package com.amazon.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.pageobjectmodel.SigninPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signin {
	
	WebDriver driver;
	
	@Given("^user visit homepage$")
	public void user_visit_homepage() throws Throwable {
		
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  
	       driver = new ChromeDriver();
	       
	       
	       
	       driver.get("https://www.amazon.com");
		}
		catch(Exception e) {
			System.out.println("browser and url not working");
		}
		
	}

	@Given("^clicks My Account button$")
	public void clicks_My_Account_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		SigninPOM obj=new SigninPOM(driver);
		obj.signin().click();
		
		
	}

	@When("^user enter to \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_to_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		SigninPOM obj=new SigninPOM(driver);
		obj.email().click();
		
	}

	@When("^user click  sign in button$")
	public void user_click_sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user successfully signin to the system$")
	public void user_successfully_signin_to_the_system() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user clicks on Log off Button for logout$")
	public void user_clicks_on_Log_off_Button_for_logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	
	
	
	
	
	
	

}
