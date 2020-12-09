package com.amazon.stepdefs;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.amazon.pageobjectmodel.AccountPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Account {
	WebDriver driver;
	@Given("^user visits home page of amazon$")
	public void user_visits_home_page_of_amazon() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  
	       driver = new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	       driver.manage().window().maximize();
	       
	       
	       driver.get("https://www.amazon.com/");
		
			    
	}

	@When("^user move to dropdown menu/window and click on courses$")
	public void user_move_to_dropdown_menu_window_and_click_on_courses() throws Throwable {
		Actions act=new Actions(driver); 
		
		AccountPOM obj= new AccountPOM(driver);
		act.moveToElement(obj.accountlist()).build().perform();
		obj.Browsinghistory().click();
		
		//Thread.sleep(2000);
		
	//	act.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[12] "))).build().perform();
		
	//	Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("\"//*[@id=\\\"contentGrid_951542\\\"]/div/div[2]/div[1]/div/div/div[2]/a")).click();
	}

	@Then("^user should able to redirect to the courses page$")
	public void user_should_able_to_redirect_to_the_courses_page() throws Throwable {
		//Actions act=new Actions(driver); 
		
		//ActionPOM obj1=new ActionPOM(driver);
		
	    //obj1.Browsinghistory().click();
		
	}

}
	
	
	
	
	
	
	


