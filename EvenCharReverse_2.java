package Strings;

public class EvenCharReverse_2 {

	public static void main(String[] args) {
		String s = "Hello Welcome to Java Programming";
		int d = s.length();

		String s1 = "";
		String s2 = "";
		String s5 = "";
		int i, j;
		for (i = 0; i < s.length(); i++) {
			if (i % 2 != 0) {
				s1 += s.charAt(i);
			} else {
				s5 += s.charAt(i);
			}
		}
		System.out.print("original : " + s1);
		for (j = s1.length() - 1; j >= 0; j--) {
			s2 += s1.charAt(j);
		}
		System.out.println();
		System.out.print("new : " + s2);
		System.out.println();
		System.out.print("s array : " + s5);
		System.out.println();

		for (int k = 0; k < s2.length(); k++) {
			System.out.print(s5.charAt(k) + "" + s2.charAt(k));
		}
		if (d % 2 != 0) {
			System.out.print(s.charAt(s.length() - 1));
		}
		System.out.println();
		System.out.println(s);
	}
}
