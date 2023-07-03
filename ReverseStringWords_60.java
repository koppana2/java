package Strings;

public class ReverseStringWords_60 {

	public static void main(String[] args) {
		String s = "xyz*abc-Hello*abcd";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.length() - 1 == i) {
				System.out.print(s.charAt(i));
				StringBuffer s3 = new StringBuffer(s2);
				System.out.print(s3.reverse());
			} else if (Character.isAlphabetic(s.charAt(i))) {
				s2 += s.charAt(i);
			} else {
				StringBuffer s3 = new StringBuffer(s2);
				System.out.print(s3.reverse());
				System.out.print(s.charAt(i));
				s2 = "";
			}
		}

	}

}
