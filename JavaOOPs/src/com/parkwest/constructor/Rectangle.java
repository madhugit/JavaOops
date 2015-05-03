package com.parkwest.constructor;

public class Rectangle {
	int length;
	int width;

	Rectangle(){
		this.length = 5;
		this.width = 6;
		System.out.println("Constructor Done");
	}

	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}

	void findArea(){ 
		int area = length * width ; 
		System.out.println("Area = "+ area); 
	}
}
