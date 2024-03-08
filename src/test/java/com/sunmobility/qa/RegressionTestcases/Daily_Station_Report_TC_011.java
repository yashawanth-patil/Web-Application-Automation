package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.Daily_Station_ReportPage;
import com.sunmobility.qa.pages.LoginPage;

public class Daily_Station_Report_TC_011 extends Baseclass
{
	@Test
	public void checkDailyStationreport() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		Reporter.log("Selecting location");
		lp.selectlocation("Bengaluru");
		
		Daily_Station_ReportPage ds=new Daily_Station_ReportPage(driver);
		Reporter.log("Navigating to daily-station-report");
		ds.clickonDailyStationReport();
		Thread.sleep(4000);
		Reporter.log("selecting specified service location");
		ds.servicelocationlist("IOCL-Bangalore-HAL Madhu","SM Validation");
		Reporter.log("selecting specified station-ID");
		ds.stationIDlist("WMQISXM1V1-00002","WMQISXM1V1-00005");
		Reporter.log("selecting the date");
		ds.selctdate("Last 7 Days");
		ds.clickonsubmit();
		Reporter.log("daily station-report displayed");
		
		
	}

}
