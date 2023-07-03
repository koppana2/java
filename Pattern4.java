package Practice;

public class Pattern4 {

	public static void main(String[] args) {
		int count = 0;
		int flag = 11;
		for (int i = 1; i <= 4; i++) {
			count++;
			flag--;
			for (int j = 1; j <= 11; j++) {
				if (j == 5) {
					System.out.print("*");
				} else if (j == 6) {
					System.out.print("*");
				} else if (j == count) {
					System.out.print("*");
				} else if (j == flag) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int m = 1; m <= 6; m++) {
			for (int n = 1; n <= 11; n++) {
				if (n == 5 || n == 6) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
