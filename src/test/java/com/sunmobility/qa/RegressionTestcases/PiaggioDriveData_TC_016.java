package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.LoginPage;
import com.sunmobility.qa.pages.PiaggioDriveDataPage;

public class PiaggioDriveData_TC_016 extends Baseclass
{
	@Test
	public void checkPiaggioData() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		PiaggioDriveDataPage pd=new PiaggioDriveDataPage(driver);
		Thread.sleep(3000);
		Reporter.log("Navigating to PiaggioData page");
		pd.clickonpiaggioData();
		Thread.sleep(3000);
		pd.slide();
		Thread.sleep(2000);
		Reporter.log("Selecting the specifed zone");
		pd.selectZone("Chandigarh");
		Reporter.log("Selcting the specifed vehicle ");
		pd.selctvehicleType("Select All");
		Reporter.log("Selecting the specifed manufacturer");
		pd.selectManufacturer("Select All");
		pd.selectdate("Last 30 days");
		Reporter.log("Selecting the date range for data");
		Reporter.log("Data is displayed for specifed zone ");
	}

	
	
}
