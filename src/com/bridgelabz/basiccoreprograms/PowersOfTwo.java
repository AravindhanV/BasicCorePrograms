package com.bridgelabz.basiccoreprograms;

public class PowersOfTwo {
	public static void main(String[] args) {
		int n = (int) Math.floor(Float.parseFloat(args[0]));
		System.out.println("Power\t\tValue\t\tLeap Year?");
		for (int i=0;i<=n;i++) {
			int res = (int)Math.pow(2,i);
			System.out.println(i+"\t\t"+res+"\t\t"+(isLeapYear(res)?"Yes":"No"));
		}

		if (n < 31 && n >= 0) {

		} else {
			System.err.println("N must be between 0 and 31");
		}
	}

	public static boolean isLeapYear(int year) {
		boolean isLeapYear = false;

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
		return isLeapYear;
	}
}
