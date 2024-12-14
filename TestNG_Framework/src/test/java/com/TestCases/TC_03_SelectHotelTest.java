package com.TestCases;

import org.testng.annotations.Test;

import com.PageObjects.LoginPage;
import com.PageObjects.SearchHotelPage;
import com.PageObjects.SelectHotelPage;
import com.ReusableClass.BaseClass;

public class TC_03_SelectHotelTest extends BaseClass {

	public LoginPage lp;
	public SearchHotelPage sh;
	public SelectHotelPage shp;
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
			
			
			//select hotel
			shp=new SelectHotelPage(driver);
			shp.clickRadiobutton();
			shp.clickContinuebutton();
			
			
			
			
			


}
}