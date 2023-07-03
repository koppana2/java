package Strings;

public class VowelsCount_5 {

	public static void main(String[] args) {
		String s = "Hello World How Are u?";
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < ch.length; j++) {
				if (s.charAt(i) == (ch[j])) {
					count++;
				}
			}
		}
		System.out.println("No.of vowels : " + count);

	}
}
