package com.Luma_TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.Luma_PageObjects.Luma_RegistrationPage;



public class TC_01_Luma_Registration extends Luma_BaseClass {
	

	@Test
	public void LumaRegistrationtest(){
		
		Luma_RegistrationPage lr=new Luma_RegistrationPage(driver);
         
		
//		lr.clickCreateAnAccountLink();
//		lr.setFirstName(null);
//		lr.setLastName(null);
//		lr.setEmailAddress(null);
//		lr.setPassword(null);
//		lr.setConfirmPassword(null);
//		lr.clickCreateAnAccountbtn();
	
		
	
		lr.clickCreateAnAccountLink();
		log.info("Luma create an account is clicked successfully");
		lr.setFirstName(FName);
		log.info("First name entered successfully");
		lr.setLastName(LName);
		log.info("Last name entered successfully");
		lr.setEmailAddress(EmailAdd);
		log.info("email address entered successfully");
		lr.setPassword(Password);
		log.info("password entered successfully");
		lr.setConfirmPassword(CPassword);
		log.info("confirm password entered successfully");
		lr.clickCreateAnAccountbtn();
		log.info("create an account button clicked successfully");
		
		
		
		//Hard Assertions
		
		String act_title=driver.getTitle();
		String exp_title="My Account";
		if(exp_title.equals(act_title))
		{
			Assert.assertTrue(true);
			System.out.println("test case is passed");
		}
		else
		{
			System.out.println("test case is failed");
			Assert.assertTrue(false);
		}
	

}}

