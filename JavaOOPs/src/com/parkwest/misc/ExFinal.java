package com.parkwest.misc;

//public final class ExFinal {
public class ExFinal {
	final int  myVal = 5;

	public static void main(String[] args) {
		ExFinal ex = new ExFinal();
		ex.method1();
	}
	
	public void method1(){
//	public final void method1(){
		// myVal = 4; 
		System.out.println("myVal = " + myVal);
		
		// a test for git
	}
}
