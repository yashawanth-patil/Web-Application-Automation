package com.sunmobility.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class BatterysummaryPage extends Baseclass
{
	WebDriver ldriver;
	
	public BatterysummaryPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//span[.='Battery Summary']")
	private WebElement Batterysummary;
	
	@FindBy(xpath="//div[@class='multiselect-dropdown']")
	private WebElement serivelocation;
	
	@FindBy(xpath="//div[@class='multiselect-dropdown']//ul//li//div")
	private List<WebElement> servicelocationList;
	
	@FindBy(xpath="//div[@id='station-id-reports']")
	private WebElement stationID;
	
	@FindBy(xpath="//div[@id='station-id-reports']//ul//li//div")
	private List<WebElement> staionIDlist;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//input[@placeholder='Select Date...']")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='ranges']//ul//li")
	private List<WebElement> datelist;
	
	public void clickonswapreport()
	{
		mousehover(Batterysummary);
		webdriverwait(Batterysummary);
	}
	
	
	
	public void servicelocationlist(String location1, String location2) throws InterruptedException
	{
		webdriverwait(serivelocation);
		for(int i=0;i<servicelocationList.size(); i++)
		{
			if(servicelocationList.get(i).getText().contains(location1))
			{
				servicelocationList.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		for(int i=0;i<servicelocationList.size(); i++)
		{
			if(servicelocationList.get(i).getText().contains(location2))
			{
				servicelocationList.get(i).click();
				break;
			}
		}
	}
	
	public void stationIDlist(String ID1,String ID2) throws InterruptedException
	{
		webdriverwait(stationID);
		
		for(int i=0;i<staionIDlist.size();i++)
		{
			if(staionIDlist.get(i).getText().contains(ID1))
			{
				staionIDlist.get(i).click();
			}
		}
		
		Thread.sleep(3000);
		for(int i=0;i<staionIDlist.size();i++)
		{
			if(staionIDlist.get(i).getText().contains(ID2))
			{
				staionIDlist.get(i).click();
			}
		}
		
	}
	public void clickonsubmit()
	{
		webdriverwait(submit);
	}
	

	public void selctdate(String value)
	{
		webdriverwait(date);
		for(int i=0;i<datelist.size(); i++)
		{
			if(datelist.get(i).getText().contains(value))
			{
				datelist.get(i).click();
				break;
			}
		}
	}
	

}
