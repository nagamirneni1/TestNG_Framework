package com.TestCases;

import org.testng.annotations.Test;

import com.PageObjects.LoginPage;
import com.ReusableClass.BaseClass;

public class TC_01_LoginTest extends BaseClass {
public  LoginPage lp;
	
	@Test
	public void LoginTest() {
		
		lp=new LoginPage(driver);
		
	    lp.setUsername();
	    lp.setPassword();
	    lp.clickLoginButton();	
	}
	
	

}
