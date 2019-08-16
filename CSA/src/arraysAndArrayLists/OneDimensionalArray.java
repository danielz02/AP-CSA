package arraysAndArrayLists;

import java.util.ArrayList;

public class OneDimensionalArray {
	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int x: arr)
			if (x % 2 != 0)
				System.out.print(x + " ");
		
		int[][] a = {{1,2,3},{4,5,6}};
		for (int i = 0; i < a.length; i++)	
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j]);
		
		//for (int i = 0; i < a.length; i++)
			//for(int x: arr[i])
				//System.out.print(x);
		
		System.out.println((int)(Math.random()*2) + 1);
		
		ArrayList<Integer> b = new ArrayList<Integer>(); 
	}
}
