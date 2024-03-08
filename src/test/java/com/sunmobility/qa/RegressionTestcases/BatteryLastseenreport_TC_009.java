package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.BatteryLastseenreportPage;
import com.sunmobility.qa.pages.LoginPage;

public class BatteryLastseenreport_TC_009 extends Baseclass
{
	@Test
	public void checkBatteryLasetseen() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		
		BatteryLastseenreportPage bl=new BatteryLastseenreportPage(driver);
		Reporter.log("navigating to batterylast-seen");
		bl.clickonBatteryLastSeen();
		Reporter.log("selecting the specifed zone");
		Thread.sleep(5000);
		bl.clickonzone();
		Thread.sleep(3000);
		bl.selectzone("Bengaluru");
		bl.Batterylastseendata();
		Reporter.log("BatteryLastseen data is displayed for specified zone");
	}
	

}
