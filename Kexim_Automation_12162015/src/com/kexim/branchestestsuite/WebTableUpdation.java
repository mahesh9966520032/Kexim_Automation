package com.kexim.branchestestsuite;

import org.testng.annotations.Test;

import com.kexim.Appfunctions.Appfunctions;
import com.kexim.config.Configuration;
import com.kexim.testdata.TestData;
import com.kexim.util.Utility;

import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class WebTableUpdation {

	boolean bFlage=false;
	boolean bStatus;
	WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() {
		  driver=Appfunctions.openBrowser(Configuration.sURL);
	  }
	
	@Test
  public void f() throws Exception {
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
		 
		 Appfunctions.WebTableUpdation(driver,"82");
		 
		 
  }


  @AfterMethod
  public void afterMethod() {
  }

}
