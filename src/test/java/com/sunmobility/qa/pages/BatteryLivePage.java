package com.sunmobility.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class BatteryLivePage extends Baseclass
{
	WebDriver ldriver;
	public BatteryLivePage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[.='Battery Live']")
	private WebElement Batterylive;
	
	public void  checkBatteryLivestatus()
	{
		mousehover(Batterylive);
		webdriverwait(Batterylive);
	}
	

}
