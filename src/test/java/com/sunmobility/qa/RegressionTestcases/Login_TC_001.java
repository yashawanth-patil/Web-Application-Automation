package com.sunmobility.qa.RegressionTestcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sunmobility.qa.pages.LoginPage;

public class Login_TC_001 extends Baseclass
{
	@Test
	public void LoginTest() throws IOException, InterruptedException
	{
		Reporter.log("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		Reporter.log("Entering user credentials");
		lp.clicklogin(email,username,userpassword);
		
		if(driver.getTitle().equals("CNC"))
		{
			Assert.assertTrue(true);
			Reporter.log("Homepage is displayed");
			Reporter.log("Login Test pass");
			
		}
		else
		{
			capturescreen(driver,"LoginTest");
			Assert.assertTrue(false);
			Reporter.log("Login test Failed");
		}
	}
	
	@Test(priority=1)
	public void checklogo() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.clicklogin(email,username,userpassword);
		Thread.sleep(3000);
		lp.checklogo();
		Assert.assertTrue(true);
		Reporter.log("application logo is displayed");
		
	}
	
	

}
