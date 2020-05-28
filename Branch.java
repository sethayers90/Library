package com.claim;

//This is basically where all the books employees and customers are handled
public class Branch {

	// add hours of operations eg. M - F 8a - 830p Sat 9a - 5p Sun closed
	private Employee[] employee; // The library needs people to run the place
	private String nameOfBranch; // So people can use Google Maps to find the place
	private Books[] books; // Why have a library w/o books
	private Customers[] customers;// Kinda need them
	private Address address;// So Google Maps can get the people to the place & we can send out mailers,
							// protmotions, etc.

	// Creating the different branches, I won't do this again
	Branch branch1 = new Branch("Little Turtle Branch");
	Branch branch2 = new Branch("Aboite Branch");
	Branch branch3 = new Branch("Dupont Branch");
	Branch branch4 = new Branch("Georgetown Branch");
	Branch branch5 = new Branch("Grabill Branch");

	// Setters and Getters
	public Branch(String nameOfBranch) {
		this.nameOfBranch = nameOfBranch;
	}

	public String getNameOfBranch() {
		return this.nameOfBranch;
	}

	public void setNameOfBranch(String nameOfBranch) {
		this.nameOfBranch = nameOfBranch;

	}
}
