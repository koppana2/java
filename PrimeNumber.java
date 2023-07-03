package FOR_loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int fact = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				fact++;
			}
		}
		if (fact == 2) {
			System.out.println("it is prime");
		} else {
			System.out.println("it is not a prime");
		}
		sc.close();
	}

}
