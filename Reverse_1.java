package Strings;

public class Reverse_1 {
	public static void main(String[] args) {
		String s = "Srikanth";
	/*	String letter = "";

		int i = 1;
		while (s.length() - i >= 0) {
			char word = s.charAt(s.length() - i);
			letter += word;
			i++;
		}
		System.out.println(letter);*/

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}