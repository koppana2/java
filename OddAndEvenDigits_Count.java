package while_loop;

import java.util.Scanner;

public class OddAndEvenDigits_Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int oddcount = 0, evencount = 0;

		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
			num /= 10;
		}
		System.out.println("evencount : " + evencount);
		System.out.println("oddcount : " + oddcount);
		sc.close();
	}

}
