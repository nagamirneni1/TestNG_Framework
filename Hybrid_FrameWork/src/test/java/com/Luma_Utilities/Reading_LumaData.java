package com.Luma_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Reading_LumaData {
Properties pro;
	
	public Reading_LumaData() {
		
		File file=new File("C:\\Users\\ramua\\eclipse-workspace\\Hybrid_FrameWork\\Configuration\\Data.Properties");
		try
		{
		FileInputStream fis=new FileInputStream(file);
		
		pro=new Properties();
		
		pro.load(fis);// loading the properties file
		}
		
	catch(Exception e) {
		
		e.printStackTrace();
	}
		
	}
	
	//Registration
	
	public String getFirstName() {
		
		String FName=pro.getProperty("FirstName");
		return FName;
		
	}
	
	public String getLastName() {
		
		String LName=pro.getProperty("LastName");
		
		return LName;
	}
	
	public String getEmailAddress() {
		
		String EmailAdd=pro.getProperty("Email");
		return EmailAdd;
	}
	
	public String getPassword() {
		
		String Password=pro.getProperty("Password");
		
		return Password;
	}

	public String  getConfirmPassword() {
		
		String CPassword=pro.getProperty("ConfirmPassword");
		
		return CPassword;
	}

}
