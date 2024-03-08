package com.sunmobility.qa.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sunmobility.qa.RegressionTestcases.Baseclass;

public class LoginPage extends Baseclass
{
	 WebDriver ldriver;
	
	
	
	public LoginPage(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[.=' Login']")
	private WebElement Login;
	
	@FindBy(xpath="//input[@id='i0116']")
	private WebElement Email;
	
	@FindBy(id="idSIButton9")
	private WebElement Yesbutton1;
	
	@FindBy(id="login-name")
	private WebElement username;
	
	@FindBy(id="login-pass")
	private WebElement password;
	
	@FindBy(id="submitbtn")
	private WebElement Submit;
	
	@FindBy(id="idSIButton9")
	private WebElement Yesbutton2;
	
	@FindBy(xpath="//select[@placeholder='Select Zone']")
	private WebElement dropdown;
	
	@FindBy(xpath="//span[contains(.,'Station Live')]")
	private WebElement Stationlive;
	
	@FindBy(xpath="//img[@class='logo']")
	private WebElement cnclogo;
	
	
	public void clicklogin(String email,String uname,String pwd)
	{
		Login.click();
		Set<String> handles = ldriver.getWindowHandles();
		Iterator<String> it = handles.iterator();
	    String parentwindowID = it.next();
		String childwindowID = it.next();
		ldriver.switchTo().window(childwindowID);
		Email.sendKeys(email);
		Yesbutton1.click();
		username.sendKeys(uname);
		password.sendKeys(pwd);
		Submit.click();
		Yesbutton2.click();
		ldriver.switchTo().window(parentwindowID);
	}
	
	public void checklogo()
	{
		cnclogo.isDisplayed();
	}
	
	public void selectlocation(String value)
	{
	    Select s= new Select(dropdown);
		s.selectByValue(value);
	}
	
	
	

}
