package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Size : ");
		int size = 0;
		int arr[] = null;
		int sum = 0;

		try {
			size = sc.nextInt();
			arr = new int[size];
			System.out.println("Array Elements : ");

			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
		} catch (InputMismatchException i) {
			System.out.println("Array Size cannot be non Integer..............");
			System.out.println("Enter size in positive Integer Number : ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		}
		System.out.println("Sum of Elements : " + sum);
		sc.close();
	}

}
