package Strings;

public class SameCharacter_54 {

	public static void main(String[] args) {
		String s = "hemanth";
		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '0';
					ch[i] = '0';
				}
			}
			if (ch[i] == '0') {
				System.out.print(i+" ");
			}

		}
	}
}
