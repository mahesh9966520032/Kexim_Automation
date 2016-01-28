package com.kexim.branchestestsuite;

import org.testng.annotations.Test;

import com.kexim.Appfunctions.Appfunctions;
import com.kexim.config.Configuration;
import com.kexim.testdata.TestData;
import com.kexim.util.Excel;
import com.kexim.util.Utility;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BR_tc003_createBranch {

	boolean bStatus;
	WebDriver driver;
 @BeforeMethod
  public void preCondition() {
	 driver=Appfunctions.openBrowser(Configuration.sURL); 
	 //input
	 //connect to excel
     Excel.setConnectinToExcel("TestData.xls");
     //select sheet to read data
     Excel.selectSheet("BranchEntry");
     //output
     //write data to ouput file
     Excel.connectToWritableExcel("TestData.xls");
     //select the writable sheet
     Excel.selectWritableSheet("BranchEntry");    
 }	
	
  @Test
  public void f() {
 
  	  Appfunctions.adminLogin(driver, TestData.KeximHome.sUserName,TestData.KeximHome.sPassword);
	  Appfunctions.clickBranches(driver);
	  
	  
	  //start
	  for(int iRowCounter=1;iRowCounter<Excel.getRowCount();iRowCounter++)
  {//for-loop starting
	 //click new branches	  
	  Appfunctions.clickNewBranche(driver);	  
	  
	  //testdata for branchentry
	  String sBranchName=Excel.getCellData(0,iRowCounter);
	  String sAdddress1=Excel.getCellData(1,iRowCounter);
	  String sZipCode=Excel.getCellData(2,iRowCounter);
	  String sCountry=Excel.getCellData(3,iRowCounter);
	  String sState=Excel.getCellData(4,iRowCounter);
	  String sCity=Excel.getCellData(5,iRowCounter);
	  String sValidation=Excel.getCellData(7,iRowCounter);
	  //fill branch entry
	  bStatus=Appfunctions.branchEntry(driver, sBranchName, sAdddress1, sZipCode, sCountry, sState, sCity);
	  //click submit
	  bStatus=Appfunctions.clickSubmit(driver);
	  //handle alert
	  bStatus=Utility.isAlertPresent(driver);
	  if(bStatus)
	  {
		String sActualAlertText=Utility.getAlertText(driver);
		if(sActualAlertText.contains(sValidation))
		{
			Excel.writeDataToCell(8,iRowCounter,"Pass");
			Reporter.log(sActualAlertText,true);
		}
		else
		{
			Excel.writeDataToCell(8,iRowCounter,"Fail");
			Reporter.log("not"+sActualAlertText,true);
		}
		Utility.handleAlert(driver);
	  }
	  
	  
 }//for-loop ending
	  
	  
	  
	  
  }


  @AfterMethod
  public void postCondition() {
  
	  bStatus=Appfunctions.tearBrowser(driver);
	  if(bStatus)
	  {
		  Reporter.log("Application is closed",true);
	  }
	  else
	  {
		  Reporter.log("Application not closed",true);
	  }
	  //save the workbook
	  Excel.saveWorkbook();
	  System.exit(0);
  }

}
