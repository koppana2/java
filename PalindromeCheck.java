package Methods_Programs;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println(isPalindrome(num));
		sc.close();
	}

	public static boolean isPalindrome(int num) {
		if (num == Reversal.reverse(num))
			return true;
		else
			return false;
	}

}
