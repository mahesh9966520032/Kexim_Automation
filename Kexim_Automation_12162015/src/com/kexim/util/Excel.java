package com.kexim.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Excel {

	
	public static Workbook objWorkbook;
	public static Sheet  objSheet;
	
	public static WritableWorkbook   objWritableWorkbook;
	public static  WritableSheet objWritableSheet;
	/*************************************************************
	 *   Mehtod Name :setConnectToExcel
	 *   Method For  :(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * **************************************************************/
	public static void setConnectinToExcel(String sinputFileName)
	{
		//set the file location converting permanent data to temporary
	File objFile=new File("C:\\Users\\mindq\\git\\Kexim_Automation2\\Kexim_Automation3\\Kexim_Automation_12162015\\TestData\\"+sinputFileName);
	try {
		FileInputStream objFis=new FileInputStream(objFile);
	objWorkbook=Workbook.getWorkbook(objFis);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
}
	
	/*************************************************************
	 *   Mehtod Name :selectSheet
	 *   Method For  :(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * **************************************************************/
	public static void selectSheet(String sSheetName)
	{
	  objSheet=objWorkbook.getSheet(sSheetName);
		
	}

	/*************************************************************
	 *   Mehtod Name :getCellData
	 *   Method For  :(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * @return 
	 * **************************************************************/
	public static String getCellData(int iColNumber,int iRowNumber)
	{
		return objSheet.getCell(iColNumber,iRowNumber).getContents();
	}
	/*************************************************************
	 *   Mehtod Name :getRowCount
	 *   Method For  :(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * @return 
	 * **************************************************************/
	public static int getRowCount()
	{
		return objSheet.getRows();
	}
	
	/*************************************************************
	 *   Mehtod Name :ConnectToWritableExcel
	 *   Method For  :(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * @return 
	 * **************************************************************/
	public static void connectToWritableExcel(String sOutputFile)
	{
		File objFileOutput=new File("C:\\Users\\mindq\\git\\Kexim_Automation2\\Kexim_Automation3\\Kexim_Automation_12162015\\TestData\\"+sOutputFile);
	    
		try {
			FileOutputStream objFos=new FileOutputStream(objFileOutput);
			
	      objWritableWorkbook=Workbook.createWorkbook(objFos,objWorkbook);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*************************************************************
	 *   Mehtod Name :selectWritableSheet
	 *   Method For  :(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * @return 
	 * **************************************************************/
	public static void selectWritableSheet(String sWritableSheetName)
	{
		   objWritableSheet=objWritableWorkbook.getSheet(sWritableSheetName);	
	}

	/*************************************************************
	 *   Mehtod Name :writeDataToCell
	 *   Method For  :(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * @return 
	 * **************************************************************/
	public static void writeDataToCell(int iColNumber,int iRowNubmer,String sResult)
	{
		  Label label=new Label(iColNumber, iRowNubmer, sResult);
		
		try {
			objWritableSheet.addCell(label);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	/*************************************************************
	 *   Mehtod Name :saveWorkbook
	 *   Method For  :(Description)
	 *   Created By  :
	 *   Created On  :  
	 *   Modified By :
	 * @return 
	 * **************************************************************/
	public static void saveWorkbook()
	{
		
		try {
			objWritableWorkbook.write();//acts as a save.
			objWritableWorkbook.close();//for closing the workbook
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
