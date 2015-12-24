package com.kexim.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.kexim.Locators.Locators;

public class PageObjects {

	//Kexim Home page Locators
	public static class KexmimHome
	{
		//lst Branch Name PageObject
		public static Select lstBranchName(WebDriver driver)
		{
	        return new Select(driver.findElement(Locators.KexmimHome.lstBranchName));		
		}
	
		//txt UserName PageObject
		public static WebElement txtUserName(WebDriver driver)
		{
	        return driver.findElement(Locators.KexmimHome.txtUserName);		
		}

		
	}//keximHome end
	
	
	//Global PageObjects
	public static class Global
	{

		
					
	}//Global end
	
	//BranchesHome PageObjects
	public static class BranchesHome
	{
		//btn NewBranch
		
	}//BranchesHome end
	
}
