package Array;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter array elements");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		sc.close();
	}
}