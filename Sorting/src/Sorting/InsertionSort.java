package Sorting;

public class InsertionSort {
	/**
	 * insertionSort			sorts an array of integers using insertion sort
	 * 
	 * @param unsortedArray		an unsorted array of integers
	 * @return					the input array, sorted least to greatest
	 */
	public static int[] insertionSort(int[] unsortedArray) {
		int len = unsortedArray.length;
		for (int i = 1; i < len; i++) {
			int j = i;
			while(j > 0 && unsortedArray[j-1] > unsortedArray[j]) {
				int temp = unsortedArray[j-1];
				unsortedArray[j-1] = unsortedArray[j];
				unsortedArray[j] = temp;
				j--;
			}			
		}
		return unsortedArray;
	}
}
