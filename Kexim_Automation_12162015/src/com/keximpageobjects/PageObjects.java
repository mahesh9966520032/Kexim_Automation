package com.keximpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.kexim.locators.locators;

public class PageObjects {
	
		
		//page objects for KeximHome
	    public static class KeximHome
	    
	    {
			//lst BranchName
			public static Select lstBranchName(WebDriver driver)
			{
				 return new Select(driver.findElement(locators.KeximHome.lstBranchName));
					
			}
			
			//txt UserName
			public static WebElement txtUserName(WebDriver driver)
			{
				 return driver.findElement(locators.KeximHome.txtUserName);
				
			}
			
			//txt Password
			public static WebElement txtPassword(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.txtPassword);
			}
			
		}//end kexim home	    
	    
	    //Global Locators
	    public static class Global
	    {
	    	//img Home
	    	public static WebElement imgHome(WebDriver driver)
	    	{
	    	return driver.findElement(locators.Global.imgHome);
	    	}
	    }
	    
		
		


}
