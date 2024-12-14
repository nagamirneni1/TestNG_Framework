package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookedItineryPage {
	public static WebDriver driver;
	


	public BookedItineryPage(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);	
	}
	//identifying the elements
	@FindBy(xpath ="//input[@id='logout']")
	WebElement logoutbtn;
	
	//perform the actions on corresponding webelements
	public void clickLogOutbutton()
	{
		logoutbtn.click();
	}

}
