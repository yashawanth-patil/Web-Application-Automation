package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.LoginPage;
import com.sunmobility.qa.pages.VehicleTrendPage;

public class VehicleTrend_TC_014 extends Baseclass
{
	@Test
	public void checkVehicleTrend() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		
		VehicleTrendPage vt=new VehicleTrendPage(driver);
		Reporter.log("Navigating to Vehicle-Trend");
		vt.clickonVehicleTrend();
		Thread.sleep(5000);
		Reporter.log("Selecting location");
		lp.selectlocation("Bengaluru");
		Thread.sleep(4000);
		vt.clickondaterange();
		Thread.sleep(4000);
		Reporter.log("Selecting the specifed date");
		vt.selectdate("Last 30 Days");
		
	}

}
