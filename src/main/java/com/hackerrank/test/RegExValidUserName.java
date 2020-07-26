package com.hackerrank.test;

import java.util.Scanner;

public class RegExValidUserName {
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}

class UsernameValidator {
	/*
	 * Write regular expression here.
	 */
	public static final String regularExpression = "^[A-Za-z]\\w{7,29}$";
}
/**
 * If someone manages to reach my comment, let me explain, in detail, why this works. 
 * ^ represents that starting character of the string. 
 * [aA-zZ] makes sure that the starting character is in the lowercase or uppercase alphabet. 
 * \\w{7,29} represents a check to make sure that the remaining items are word items, 
 * which includes the underscore, until it reaches the end and that is represented with $. 
 * The {7,29} represents the 8-30 character constraint given to us minus the predefined 
 * first character.
 */
