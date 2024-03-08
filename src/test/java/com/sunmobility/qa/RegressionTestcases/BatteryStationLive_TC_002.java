package com.sunmobility.qa.RegressionTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.BatteryStationLivePage;
import com.sunmobility.qa.pages.LoginPage;


public class BatteryStationLive_TC_002 extends Baseclass
{
	
	@Test
	public void checkstationlive() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		Reporter.log("selecting  specified location");
		lp.selectlocation("Bengaluru");
		BatteryStationLivePage bsp= new BatteryStationLivePage(driver);
		Reporter.log("navigating to stationlive");
		bsp.clickonstationlive();
		Reporter.log("Selecting station");
		bsp.selectstaions("SM Validation");
		Thread.sleep(3000);
		Reporter.log("selecting station-ID");
		bsp.SelectstationID("WMQISXM1V1-00005");
		//capture(driver,"checkstationlive");
		
	}
	
	//@Test(groups= {"Smoke Test"})
	public void clickonstationlive() throws InterruptedException, IOException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		
	}
}
