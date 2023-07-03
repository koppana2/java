package Strings;

public class CountDigits_63 {

	public static void main(String[] args) {
		String s = "Sam1sun2dar3";
		System.out.print(" : are the digits" + " ---->No.of digits = " + Count(s));
	}

	public static int Count(String s1) {
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (Character.isAlphabetic(s1.charAt(i))) {
				continue;
			} else {
				count++;
				System.out.print(s1.charAt(i));
			}
		}
		return count;
	}
}