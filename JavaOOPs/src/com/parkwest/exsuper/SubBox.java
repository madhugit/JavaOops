package com.parkwest.exsuper;

public class SubBox extends Box{
	
	public int calculateArea(int length, int width) {
		System.out.println("my implementation");
		return 0;
	}
	public void calculateVolume(int length, int width, int height){
		double volume = calculateArea(length, width) * height;
		System.out.println("Volume = "+ volume);
	}	
}
