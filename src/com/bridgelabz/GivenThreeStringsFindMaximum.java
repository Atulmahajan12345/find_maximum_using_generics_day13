package com.bridgelabz;

public class GivenThreeStringsFindMaximum {
	public static void main(String[] args) {
		Integer intNumber1 = 30;
		Integer intNumber2 = 100;
		Integer intNumber3 = 80;

		Double doubleNumber1 = 802.3;
		Double doubleNumber2 = 803.112;
		Double doubleNumber3 = 802.90;

		String fruit1 = "Apple";
		String fruit2 = "Banana";
		String fruit3 = "Peach";

		findMaximumString(fruit1, fruit2, fruit3);
		findMaximumIntegerNumber(intNumber1, intNumber2, intNumber3);
		findMaximumDoubleNumber(doubleNumber1, doubleNumber2, doubleNumber3);
	}

	private static void findMaximumString(String fruit1, String fruit2, String fruit3) {
		String maximumString = fruit1;
		if (maximumString.compareTo(fruit2) < 0) {
			maximumString = fruit2;
		}
		if (maximumString.compareTo(fruit3) < 0) {
			maximumString = fruit3;
		}
		System.out.println("The maximum string is " + maximumString);
	}

	private static void findMaximumDoubleNumber(Double doubleNumber1, Double doubleNumber2, Double doubleNumber3) {
		Double maximumNumber = doubleNumber1;
		if (maximumNumber.compareTo(doubleNumber2) < 0) {
			maximumNumber = doubleNumber2;
		}
		if (maximumNumber.compareTo(doubleNumber3) < 0) {
			maximumNumber = doubleNumber3;
		}
		System.out.println("The maximum floating Number is " + maximumNumber);
	}

	private static void findMaximumIntegerNumber(Integer intNumber1, Integer intNumber2, Integer intNumber3) {
		Integer maximumNumber = intNumber1;
		if (maximumNumber.compareTo(intNumber2) < 0) {
			maximumNumber = intNumber2;
		}
		if (maximumNumber.compareTo(intNumber3) < 0) {
			maximumNumber = intNumber3;
		}
		System.out.println("The maximum Integer Number is " + maximumNumber);
	}
}
