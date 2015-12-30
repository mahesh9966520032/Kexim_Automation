package com.kexim.Appfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.keximpageobjects.PageObjects;

public class Appfunctions {

	/*************************************************************
	 *   Mehtod Name :openBrowser
	 *   Method For  :open the browser(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * **************************************************************/
	public static WebDriver openBrowser(String sURL)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get(sURL);  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//before throwing the exception it will wait for the given time to be elapsed..
		return driver;
	}
	
	
	/*************************************************************
	 *   Mehtod Name :adminLogin
	 *   Method For  :for admin login to application(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * **************************************************************/
	public static boolean adminLogin(WebDriver driver,String sUserName,String sPassword)
	{
		try{
       //txt username
	   PageObjects.KeximHome.txtUserName(driver).clear();
	   PageObjects.KeximHome.txtUserName(driver).sendKeys(sUserName);
	  
	   //txt password
	   PageObjects.KeximHome.txtPassword(driver).clear();
	   PageObjects.KeximHome.txtPassword(driver).sendKeys(sPassword);
	   
	   //click login
	   PageObjects.KeximHome.btnLogin(driver).click();
		
	   return true;
		
	}catch(Exception e)
	   {
			return false;
		}
	}
	
	/*************************************************************
	 *   Mehtod Name :tearBrowser
	 *   Method For  :for closing the application(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * **************************************************************/
	public static boolean tearBrowser(WebDriver driver)
	{
		try{
 	        driver.quit();
 	        return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	
}
