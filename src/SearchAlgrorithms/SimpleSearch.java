package SearchAlgrorithms;

/**
 * Simple search algorithm for linear approach. 
 * @author Aleksi Tani
 */
public class SimpleSearch {

	/**
	 * Simple algorithm for linear searching from int[] array. 
	 * Worst case scenario: Goes through all indexes if the wanted number is at the last index.
	 * @param arr Given array.
	 * @param number Number that is searched.
	 * @return Returns the number if it is found, otherwise -1.
	 */
	protected static int linearSearch(int[] arr, int number) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == number) {
				return arr[i];
				// could return the index also
				// return i;
			}
		}
		return -1;
		
	}
	
	/**
	 * Main method used for testing algorithm.
	 * @param args not used
	 */
	public static void main(String[] args) {
		int[] array = { 1, 2, 555, 12, 98, 34, 657, 54, 343, 12 };
		int number = 34;
		int number2 = 55;
		
		System.out.println("Number " + linearSearch(array, number) + " is in array.");
		System.out.println("Number 55 is not in array. Returning value -1 > " + linearSearch(array, number2));
	}

}
