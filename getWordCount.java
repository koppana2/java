package Strings;

import java.util.Scanner;

public class getWordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence :");
		// next()---->for single word, nextLine()---->for sentence
		String str = sc.nextLine();
		System.out.println("enter split character :");
		String sp = sc.next();
		int count = GetWordCount(str, sp);
		System.out.println("wordsCount is :" + count);
		sc.close();
	}

	public static int GetWordCount(String s1, String s2) {
		String[] words = s1.split(s2);

		for (int i = 0; i < words.length; i++) {
			System.out.println(i + ":" + words[i]);
		}
		return words.length;

	}
}
