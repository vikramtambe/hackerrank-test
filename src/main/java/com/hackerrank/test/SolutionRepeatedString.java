package com.hackerrank.test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * Lilah has a string, s , of lowercase English letters that she repeated infinitely many times.

Given an integer, n , find and print the number of letter a's in the first n letters of Lilah's infinite string.

For example, if the string s = 'abcac' and n = 10, the substring we consider is abcacabcac, the first 10 characters of her infinite string. There are 4 occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below. It should return an integer representing the number of occurrences of a in the prefix of length n  in the infinitely repeating string.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
Input Format

The first line contains a single string, s. 
The second line contains an integer, n.

Constraints
1 <= s <= 100
1 <= n <= 10^12

For  of the test cases, .
Output Format

Print a single integer denoting the number of letter a's in the first  letters of the infinite string created by repeating  infinitely many times.

Sample Input 0

aba
10
Sample Output 0

7
Explanation 0 
The first  letters of the infinite string are abaabaabaa. Because there are  a's, we print  on a new line.
 * @author vtambe
 *
 */
public class SolutionRepeatedString {

	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

    	long length = s.length();
    	long count_of_a=0;
        long temp=n%length;
        for(long i=0;i<length;++i)
        {
        	System.out.println("i " + i + " temp "+ temp);
            if(i<temp && s.charAt((int)i)=='a') {
            	++count_of_a;
            }
            if(s.charAt((int)i)=='a') {
            	count_of_a += (long)(n/length);
            }
        }    
        
    	
    	return count_of_a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    	String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);


        System.out.println("No of repeatedString :" + result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
