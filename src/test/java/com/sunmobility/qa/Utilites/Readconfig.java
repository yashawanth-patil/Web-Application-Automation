package com.sunmobility.qa.Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig 
{
	Properties prop;
	
	public Readconfig()
	
	
	{
		
		File src=new File(System.getProperty("user.dir")+"./Configuration/config.properties");
		try
		{
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+ e.getMessage());
		}
	}
	
	
	public String getApplicationURL()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getUsername()
	{
		String username=prop.getProperty("username");
		return username;
	}
	
	public String getPassword()
	{
		String password=prop.getProperty("password");
		return password;
	}
	
	public String getEmail()
	{
		String email=prop.getProperty("email");
		return email;
	}
	
	public String getChromepath()
	{
		String Chromepath=prop.getProperty("chromeEXE");
		return Chromepath;
	}
	public String getEdgepath()
	{
		String edgepath=prop.getProperty("edgeEXE");
		return edgepath;
	}
	
		
		
		
}

