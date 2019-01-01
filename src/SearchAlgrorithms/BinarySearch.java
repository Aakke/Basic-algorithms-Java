package SearchAlgrorithms;

import java.util.Arrays;

/**
 * Implementation of binary search algorithm. Java also have its own binarySearch()
 * in the classes of Array and Collections. Own implementation done with the help of course book.
 * @author Aleksi Tani
 *
 */
public class BinarySearch {

	/**
	 * Implementation of simple binary search. 
	 * @param arr Given array of integers
	 * @param low Lowest index 
	 * @param high Highest index
	 * @param key Key we are searching for
	 * @return The index of given key
	 */
	protected static int binarySearchImpl(int[] arr, int low, int high, int key) {
		int result=0;
		
		while (low <= high) {
			int middle = (low + high)/2;
			if ( arr[middle] < key ) {
				low = middle + 1;
			}
			else if  (arr[middle] > key ){
				high = middle - 1;
			}
			else if ( arr[middle] == key ) {
				result = middle;
				break;
			}
		}
		return result;
	}
	
	/**
	 * Java.utils own binarysearch method. Returns the index of given element.
	 * The array needs to be sorted, otherwise result will be undefined.
	 * @param arr Given array of characters
	 */
	protected static void binarySearch(char[] arr) {
		System.out.println(arr);
		System.out.println(Arrays.binarySearch(arr, 'A'));
		System.out.println(Arrays.binarySearch(arr, 'L'));
	}
	
	/**
	 * Main used for testing.
	 * @param args not used
	 */
	public static void main(String[] args) {
		char[] arr = { 'A', 'L', 'E', 'K', 'S', 'I' }; 
		Arrays.sort(arr); // Sort characters in alphabetical order to get the right index.
		binarySearch(arr);
		
		int[] intArray = {1,2,7,3,2,7,879,423,34};
		Arrays.sort(intArray);
		int key = 3;
		int high = intArray.length-1;
		int low = 0;
		int result = binarySearchImpl(intArray, low, high, key);
		System.out.println("Index of 3 should be 3 and the returned index is > " + result);
	}
}
