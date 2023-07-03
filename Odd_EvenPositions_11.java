package Array;

public class Odd_EvenPositions_11 {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 8, 9, 2, 4, 3, 1, 8, 3 };
		oddPositions(arr);
		System.out.println();
		evenPositions(arr);

	}

	public static void evenPositions(int arr[]) {
		System.out.print("Even Positions : ");
		for (int i = 1; i < arr.length; i = i + 2) {

			System.out.print(arr[i] + ",");

		}
	}

	public static void oddPositions(int arr[]) {
		System.out.print("Odd Positions : ");
		for (int i = 0; i < arr.length; i = i + 2) {

			System.out.print(arr[i] + ",");

		}
	}

}