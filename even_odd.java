package IF_condition;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter numner: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		sc.close();

	}

}
