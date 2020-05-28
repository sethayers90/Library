package com.claim;
/*
 * I'm not exactly sure but maybe add a book home part of the object to say this book belongs at a certain branch
 * Also I'm not sure how to implement but there needs to be some type of search system to see if a book is on hand
 * so that the customer doesn't have to leave their house
 */

import java.util.Scanner;
//This will essentially be an inventory management system that can be accessed by the branch's 
public class Books {
	//Self explanatory of why we need these 
	private String author;
	private int istbn;
	private String title;
	private int numOfPages;
	private int barcode; //  I think this is kind of ambitious considering where we are but this should hold all the other info once scanned

	// Create a few books, I won't do this again
	Books book1 = new Books("Edgar Allan Poe", 2342, "The Raven", 24, 1);
	Books book2 = new Books("Stephen King", 38512, "The Shining", 450, 2);
	Books book3 = new Books("Nicholas Sparks", 3243, "The Longest Ride", 358, 3);
	Books book4 = new Books("George R.R. Martin", 8382, "A Game of Thrones (Song of Ice and Fire)", 401, 4);
	Books book5 = new Books("J.K. Rowling", 71923, "Harry Potter and the Sorcerer's Stone", 245, 5);

	public Books(String author, int istbn, String title, int numOfPages, int barcode) {
		this.author = author;
		this.istbn = istbn;
		this.title = title;
		this.numOfPages = numOfPages;
		this.barcode = barcode;
	}
//Getter & Setters
	public double getBarcode() {
		return this.barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIstbn() {
		return this.istbn;
	}

	public void setIstbn(int istbn) {
		this.istbn = istbn;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfPages() {
		return this.numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
//Creating a method to add a book to the system
	public static void addBook() {
		System.out.println("Please enter the title of the book: ");
		Scanner input = new Scanner(System.in);
		String title = input.next();

		System.out.println("Please enter the book's author: ");
		Scanner input2 = new Scanner(System.in);
		String author = input.next();

		System.out.println("What's the book's istbn");
		Scanner input3 = new Scanner(System.in);
		int istbn = input.nextInt();

		System.out.println("How many pages does the book have: ");
		Scanner input4 = new Scanner(System.in);
		int pages = input.nextInt();
	}
//This helps this system keep accurate inventory 
	private static void checkOut() {
		System.out.println("What branch is the customer located at: \n"
				+ "Enter 1 for \t Little Turtle Branch \n Enter 2 for \t Aboite Branch \n Enter 3 for \t Dupont Branch \n"
				+ " Enter 4 for \t Georgetown Branch \n Enter 5 for Grabill Branc");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		// Pull up the inventory of books at that specific branch

		System.out.println("Please enter the barcode of the book");
		Scanner input2 = new Scanner(System.in);
		int barcode = input.nextInt();
		// Much confusion here I'm not sure if barcode should be it own thing or not ask
		// Lamar

		// Add physical book to the customers class and take the book away from the
		// librarys inventory
	}

}