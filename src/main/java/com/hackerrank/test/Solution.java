package com.hackerrank.test;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{ 
	public static ArrayList<Integer> IDsOfPackages(int truckSpace, 
	                                 ArrayList<Integer> packagesSpace)
	{
		// WRITE YOUR CODE HERE
		int reserveSpace = 30;
		int actualspace = truckSpace - reserveSpace;
		ArrayList<Integer> resultIDs = new ArrayList<>();
		ArrayList<Integer> tempSpace = new ArrayList<>();
		tempSpace.addAll(packagesSpace);
		Collections.sort(tempSpace);
		int leftIndex = 0;
		int rightIndex = tempSpace.size() - 1;
		
		while(leftIndex < rightIndex){
		    if(tempSpace.get(leftIndex) + tempSpace.get(rightIndex) == actualspace){
		        resultIDs.add(tempSpace.get(leftIndex));
		        resultIDs.add(tempSpace.get(rightIndex));
		        break;
		    }else if(tempSpace.get(leftIndex) + tempSpace.get(rightIndex) < actualspace){
		        leftIndex++;
		    }else{
		        rightIndex--;
		    }
		}
		ArrayList<Integer> resultIndexes = new ArrayList<>();
		int index=0;
		for(Integer space:packagesSpace){
		    
		    for(Integer resultId:resultIDs){
		        if(resultId.equals(space)){
		            resultIndexes.add(index);
		            break;
		        }
		        
		    }
		    index++;
		}
		return resultIndexes;
	}
	// METHOD SIGNATURE ENDS
	public static void main(String[] args) {
		int truckSpace = 90;
		ArrayList<Integer> spaces = new ArrayList<>();
		spaces.add(1);
		spaces.add(10);
		spaces.add(25);
		spaces.add(35);
		spaces.add(60);
		ArrayList<Integer> ids =  IDsOfPackages(truckSpace, spaces);
		for(Integer id:ids) {
			System.out.println(id);
		}
	}
}