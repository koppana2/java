package FOR_loop;

import java.util.Scanner;

public class PrimeNumberCheck_UsingBreak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int flag = 0;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag++;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("not a prime");
		} else {
			System.out.println("prime");
		}
		sc.close();
	}

}
