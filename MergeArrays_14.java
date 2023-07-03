package Array;

public class MergeArrays_14 {

	public static void main(String[] args) {
		int arr1[] = { 5, 6, 8, 2, 1, 0 };
		int arr2[] = { 2, 5, 1, 3, 7, 4 };
		int arr3[] = new int[arr1.length + arr2.length];

		int pos = 0;

		for (int a : arr1) {
			arr3[pos] = a;
			pos++;
		}
		for (int b : arr2) {
			arr3[pos] = b;
			pos++;
		}
		for (int c : arr3) {
			System.out.print(c + ",");
		}
	}

}
