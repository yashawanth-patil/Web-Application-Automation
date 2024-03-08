package com.sunmobility.qa.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class Daily_Vehicle_ReportPage extends Baseclass
{
	WebDriver ldriver;
	public Daily_Vehicle_ReportPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[.='Daily Vehicle Report']")
	private WebElement Vehiclereport;
	
	@FindBy(xpath="//input[@placeholder='Select Date...']")
	private WebElement date;
	
	@FindBy(xpath="//div[@class='ranges']//ul//li")
	private List<WebElement> dateoptions;
	
	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class='ag-center-cols-container']")
	private List<WebElement> vehicledata;
	
	@FindBy(xpath="//div[@class='ag-body-viewport ag-layout-normal ag-row-no-animation ag-selectable']")
	private List<WebElement> data;
	
	@FindBy(xpath="//div[@class='ag-cell-wrapper']//.//span")
	private List<WebElement> rows;
	
	
	public void clickonDriverReport()
	{
		mousehover(Vehiclereport);
		webdriverwait(Vehiclereport);
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
	/*public void captureDrives()
	{
		for(int i=0; i<rows.size(); i++)
		{
			System.out.println(rows.get(0).getText());
			System.out.println(rows.get(1).getText());
			System.out.println(rows.get(2).getText());
			System.out.println(rows.get(3).getText());
			System.out.println(rows.get(4).getText());
			System.out.println(rows.get(5).getText());
			System.out.println(rows.get(6).getText());
			System.out.println(rows.get(7).getText());
			System.out.println(rows.get(8).getText());
			break;
		}
	}*/
	String vehicles,drives,totalkms,kwhr,Batteryswaps,totaldrivetime,whperkm,avgdrivetime,avgdod;
	public String Vehicles()
	{
		for(int i=0; i<rows.size(); i++)
		{
		    vehicles=rows.get(2).getText();
			
			break;
		}
		return vehicles;
}
	public String drives()
	{
		for(int i=0; i<rows.size();i++)
		{
		   drives=rows.get(3).getText();
			break;
		}
		return drives;
	}
	
	public String totalkms()
	{
		for(int i=0; i<rows.size(); i++)
		{
			totalkms=rows.get(4).getText();
			break;
		}
		return totalkms;
	}
	
	public String kwhr()
	{
		for(int i=0; i<rows.size(); i++)
		{
			kwhr=rows.get(5).getText();
			break;
		}
		return kwhr;
	}
	public String Batteryswaps()
	{
		for(int i=0; i<rows.size(); i++)
		{
			Batteryswaps=rows.get(6).getText();
			break;
		}
		return Batteryswaps;
	}
	
	public String totaldrivetime()
	{
		for(int i=0; i<rows.size(); i++)
		{
			totaldrivetime=rows.get(7).getText();
			break;
		}
		return totaldrivetime;
	}
	
	public String whperkm()
	{
		for(int i=0; i<rows.size(); i++)
		{
			whperkm=rows.get(0).getText();
			break;
		}
		return whperkm;
	}
	
	public String avgdrivetime()
	{
		for(int i=0; i<rows.size(); i++)
		{
			avgdrivetime=rows.get(1).getText();
			break;
		}
		return avgdrivetime;
	}
	
	public String avgdod()
	{
		for(int i=0; i<rows.size(); i++)
		{
			avgdod=rows.get(8).getText();
			break;
		}
		return avgdod;
	}
}

	
		