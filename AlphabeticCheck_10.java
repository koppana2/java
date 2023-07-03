package Strings;

public class AlphabeticCheck_10 {

	public static void main(String[] args) {
		String s = "doddasrikanth88@gmail.com";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				System.out.print(ch + " ");
			}
		}

	}

}
