package com.parkwest.errhandling;

public class ExException {
	public static void main(String[] args) {	
		int arr[] = new int[4];
		int a = 35;
		int b = 0;
		int c = 0;
		try{
			arr[5] = 25;
			c = a/b;
//			return;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { 
			System.out.println("Error message = " + e);
		} catch (Exception e) { System.out.println("Exception= " + e);
		} finally { 
			System.out.println("final code block - always runs");
		}
	
		System.out.println("c = " + c);
	}
}
