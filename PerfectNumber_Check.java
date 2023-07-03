package FOR_loop;

import java.util.Scanner;

public class PerfectNumber_Check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int aliquot = 0;
		int num = sc.nextInt();

		for (int i = 1; i <= num / 2; i++) {
			/* or i<num */
			if (num % i == 0) {
				aliquot += i;
			}
		}
		if (aliquot == num) {
			System.out.println("it is a perfect number");
		} else {
			System.out.println("it is not a perfect number");
		}
		sc.close();
	}

}
