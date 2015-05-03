package com.parkwest.errhandling;

public class ExThrowClass2 {

	public static void main(String[] args) {
		ExThrowClass1 ex = new ExThrowClass1();
		try {
			System.out.println(ex.divideNums(10, 0));
		} catch (Exception e) {
			System.out.println("ExThrowClass2 = " + e.getMessage());
		}
	}
}
