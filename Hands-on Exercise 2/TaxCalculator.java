package com.cognizant.tax;
// Problem Statement 1
public class TaxCalculator {
	// Instance variable
	float basicSalary;
	boolean citizenship;
	float tax;
	int nettSalary;
	
	// Problem Statement 2
	void calculateTax(){ // method 1
		tax=30*basicSalary/100;
		System.out.println("The Tax of the employee for the "+ basicSalary +" is "+tax);
	}
	
	//Problem Statement 3
	void deductTax(){ //method 2
		nettSalary = (int)(basicSalary-tax); //Type Casting
		System.out.println("The nett salary of the employee "+nettSalary);
	}
	
	//Problem Statement 4
	void validateSalary(){ // method 3
		if(basicSalary > 100000 && citizenship==true) {
			System.out.println("The salary and citizenship eligibility: true");
			
		}
		else {
			System.out.println("The salary and citizenship eligibility: false");
		}
	}
	
	//

}
