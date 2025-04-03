package com.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.pages.LoginpageLocator;
import com.utilities.HelperClass;

public class Loginpageactions {
	LoginpageLocator Loginpagelocator=null;
	String strusername,strpassword;
	
	public Loginpageactions()
	{
		this.Loginpagelocator=new LoginpageLocator();
		PageFactory.initElements(HelperClass.getDriver(), Loginpagelocator);
	}
	public void setusername(String username)
	{
		Loginpagelocator.userName.sendKeys(username);
		
	}
	public void setpassword(String password)
	{
		Loginpagelocator.Password.sendKeys(password);
		
	}
	public void clickLogin()
	{
		Loginpagelocator.login.click();
	}
	public void login()
	{
		File file=new File("src/test/resources/testdata.properties");
		FileInputStream fileinput=null;
		try
		{
			fileinput=new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try
		{
			prop.load(fileinput);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		strusername=prop.getProperty("Username");
		strpassword=prop.getProperty("Password");
		this.setusername(strusername);
		this.setpassword(strpassword);
		this.clickLogin();
		
		
	}

}
