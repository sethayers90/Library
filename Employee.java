package com.claim;

import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private Address address; // because we're old school and we're gonna send out paper checks
	private int employeeNum;
	private double basePay;

	// Creating a couple customers, I won't do this again
	Employee employee1 = new Employee("Seth", "Ayers", 1);
	Employee employee2 = new Employee("Vicki", "Swank", 2);

	public Employee(String firstName, String lastName, int employeeNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeNum = employeeNum;

	}

	public int getEmployeeNum() {
		return this.employeeNum;
	}

	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static void addEmployee() {
		System.out.println("Please enter the employee's first name: ");
		Scanner input = new Scanner(System.in);
		String firstName = input.next();

		System.out.println("Please  enter the employee's last name: ");
		Scanner input2 = new Scanner(System.in);
		String lastName = input.next();

		System.out.println("Please enter the employee's city: ");
		Scanner input3 = new Scanner(System.in);
		String city = input.next();

		System.out.println("Please enter the employee's street name: ");
		Scanner input4 = new Scanner(System.in);
		String streetName = input.next();

		System.out.println("Please enter the employee's street number: ");
		Scanner input5 = new Scanner(System.in);
		int streetNum = input.nextInt();

		System.out.println("Please enter the employee's zip code: ");
		Scanner input6 = new Scanner(System.in);
		int zipCode = input.nextInt();

	}

}
