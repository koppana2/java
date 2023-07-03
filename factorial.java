package FOR_loop;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
		sc.close();
	}

}
