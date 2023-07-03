package IF_condition;

import java.util.Scanner;

public class vote_eligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter Age: ");
		int age = sc.nextInt();

		if (age >= 18)
			System.out.println("eligible to vote");
		else
			System.out.println("not eligible to vote");
		sc.close();
	}

}
