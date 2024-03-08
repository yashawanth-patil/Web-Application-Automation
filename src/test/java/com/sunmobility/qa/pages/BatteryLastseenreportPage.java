package com.sunmobility.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class BatteryLastseenreportPage extends Baseclass 
{
	WebDriver ldriver;
	public BatteryLastseenreportPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[.='Battery Last Seen Report']")
	private WebElement batterylastseen;
	
	@FindBy(xpath="//ng-select[@role='listbox']")
	private WebElement selectzone;
	
	@FindBy(xpath="//div[@class='ng-dropdown-panel-items scroll-host']//div//span")
	private List<WebElement> zones;
	
	@FindBy(xpath="//div[@class='ag-center-cols-clipper']")
	private List<WebElement> BatteryLastSeendata;
	
	
	public void clickonBatteryLastSeen()
	{
		mousehover(batterylastseen);
		webdriverwait(batterylastseen);
	}
	
	public void clickonzone()
	{
		webdriverwait(selectzone);
	}
	
	public void selectzone(String value)
	{
		for(int i=0;i<zones.size();i++)
		{
			if(zones.get(i).getText().contains(value))
			{
				zones.get(i).click();
			}
		}
	}
	
	public void Batterylastseendata()
	{
		for(int i=0;i<BatteryLastSeendata.size(); i++)
		{
			BatteryLastSeendata.get(i).getText();
		}
	}
	

}
