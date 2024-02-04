package com.file.io.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextDocDemo {

	public static void main(String[] args) throws IOException {
		
		String rootPath =  System.getProperty("user.dir");
		System.out.println("rootPath location in local: " + rootPath );
		
		//Load the file into File object
		File fileObject =  new File(rootPath+"/src/test/resources/AboutAustralia.txt");
		
		//Below code reads the data in above text file 
		BufferedReader bufferedReaderObj =  new BufferedReader(new FileReader(fileObject));
		String strTemp = "";
		
		//Read text doc line by line. when it completes all the lines reading, it returns null and quits the while loop
		while( (strTemp  = bufferedReaderObj.readLine()) != null) { // null != null --> false
			System.out.println(strTemp);
		}
		
		System.out.println("*************");
		
		FileReader fr =  new FileReader(fileObject);
		int num;
		
		//Read text doc char by char. when it completes all the char reading, it returns -1 and quits the while loop
		while( (num = fr.read()) != -1) { // -1 != -1 --> false
			char myChar = (char)num;
			System.out.print(myChar);
		}
			
	}

}
