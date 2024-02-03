package com.exception.handling.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//file IO operation. File input/output operation
public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		/*
		 * Create a properties file name: app.properties
		 * Add data in the above file
		 * Write java program to read the data in the file and print it on the console
		 * */
		
		//rootPath var stores the fullpath of the project
		String rootPath = System.getProperty("user.dir");
		System.out.println("rootPath: " + rootPath);
		
		try {
			
			//trying to load a file "app.properties' usingFileInputStream class
			FileInputStream fis =  new FileInputStream(rootPath+"/src/test/resources/app.properties");
			
			//Creating a properties object below
			Properties props = new Properties();
			
			//trying to load file object (fis) into props object
			props.load(fis);
			
			//trying to read each property using getProperty("keyName")
			System.out.println(props.getProperty("appURL"));
			System.out.println(props.getProperty("userName"));
			System.out.println(props.getProperty("password"));
			System.out.println(props.getProperty("browser"));
			
			
		} catch (FileNotFoundException e) {
			System.out.println("inside catch block..it seems file is not there in given path");
			e.printStackTrace();
		}
		
//		System.out.println("file reading operation is complete");
//		
//		FileInputStream fis2 =  new FileInputStream(rootPath+"/src/test/resources/app.properties");
	}
}
