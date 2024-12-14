package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookAHotelPage {
	public static WebDriver driver;
	public Select sc;


	public BookAHotelPage(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);	
	}
	//identify the webelements
	@FindBy(xpath="//input[@id='first_name']")
	WebElement txtfirstname;

	@FindBy(xpath="//input[@id='last_name']")
	WebElement txtlastname;

	@FindBy(xpath="//textarea[@id='address']")
	WebElement txtbillingaddress;

	@FindBy(xpath="//input[@id='cc_num']")
	WebElement txtcardnumber;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	WebElement drpcreditcardtype;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	WebElement drpexpmonth;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	WebElement drpexpyear;

	@FindBy(xpath="//input[@id='cc_cvv']")
	WebElement txtcvvnumber;
	
	@FindBy(xpath = "//input[@id='book_now']")
	WebElement booknowbtn;

	//perform the actions on corresponding webelements
	public void setFirstName()
	{
		txtfirstname.sendKeys("Nagaraja");
	}
	public void setLastName()
	{
		txtlastname.sendKeys("Amirneni");
	}
	public void setBillingAddress()
	{
		txtbillingaddress.sendKeys("Guntur");
	}
	public void setCreditCardNumber()
	{
		txtcardnumber.sendKeys("1234567891234567");
	}
	public void setCreditCardType()
	{
		sc=new Select(drpcreditcardtype);
		sc.selectByIndex(2);
	}
	public void setExpiryMonth()
	{
		sc=new Select(drpexpmonth);
		sc.selectByIndex(5);
	}
	public void setExpiryyear()
	{
		sc=new Select(drpexpyear);
		sc.selectByIndex(5);
	}
	public void setCVVNumber()
	{
		txtcvvnumber.sendKeys("1234");
	}
	public void clickBookNowbutton()
	{
		 booknowbtn.click();
	}
	
}
