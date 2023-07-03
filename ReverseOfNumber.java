package while_loop;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		System.out.println("given number : " + num);
		int reverse = 0;

		while (num != 0) {
			int rem = num % 10;
			reverse = (reverse * 10) + rem;
			num /= 10;
		}
		System.out.println("reversed number is: " + reverse);
		sc.close();

	}

}

