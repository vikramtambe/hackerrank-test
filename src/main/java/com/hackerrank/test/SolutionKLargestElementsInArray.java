package com.hackerrank.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SolutionKLargestElementsInArray {

	private static final Scanner scanner = new Scanner(System.in);

	public static void kLargest(Integer[] arr, int k) {
		// Sort the given array arr in reverse order
		// This method doesn't work with primitive data
		// types. So, instead of int, Integer type
		// array will be used
		Arrays.sort(arr, Collections.reverseOrder());

		// Print the first kth largest elements
		for (int i = 0; i < k; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {

		int noOfTestcases = scanner.nextInt();
		Map<ArrayList<Integer>,Integer> userinputList = new HashMap<>();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for(int testcase=0;testcase<noOfTestcases;testcase++) {
			String[] arSizeAndKElements = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			int noOfElements= Integer.parseInt(arSizeAndKElements[0]);
			int kElements =Integer.parseInt(arSizeAndKElements[1]);
			Integer[] actualElements = new Integer[noOfElements];
			String[] arItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			for (int i = 0; i < noOfElements; i++) {
				int arItem = Integer.parseInt(arItems[i]);
				actualElements[i] = arItem;
			}
			kLargest(actualElements, kElements);
		}
		
		

		//int noOfElements = scanner.nextInt();
		//scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		// Integer arr[] = new Integer[] { 1, 23, 12, 9, 30, 2, 50 };
		
		//kLargest(arr, noOfElements);
	}
}