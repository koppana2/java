package Strings;

public class NumOfWords_8 {

	public static void main(String[] args) {
		String s = "Welcome to Java Programming";
		String s1[] = s.split(" ");
		int count = 0;
		for (String i : s1) {
			count++;
		}
		System.out.println("No.of Words : " + count);
	}

}
