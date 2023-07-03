package Strings;

import java.util.Scanner;

public class palindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.next();
		String result = CheckPalindrome(str);
		if (str.equalsIgnoreCase(result)) {
			System.out.println("palindrome string");
		} else {
			System.out.println("not palindrome string");
		}
		sc.close();
	}

	public static String CheckPalindrome(String s1) {
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev += s1.charAt(i);
		}
		return rev;
		/*if (s1.equalsIgnoreCase(rev)) {
			System.out.println("palindrome string");
		} else {
			System.out.println("not palindrome string");
		}*/
	}
}
