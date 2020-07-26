package com.hackerrank.test;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * Given a 6 X 6 2D Array, arr :

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in A  to be a subset of values with indices falling in this pattern in arr's graphical representation:

a b c
  d
e f g
There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in arr , then print the maximum hourglass sum.

For example, given the 2D array:

-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
We calculate the following 16 hourglass values:

-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18

Our highest hourglass value is 28 from the hourglass:

0 4 3
  1
8 6 6

 *
 */
public class HighestHourGlassSum {

	  static int hourglassSum(int[][] arr) {
    	
    	int maxSum = -64; //Because the minimum it could be is -9 * 7 = -63
        int startColIndex = 0;
        
        //Each iteration of the outer loop is one hour glass:
        for (int currentRow = 0; currentRow <= 3; currentRow++){
            int sum = 0; //Initialize this specific hourglass' sum
            for (int currentCol = startColIndex; currentCol < startColIndex + 3; currentCol ++) {
                sum += arr[currentRow][currentCol]; //Gets current index that col and row are on
                if (currentCol == startColIndex) { //Only doing it if it's on the startCol ensures we only add middle piece once
                    sum += arr[currentRow+1][startColIndex+1];
                }
                sum += arr[currentRow+2][currentCol]; //Gets the corresponding index in the bottom row
            }
            startColIndex = (startColIndex < 3) ? startColIndex + 1 : 0; // If there is space for another hour glass in this row, goto                                                               // the next Col
            if (startColIndex != 0) { //If there is space for another hour glass in this row, continue in the same row
            	currentRow--;             //You need to decrement in order to do this bc for loop will increment
            }
            if (sum > maxSum) {
                maxSum = sum;
            } //keeps track of what the maximum sum is so we can print it at the end
            System.out.println("Each Iteration Hour Glass sum is :" + sum);
        }
        
     	return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    	int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);


        System.out.println("Hour Glass Sum :" + result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
