package com.hackerrank.test;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;
public class Solution2
{ 
	 // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public static int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot)
    {
    	 Queue<Node> queue = new ArrayDeque<>();
        // WRITE YOUR CODE HERE
        int distanceTravled = -1;
        
        for(List<Integer> currentLot:lot) {
        	
        }
        return distanceTravled;
    }
	// METHOD SIGNATURE ENDS
	public static void main(String[] args) {
		int numRows = 3;
		int numColumns = 3;
		List<Integer> data1 = new ArrayList<>();
		data1.add(1);
		data1.add(0);
		data1.add(0);
		
		List<Integer> data2 = new ArrayList<>();
		data2.add(1);
		data2.add(0);
		data2.add(0);
		
		List<Integer> data3 = new ArrayList<>();
		data3.add(1);
		data3.add(9);
		data3.add(1);
		
		List<List<Integer>> lot = new ArrayList<>();
		lot.add(data1);
		lot.add(data2);
		lot.add(data3);
		
		int result = removeObstacle(numRows, numColumns, lot);
		System.out.println(result);
	}
	public boolean isValid(int row, int col, int maxRow, int maxCol) {
		return (row >= 0) && (row < maxRow) && (col >= 0) && (col < maxCol);
	}
}
class Point{
	int x;
	int y;
}
class QueueNode{
	Point curPoint;
	int dist;
}