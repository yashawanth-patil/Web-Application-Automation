package com.sunmobility.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class Battery_Service_TimePage extends Baseclass
{
	WebDriver ldriver;
	
	public Battery_Service_TimePage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//span[.='Battery Service Time']")
	private WebElement BatteryserviceTime;
	
	@FindBy(xpath="//input[@placeholder='Select Date...']")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='ranges']//ul//li")
	private List<WebElement> dateoptions;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	public void clickonBatteryserivce()
	{
		mousehover(BatteryserviceTime);
		webdriverwait(BatteryserviceTime);
	}
	
	public void selectdate(String value)
	{
		webdriverwait(date);
		for(int i=0; i<dateoptions.size(); i++)
		{
			if(dateoptions.get(i).getText().contains(value))
			{
				dateoptions.get(i).click();
			}
			
		}
		
		webdriverwait(submit);
	}
	
}
