package com.sunmobility.qa.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class PiaggioDriveDataPage extends Baseclass 
{
	WebDriver ldriver;
	
	public PiaggioDriveDataPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[.='Piaggio Drive Data']")
	private WebElement PiaggioData;
	
	@FindBy(xpath="//div[@class='multiselect-dropdown']")
	private WebElement zone;
	
	@FindBy(xpath="//div[@class='dropdown-list']//ul//li")
	private List<WebElement> zones;
	
	@FindBy(xpath="//div[@id='vtype']")
	private WebElement vehicleType;
	
	@FindBy(xpath="//div[@id='vtype']//div//ul//li")
	private List<WebElement> vehicletypeList;
	
	@FindBy(xpath="//div[@id='manufacturer']")
	private WebElement manufacturer;
	
	@FindBy(xpath="//div[@id='manufacturer']//div//ul//li")
	private List<WebElement> manufacturerList;
	
	@FindBy(xpath="//input[@placeholder='Select Date...']")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='ranges']//ul//li")
	private List<WebElement> dateoptions;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[@id='mobile-collapse']")
	private WebElement collapse;
	
	public void clickonpiaggioData() throws InterruptedException
	{
		mousehover(PiaggioData);
		webdriverwait(PiaggioData);
	}
	
	public void slide()
	{
		mousehover(collapse);
	}

		
		
	
	public void selectZone(String value)
	{
		
		webdriverwait(zone);
		for(int i=0; i<zones.size(); i++)
		{
			if(zones.get(i).getText().contains(value))
			{
				zones.get(i).click();
			}
		}
	}
	
	public void selctvehicleType(String value)
	{
		webdriverwait(vehicleType);
		
		for(int i=0; i<vehicletypeList.size(); i++)
		{
			if(vehicletypeList.get(i).getText().contains(value))
			{
				vehicletypeList.get(i).click();
			}
		}
	}
	
	public void selectManufacturer(String value)
	{
		webdriverwait(manufacturer);
		
		for(int i=0; i<manufacturerList.size(); i++)
		{
			if(manufacturerList.get(i).getText().contains(value))
			{
				manufacturerList.get(i).click();
			}
		}
		
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
