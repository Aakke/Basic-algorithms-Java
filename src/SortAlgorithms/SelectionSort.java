package SortAlgorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * Implementation of a simple Selection sort algorithm. main() used for testing.
 * @author Aleksi Tani
 */
public class SelectionSort {

	/**
	 * Simple implementation of a selection sort algorithm.
	 * @param arr Given array filled with random numbers.
	 * @return Sorted array
	 */
	protected static int[] selectionSort(int[] arr) {
		int[] result = arr;
		int temp;
		int min;
		
		for(int i=0; i<result.length-1; i++) {
			min = i;
			for(int j=i+1; j<result.length; j++) {
				if (result[min] > result[j]) {
					min = j;
				}
			}
			if (min != i) {
				temp = result[i];
				result[i] = result[min];
				result[min] = temp;
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
		int[] sortedArray = selectionSort(arr);
		System.out.println("Sorted array > " + Arrays.toString(sortedArray));
	}
}
