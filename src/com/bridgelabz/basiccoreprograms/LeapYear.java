package com.bridgelabz.basiccoreprograms;

public class LeapYear {
	public static void main(String[] args) {
		int year = 1996;
		boolean isLeapYear = false;

		if (String.valueOf(year).length() == 4) {
			if (year % 4 == 0) {
				isLeapYear = true;
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						isLeapYear = true;
					} else {
						isLeapYear = false;
					}
				}
			} else {
				isLeapYear = false;
			}

			System.out.print(year + " is ");
			if (isLeapYear) {
				System.out.println("a leap year");
			} else {
				System.out.println("not a leap year");
			}
		} else {
			System.err.println("Invalid Year Input");
		}
	}
}
