package com.Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Luma_TestCases.Luma_BaseClass;

public class Luma_AddressPage extends Luma_BaseClass{
	
	public static WebDriver driver;
	
	//constructor
	public Luma_AddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//identifying webelements
	//@FindBy
	
	
	

}
