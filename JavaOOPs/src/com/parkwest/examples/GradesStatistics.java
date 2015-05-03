package com.parkwest.examples;
import java.util.Scanner;

public class GradesStatistics {
	public static int[] grades;
	public static int numStudents;
	
	public void readGrades(){
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("Enter number of students : ");
			numStudents = in.nextInt();
			
			if ((numStudents <= 0) | (numStudents > 10)) {
				System.out.print("Enter number of students between 1 and 10\n");
			}
		} while ((numStudents <= 0) | (numStudents > 10));

		grades = new int[numStudents];
		int counter = 0;
		
		do {
			int grade;
			
			System.out.print("Enter grade of student "+counter+ " : ");
			grade = in.nextInt();
			
			if (grade <= 100) {
				grades[counter] = grade;
				++counter;
			}
			else {
				System.out.print("Enter valid grade between 0 and 100 \n");				
			}
		} while (counter < numStudents);
		
		in.close();
	}
	
	public double average() {
		double sum = 0.0;
		double avg;
		for (int grade : grades) {
			sum += grade;
		}
		avg = sum/numStudents;
		return avg;
	}

	public int min() {
		int min = 99;
		for (int i=0; i<numStudents; i++){
			if (min > grades[i]) {
				min = grades[i];
			}
		}
		return min;
	}

	public int max() {
		int max = 0;
		for (int i=0; i<numStudents; i++){
			if (max < grades[i]) {
				max = grades[i];
			}
		}
		return max;
	}
	
}
