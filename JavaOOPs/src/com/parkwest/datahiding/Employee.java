package com.parkwest.datahiding;

public class Employee {
	private double salary;
	private double bonus;

	
    public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		if (salary < 100000) {
			this.salary = salary;
		} else {
			System.out.println("Please set salary to valid range");
		}
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	/*	public double getBonus() {
		return bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void setSalary(double salary){
		if(salary >= 30000 && salary <=150000){
			this.salary = salary;
		}else{
			this.salary = 0;
			System.out.println("Please check salary");
		}
	}
	
	public double getSalary(){ 
		return salary;
	}
*/
	public void totalPay() {
		double totalPay = salary + bonus;
		System.out.println("Total Pay = " + totalPay);
	}
}
