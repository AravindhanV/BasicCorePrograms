package com.bridgelabz.basiccoreprograms;

public class VowelChecker {
	public static void main(String[] args) {
		char input = 'a';
		
		switch(Character.toLowerCase(input)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(input + " is a vowel");
			break;
		default: 
			System.out.println(input + " is not a vowel");
		}
	}
}
