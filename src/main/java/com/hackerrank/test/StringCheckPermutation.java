package com.hackerrank.test;

import java.util.Collections;

/*
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of 
 * the other. 
 */
public class StringCheckPermutation {

	public String sortString(String input) {
		char[] stringContents = input.toCharArray();
		java.util.Arrays.sort(stringContents);
		return new String(stringContents);
	}
	public boolean checkPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		return sortString(s1).equalsIgnoreCase(sortString(s2));
	}
	public static void main(String[] args) {
	
		System.out.println(new StringCheckPermutation().checkPermutation("dog", "god"));
		System.out.println(new StringCheckPermutation().checkPermutation("dog", "God"));
		System.out.println(new StringCheckPermutation().checkPermutation("dog", "goddd"));
	}

}
