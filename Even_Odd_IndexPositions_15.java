package Array;

public class Even_Odd_IndexPositions_15 {

	public static void main(String[] args) {
		int arr[] = { 5, 4, 1, 8, 9, 2, 4, 3, 1, 8, 3 };
		oddIndexPositions(arr);
		System.out.println();
		evenIndexPositions(arr);

	}

	public static void evenIndexPositions(int arr[]) {
		System.out.print("Even IndexPositions : ");
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[i] + ",");
			}
		}
	}

	public static void oddIndexPositions(int arr[]) {
		System.out.print("Odd IndexPositions : ");
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 != 0) {
				System.out.print(arr[i] + ",");
			}
		}
	}

}
