package com.ExtentReports;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class Reports implements ITestListener {
	public ExtentSparkReporter report;
	
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext tr) {
		
		report=new ExtentSparkReporter("C:\\Users\\ramua\\eclipse-workspace\\TestNG_Framework\\Reports\\AdactinLogin.html");
		
		//document tittle
		
		report.config().setDocumentTitle("Adactin-Testing-Report");
		report.config().setReportName("Adactin Login-Search Hotel validation test");
		report.config().setTheme(Theme.STANDARD);
		
		//provide basic info user
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		
		
		extent.setSystemInfo("Hostname", "Local Host");
		extent.setSystemInfo("User", "Nagaraja");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("OS", "Windows10");
		extent.setSystemInfo("Browser", "Chrome,Edge,Firefox");	
	}
	
	public void onTestSuccess(ITestResult tr) {
		
		test=extent.createTest(tr.getName());
		
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));	
	}
	
	public void onTestFailure(ITestResult tr) {
		
		test=extent.createTest(tr.getName());
		
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));	
	}
	public void onTestSkipped(ITestResult tr) {
		
		test=extent.createTest(tr.getName());
		
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.YELLOW));	
	}
	
	public void onFinish(ITestContext context) {
		
		extent.flush(); 
	
	}

}
