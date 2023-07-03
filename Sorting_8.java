package Array;

import java.util.Arrays;

public class Sorting_8 {

	public static void main(String[] args) {
		int arr[] = { 8, 5, 4, 9, 2, 1 };
		
		//5,4,8,2,1,9
		//4,5,2,1,8,9
		//4,2,1,5,8,9
		//2,1,4,5,8,9
		//1,2,4,5,8,9
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int m : arr) {
			System.out.print(m+" ");
		} 
	/*	Arrays.sort(arr);
		for(int newArr:arr) {
			System.out.print(newArr+" ");
		}*/

	}

}
