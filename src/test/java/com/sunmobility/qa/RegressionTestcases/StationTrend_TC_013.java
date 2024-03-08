package com.sunmobility.qa.RegressionTestcases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.LoginPage;
import com.sunmobility.qa.pages.Station_TrendPage;

public class StationTrend_TC_013 extends Baseclass
{
	@Test
	public void checkStationTrend() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email, username, userpassword);
		Reporter.log("Selecting location");
		lp.selectlocation("Bengaluru");
		
		Station_TrendPage st=new Station_TrendPage(driver);
		Reporter.log("Navigating to Station-Trend");
		st.clickonStaionTrend();
		Thread.sleep(5000);
		Reporter.log("selecting specified service loaction");
		st.servicelocationlist("IOCL-Bangalore-HAL Madhu","SM Validation");
		Reporter.log("selecting specified station-ID");
		st.stationIDlist("WMQISXM1V1-00002","WMQISXM1V1-00005");
		logger.info("");
		Thread.sleep(2000);
		st.selctdate("Last 7 Days");
		
		st.clickonsubmit();
		Reporter.log("stationTrend data is displayed");
	}
			

}
