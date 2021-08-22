package com.bridgelabz.basiccoreprograms;

public class NumberSwap {
	public static void main(String[] args) {
		int firstNumber = 5;
		int secondNumber = 2;

		System.out.println("Before Swap:");
		System.out.println("firstNumber = " + firstNumber);
		System.out.println("secondNumber = " + secondNumber);

		int temp;
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("After Swap:");
		System.out.println("firstNumber = " + firstNumber);
		System.out.println("secondNumber = " + secondNumber);
	}
}
