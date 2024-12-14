package com.TestCases;

import org.testng.annotations.Test;

import com.PageObjects.BookAHotelPage;
import com.PageObjects.BookingConfirmationPage;
import com.PageObjects.LoginPage;
import com.PageObjects.SearchHotelPage;
import com.PageObjects.SelectHotelPage;
import com.ReusableClass.BaseClass;

public class TC_05_BookingConfirmationTest extends BaseClass {
	public LoginPage lp;
	public SearchHotelPage sh;
	public SelectHotelPage shp;
	public BookAHotelPage bh;
	public BookingConfirmationPage bcp;
	@Test
	public void BookingConfirmationTest() {
	
			
			//Login
			lp=new LoginPage(driver);
			lp.setUsername();
			lp.setPassword();
			lp.clickLoginButton();
			
			//Search Hotel
			sh=new SearchHotelPage(driver);
			sh.setLocation();
			sh.setRoomNo();
			sh.setDatePickIn();
			sh.setDatePickOut();
			sh.setAdultsPerRoom();
			sh.clickSearchButton();
			
			
			//select hotel
			shp=new SelectHotelPage(driver);
			shp.clickRadiobutton();
			shp.clickContinuebutton();
			
			//bookahotel
			bh=new BookAHotelPage(driver);
			bh.setFirstName();
			bh.setLastName();
			bh.setBillingAddress();
			bh.setCreditCardNumber();
			bh.setCreditCardType();
			bh.setExpiryMonth();
			bh.setExpiryyear();
			bh.setCVVNumber();
			bh.clickBookNowbutton();
			
			//booking confirmation page
			bcp=new BookingConfirmationPage(driver);
			bcp.clickMyItinerybutton();


}}
