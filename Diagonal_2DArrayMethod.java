package Array;

import java.util.Scanner;

public class Diagonal_2DArrayMethod {
	static int x;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		x = size;
		int[][] arr = new int[size][size];
		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] result = DiagonalElements(arr);
		for (int i : result) {
			System.out.print(i+" ");
		}
		sc.close();
	}

	public static int[] DiagonalElements(int[][] a) {
		int b[] = new int[x];
		int c = 0;
		for (int s = 0; s < a.length; s++) {
			for (int t = 0; t < a.length; t++) {
				if (s == t) {
					b[c] = a[s][t];
					c++;
				}
			}
		}
		return b;
	}
}
