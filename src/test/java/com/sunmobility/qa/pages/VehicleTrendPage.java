package com.sunmobility.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class VehicleTrendPage extends Baseclass
{
	WebDriver ldriver;
	
	public VehicleTrendPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[.='Vehicle Trend']")
	private WebElement vehicleTrend;
	
	@FindBy(xpath="//input[@placeholder='Select Date...']")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='ranges']//ul//li")
	private List<WebElement> dateoptions;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	public void clickonVehicleTrend()
	{
		mousehover(vehicleTrend);
		webdriverwait(vehicleTrend);
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
	
	

}
