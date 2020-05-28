package com.claim;

/*
 * This is just a virtual location to house the "system", again I think this is ambitious, but this 1st promopt would,
 * then switch to the methods that are in the other classes.
 */
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		System.out.println("Welcome to my library! Please enter a number based on what you want to do: \n"
				+ "1. Add a book\n" + "2. Add a customer\n" + "3. Check out a book\n" + "4.Add a branch");
		Scanner input = new Scanner(System.in);
		int usrInput = input.nextInt(); // After this I want it to pass to one of the methods and so on and so fourth
	}

}