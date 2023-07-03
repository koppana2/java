package Array;

public class CommomElements_7 {

	public static void main(String[] args) {
		char[] ch1 = { 'g', 'y', 'p', 'q', 'r' };
		char[] ch2 = { 'q', 't', 'i', 'p' };

		for (char a : ch1) {
			for (char b : ch2) {
				if (a == b) {
					System.out.println(b);
				}
			}
		}

	}

}
