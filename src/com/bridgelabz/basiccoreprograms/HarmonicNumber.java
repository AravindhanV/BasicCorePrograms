package com.bridgelabz.basiccoreprograms;

public class HarmonicNumber {
	public static void main(String[] args) {
		int n = 5;

		if (n > 0) {
			double res = 0;
			for(int i=1;i<=n;i++) {
				res += (1.0/i);
			}
			System.out.println("The required harmonic number is "+res);
		} else {
			System.err.println("Number must be > 0");
		}
	}
}
