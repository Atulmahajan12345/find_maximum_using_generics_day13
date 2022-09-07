package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMaximum <T extends Comparable<T>>
{
	private T value1;
	private T value2;
	private T value3;
	private T[] valueArray;

	public PrintMaximum(T value1, T value2, T value3, T[] valueArray)
	{
		super();
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
		this.valueArray = valueArray;
	}

	public void findMaxUsingCompare() 
	{
		findMaximumUsingCompare(this.value1, this.value2, this.value3,this.valueArray);
	}

	public static <T extends Comparable<T>> void findMaximumUsingCompare(T value1, T value2, T value3,T[] valueArray) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter by which way you have to fnd maximum \n 1) Using Compaare \n 2) Using Sorting");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			T maximum = value1;
			if (maximum.compareTo(value2) < 0)
			{
				maximum = value2;
			}
			if (maximum.compareTo(value3) < 0 )
			{
				maximum = value3;
			}
			printMax(maximum);			
			break;
		case 2:
			Arrays.sort(valueArray);
			printMax(valueArray[2]);
			break;
		default:
			System.err.println("Wrong input value");
			break;
		}
	}

	private static <T> void printMax(T maximum) {
		System.out.println("The Maximum is "+ maximum);
	}

	public static void main(String[] args)
	{
		Integer intNumber1 = 300;
		Integer intNumber2 = 1000;
		Integer intNumber3 = 800;
		Integer[] intNumbers = {intNumber1,intNumber2,intNumber3};

		Double doubleNumber1 = 802.3; 
		Double doubleNumber2 = 803.912; 
		Double doubleNumber3 = 802.90; 
		Double[] doubleNumbers = {doubleNumber1, doubleNumber2,doubleNumber3};

		String fruit1 = "Apple";
		String fruit2 = "Banana";
		String fruit3 = "Peach";
		String[] strFruits = {fruit1,fruit2,fruit3};

		PrintMaximum<Integer> integer = new PrintMaximum<Integer>(intNumber1,intNumber2,intNumber3,intNumbers) ;
		integer.findMaxUsingCompare();

		PrintMaximum<Double> floatingNumber = new PrintMaximum<Double>(doubleNumber1,doubleNumber2,doubleNumber3,doubleNumbers);
		floatingNumber.findMaxUsingCompare();

		PrintMaximum<String> stringValue  = new PrintMaximum<String>(fruit1,fruit2,fruit3,strFruits);
		stringValue.findMaxUsingCompare();

	}
}


