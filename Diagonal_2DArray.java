package Array;

import java.util.Scanner;

public class Diagonal_2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal Elements");

		for (int s = 0; s < arr.length; s++) {
			for (int t = 0; t < arr.length; t++) {
				if (s == t) {
					System.out.println(arr[s][t]);
				}
			}
		}
		sc.close();
	}
}
