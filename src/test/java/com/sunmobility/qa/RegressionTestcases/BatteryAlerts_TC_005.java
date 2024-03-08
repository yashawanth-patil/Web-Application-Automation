package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.BatteryAlertsPage;
import com.sunmobility.qa.pages.LoginPage;

public class BatteryAlerts_TC_005 extends Baseclass
{
	//@Test
	public void checkBatteyAlertsZone() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		lp.selectlocation("Bengaluru");
		
		BatteryAlertsPage ba=new BatteryAlertsPage(driver);
		ba.clickonBatteryAlert();
		Thread.sleep(3000);
		//ba.clickonzonelist();
		Thread.sleep(3000);
		//ba.selectBatteryWiseAlerts("Zone");
		ba.clickondaterange();
		ba.selectdate("Last 7 Days");
	}
	
	@Test
	public void checkBatteyAlerts() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		
		BatteryAlertsPage ba=new BatteryAlertsPage(driver);
		Reporter.log("Navigating to Battery alerts page");
		ba.clickonBatteryAlert();
		Reporter.log("Selecting specified location");
		lp.selectlocation("Bengaluru");
		Thread.sleep(3000);
		ba.clickonzonelist();
		Thread.sleep(3000);
		ba.selectBatteryWiseAlerts("Battery");
		ba.enterBatteryID("INSMOMAH1803K2805B09");
		ba.clickonsubmit();
		Reporter.log("Battery alerts displayed for specided BatteryID");
		
	}

}
