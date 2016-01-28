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
			
				try{
				 return new Select(driver.findElement(locators.KeximHome.lstBranchName));
				}catch(Exception e)
				{
					e.printStackTrace();
					return null;
				}
			}
			
			//txt UserName
			public static WebElement txtUserName(WebDriver driver)
			{
				try{
				 return driver.findElement(locators.KeximHome.txtUserName);
				}catch(Exception e)
				{
					e.printStackTrace();
					return null;
				}
			}
			
			//txt Password
			public static WebElement txtPassword(WebDriver driver)
			{
				try{
				return driver.findElement(locators.KeximHome.txtPassword);
				}catch(Exception e)
				{
					e.printStackTrace();
					return null;
				}
				
			}
			
			//btn Login
			public static WebElement btnLogin(WebDriver driver)
			{
				try{
				return driver.findElement(locators.KeximHome.btnLogin);
				}catch(Exception e)
				{
					e.printStackTrace();
					return null;
				}
			}
			
			//img Home
			public static WebElement imgHome(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.imgHome);
			}
			
			//img Personal Banking
			public static WebElement imgPersonalBanking(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.imgPersonalBanking);
			}
			
			//img Corporate Banking
			public static WebElement imgCorporateBanking(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.imgCorporateBanking);
			}
			
			//img International Banking
			public static WebElement imgInternationalBanking(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.imgInternationalBanking);
			}
			
			//img About Us
			public static WebElement imgAboutUs(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.imgAboutUs);
			}
			
			//img Personal
			public static WebElement imgPersonal(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.imgPersonal);
			}
			
			//img Corporate
			public static WebElement imgCorporate(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.imgCorporate);
			}
			
			//img International
			public static WebElement imgInternational(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.imgInternational);
			}
			
			//lnk Customer Service
			public static WebElement lnkCustomerervice(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.lnkCustomerService);
			}
			
			//lnk International Banking FAQ's
			public static WebElement lnkInternationalBankingFAQs(WebDriver driver)
			{
				return driver.findElement(locators.KeximHome.lnkInternetBankingFAQs);
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
	    	 //img Change Password
	    	public static WebElement imgChangePassword(WebDriver driver)
	    	{
	    		return driver.findElement(locators.Global.imgChangePassword);
	    	}
	    	//img Logout
	    	public static WebElement imgLogout(WebDriver driver)
	    	{
		    	return driver.findElement(locators.Global.imgLogout);
		    	
	    	}
	    	//img Branches
	    	public static WebElement imgBranches(WebDriver driver)
	    	{
	    		return driver.findElement(locators.Global.imgBranches);
	    	}
	    	//img Roles
	    	public static WebElement imgRoles(WebDriver driver)
	    	{
	    		return driver.findElement(locators.Global.imgRoles);
	    	}
	    	//img Users
	    	public static WebElement imgUsers(WebDriver driver)
	    	{
	    		return driver.findElement(locators.Global.imgUsers);
	    	}		
	    	//img Employee
	    	public static WebElement imgEmployee(WebDriver driver)
	    	{
	    		return driver.findElement(locators.Global.imgEmployee);	
	    	}
	    	//lst Country
	    	public static Select lstCountry(WebDriver driver)
	    	{
	    		return new Select(driver.findElement(locators.Global.lstCountry));	
	    	}
	    	//lst State
	    	public static Select lstState(WebDriver driver)
	    	{
	    		return new Select(driver.findElement(locators.Global.lstState));	
	    	}
	    	//lst City
	    	public static Select lstCity(WebDriver driver)
	    	{
	    		return new Select(driver.findElement(locators.Global.lstCity));	
	    	}
	    	//btn Search
	    	public static WebElement btnSearch(WebDriver driver)
	    	{
	    		return driver.findElement(locators.Global.btnSearch);		
	    	}
	        //submit
	    	public static WebElement btnSubmit(WebDriver driver)
	    	{
	    		return driver.findElement(locators.Global.btnSubmit);		
	    	}
	    	
	    	
	    	
	    }
	    
	    //page objects of newbranch home
	    public static class NewBranchHome
	    {
	    	//branchname
	    	public static WebElement txtBranchName(WebDriver driver)
	    	{
	    		return  driver.findElement(locators.NewBranchHome.txtBranchName);
	    	}
	    	public static WebElement txtAddress1(WebDriver driver)
	    	{
	    		return driver.findElement(locators.NewBranchHome.txtAddress);
	    	}
	    	public static WebElement txtZipCode(WebDriver driver)
	    	{
	    		return driver.findElement(locators.NewBranchHome.txtZipCode);
	    	}
	    	
	    	
	    	
	    }
	    
		
		public static class Branches
		{
			public static WebElement imgNewBranches(WebDriver driver)
			{
			    return driver.findElement(locators.BranchesHome.imgNewBranch);
			}
		}


}
