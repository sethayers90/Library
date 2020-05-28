package com.claim;

import java.util.Scanner;

public class Customers {
	private String firstName;
	private String lastName;
	private Address address;
	private Books[] books;
	private int customerNum;
//Creating a couple customers, I won't do this again
	Customers customer1 = new Customers("Seth", "Ayers", 1);
	Customers customer2 = new Customers("Vicki", "Swank", 2);

	public Customers(String firstName, String lastName, int customerNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerNum = customerNum;

	}

	public int getCustomerNum() {
		return this.customerNum;
	}

	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
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

	public static void addCustomer() {
		System.out.println("Please enter the customer's first name: ");
		Scanner input = new Scanner(System.in);
		String firstName = input.next();

		System.out.println("Please  enter the customer's last name: ");
		Scanner input2 = new Scanner(System.in);
		String lastName = input.next();

		System.out.println("Please enter the customer's city: ");
		Scanner input3 = new Scanner(System.in);
		String city = input.next();

		System.out.println("Please enter the customer's street name: ");
		Scanner input4 = new Scanner(System.in);
		String streetName = input.next();

		System.out.println("Please enter the customer's street number: ");
		Scanner input5 = new Scanner(System.in);
		int streetNum = input.nextInt();

		System.out.println("Please enter the customer's zip code: ");
		Scanner input6 = new Scanner(System.in);
		int zipCode = input.nextInt();

		// look up how to generate a random int for the customer id

		// have another prompt come up based on the customers address that brings up
		// recommendations of home branches

	}

}
