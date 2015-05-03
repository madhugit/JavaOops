package com.parkwest.exstatic;

public class ExampleStatic {
	//static data
	static int staticVariable;
	int nonStaticVariable;
	
	ExampleStatic(){
		System.out.println("Constructor");
	}

	static {
		System.out.println("Static block of code");
	}
	
	//static method
	static public void staticMethod()
	{
		System.out.println("staticVariable = " + staticVariable);
		staticVariable++;
		//static methods can only access other static data & methods
	}
	
	public void nonStaticMethod()
	{
		System.out.println("nonStaticVariable = " + nonStaticVariable);
		nonStaticVariable++;
	}	
}
