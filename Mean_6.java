package Array;

public class Mean_6 {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 25, 26, 78, 42 };
		int sum = 0, count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				sum += arr[i];
				count++;
			}
		}
		System.out.println("Mean : " + (sum / count));

	}

}
