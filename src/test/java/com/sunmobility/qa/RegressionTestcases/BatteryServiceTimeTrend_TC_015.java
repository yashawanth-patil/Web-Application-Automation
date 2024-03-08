package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.BatteryServiceTimeTrendPage;
import com.sunmobility.qa.pages.LoginPage;

public class BatteryServiceTimeTrend_TC_015 extends Baseclass
{
	@Test
	public void checkBatteryServiceTrend() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		Reporter.log("Selecting specifed  location");
		lp.selectlocation("Bengaluru");
		
		BatteryServiceTimeTrendPage bs=new BatteryServiceTimeTrendPage(driver);
		Thread.sleep(3000);
		Reporter.log("Navigating to Battery-serviceTrend");
		bs.clickonStaionTrend();
		Thread.sleep(3000);
		Reporter.log("selecting the specifed service-loaction and stationID");
		bs.servicelocationlist("IOCL-Bangalore-HAL Madhu","SM Validation");
		bs.stationIDlist("WMQISXM1V1-00002","WMQISXM1V1-00005");
		Thread.sleep(3000);
		Reporter.log("selecting soc change");
		bs.selectsoc("50");
		Reporter.log("selecting the required date");
		bs.selctdate("Last 7 Days");
		Reporter.log("click on submit");
		bs.clickonsubmit();
		Reporter.log("Battery service Time Trend data is displayed for specifed zone and soc");
	}

}
