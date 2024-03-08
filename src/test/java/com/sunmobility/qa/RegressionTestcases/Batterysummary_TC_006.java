package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.BatterysummaryPage;
import com.sunmobility.qa.pages.LoginPage;
import com.sunmobility.qa.pages.Swap_ReportPage;

public class Batterysummary_TC_006 extends Baseclass
{
	@Test
	public void checkBatterysummary() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		Reporter.log("Selecting location");
		lp.selectlocation("Bengaluru");
		BatterysummaryPage bs=new BatterysummaryPage(driver);
		bs.clickonswapreport();
		Reporter.log("selecting service location");
		Thread.sleep(5000);
		Reporter.log("selecting specified location");
		bs.servicelocationlist("IOCL-Bangalore-HAL Madhu","SM Validation");
		Thread.sleep(3000);
		Reporter.log("selecting the specifed stationID");
		bs.stationIDlist("WMQISXM1V1-00002","WMQISXM1V1-00005");
		Thread.sleep(3000);
		bs.selctdate("Last 30 Days");
		bs.clickonsubmit();
		Reporter.log("The selected data is displayed for specified location and stationID");

	}

}
