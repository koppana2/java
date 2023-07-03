package exceptions;

import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age : ");
		int age = sc.nextInt();
		sc.close();

		if (age < 18) {
			throw new Exception("Age Must be Greater");
		} else
			System.out.println("Age is : " + age);

	}

}
