package com.amazon.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.amazon.pageobjectmodel.DellPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell {
	
	WebDriver driver;
	
	@Given("^user visits home page of dell$")
	public void user_visits_home_page_of_dell() throws Throwable {
	    
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  
	       driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	       
	       
	       driver.get("https://www.dell.com/");
		
			    
		
		
	}

	@When("^user move to dropdown window and click on solutions$")
	public void user_move_to_dropdown_window_and_click_on_solutions() throws Throwable {
		
		Actions act=new Actions(driver); 
		
		DellPOM obj= new DellPOM (driver);
	    act.moveToElement(obj.Solutions()).build().perform();
	    obj.AllSolutions().click();
		
	}

	@Then("^user should able to redirect to the all solutions page$")
	public void user_should_able_to_redirect_to_the_all_solutions_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	
	
	
	

}
