package com.interfaces.demo;

public interface ClassInterface {

	//Interface contains only abstract methods. That means methods with signature but without body
	public void printClassDetails(String className); // only method signature
	
	public void printClassBlock(String block);
	
	public int getClassPassPercentage(int stClass);
	
}
