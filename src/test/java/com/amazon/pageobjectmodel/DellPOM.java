package com.amazon.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellPOM {

	WebDriver driver;
	 public  DellPOM (WebDriver driver) {
	  this.driver=driver;
	 
	  PageFactory.initElements(driver, this);
	
	 }
	 
	 @FindBy (xpath="//button[@id='l2']")
	  WebElement click_Solutions;
	  
	 public WebElement Solutions() {

         return click_Solutions;
         
	 }
	
	@FindBy (xpath="//header/div[3]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	WebElement click_AllSolutions;
	public WebElement AllSolutions() {
		return click_AllSolutions;
	}
	
	
	
	
}
