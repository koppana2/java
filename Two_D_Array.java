package Array;

public class Two_D_Array {

	public static void main(String[] args) {
		char[][] charArray = new char[2][2];
		charArray[0][0] = 'a';
		charArray[0][1] = 'b';
		charArray[1][0] = 'f';
		charArray[1][1] = 'g';

		for (int r = 0; r < 2; r++) {
			for (int c = 0; c < 2; c++) {
				System.out.print(charArray[r][c] + " ");
			}
			System.out.println();
		}

	}

}
