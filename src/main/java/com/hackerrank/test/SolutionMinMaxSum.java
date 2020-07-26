package com.hackerrank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SolutionMinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	List<Integer> randomNumbers = new ArrayList<>();
    	for(int i=0;i<arr.length;i++) {
    		randomNumbers.add(arr[i]);
    	}
    	Collections.sort(randomNumbers);
    	
    	long minSum = 0;
    	long maxSum = 0;
    	int cnt = 1;
    	int maxCnt = randomNumbers.size();
    	for(Integer randomNumber:randomNumbers) {
    		
    		if(cnt == 1) {
    			minSum = minSum + randomNumber;
    		}
    		if(cnt > 1 && cnt < maxCnt) {
    			maxSum = maxSum + randomNumber;
    			minSum = minSum + randomNumber;
    		}
    		
    		if(cnt == maxCnt) {
    			maxSum = maxSum + randomNumber;
    		}
    		
    		cnt++;
    	}
    	System.out.println(minSum + " " + maxSum );

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}