package Array;

public class SwapWithout3rdVariable_12 {

	public static void main(String[] args) {
		int arr[] = { 8, 2 };

		arr[0] = arr[0] + arr[1];
		arr[1] = arr[0] - arr[1];
		arr[0] = arr[0] - arr[1];
		for (int b : arr) {
			System.out.println(b);
		}
	}

}
