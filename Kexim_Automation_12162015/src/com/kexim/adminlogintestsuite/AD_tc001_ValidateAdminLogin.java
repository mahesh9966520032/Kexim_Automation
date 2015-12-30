package com.kexim.adminlogintestsuite;

import org.testng.annotations.Test;

import com.kexim.Appfunctions.Appfunctions;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class AD_tc001_ValidateAdminLogin {
//trhoguht project we have maitain the same driver instance otherwise caught up the null pointer exception
WebDriver driver;	
boolean bStatus;	
 @BeforeMethod
  public void beforeMethod() {
	 
	driver=Appfunctions.openBrowser("http://srssprojects.in/home.aspx");
 }	
	
  @Test
  public void f() {
	  
    bStatus=Appfunctions.adminLogin(driver, "Admin","Admin");
    if(bStatus)
    {
    	Reporter.log("Admin login successfully",true);
    }
    else
    {
    	Reporter.log("Admin not logined successfully",true);
    }
    
  }


  @AfterMethod
  public void afterMethod() {
	  
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
