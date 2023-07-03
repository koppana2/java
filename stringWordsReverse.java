package Strings;

import java.util.Scanner;

public class stringWordsReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();

		System.out.println(getWordReverse(str));
		sc.close();
	}

	public static String getWordReverse(String s1) {
		String[] substring = s1.split(" ");
		String result = "";
		for (int i = 0; i < substring.length; i++) {
			result += getReverse(substring[i]) + " ";
		}
		return result;
	}

	public static String getReverse(String s2) {
		String result = "";
		for (int i = s2.length() - 1; i >= 0; i--) {
			result += s2.charAt(i);
		}
		return result;
	}
}
