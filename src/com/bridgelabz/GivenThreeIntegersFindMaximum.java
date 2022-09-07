package com.bridgelabz;

public class GivenThreeIntegersFindMaximum {
	public static void main(String[] args) {
		Integer number1 = 30;
		Integer number2 = 10;
		Integer number3 = 80;
		findMaximumNumber(number1, number2, number3);
	}

	private static void findMaximumNumber(Integer number1, Integer number2, Integer number3) {
		Integer maximumNumber = number1;
		if (Integer.compare(maximumNumber, number2) == -1) {
			maximumNumber = number2;
		}
		if (Integer.compare(maximumNumber, number3) == -1) {
			maximumNumber = number3;
		}

		System.out.println("The maximum Number is " + maximumNumber);
	}
}
