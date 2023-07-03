package Strings;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Hemanth";
		System.out.println(Reverse(str));
	}

	public static String Reverse(String s1) {
		String result = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			result += s1.charAt(i);
		}
		return result;
	}
}
