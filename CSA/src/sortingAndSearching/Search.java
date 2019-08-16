package sortingAndSearching;

public class Search {
	public static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target)
				return i;
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] > target)
				end = mid - 1;
			else
				end = mid + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] test2 = {0, 1, 2, 3, 4, 5, 5, 6, 7};
		Search.binarySearch(test2, 7);
	}
}
