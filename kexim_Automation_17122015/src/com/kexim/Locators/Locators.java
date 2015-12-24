package com.kexim.Locators;

import org.openqa.selenium.By;

public class Locators {
	
	//Kexim Home page Locators
	public static class KexmimHome
	{
		//lst Branch Name
		public static By lstBranchName=By.id("drlist");
		
		//txt UserName
		public static By txtUserName=By.id("txtuId");
		
		//txt Password
		public static By txtPassword=By.id("txtPword");
		
		//img Home
		public static By imgHome=By.xpath(".//*[@id='Table_07']/tbody/tr/td[2]/a/img");
		
		//btn Personal
		public static By btnPersonal=By.id("personal");
		
		//lnk CustomerService
		public static By lnkCustomerService=By.linkText("Customer Service");
		
	}//keximHome end
	
	
	//Global Locators
	public static class Global
	{
		//img Branches	
		public static By imgBranches=By.xpath("//img[@src='images/Branches_but.jpg']");
		
		//img Country
		public static By imgCountry=By.xpath("//select[starts-with(@id,'lst_coun')]");
		
		//btn search		
		public static By btnSearch=By.id("btn_search");
		
		//btn clear
		public static By btnClear=By.xpath("//input[starts-with(@id,'btn_cl')]");
		
		//btn Submit
		public static By btnSubmit=By.xpath("//input[@src='images/submit.jpg']");
		
		//btn Reset
		public static By btnReset=By.xpath("//input[contains(@src,'eset.jpg')]");
		
					
	}//Global end
	
	//BranchesHome Locators
	public static class BranchesHome
	{
		//btn NewBranch
		
	}
	
	
	
}
