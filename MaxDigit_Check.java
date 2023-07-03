package while_loop;

import java.util.Scanner;

public class MaxDigit_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int max = 0;

		while (num > 0) {
			int digit = num % 10;
			if (digit > max) {
				max = digit;
			}
			num /= 10;
		}
		System.out.println("max digit : "+max);
		sc.close();
	}

}
