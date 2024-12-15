package com.Luma_TestCases;



import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;


import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Luma_Utilities.Reading_LumaData;




public class Luma_BaseClass {
	//implement the common functionalities open application,close application,screenshots
	public Logger log;
public static WebDriver driver;
	
Reading_LumaData RLD=new Reading_LumaData();

//Registration 
	public String FName= RLD.getFirstName();
	public String LName=RLD.getLastName();
	public String EmailAdd=RLD.getEmailAddress();
	public String Password=RLD.getPassword();
	public String CPassword=RLD.getConfirmPassword();
	
	
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void openApplication(String br,String URL) {
		
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		log=Logger.getLogger("Hybrid_FrameWork");
		PropertyConfigurator.configure("log4j.Properties");
	}
//	@AfterClass
//	public void closeApplication() {
//		
//		driver.close();
//	}
	//screenshots ,project directory
	public String captureScreen(String tname)
	{
		String timestamp=new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\Screenshots\\"+tname+"_"+timestamp+".png";
		try
		{
			FileUtils.copyFile(source, new File(destination));
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return destination;
	}

}
