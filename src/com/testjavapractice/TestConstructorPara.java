package com.testjavapractice;

public class TestConstructorPara {

	int year;
	String ModelName;
	
	public TestConstructorPara(int myear, String Mname) {
		year= myear;
		ModelName = Mname;
		
	}
	
	public static void main(String args[]) {
		TestConstructorPara tcp = new TestConstructorPara(1995,"KoL");
		System.out.println("Manfu of the year "+ tcp.year + " Name of the model "+ tcp.ModelName);
		
	}
}
