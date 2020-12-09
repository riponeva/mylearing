package com.amazon.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPOM {
	WebDriver driver;
	 public  SigninPOM (WebDriver driver) {
	  this.driver=driver;
	 
	  PageFactory.initElements(driver, this);
	 }
	
	@FindBy(xpath="//div[@class=\"nav-signin-tooltip-footer\"]")
WebElement click_signin;
	
	public WebElement signin () {
		return click_signin;
					
	}
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement type_email;
	
	public WebElement email() {
		return type_email;
		
	}
	 
	 
	 
	 
	 
		 
	 
}
