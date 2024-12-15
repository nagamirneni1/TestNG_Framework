package com.Luma_TestCases;

import org.testng.annotations.Test;

import com.Luma_PageObjects.Luma_MyAccountPage;
@Test
public class TC_03_Luma_MyAccount extends Luma_BaseClass {
	public void LumaMyAccounttest() {
		Luma_MyAccountPage lma=new Luma_MyAccountPage(driver);
		lma.clickMendropdown();
		lma.clickJacketlink();
		lma.clickImg();
		lma.clickSize();
		lma.clickColour();
		lma.clickAddToCart();
		lma.clickProceedToCheckOut();
		
	}
	
	
	

}
