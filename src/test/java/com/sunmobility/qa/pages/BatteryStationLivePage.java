package com.sunmobility.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sunmobility.qa.RegressionTestcases.Baseclass;


public class BatteryStationLivePage extends Baseclass 
{ 
	WebDriver ldriver;
	
	public BatteryStationLivePage(WebDriver driver)
	{
	    ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(.,'Station Live')]")
	public WebElement Stationlive;
	
	@FindBy(xpath="//select[@placeholder='SelectServiceLocation']")
	public WebElement stations;
	
	@FindBy(xpath="//select[@placeholder='stationid']")
	public WebElement stationID;
	
	
	
	
	
	public void clickonstationlive()
	{
		mousehover(Stationlive);
		webdriverwait(Stationlive);
	}
	
	public void selectstaions(String value)
	{
		Select s= new Select(stations);
		s.selectByValue(value);
	}
	
	public void SelectstationID(String value)
	{
		Select s=new Select(stationID);
		s.selectByValue(value);
	}
	
	
	
	
	
	
	
	
}


