package Array;

import java.util.Arrays;

public class secondLargestElement_9 {

	public static void main(String[] args) {
		int arr[] = { 5, 9, 3, 1, 4, 7 };
		Arrays.sort(arr); // Ascending order
		System.out.println("Second largest num : " + arr[arr.length - 2]);

	}

}
