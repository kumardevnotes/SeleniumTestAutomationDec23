package com.file.io.demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextDocDemo {

	public static void main(String[] args) throws IOException {
		
		String rootPath =  System.getProperty("user.dir");
		System.out.println("rootPath location in local: " + rootPath );
		
		//Load the file into File object
		//Below code loads the file into File object that is "fis" if that file exists with given path
		//Below code creates and loads the file into File object that is "fis" if that file does not exist
		File fis =  new File(rootPath+"/src/test/resources/WriteAboutAustralia456.txt");
		
		String data = "Australia is a beautiful country!";	
		
		FileWriter fw = new FileWriter(fis);
		fw.write(data); // to write into file
		fw.append(data); // to append into the file on top of the existing data in the file
		fw.close(); // to close and save the file changes
		
	}

}
