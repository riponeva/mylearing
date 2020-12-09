package com.amazon.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.pageobjectmodel.AmazonpagePOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonpage {
	WebDriver driver;
	
	@Given("^customer went to homepage of amazon$")
	public void customer_went_to_homepage_of_amazon() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  
	       driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	       
	       
	       driver.get("https://www.amazon.com/");
		
	    // Thread.sleep(2000);
		
		
	}

	@When("^customer click on Gift cards$")
	public void customer_click_on_Gift_cards() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmazonpagePOM obj=new AmazonpagePOM(driver); 
		obj.giftcards().click();
		
		//Thread.sleep(2000);
		
		WebDriverWait wait=new WebDriverWait(driver,20);
				
	}

	
	@When("^customer click on Best sellers$")
	public void customer_click_on_Best_sellers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmazonpagePOM obj=new AmazonpagePOM(driver); 
		obj.bestsellers().click();
		
		//Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,20);
			
	}

	@When("^customer type search$")
	public void customer_type_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmazonpagePOM obj=new AmazonpagePOM(driver); 
		obj.search().sendKeys(Keys.ENTER);
		
		//Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,20);
	}

	@Then("^customer type Select your address$")
	public void customer_type_Select_your_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		AmazonpagePOM obj=new AmazonpagePOM(driver); 
		obj.selectyouraddress().sendKeys(Keys.ENTER);
		
		
	}
	
	
	
	
	
	
	
	
}
