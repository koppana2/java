package while_loop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int digit = 0, sum = 0;

		while (num > 0) {
			digit = num % 10;
			sum += digit;
			num /= 10;
		}
		System.out.println(sum);
		sc.close();
	}

}
