package com.kexim.locators;

import org.openqa.selenium.By;

public class locators {

	//Kexim Homepage Locators
	public static class KeximHome
	{
		//lst Branch Name
		public static By lstBranchName=By.id("drlist");
		
		//txt User Name
		public static By txtUserName=By.id("txtuId");
		
		//txt Password
		public static By txtPassword=By.id("txtPword");
		
		//btn Login
		public static By btnLogin=By.id("login");
		
		//img Home
		public static By imgHome=By.xpath(".//*[@id='Table_07']/tbody/tr/td[2]/a/img");
		
		//img Personal Banking
		public static By imgPersonalBanking=By.id("IMG3");
		
		//img Corporate Banking
		public static By imgCorporateBanking=By.xpath(".//*[@id='Table_07']/tbody/tr/td[4]/a/img");
		
		//img International Banking
		public static By imgInternationalBanking=By.xpath(".//*[@id='Table_07']/tbody/tr/td[5]/a/img");
		
		//img About Us
		public static By imgAboutUs=By.xpath("//*[@id='Table_07']/tbody/tr/td[6]/a/img");
		
		//img Personal
		public static By imgPersonal=By.id("personal");
		
		//img Corporate
		public static By imgCorporate=By.id("corporate");
		
		//img International
		public static By imgInternational=By.id("NRI");
		
		//lnk Customer Service
		public static By lnkCustomerService=By.linkText("Customer Service");
		
		//lnk Internet Banking FAQ's
		public static By lnkInternetBankingFAQs=By.linkText("Internet Banking FAQ's");
		
		//lnk Privacy
		public static By lnkPrivacy=By.linkText("Privacy");
		
		//lnk Terms and Conditions
		public static By lnkTermsandConditions=By.linkText("Terms and Conditions");
		
		//lnk Disclaimer
		public static By lnkDisclaimer=By.linkText("Disclaimer");
		
		//lnk Site Map	
		public static By lnkSiteMap=By.linkText("Site Map");
		

		
	}
	//Global Locators
	public static class Global
	
	{
	
	  //img Home
		public static By imgHome=By.xpath("//img[@src='images/admin_but_01.jpg']");
		
	  //img Change Password
		public static By imgChangePassword=By.xpath("//img[@src='images/admin_but_02.jpg']");
		
	 //img Logout
		public static By imgLogout=By.xpath("//img[@src='images/admin_but_03.jpg']");		
		
	//img Branches
		public static By imgBranches=By.xpath("//img[@src='images/Branches_but.jpg']");
		
		//img Roles
		public static By imgRoles=By.xpath("//img[@src='images/Roles_but.jpg']");
		
		//img Users
		public static By imgUsers=By.xpath("//img[@src='images/Users_but.jpg']");
		
		//img Employee
		public static By imgEmployee=By.xpath("//img[@src='images/emp_btn.jpg']");
		
		//lst Country
		public static By lstCountry=By.xpath("//select[starts-with(@id,'lst_coun')]");
		
		//lst State
		public static By lstState=By.xpath("//select[starts-with(@id,'lst_state')]");
		
		//lst City
		public static By lstCity=By.xpath("//select[starts-with(@id,'lst_city')]");
		
		//btn Search
		public static By btnSearch=By.id("btn_search");
				
		//btn Clear
		public static By btnClear=By.xpath("//input[starts-with(@id,'btn_cl')]");
		
		//btn Submit
		public static By btnSubmit=By.xpath("//input[@src='images/submit.jpg']");
		
		//btn Reset
		public static By btnReset=By.xpath("//input[contains(@src,'eset.jpg')]");
		
		//btn Cancel
		public static By btnCancel=By.xpath("//input[contains(@src,'ancel.jpg')]");
		
		
	
				
				
	}
}
