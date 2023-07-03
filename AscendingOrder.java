package Array;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] result = gettingAscendingOrder(arr);
		for (int s = 0; s < result.length; s++) {
			System.out.print(result[s] + " ");
		}

		sc.close();
	}

	public static int[] gettingAscendingOrder(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
