package com.kexim.branchestestsuite;

import org.testng.annotations.Test;

import com.kexim.Appfunctions.Appfunctions;
import com.kexim.config.Configuration;
import com.kexim.testdata.TestData;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BR_tc001_validateBranches {
  
	WebDriver driver;
	boolean bStatus;
 @BeforeMethod
 public void preCondition()
  {
	 driver=Appfunctions.openBrowser(Configuration.sURL);
  }	
	
  @Test
  public void f() 
  {
	  
	  bStatus=Appfunctions.adminLogin(driver,TestData.KeximHome.sUserName,TestData.KeximHome.sPassword);
	  if(bStatus)
	  {
		  Reporter.log("Admin login successfully",true);
	  }
	  else
	  {
		  Reporter.log("Admin not login successfully",true);
	  }
	  
	  bStatus=Appfunctions.clickBranches(driver);
	  if(bStatus)
	  {
		  Reporter.log("Branches page opend successfully",true);
	  }
	  else
	  {
		  Reporter.log("Branches not page opend successfully",true);
	  }
	  
  }


  @AfterMethod
  public void postCondition()
  {
	  bStatus=Appfunctions.tearBrowser(driver);
	  if(bStatus)
	  {
		  Reporter.log("Application is closed",true);
	  }
	  else
	  {
		  Reporter.log("Application not closed",true);
	  }
  }

}
