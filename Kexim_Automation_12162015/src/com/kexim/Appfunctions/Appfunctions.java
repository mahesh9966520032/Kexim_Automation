package com.kexim.Appfunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.kexim.util.Utility;
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
		    e.printStackTrace();
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
	
	/*************************************************************
	 *   Mehtod Name :clickBranches
	 *   Method For  :for accessing the branches modulues
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * @return 
	 * **************************************************************/
	public static boolean clickBranches(WebDriver driver)
	{
     try{
      PageObjects.Global.imgBranches(driver).click();		
      return true;
     }catch(Exception e){
    	 e.printStackTrace();//it is printing error description on console
     return false;
     }
	}

	/*************************************************************
	 *   Mehtod Name :clickNewBranche
	 *   Method For  :
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * @return 
	 * **************************************************************/
	public static boolean clickNewBranche(WebDriver driver)
	{
     try{
      PageObjects.Branches.imgNewBranches(driver).click();		
      return true;
     }catch(Exception e){
    	 e.printStackTrace();//it is printing error description on console
     return false;
     }
	}

	
	
	/*************************************************************
	 *   Mehtod Name :branchEntry
	 *   Method For  :fill  all the fields of branch entry form
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * @return 
	 * **************************************************************/
	public static boolean branchEntry(WebDriver driver,String sBranchName,String sAdddress1,String sZipCode,String sCountry,String sState,String sCity) 	
	
	{
     try{
       //branchName
  
    	 PageObjects.NewBranchHome.txtBranchName(driver).sendKeys(sBranchName);
    	 PageObjects.NewBranchHome.txtAddress1(driver).sendKeys(sAdddress1);
    	 PageObjects.NewBranchHome.txtZipCode(driver).sendKeys(sZipCode);
    	 PageObjects.Global.lstCountry(driver).selectByVisibleText(sCountry);
    	 PageObjects.Global.lstState(driver).selectByVisibleText(sState);
    	 PageObjects.Global.lstCity(driver).selectByVisibleText(sCity); 	 
    	 
      return true;
     }catch(Exception e){
    	 e.printStackTrace();//it is printing error description on console
     return false;
     }
	}
	
	/*************************************************************
	 *   Mehtod Name :clickSubmit
	 *   Method For  :
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * @return 
	 * **************************************************************/
	public static boolean clickSubmit(WebDriver driver) 	
	
	{
     try{
       //branchName
        PageObjects.Global.btnSubmit(driver).click();
      return true;
     }catch(Exception e){
    	 e.printStackTrace();//it is printing error description on console
     return false;
     }
	}
	/*************************************************************
	 *   Mehtod Name :WebTableUpdation
	 *   Method For  :
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * @return 
	 * @return 
	 * **************************************************************/
	public static boolean WebTableUpdation(WebDriver driver,String sExpectedBranchId) throws Exception
	{
		try{
		
		 boolean bFlage=false;
		  //get the total tables 
	     String TablesCount=driver.findElement(By.xpath(".//*[@id='DG_bankdetails']/tbody/tr[7]/td")).getText();
		 System.out.println(TablesCount);
		 //make string to array
		 String[] sTables=TablesCount.split(" ");
		 
		 //loop through each table
		 for(int iTableCounter=1;iTableCounter<sTables.length;iTableCounter++)
		 {
			 //target the table
			 WebElement table=driver.findElement(By.xpath(".//*[@id='DG_bankdetails']/tbody"));
			 //get the total rows
			   List<WebElement>  Rows=table.findElements(By.tagName("tr"));
			    //loop through each row
			       for(int iRowCounter=0;iRowCounter<Rows.size();iRowCounter++)
			       {
			    	   //targetting the row  and get cel
			    	     List<WebElement>  cells=Rows.get(iRowCounter).findElements(By.tagName("td"));
			    	      //loop through each cell 
			    	     for (int iColCounter=0;iColCounter<cells.size();iColCounter++)
			    	     {
			    	    	 String actualText=cells.get(iColCounter).getText();
			    	    	 
			    	    	 if(actualText.matches(sExpectedBranchId))
			    	    	 {
			    	    		 //for updation
			    	    		 cells.get(6).findElement(By.tagName("a")).click();
			    	    		 
			    	    		 driver.findElement(By.id("txtadd2u")).sendKeys("Changed1");
			    	    		 Thread.sleep(3000);
			    	    		 driver.findElement(By.id("btnupdate")).click();
			    	    		 Utility.handleAlert(driver);
			    	    		 bFlage=true;
			    	    		 break;
			    	    		
			    	    	 }
			    	    				    	    	  
			    	     }
			    	     
		    	    	 if(bFlage)
		    	    	 {
		    	    		 break;
		    	    	 }
			    	     
			       }
			 
			 
	    	    	 if(bFlage)
	    	    	 {
	    	    		 break;
	    	    	 }
	    	    	 else{	 
			                 //click on each table
			                 driver.findElement(By.linkText(sTables[iTableCounter])).click();
	    	    	  }
	    	}
		 return true;
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		 
	}
	
		
}//appfunction  closing
