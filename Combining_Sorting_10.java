package Array;

public class Combining_Sorting_10 {

	public static void main(String[] args) {
		int arr1[] = { 5, 6, 8, 2, 1, 0 };
		int arr2[] = { 2, 5, 1, 3, 7, 4 };

		int arr3[] = new int[arr1.length + arr2.length];
		int pos = 0;

		for (int i : arr1) {
			arr3[pos] = i;
			pos++;
		}
		for (int j : arr2) {
			arr3[pos] = j;
			pos++;
		}
		System.out.print("After Combining : ");
		for (int s : arr3) {
			System.out.print(s+" ");
		}
		System.out.println();

		for (int k = 0; k < arr3.length; k++) {
			for (int l = k + 1; l < arr3.length; l++) {
				if (arr3[k] > arr3[l]) {
					int temp = arr3[k];
					arr3[k] = arr3[l];
					arr3[l] = temp;
				}
			}
		}
		System.out.print("After Sorting : ");
		for (int s : arr3) {
			System.out.print(s+" ");
		}

	}

}
