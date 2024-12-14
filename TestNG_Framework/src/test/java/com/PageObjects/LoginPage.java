package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public   WebDriver driver; 
	public LoginPage(WebDriver driver) { 

		this.driver=driver; 	
		PageFactory.initElements(driver, this);	
	}

	//2.identify the web elements

	@FindBy(id="username")
	WebElement txtUsername;

	@FindBy(id="password")
	WebElement txtPassword;

	@FindBy(id="login")
	WebElement btnLogin;



	//3.Create the actions on corresponding webelements

	public void setUsername() {

		txtUsername.sendKeys("amirneni");  
	}
	
	public void setPassword() {
		txtPassword.sendKeys("amirneni");
	}
	
	public void clickLoginButton() {
		
		btnLogin.click();
	}

}
