package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.sunmobility.qa.pages.BatterysummaryTIU_Page;
import com.sunmobility.qa.pages.LoginPage;

public class BatterysummaryTIU_TC_008 extends Baseclass 
{
	//@Test
	public void checkBatterysummaryTIU() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering user credentials");
		lp.clicklogin(email,username,userpassword);
		logger.info("selecting location");
		lp.selectlocation("Bengaluru");
		
		BatterysummaryTIU_Page tiu=new BatterysummaryTIU_Page(driver);
		
		tiu.clickonBPsummaryTIU();
		Thread.sleep(3000);
		tiu.clickonBPsummary();
		tiu.selectsummary("Battery");
		tiu.clickok();
	}
	
	@Test
	public void checkBatterysummaryTIUzone() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email,username,userpassword);
		Reporter.log("selcting zone");
		lp.selectlocation("Bengaluru");
		
		BatterysummaryTIU_Page tiu=new BatterysummaryTIU_Page(driver);
		Reporter.log("Navigating to BatteryTIU");
		Thread.sleep(3000);
		tiu.clickonBPsummaryTIU();
		Thread.sleep(3000);
		Reporter.log("selecting sepecfied date");
		tiu.clickondate();
		tiu.selctdate("Yesterday");
		Reporter.log("click on submit");
		tiu.clickok();
		Thread.sleep(5000);
		//tiu.Batterydata();
		tiu.datasize();
		Reporter.log("BatterySummaryTIU is displayed");
		//tiu.data();
		
	
	}

}
