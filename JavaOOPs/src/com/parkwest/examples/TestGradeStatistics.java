package com.parkwest.examples;

public class TestGradeStatistics {

	public static void main(String[] args) {
		GradesStatistics gs = new GradesStatistics();
		gs.readGrades();
		System.out.println("The average is " + gs.average());
		System.out.println("The minimum is " + gs.min());
		System.out.println("The maximum is " + gs.max());
	}

}
