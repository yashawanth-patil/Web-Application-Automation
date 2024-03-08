package com.sunmobility.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class BatteryAlertsPage extends Baseclass
{
	WebDriver ldriver;
	
	public BatteryAlertsPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[.='Battery Alerts']")
	private WebElement BatteryAlert;
	
	@FindBy(xpath="//span[@title='Clear all']")
	private WebElement clearall;
	
	@FindBy(xpath="//div[@class='ng-value-container']")
	private WebElement zone;
	
	@FindBy(xpath="//input[@placeholder='Enter Battery ID']")
	private WebElement BatteryID;
	
	@FindBy(xpath="//div[@class='ng-dropdown-panel-items scroll-host']")
	private List<WebElement> zonelist;
	
	@FindBy(xpath="//input[@placeholder='Select Date...']")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='ranges']//ul//li")
	private List<WebElement> dateoptions;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	public void clickonBatteryAlert()
	{
		mousehover(BatteryAlert);
		webdriverwait(BatteryAlert);
	}
	
	public void clickonzonelist()
	{
		webdriverwait(clearall);
		webdriverwait(zone);
	}
	
	public void selectBatteryWiseAlerts(String alertwise)
	{
		
		for(int i=0;i<zonelist.size();i++)
		{
			System.out.println(zonelist.get(i).getText());
			if(zonelist.get(i).getText().contains(alertwise))
			{
				zonelist.get(i).click();
			}
		}
		
		webdriverwait(submit);
	}
	
	public void clickondaterange()
	{
		date.click();
	}
	
	public void selectdate(String value)
	{
		
		for(int i=0; i<dateoptions.size(); i++)
		{
			if(dateoptions.get(i).getText().contains(value))
			{
				dateoptions.get(i).click();
			}
			
		}
		
		webdriverwait(submit);
	}
	
	public void enterBatteryID(String ID)
	{
		BatteryID.sendKeys(ID);
	}
	
	public void clickonsubmit()
	{
		webdriverwait(submit);
	}
	
	
	
	
	
	
	

}
