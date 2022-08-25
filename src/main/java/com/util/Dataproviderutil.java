package com.util;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dataproviderutil {

		
		static Workbook book;
		static Sheet sheet;
		public static String Testdata_Path="C:\\Users\\14388\\eclipse-workspace\\GCReddyPortal\\src\\main\\java\\testdata\\logindetails.xlsx";
		
		public static Object[][] getTestData(String sheetname)
		{
			FileInputStream fis=null;
			
			try {
				fis=new FileInputStream(Testdata_Path);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 try {
				book=WorkbookFactory.create(fis);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 sheet=book.getSheet(sheetname);
			 Object data[][]=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			 for(int i=0;i<sheet.getLastRowNum();i++)
			 {
				 for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
				 {
					 data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				 }
			 }
			 
			 return data;
			 
					 }

	}




