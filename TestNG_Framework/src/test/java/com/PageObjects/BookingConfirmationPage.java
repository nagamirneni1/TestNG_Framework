package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookingConfirmationPage {
	public static WebDriver driver;
	


	public BookingConfirmationPage(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);	
	}
	//identifying the webelements
	@FindBy(xpath ="//input[@id='my_itinerary']")
	WebElement myitinerybtn;
	
	//perform the actions on corresponding webelements
	public void clickMyItinerybutton()
	{
		myitinerybtn.click();
	}

}
