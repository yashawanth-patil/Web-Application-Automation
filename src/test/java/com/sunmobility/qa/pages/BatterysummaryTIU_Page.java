package com.sunmobility.qa.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class BatterysummaryTIU_Page extends Baseclass
{

	WebDriver ldriver;
	public BatterysummaryTIU_Page(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[.='Battery Summary(TIU)']")
	private WebElement Batterysummary;
	
	@FindBy(xpath="//div[@class='ng-select-container ng-has-value']")
	private WebElement BPsummary;
	
	@FindBy(xpath="//div[@class='ng-dropdown-panel-items scroll-host']//div//span")
	private List<WebElement> BPlist;
	
	@FindBy(xpath="//input[@placeholder='Select Date...']")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='ranges']//ul//li")
	private List<WebElement> datelist;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//*[@class='ag-center-cols-container']//div")
	private List<WebElement> Batterydata;
	
	@FindBy(xpath="//div[contains(@class,'header-cell')]//span[contains(@class,'header-cell-text')]")
	private List<WebElement> allheaders;
	
	@FindBy(xpath="//div[contains(@class,'ag-body-viewport')]//div[contains(@class,'ag-row')]")
	private List<WebElement> rows;
	
	@FindBy(xpath="//div[contains(@class,'ag-body-viewport')]//div[contains(@class,'ag-row')]")
	private List<WebElement> columns;
	
	
	public void clickonBPsummaryTIU() throws InterruptedException
	{
		mousehover(Batterysummary);
		Thread.sleep(2000);
		webdriverwait(Batterysummary);
	}
	
	public void clickonBPsummary()
	{
		webdriverwait(BPsummary);
	}
	
	public void selectsummary(String value)
	{
		for(int i=0; i<BPlist.size();i++)
		{
			if(BPlist.get(i).getText().contains(value))
			{
				BPlist.get(i).click();
			}
		}
	}
	
	public void clickondate()
	{
		date.click();
	}
	
	public void selctdate(String value)
	{
		
		for(int i=0;i<datelist.size(); i++)
		{
			if(datelist.get(i).getText().contains(value))
			{
				datelist.get(i).click();
				break;
			}
		}
	}
	
	public void clickok()
	{
		webdriverwait(submit);
	}
	
	public void Batterydata()
	{
		for(int i=0;i<Batterydata.size();i++)
		{
			Batterydata.get(i).getText();
			//if(Batterydata.get(i).getText().)
		}
	}
	
	
	public void datasize()
	{
		
		for(int i=0;i<rows.size();i++)
		{
			rows.get(i).getText();
		}
	
		
		
			//System.out.println(columns.size());
		
	}
	
	public void data()
	{
		List<String> allheadernames = new ArrayList<String>();
		for(WebElement header:allheaders)
		{
			String headername=header.getText();
			allheadernames.add(headername);
		}
		
		System.out.println("All headers are:-");
		System.out.println(allheadernames);
		
		List<LinkedHashMap<String,String>> alltabledata=new ArrayList<LinkedHashMap<String,String>>();
		
		for(int i=0;i<rows.size();i++)
		{
			LinkedHashMap<String,String> eachrowdata=new LinkedHashMap();
			for(int j=0;j<columns.size(); j++)
			{
				String cellvalue=columns.get(j).getText();
				eachrowdata.put(allheadernames.get(j), cellvalue);
			}
			alltabledata.add(eachrowdata);
		}
		
		System.out.println("Table data are:-");
		for(LinkedHashMap<String, String> data:alltabledata)
		{
			for(String key:data.keySet())
			{
				System.out.println(key+"     : "+data.get(key));
			}
		}
		
		
		
		
	}
	
	
}
