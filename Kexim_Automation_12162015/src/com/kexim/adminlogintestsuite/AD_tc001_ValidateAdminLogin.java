package com.kexim.adminlogintestsuite;

import org.testng.annotations.Test;

import com.kexim.Appfunctions.Appfunctions;
import com.kexim.config.Configuration;
import com.kexim.util.Utility;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class AD_tc001_ValidateAdminLogin {
//trhoguht project we have maitain the same driver instance otherwise caught up the null pointer exception
WebDriver driver;	
boolean bStatus;	
 @BeforeMethod
  public void preCondition() {
	 //srssprojects=domain name
	 //10.20.14.1024:8090
	driver=Appfunctions.openBrowser(Configuration.sURL);
	if(Utility.verifyText(driver,"Banker Login"))
	{		
		Reporter.log("browser is not launched properlly",true);
	}
	else
	{
		Assert.fail("browser is not launched properlly");
	}
 }	
	
  @Test
  public void f() {
	//admin login  
    bStatus=Appfunctions.adminLogin(driver, "Admin","Admin");
    if(bStatus)
    {    	
    	Reporter.log("Admin login successfully",true);
    }
    else
    {
    	Reporter.log("Admin not logined successfully",true);
    }
    
    if(!Utility.verifyText(driver,"Welcome"))
    {
    	Assert.fail("admin not not login to related modulues");
    }

    
    
  }


  @AfterMethod
  public void postCondition() {
	  
   bStatus=Appfunctions.tearBrowser(driver);
   if(bStatus)
   {
   	Reporter.log("closing the successfully",true);
   }
   else
   {
   	Reporter.log("Application is not closed",true);
   }

  
  }

}
