package Math_functions;

import java.util.Scanner;

public class sqrt_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();

		System.out.println(Math.sqrt(num));
		sc.close();
	}

}
