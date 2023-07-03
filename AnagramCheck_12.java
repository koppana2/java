package Strings;

import java.util.Arrays;

public class AnagramCheck_12 {

	public static void main(String[] args) {
		String s = "Listen";
		String s1 = "Silent";

		if (s.length() != s1.length()) {
			System.out.println("Not a Anagram");
		} else {
			String s3 = s.toLowerCase();
			String s4 = s1.toLowerCase();

			char ch[] = s3.toCharArray();
			char ch1[] = s4.toCharArray();
  
			Arrays.sort(ch);
			Arrays.sort(ch1);

			if (Arrays.equals(ch, ch1)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not a Anagram");
			}
		}
	}
}
