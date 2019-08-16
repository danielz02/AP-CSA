package sortingAndSearching;

import java.util.Arrays;

public class Sort {
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] < arr[minIndex]) {
					minIndex = k;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}

	}
	
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int sortIndex = i;
			while (sortIndex > 0 && temp < arr[sortIndex - 1]) {
				arr[sortIndex] = arr[sortIndex - 1];
				sortIndex --;
			}
			arr[sortIndex] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] test1 = {1, 10, 5, 9, 8, -3, 9, 10};
		System.out.println("Before sorting: " + Arrays.toString(test1));
		Sort.selectionSort(test1);
		System.out.println("After sorting: " + Arrays.toString(test1));
		
		int[] test2 = {1, 10, 5, 9, 8, -3, 9, 10};
		System.out.println("Before sorting: " + Arrays.toString(test2));
		Sort.insertionSort(test2);
		System.out.println("After sorting: " + Arrays.toString(test2));
		
	}
}