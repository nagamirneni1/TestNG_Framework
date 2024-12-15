package com.Luma_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Luma_PageObjects.Luma_LoginPage;
import com.Luma_Utilities.XLUtils;

public class TC_02_Luma_Login extends Luma_BaseClass {

	@Test(dataProvider = "LumaLoginData")
	public void logintest(String Email,String Password) throws InterruptedException
	{
		Luma_LoginPage ll=new Luma_LoginPage(driver);
		ll.setEmail(Email);
		log.info("login email address entered successfully");
		Thread.sleep(3000);
		ll.setPassword(Password);
		log.info("login password entered successfully");
		Thread.sleep(3000);
		ll.clickSigninbutton();
		log.info("login signin button clicked successfully" );
		ll.clearEmail();
		Thread.sleep(3000);
		log.info("login Email is cleared successfully");
		ll.clearPassword();
		Thread.sleep(3000);
		log.info("login password is cleared successfully");
		
		//Hard Assertions
	/*   String act_title=driver.getTitle();
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
		} */
		
	}
	@DataProvider(name="LumaLoginData")
    String [][] getData() throws IOException{
		
    	String path="C:\\Users\\ramua\\eclipse-workspace\\Hybrid_FrameWork\\src\\test\\java\\com\\Luma_TestData\\LumaLoginData.xlsx";
    	
    	//identify the row count
    	int rownum=XLUtils.getRowCount(path, "Sheet1");
    	
    	//identify the col count
    	
    	int colcount=XLUtils.getCellcount(path, "Sheet1", 1);
    	
    	String logindata[][]=new String[rownum][colcount];
    	
    	for(int i=1; i<=rownum; i++) { // it will represents rows
    		
    		for(int j=0; j<colcount; j++) { // it will respresnts columns
    			
    			logindata[i-1][j]=XLUtils.getcelldata(path, "Sheet1", i, j);	
    			
    		}
    		
    	}
    	
		return logindata;

	
	

}
}
