package com.hackerrank.test;
//Is Unique: Implement an algorithm to determine if a string has all unique characters. 
//What if you cannot use additional data structures? 
public class SolutionUniqueCharacters {

	public boolean isUniqueChars(String inputString) {
		if(inputString.length() > 128) {
			return false;
		}
		boolean[] charSet = new boolean[128];
		for(int i=0;i<inputString.length();i++) {
			int curVal = inputString.charAt(i);
			if(charSet[curVal]) {
				return false;
			}
			charSet[curVal] = true;
		}
		return true;
	}
	public static void main(String[] args) {
		System.err.println(new SolutionUniqueCharacters().isUniqueChars("asdflkjh"));
		System.err.println(new SolutionUniqueCharacters().isUniqueChars("abhayarjun"));
	}

}
