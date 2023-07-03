package Strings;

public class Frequency_34 {

	public static void main(String[] args) {
		String s = "aaaaBBBcdddd";
		char s1[] = s.toCharArray();
		int i, j, count;
		for (i = 0; i < s.length(); i++) {
			count = 1;
			for (j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s1[j]) {
					count++;
					s1[j] = '0';
				}
			}
			if (s1[i] != '0') {
				System.out.println(s.charAt(i) + " : " + count);
			}
		}
		// for(char g:s1) {
		// System.out.print(g+" ");
		//}
	}
}
