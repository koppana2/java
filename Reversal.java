package Methods_Programs;

import java.util.Scanner;

public class Reversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int num1=sc.nextInt();
		System.out.println(reverse(num));
		System.out.println(reverse(num1));
		sc.close();
	}

	public static int reverse(int num) {
		int digit, rev = 0;
		while (num > 0) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num /= 10;
		}

		return rev;
	}
}
