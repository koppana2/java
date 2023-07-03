package IF_condition;

import java.util.Scanner;

public class positive_negative_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("number is positive");
		} else {
			System.out.println("number is negative");
		}
		sc.close();
	}

}
