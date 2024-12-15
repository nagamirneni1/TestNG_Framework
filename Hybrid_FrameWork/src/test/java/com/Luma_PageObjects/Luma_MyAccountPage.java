package com.Luma_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Luma_MyAccountPage {
	public WebDriver driver;
	//constructor
	public Luma_MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//identifying webelements 
	@FindBy(xpath ="//a[@id='ui-id-5']/span[1]")
	WebElement drpmen;
	
	@FindBy(xpath="//main[@id='maincontent']/div[4]/div[2]/div[2]/div/ul[1]/li[2]/a")
	WebElement linkjackets;
	
	@FindBy(xpath = "//main[@id='maincontent']/div[3]/div[1]/div[3]/ol/li[1]/div/a/span/span/img")
	WebElement img;
	
	
	@FindBy(id="option-label-size-143-item-168")
	WebElement size;
	
	@FindBy(id="option-label-color-93-item-50")
	WebElement colorblue;
	
	@FindBy(xpath = "//button[@id='product-addtocart-button']/span")
	WebElement btnaddtocart;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a/span[2]")
	WebElement imgcart;
	
	@FindBy(xpath="//button[@id='top-cart-btn-checkout']")
	WebElement btnproceedtocheckout;
	
	//create the actions on corresponding webelements
	public void clickMendropdown()
	{
		drpmen.click();
	}
	public void clickJacketlink()
	{
		linkjackets.click();
	}
	public void clickImg()
	{
		img.click();
	}
	public void clickSize()
	{
		size.click();
	}
	public void clickColour()
	{
		colorblue.click();
	}
	public void clickAddToCart()
	{
		btnaddtocart.click();
	}
	public void clickProceedToCheckOut()
	{
		btnproceedtocheckout.click();
	}
	

}
