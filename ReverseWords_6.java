package Strings;

public class ReverseWords_6 {

	public static void main(String[] args) {
		String s = "Welcome to Java Programming";
		String[] s1 = split_words(s);
		reverse(s1);
	}

	public static String[] split_words(String s1) {
		String s[] = s1.split(" ");

		return s;
	}

	public static void reverse(String[] s1) {
		for (String d : s1) {
			for (int j = d.length() - 1; j >= 0; j--) {
				System.out.print(d.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
