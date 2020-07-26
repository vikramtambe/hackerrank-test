package com.hackerrank.test;

public class IsPrimeNumber {

	boolean isPrime(int number) {
		for(int x=2; x * x <= number; x++) {
			if(number % x == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(new IsPrimeNumber().isPrime(12));
		System.out.println(new IsPrimeNumber().isPrime(11));
		System.out.println(new IsPrimeNumber().isPrime(33));
	}
}
