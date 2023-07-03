package Array;

import java.util.Scanner;

public class AverageOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter array elements");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		System.out.println(getAvg(arr));
		sc.close();
	}

	public static double getAvg(int a[]) {
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			avg = (double) sum / a.length;
		}
		return avg;
	}

}
