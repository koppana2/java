package FOR_loop;

import java.util.Scanner;

public class OddAndEvenDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int oddcount = 0, evencount = 0;

		for (int i = num; i != 0; i /= 10) {
			if (i % 2 == 0) {
				evencount++;
			} else
				oddcount++;
		}
		System.out.println("evencount : " + evencount);
		System.out.println("oddcount : " + oddcount);
		sc.close();
	}

}
