package IF_condition;

import java.util.Scanner;

public class IfElse_Ifelse_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers: ");

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println("enter the choice of operation: ");
		int choice = sc.nextInt();

		double result = 0;

		if (choice == 1)
			result = num1 + num2;
		if (choice == 2)
			result = num1 - num2;
		if (choice == 3)
			result = num1 * num2;
		if (choice == 4)
			result =(double) num1 / num2;
		if (choice == 5)
			result = num1 % num2;
		
		System.out.println("the choice of operation is : " + choice + " and the result is : " + result);

		sc.close();
	}

}
