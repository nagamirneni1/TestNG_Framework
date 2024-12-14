package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage {
	//Constructor
		public  WebDriver driver;
		public Select sc;
		
		
		public SearchHotelPage(WebDriver driver) {
			
			this.driver=driver;
			
			PageFactory.initElements(driver, this);	
		}
		
		//2.identify the web elements
		
		@FindBy(id="location")
		WebElement drpLocation;
		
		@FindBy(id="room_nos")
		WebElement drpRoomNo;
		
		@FindBy(id="datepick_in")
		WebElement txtDatePickIn;
		
		@FindBy(id="datepick_out")
	    WebElement txtDatePickOut;
		
		@FindBy(id="adult_room")
		WebElement drpAdultRoom;
		
		
	
		@FindBy(id="Submit")
		WebElement btnSubmit;
		
		
		//3.Create the  actions to corresponding elements
		
		public void setLocation() {
			sc=new Select(drpLocation);
			sc.selectByIndex(2);
		}
		
		public void setRoomNo() {
			
			sc=new Select(drpRoomNo);
			sc.selectByIndex(2);
		}
		
		public void setDatePickIn() {
			txtDatePickIn.sendKeys("10/09/2024");	
		}
		
		public void setDatePickOut() {
			txtDatePickOut.sendKeys("11/09/2024");
		}
		public void setAdultsPerRoom()
		{
			sc=new Select(drpAdultRoom);
			sc.selectByIndex(1);
		}
			
	
		public void clickSearchButton() {
			btnSubmit.click();
		}

}
