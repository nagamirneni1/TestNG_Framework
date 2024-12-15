package com.Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_LoginPage {
	//This page is divided into three parts
	//constructor
	public WebDriver driver;
	public Luma_LoginPage(WebDriver driver)
	{
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	}
	
	//identifying the webelements
	@FindBy(xpath="//input[@id='email']")
	WebElement txtEmail;
	
	@FindBy(id="pass")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@id='send2']")
	WebElement btnSignin;
	
	//create actions on correseponding webelements
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void clickSigninbutton()
	{
		btnSignin.click();
	}
	public void clearEmail()
	{
		txtEmail.clear();
	}
	public void clearPassword()
	{
		txtPassword.clear();
	}


}
