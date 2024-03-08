package com.sunmobility.qa.RegressionTestcases;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.Battery_Service_TimePage;
import com.sunmobility.qa.pages.LoginPage;

public class Battery_Service_Time_TC_012 extends Baseclass
{
	@Test
	public void checkBatteryserviceTime() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		Reporter.log("Selecting specifed location");
		lp.selectlocation("Bengaluru");
		
		
		Battery_Service_TimePage bs=new Battery_Service_TimePage(driver);
		Reporter.log("Naviagting to battery service-Time");
		Thread.sleep(5000);
		bs.clickonBatteryserivce();
		Thread.sleep(4000);
		bs.selectdate("Last 30 Days");
		Reporter.log("selected date batterydata is displayed");
		
	}


}
