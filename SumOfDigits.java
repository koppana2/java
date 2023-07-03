package Methods_Programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println(sumofDigits(num));
		sc.close();
	}

	public static int sumofDigits(int num) {
		int digit, sum = 0;
		while (num != 0) {
			digit = num % 10;
			num /= 10;
			sum += digit;
		}
		return sum;
	}

}
