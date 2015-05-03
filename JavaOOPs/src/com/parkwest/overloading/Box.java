package com.parkwest.overloading;

public class Box {
	void findArea (int length){
		System.out.println("Area (1 arg) = " + (length*length));
	}
	void findArea(double length){
		System.out.println("Double Area = " + (length*length));
	}
	void findArea(int length, int width){
		System.out.println("Area (2 args) = " + (length*width));
	}
}
