package com.amazon.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//WebDriver driver;
//public UserLogin(WebDriver drive){
//this driver=driver (Local page Factory.init.Elements)






public class SigninaPOM {
	
	WebDriver driver;
	 public  SigninaPOM (WebDriver driver) {
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
	 
	 
	 
	 
	 
	 
	 
	 
	 
	@FindBy(xpath="//a[@href=\"/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc\"]")
	WebElement click_giftcards;
	
	public WebElement giftcards () {
		return click_giftcards;
					
	
	}
	
	@FindBy(xpath="//a[@href=\"/holidaydash?ref_=nav_cs_td_dash_dt_cr\"]")
	WebElement click_holiday;
	
	public WebElement holiday () {
		return click_holiday;
	}
	
	@FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	WebElement click_bestsellers ;
	
	public WebElement bestsellers () {
		return  click_bestsellers;
	
	}
	
	@FindBy(xpath="//script[@src=\"https://images-na.ssl-images-amazon.com/images/I/71uAHTPElNL.js\"]")
	WebElement type_search;
	
	public WebElement search() {
		return  type_search;
		
	}
	
	@FindBy(xpath="//script[@src=\"https://images-na.ssl-images-amazon.com/images/I/71uAHTPElNL.js\"]")
	WebElement type_selectyouraddress; 
	
	public WebElement selectyouraddress() {
		return type_selectyouraddress; 
	}
		
	
	
	
	
	
}
