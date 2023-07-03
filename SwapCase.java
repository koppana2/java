package Strings;

import java.util.Scanner;

public class SwapCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence :");
		String str = sc.nextLine();

		String result = getSwapCase(str);
		System.out.println("string after swaping case :" + result);
		sc.close();
	}

	public static String getSwapCase(String s1) {
		String result = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (Character.isAlphabetic(ch)) {
				if (Character.isUpperCase(ch)) {
					result += Character.toLowerCase(ch);
				} else if (Character.isLowerCase(ch)) {
					result += Character.toUpperCase(ch);
				}
			} else
				result += ch;
		}
		return result;
	}
}