package com.hackerrank.test;

/*
 * Compare x with the middle element.
If x matches with middle element, we return the mid index.
Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
Else (x is smaller) recur for the left half.
 */
public class FindElementInArrayBinarySearch {

	// Returns index of x if it is present in arr[l..
	// r], else return -1
	int binarySearch(int arr[], int startIndex, int length, int number) {
		if (length >= startIndex) {
			int mid = startIndex + (length - startIndex) / 2;

			// If the element is present at the
			// middle itself
			if (arr[mid] == number)
				return mid;

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr[mid] > number) {
				return binarySearch(arr, startIndex, mid - 1, number);
			}

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, length, number);
		}

		// We reach here when element is not present
		// in array
		return -1;
	}

	public static void main(String args[]) {
		FindElementInArrayBinarySearch ob = new FindElementInArrayBinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int length = arr.length;
		int number = 10;
		int result = ob.binarySearch(arr, 0, length - 1, number);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}
}
