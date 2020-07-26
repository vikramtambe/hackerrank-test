package com.hackerrank.test;
/**
 * String Compression: Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. 
 * If the "compressed" string would not become smaller than the original string, your method 
 * should return the original string. You can assume the string has only uppercase and 
 * lowercase letters (a -z). 
 * @author vtambe
 *
 */
public class SolutionStringCompress {

	public String compressString(String s) {
	    if (s == null) {
	        return s;
	    }
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	        sb.append(s.charAt(i));
	        int j = i+1;
	        System.out.println("J "+ j);
	        while (j < s.length() && s.charAt(j) == s.charAt(i)) {
	            j++;
	        }
	        int k = j - i;
	        sb.append(k);
	        i = j-1;
	        System.out.println("K " + k);
	        
	        System.out.println("I " + i);
	    }
	    return sb.length() > s.length() ? s : sb.toString();
	}
	public static void main(String[] args) {
		//System.out.println(new SolutionStringCompress().compressString("aabcccccaaa"));
		System.out.println(new SolutionStringCompress().compressString("abcd"));
	}

}
