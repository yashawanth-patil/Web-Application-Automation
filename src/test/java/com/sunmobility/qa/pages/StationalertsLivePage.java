package com.sunmobility.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class StationalertsLivePage extends Baseclass
{
	WebDriver ldriver;
	public StationalertsLivePage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[.='Station Alerts']")
	private WebElement stationalert;
	
	@FindBy(xpath="//div[.=' Total: 70 ']")
	private WebElement total;
	
	@FindBy(xpath="//div[.=' Station Offline: 60 ']")
	private WebElement stationoffline;
	
	@FindBy(xpath="//div[.=' Power Off: 7 ']")
	private WebElement poweroff;
	
	@FindBy(xpath="//div[.=' System Down: 15 ']")
	private WebElement systemdown;
	
	
	
	public void clickonstationalert() throws InterruptedException
	{
		mousehover(stationalert);
		//((JavascriptExecutor) driver).executeScript("return arguments[0].click();",stationalert );
		webdriverwait(stationalert);
	}
	
	public void stationinfo()
	{
		String Total = total.getText();
		System.out.println("Total stations:"+Total);
	}

}
