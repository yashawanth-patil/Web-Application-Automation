package com.sunmobility.qa.RegressionTestcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sunmobility.qa.Utilites.Readconfig;

public class Baseclass
{
	Readconfig config=new Readconfig();
	
	public String url=config.getApplicationURL();
	public String email=config.getEmail();
	public String username=config.getUsername();
	public String userpassword=config.getPassword();
    public static  WebDriver driver;
    public Logger logger;
   
    
    
    
	@BeforeMethod(alwaysRun=true)
    //@Parameters("browser")
    public void setup()
    {
    	// if(browser.equalsIgnoreCase("Edge"))
    	 //{
    		logger=Logger.getLogger("CNC-Automation Testing");
        	PropertyConfigurator.configure("log4j.properties");
    		System.setProperty("webdriver.edge.driver",config.getEdgepath());
    		//Headless-Browser
    		//EdgeOptions op=new EdgeOptions();
    		//op.addArguments("window-size=1400,800");
    		//op.addArguments("headless");
    		driver=new EdgeDriver();
            driver.manage().deleteAllCookies();
    		driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        	driver.navigate().to(url);
    	}
    	//else if(browser.equalsIgnoreCase("Chrome"))
    	/* {
    		logger=Logger.getLogger("CNC-Automation Testing");
         	PropertyConfigurator.configure("log4j.properties");
     		System.setProperty("webdriver.chrome.driver",config.getChromepath());
     		//Headless-Browser
     		ChromeOptions options=new ChromeOptions();
    		//options.addArguments("window-size=1400,800");
    		//options.addArguments("headless");
     		driver=new ChromeDriver();
     		driver.manage().deleteAllCookies();
     		driver.manage().window().maximize();
         	driver.manage().timeouts().implicitlyWait(75,TimeUnit.SECONDS);
         	//driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
         	driver.navigate().to(url);
    	 }*/

    		 
    	// }
    	
    //}
    
    @AfterMethod
    public void teardown()
    {
    	driver.quit();
    }
    
    
    public void capturescreen(WebDriver driver,String testcasename) throws IOException
    {
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	File source=ts.getScreenshotAs(OutputType.FILE);
    	File target=new File(System.getProperty("user.dir")+"/Screenshots/"+testcasename+".png");
    	FileUtils.copyFile(source, target);
    	System.out.println("Screenshot Taken");
    }
    
    public String randomestring()
    {
    	String generatedstring=RandomStringUtils.randomAlphabetic(8);
    	return(generatedstring);
    }
    
    public static void Selectdropdown(WebElement element, String Value)
	{
		Select select=new Select(element);
		select.selectByValue(Value);
	}
	
   public static void webdriverwait(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver,45);
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	
	}
	
	public static void mousehover(WebElement element)
	{
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public void capture(WebDriver driver, String Testcasename) throws IOException
    {
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	File source=ts.getScreenshotAs(OutputType.FILE);
    	File target=new File(System.getProperty("user.dir")+"/Screenshots"+Testcasename+".png");
    	FileUtils.copyFile(source, target);
    	System.out.println("Screenshot Taken");
    }
	
	
    
}
