package com.testjavapractice;

public class TestConstPara {
	
	int x;

	public TestConstPara(int y) {
		
		x = y;
	}
	
	public static void main(String args[]) {
		
		TestConstPara test = new TestConstPara(2500);
		System.out.println(test.x);
		
	}

}
