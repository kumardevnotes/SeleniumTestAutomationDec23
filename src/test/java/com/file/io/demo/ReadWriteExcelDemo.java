package com.file.io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelDemo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Create an excel workbook or worksheet
		 * Create a sheet inside it
		 * Add data in the form of rows and columns
		 * 
		 * Write a Java program to read or write into excel sheet
		 *   Add the third party libraries from mavenrepository into pom.xml --> project object model
		 *   Write the code in java to read or write into excel sheet
		 * */
		
		/*
		 *  Reading from excel workbook
		 * 
		 * 1. Copy excel dependencies (apache poi dependencies ) and add in your
		 *       project's POM.xml and then save it 
		 *       
		 * 2. Write your code using XSSS=FWorkbook
		 *      and XSSFWorksheet class level methods to read/write data into excel
		 */

		// Below statement gives you root folder path
		String rootPath = System.getProperty("user.dir");

		// Reading from excel workbook
		FileInputStream fileInputStream = new FileInputStream(
				new File(rootPath + "//src//test//resources//MyExcelWorksheet.xlsx"));

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("UserData");
		System.out.println(sheet.getRow(2).getCell(1).toString());
		System.out.println(sheet.getRow(2).getCell(2).toString());
		System.out.println(sheet.getRow(3).getCell(3).toString());
		
		
		System.out.println(sheet.getRow(0).getCell(0).toString());
		System.out.println(sheet.getRow(0).getCell(3).toString());
		System.out.println(sheet.getRow(11).getCell(2).toString());
		
		
		// Writing into excel workbook
		  System.out.println("Before writing/updating into excel sheet");
		  System.out.println(sheet.getRow(2).getCell(2).toString()); //  johntest1122@gmail.com
		  
		  // To write into Excel sheet 
			  FileOutputStream fileOutputStream = new FileOutputStream( new File(rootPath + "//src//test//resources//MyExcelWorksheet.xlsx"));
		  
		  // To update or write changes into excel sheet
		  sheet.getRow(2).getCell(2).setCellValue("testuser@gmail.com"); // testuser@gmail.com
		  
		  // Write changes into excel sheet 
		  
		  workbook.write(fileOutputStream);
		  
		  System.out.println("After writing/updating into excel sheet");
		  System.out.println(sheet.getRow(2).getCell(2).toString()); // testuser@gmail.com
		  
		  // Save and close excel sheet 
		  
		  fileOutputStream.close();
	}

}
