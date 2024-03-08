package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.sunmobility.qa.pages.LoginPage;
import com.sunmobility.qa.pages.Swap_ReportPage;

public class SwapReport_TC_007 extends Baseclass
{
	@Test
	public void checkswapreport() throws InterruptedException
	{
	    
		
		Reporter.log("url is opened");
		
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		Reporter.log("Selecting location");
		lp.selectlocation("Bengaluru");
		Swap_ReportPage sw=new Swap_ReportPage(driver);
		Reporter.log("navigating to swap-report");
		sw.clickonswapreport();
		Reporter.log("selecting service location");
		Thread.sleep(3000);
		sw.clickonserviceloctaion();
		Reporter.log("selecting specified location");
		sw.servicelocationlist("IOCL-Bangalore-HAL Madhu","SM Validation");
		Thread.sleep(3000);
		Reporter.log("selecting the specifed stationID");
		sw.stationIDlist("WMQISXM1V1-00002","WMQISXM1V1-00005");
		sw.clickonsubmit();
		Reporter.log("The selected data is displayed");
		
	}

	
}
