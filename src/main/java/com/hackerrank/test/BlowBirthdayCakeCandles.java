package com.hackerrank.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BlowBirthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] arr) {

    	List<Integer> candleHeights = new ArrayList<>();
    	for(int i=0;i<arr.length;i++) {
    		candleHeights.add(arr[i]);
    	}
    	Collections.sort(candleHeights);
    	int maxCandleCount = candleHeights.size()-1;
    	int maxCandleHeightCnt = candleHeights.get(maxCandleCount);
    	int cnt = 0;
    	for(int candle:candleHeights) {
    		if(maxCandleHeightCnt == candle) {
    			cnt++;
    		}
    	}

    	return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}