package com.testjavapractice;

public class JackAbstract extends MainTest {
	public int gradYear = 2021;
	@Override
	public void work() {
		System.out.println("Working int the sw");
		
		
	}
	
public static void main(String args[]) {
	
	JackAbstract test = new JackAbstract();
	
	System.out.println("Name :" + test.name);
	System.out.println("age :" + test.age);
	System.out.println("graduYear :" + test.gradYear);
}

}
