package com.testjavapractice;

public class TestCosntParaTwo {

	int modelYear;
	String modelCar;
	public TestCosntParaTwo(int year, String Car) {
		
		modelYear = year;
		modelCar = Car;
		
	}
	
	public static void main(String args[]) {
		
		TestCosntParaTwo test = new TestCosntParaTwo(2021,"BMW");
		System.out.println(test.modelYear +" "+ test.modelCar);
	}
	
	
}
