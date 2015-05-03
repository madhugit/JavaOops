package com.parkwest.exabstract;

public class TestContainer {

	public static void main(String[] args) {
		Container c1 = new CircleContainer();
		c1.calculateVolume(10, 5);
		
		Container c2 = new SquareContainer();
		c2.calculateVolume(10, 5);
				
	}
}
