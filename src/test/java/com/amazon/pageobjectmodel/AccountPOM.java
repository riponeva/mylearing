package com.amazon.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPOM {
	
	WebDriver driver;
	 public  AccountPOM (WebDriver driver) {
	  this.driver=driver;
	 
	  PageFactory.initElements(driver, this);
	
	
	 }
	 
	 @FindBy(xpath="//div[contains(text(),'Your Account')]")
	 WebElement act_accountlist;
	 
		public WebElement accountlist () {
			return act_accountlist;
			
		}
	 
	 @FindBy(xpath="//span[contains(text(),'Browsing History')]")
	 WebElement click_Browsinghistory;
	 
		public WebElement Browsinghistory  () {
			return click_Browsinghistory;
		}

}
