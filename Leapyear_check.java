package IF_condition;

import java.util.Scanner;

public class Leapyear_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year ");

		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year ");
		} else {
			System.out.println(year + " is not a leap year ");
		}
		sc.close();
	}
}
