package com.parkwest.datahiding;

public class TestEmployee {

	public static void main(String[] args) {
		Employee john = new Employee();
//		Employee mary = new Employee();
//		Employee carlos = new Employee();

//		john.salary = 40000;
		john.setSalary(400000);
		double sal = john.getSalary();
		System.out.println(sal);
		
/*		john.setSalary(40000);
		john.setBonus(20000);; 
		john.totalPay();
*/
	}

}
