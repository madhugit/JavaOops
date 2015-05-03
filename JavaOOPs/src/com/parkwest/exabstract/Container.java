package com.parkwest.exabstract;

public abstract class Container {
	public void calculateVolume(int length, int height){
		double volume = calculateAreaOfBase(length) * height; 
		System.out.println("Volume = " + volume);
	}
	public abstract double calculateAreaOfBase(int length);
}
