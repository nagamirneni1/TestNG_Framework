package com.Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_RegistrationPage {
	//1.Constructor
		public WebDriver driver;
		public Luma_RegistrationPage(WebDriver driver) {
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
		
		//2. identified web elements in the page
		
		  @FindBy(xpath="(//a[text()='Create an Account'])[1]")
		  WebElement linkCreateAccount;
		  
		  @FindBy(id="firstname")
		  WebElement txtFirstName;
		  
		  @FindBy(id="lastname")
		  WebElement txtLastName;
		  
		  @FindBy(id="email_address")
		  WebElement txtEmailAddress;
		  
		  @FindBy(id="password")
		  WebElement txtPassword;
		  
		  @FindBy(id="password-confirmation")
		  WebElement txtConfirmPassword;
		  
		  @FindBy(xpath="//button[@class='action submit primary']")
		  WebElement btnCreateAnAccount;
		  
		  //3.Create the corresponding actions
		  
		  public void clickCreateAnAccountLink() {
			  
			  linkCreateAccount.click();
		  }
		  
		  public void setFirstName(String FName) {
			  
			  txtFirstName.sendKeys(FName);	  
		  }
		  
		  public void setLastName(String LName) {
			  
			  txtLastName.sendKeys(LName);
		  }
		  
		  public void setEmailAddress(String Email) {
			  
			  txtEmailAddress.sendKeys(Email);
			  
		  }
		  
		  public void setPassword(String Password) {
			  
			  txtPassword.sendKeys(Password);
		  }
		  
		  public void setConfirmPassword(String CPassword) {
			  
			  txtConfirmPassword.sendKeys(CPassword);
		  }
		  
		  public void clickCreateAnAccountbtn() {
			  btnCreateAnAccount.click();	  
		  }

}
