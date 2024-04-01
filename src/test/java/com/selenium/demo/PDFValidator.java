package com.selenium.demo;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFValidator {
	String filePath = "file:///C:/Users/JUNNU/Documents/Animal.pdf";
	@Test
	public void verifyTextFromPDF() {
		try {
			String pdfContent = displayPDfContent(filePath);
			Assert.assertTrue(pdfContent.contains("Animals dominate human conceptions"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Caught an excpetion while locating the file..." + e);
		}
	}

	public String displayPDfContent(String path) throws IOException {
		URL pdfURL = new URL(path);
		InputStream is = pdfURL.openStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		PDDocument doc = PDDocument.load(bis);
		PDFTextStripper strip = new PDFTextStripper();
		String stripText = strip.getText(doc);
		System.out.println(stripText);
		doc.close();
		return stripText;
	}

}
