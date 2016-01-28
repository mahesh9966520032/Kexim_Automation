package com.kexim.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	//verify text
	public static boolean verifyText(WebDriver driver,String sExpectedText)
	{
		
	boolean bStatus=driver.getPageSource().contains(sExpectedText);
	if(bStatus)
	{
		return true;
	}
	else
	{
		return false;
	}
}
    
    //verify object existance
	public static boolean objectExistance(WebDriver driver,By objLocator)
	{
		try{
		driver.findElement(objLocator).isDisplayed();
		return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	//getscreenshot
	public static void getScreenShot(WebDriver driver,String sFileName)
	{
		
		//getting the system current data
		Date date=new Date();
	    //specify formate for date
		DateFormat formate=new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
		
		//now collect the formated date to variable
		  String sFormatedDate=formate.format(date);
		
		String sFolderPath="C:\\Users\\mindq\\git\\Kexim_Automation2\\Kexim_Automation3\\Kexim_Automation_12162015\\screenshots\\";
		
		File  srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(sFolderPath+sFileName+sFormatedDate+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	//verify aler existance
	public static boolean isAlertPresent(WebDriver driver)
	{
		try{
		driver.switchTo().alert();
		return true;
		
		}catch(Exception e)
		{
			return false;
		}
   }
	
	//get text from alert
	public static String getAlertText(WebDriver driver)
	{
		try{
		return driver.switchTo().alert().getText();
		}catch(Exception e)
		{
			return null;
		}
	}
	
	//handle the alert
	public static boolean handleAlert(WebDriver driver)
	{
		try{
		driver.switchTo().alert().accept();
		return true;
		}catch(Exception e)
		{
			return false;
		}
	}
	
	
	
}


