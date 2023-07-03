package Methods_Programs;

import java.util.Scanner;

public class PrimeNumCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println(isPrime(num));
		if (isPrime(num)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
		sc.close();
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
