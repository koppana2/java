package Strings;

public class MissingWord_7 {

	public static void main(String[] args) {
		String s = "World";
		String s1 = "Wold";

		for (int i = 0; i < s.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < s1.length(); j++) {

				if (s.charAt(i) == s1.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(s.charAt(i));
			}
		}
	}

}
