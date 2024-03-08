package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.BatteryLivePage;
import com.sunmobility.qa.pages.LoginPage;

public class BatteryLive_TC_003 extends Baseclass
{
	@Test
	public void checkBateryLive() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email,username,userpassword);
		Reporter.log("Selecting the specified locatiion for Battery status");
		lp.selectlocation("Bengaluru");
		
		BatteryLivePage bl= new BatteryLivePage(driver);
		Reporter.log("Navigating BatteryLivePage");
		bl.checkBatteryLivestatus();
		Reporter.log("BatteryLive page is displayed");
		
	}

}
