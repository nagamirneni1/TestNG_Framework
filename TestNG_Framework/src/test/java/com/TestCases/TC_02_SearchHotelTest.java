package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PageObjects.LoginPage;
import com.PageObjects.SearchHotelPage;
import com.ReusableClass.BaseClass;

public class TC_02_SearchHotelTest extends BaseClass {

	public LoginPage lp;
	public SearchHotelPage sh;
	
	@Test
	public void SearchHotelTest() {
	
			
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
			

}}
