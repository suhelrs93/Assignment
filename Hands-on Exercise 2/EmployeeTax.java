package com.cognizant.tax;

// Problem Statement 5
public class EmployeeTax {
	public static void main(String[] args) {
		TaxCalculator object = new TaxCalculator();
		//Test Case 1
		System.out.println("Test Case 1 :");
		// passed value to instance variable for Test case 1
		object.basicSalary=25000f;
		object.citizenship=true; 
		// method calls for test case 1
		object.calculateTax();
		object.deductTax();
		object.validateSalary();
		
		System.out.println();// Will Print Blank line
		
		//Test Case 2
		System.out.println("Test Case 2 :");
		// passed value to instance variable for Test case 2
		object.basicSalary=125000f;
		object.citizenship=true;
		// method calls for test case 2
		object.calculateTax();
		object.deductTax();
		object.validateSalary();
		
	}

}
