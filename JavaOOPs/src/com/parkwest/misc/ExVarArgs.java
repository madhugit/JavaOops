package com.parkwest.misc;

public class ExVarArgs {
	public static void main(String args[]) {
		/*ExVarArgs ex = new ExVarArgs();
		ex.addNumbers(3, 4, 5);*/
		ExVarArgs.addNumbers("Adding Numbers" , 3, 4, 5, 78, 92, 34);
	}

	public static void addNumbers(String b, int ... a){
		int sum = 0;
		for(int x : a){
			sum += x;
		}
		System.out.println(b);
		System.out.println("sum = " + sum);
	}
}
