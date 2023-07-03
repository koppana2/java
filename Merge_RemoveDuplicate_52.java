package Strings;

public class Merge_RemoveDuplicate_52 {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = "World";
		String s2 = s + s1;
		char[] ch = s2.toCharArray();

		for (int i = 0; i < s2.length(); i++) {
			for (int j = i + 1; j < s2.length(); j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '0';
				}
			}
			if (ch[i] != '0') {
				System.out.print(ch[i]);
			}
		}

	}

}
