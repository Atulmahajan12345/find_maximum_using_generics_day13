package com.bridgelabz;

public class GivenThreeFloatFindMaximum {
	public static void main(String[] args) {
		Integer intNumber1 = 30;
		Integer intNumber2 = 100;
		Integer intNumber3 = 80;

		Double doubleNumber1 = 800.3;
		Double doubleNumber2 = 800.0;
		Double doubleNumber3 = 800.90;

		findMaximumIntegerNumber(intNumber1, intNumber2, intNumber3);
		findMaximumDoubleNumber(doubleNumber1, doubleNumber2, doubleNumber3);
	}

	private static void findMaximumDoubleNumber(Double doubleNumber1, Double doubleNumber2, Double doubleNumber3) {
		Double maximumNumber = doubleNumber1;
		if (Double.compare(maximumNumber, doubleNumber2) == -1) {
			maximumNumber = doubleNumber2;
		}
		if (Double.compare(maximumNumber, doubleNumber3) == -1) {
			maximumNumber = doubleNumber3;
		}
		System.out.println("The maximum floating Number is " + maximumNumber);
	}

	private static void findMaximumIntegerNumber(Integer intNumber1, Integer intNumber2, Integer intNumber3) {
		Integer maximumNumber = intNumber1;
		if (Integer.compare(maximumNumber, intNumber2) == -1) {
			maximumNumber = intNumber2;
		}
		if (Integer.compare(maximumNumber, intNumber3) == -1) {
			maximumNumber = intNumber3;
		}
		System.out.println("The maximum Integer Number is " + maximumNumber);
	}
}
