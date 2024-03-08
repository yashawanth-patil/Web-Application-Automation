package com.sunmobility.qa.RegressionTestcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.Daily_Vehicle_ReportPage;
import com.sunmobility.qa.pages.LoginPage;

public class Daily_Vehicle_Report_TC_010 extends Baseclass
{
	@Test
	public void checkVehicleReport() throws InterruptedException
	{
		String s="5";
        Reporter.log("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email,username,userpassword);
		lp.selectlocation("Bengaluru");
		Thread.sleep(3000);
		
		Daily_Vehicle_ReportPage dv=new Daily_Vehicle_ReportPage(driver);
		Reporter.log("Navigating to Daily-vehcile report");
		dv.clickonDriverReport();
		Thread.sleep(5000);
		dv.selectdate("Yesterday");
		Thread.sleep(3000);
		Reporter.log("showing the selected data");
		Assert.assertEquals(dv.Vehicles(),s);
		Reporter.log(dv.Vehicles());
		dv.Vehicles();
		dv.drives();
		dv.totalkms();
		dv.kwhr();
		dv.Batteryswaps();
		dv.totaldrivetime();
		dv.avgdod();
		dv.whperkm();
		dv.avgdrivetime();
		Reporter.log("DailyVehicleReport Data is displayed for particular location");
	}

}
