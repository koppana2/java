package Strings;

public class MaxWordLength_14 {

	public static void main(String[] args) {
		String s = "spacy's named entirely recognition has been trained On the on";
		String s1[] = s.split(" ");
		int max = 0;
		String s3 = "";
		for (String s2 : s1) {
			if (max < s2.length()) {
				max = s2.length();
				s3 = s2;
			}
		}
		System.out.println("MaxLengthWord is : " + s3);
		System.out.println("Length is : " + max);

	}

}
