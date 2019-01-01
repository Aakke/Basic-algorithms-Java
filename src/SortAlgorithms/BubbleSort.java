package SortAlgorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * Implementation of a simple bubble sort algorithm. main() used for testing.
 * @author Aleksi Tani
 */
public class BubbleSort {
	
	/**
	 * Simple implementation of a bubble sort algorithm. 
	 * @param arr Given array filled with random numbers
	 * @return Sorted array
	 */
	protected static int[] bubbleSort(int[] arr) {
		int[] result = arr;
		int temp;
		
		for(int i=0; i<result.length-1; i++) {
			for(int j=0; j<result.length-i-1; j++) {
				if (result[j] > result[j+1]) {
					temp = result[j];
					result[j] = result[j+1];
					result[j+1] = temp;
				}
			}
		}
		return result;
	}
	
	/**
	 * Main used for testing.
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		Random rnd = new Random();
		
		// Filling the array with random numbers 0-20
		for(int i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(20);
		}
		System.out.println("Array filled with random numbers > " + Arrays.toString(arr));
		int[] sortedArray = bubbleSort(arr);
		System.out.println("Sorted array > " + Arrays.toString(sortedArray));
	}

}
