package com.claim;

public class Address {
	private String city;
	private String streetName;
	private int zipCode;
	private int streetNumber;

	public Address(String city, String streetName, int zipCode, int streetNumber) {
		this.city = city;
		this.streetName = streetName;
		this.zipCode = zipCode;
		this.streetNumber = streetNumber;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetName() {
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getStreetNumber() {
		return this.streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
}
