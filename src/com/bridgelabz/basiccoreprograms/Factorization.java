package com.bridgelabz.basiccoreprograms;

public class Factorization {
	public static void main(String[] args) {
		int n = 30;

		for (int i = 1; i * i <= n; i++) {
			if(n%i==0) {
				System.out.print(i+" "+(n/i)+" ");
			}
		}
		System.out.println();
	}
}
