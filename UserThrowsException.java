package exceptions;

import java.util.Scanner;

public class UserThrowsException {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num : ");
		int num = sc.nextInt();
		sc.close();

		if (num < 0) {
			throw new Exception("Num cannot be Negative...............");
		} else
			System.out.println("Num : " + num);
	}

}
