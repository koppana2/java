package Strings;

public class NumChar_36 {

	public static void main(String[] args) {
		// String s = "a3b2c4";
		String s = "ak2b3r";
		char s2 = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				s2 = s.charAt(i);
				System.out.print(s2);
			} else {
				// int s1 = Integer.parseInt(s.valueOf(s.charAt(i)));
				int s1 = Character.getNumericValue(s.charAt(i));
				for (int j = s1; j > 1; j--) {
					System.out.print(s2);
				}
			}
		}

	}

}
