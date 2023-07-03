package while_loop;

import java.util.Scanner;

public class Palindrome_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int originalnum = num, rev = 0, rem;

		while (num > 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;
		}
		if (originalnum == rev) {
			System.out.println("palindrome number");
		} else {
			System.out.println("not palindrome number");
		}
		sc.close();
	}

}
