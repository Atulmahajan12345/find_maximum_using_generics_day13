package com.bridgelabz;

public class FindMaximum {
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

		findMaximum(fruit1, fruit2, fruit3);
		findMaximum(intNumber1, intNumber2, intNumber3);
		findMaximum(doubleNumber1, doubleNumber2, doubleNumber3);
	}

	public static <T extends Comparable<T>> void findMaximum(T value1, T value2, T value3) {
		T maximum = value1;
		if (maximum.compareTo(value2) < 0) {
			maximum = value2;
		}
		if (maximum.compareTo(value3) < 0) {
			maximum = value3;
		}
		System.out.println("The Maximum is " + maximum);

	}

}
