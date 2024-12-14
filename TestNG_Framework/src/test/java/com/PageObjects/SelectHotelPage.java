package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectHotelPage {
	public static WebDriver driver;
	public Select sc;
	
	
	public SelectHotelPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);	
	}
	//identify the web elements
	@FindBy(xpath="//input[@id='radiobutton_1']")
	WebElement radiobtn;
	
	@FindBy(xpath="//input[@id='continue']") 
	WebElement btncontinue;
	
	//create the corresponding actions
	public void clickRadiobutton() {
		radiobtn.click();
	}
	public void clickContinuebutton() {
		btncontinue.click();
	}
	

}
