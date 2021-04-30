package com.testjavapractice;

public class TestConstructor {
	
	int x;
	
	
	public void add() {
		int a =10;
		int b= 20;
		int c= a+b;
		
		System.out.println("Final value of the c "+ c);
		
	}
	
	public TestConstructor() {
		x=10;
		
		System.out.println("entered the value as x "+ x);
		
		add();
	}
	
	public static void main(String [] args) {
		
		TestConstructor testconst = new TestConstructor();
		
	}

}
