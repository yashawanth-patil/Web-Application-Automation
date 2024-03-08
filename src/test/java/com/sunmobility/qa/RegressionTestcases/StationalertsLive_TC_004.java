package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.LoginPage;
import com.sunmobility.qa.pages.StationalertsLivePage;

public class StationalertsLive_TC_004 extends Baseclass
{
	@Test
	public void clickonstationalert() throws InterruptedException
	{
        
		Reporter.log("opening browser");
		
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email,username,userpassword);
		
		lp.selectlocation("Bengaluru");
		
		StationalertsLivePage sp=new StationalertsLivePage(driver);
		Reporter.log("Navigating to stationalertlive");
		sp.clickonstationalert();
		Thread.sleep(3000);
		Reporter.log("Station alerts page displayed with station information");
		//sp.stationinfo();
	}

}
