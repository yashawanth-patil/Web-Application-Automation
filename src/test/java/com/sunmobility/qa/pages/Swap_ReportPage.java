package com.sunmobility.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;


public class Swap_ReportPage extends Baseclass
{
	WebDriver ldriver;
	
	public Swap_ReportPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[.='Swap Report']")
	private WebElement swapReport;
	
	@FindBy(xpath="//div[@class='multiselect-dropdown']")
	private WebElement servicelocation;
	
	@FindBy(xpath="//div[@class='multiselect-dropdown']//ul//li//div")
	private List<WebElement> servicelocationList;
	
	@FindBy(xpath="//div[@id='station-id-reports']")
	private WebElement stationID;
	
	@FindBy(xpath="//div[@id='station-id-reports']//ul//li//div")
	private List<WebElement> staionIDlist;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//*[@class='ag-center-cols-clipper']//div")
	private List<WebElement> swapdata;
	
	
	public void clickonswapreport()
	{
		mousehover(swapReport);
		webdriverwait(swapReport);
	}
	
	public void clickonserviceloctaion()
	{
		servicelocation.click();
	}
	
	public void servicelocationlist(String location1, String location2) throws InterruptedException
	{
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
	
	public void swapdata()
	{
		for(int i=0; i<swapdata.size(); i++)
		{
			swapdata.get(i).getText();
		}
	}
	
	

}
