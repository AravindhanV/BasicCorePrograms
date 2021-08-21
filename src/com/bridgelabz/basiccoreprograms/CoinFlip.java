package com.bridgelabz.basiccoreprograms;

public class CoinFlip {
	public static void main(String[] args) {
		int timesToFlip = 5;
		int tailsCount = 0;

		if (timesToFlip > 0) {
			for (int i = 0; i < timesToFlip; i++) {
				double randomNumber = Math.random();
				if (randomNumber < 0.5) {
					tailsCount++;
				}
			}
			double tailsPercent = 100*tailsCount/timesToFlip;
			System.out.println("Tails: "+tailsPercent+"%\nHeads: "+(100-tailsPercent)+"%");
		} else {
			System.err.println("Time to flip coin must be positive");
		}
	}
}
