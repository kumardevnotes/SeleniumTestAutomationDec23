package com.interfaces.demo;

public class KinderGarten implements ClassInterface {

	public static void main(String[] args) {
		KinderGarten kgObj = new KinderGarten();
		kgObj.printClassDetails("KinterGarten");
		kgObj.printClassBlock("Block C");
		System.out.println((kgObj.getClassPassPercentage(90)+"%"));
		
	}

	@Override
	public void printClassDetails(String className) {
		System.out.println("The className is: " + className);
	}

	@Override
	public void printClassBlock(String block) {
		System.out.println("The class block is: "+ block);
	}

	@Override
	public int getClassPassPercentage(int passPercentage) {
		return passPercentage;
		//
		//
		//
	}

}
