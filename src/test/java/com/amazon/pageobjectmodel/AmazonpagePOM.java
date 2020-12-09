package com.amazon.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonpagePOM {

	
	WebDriver driver;
	 public  AmazonpagePOM (WebDriver driver) {
	  this.driver=driver;
	 
	  PageFactory.initElements(driver, this);
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
		
		@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[3]")
		WebElement click_bestsellers ;
		
		public WebElement bestsellers () {
			return  click_bestsellers;
		
		}
		
		@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
		WebElement type_search;
		
		public WebElement search() {
			return  type_search;
			
		}
	 
		@FindBy(xpath="//*[@id=\"glow-ingress-line2\"]")
		WebElement type_selectyouraddress; 
		
		public WebElement selectyouraddress() {
			return type_selectyouraddress; 
		}
			
		
	 
	 
	 
	 
	 
	
	
	
	
	
	
}
