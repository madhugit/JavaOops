package com.parkwest.errhandling;

public class ExThrowClass1 {
	public int divideNums(int a, int b) throws Exception {
		int c = 0;
		try {
			c = a/b;
		} catch(Exception e) {
			System.out.println("Exception from ExThrowClass1");
			throw new Exception("Please check your arguments");
		}
		
		return c;	
	}
}
