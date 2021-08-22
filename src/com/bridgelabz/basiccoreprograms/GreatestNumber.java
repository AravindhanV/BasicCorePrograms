package com.bridgelabz.basiccoreprograms;

public class GreatestNumber {
	public static void main(String[] args) {
		int firstNumber = 3;
		int secondNumber = 5;
		int thirdNumber = 6;

		int greatest = firstNumber > secondNumber ? (firstNumber > thirdNumber ? firstNumber : thirdNumber)
				: (secondNumber > thirdNumber ? secondNumber : thirdNumber);
		
		System.out.println("The greatest number is "+greatest);
	}
}
