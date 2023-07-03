package Methods_Programs;

import java.util.Scanner;

public class Basic_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(add(num1, num2));

		System.out.println(sub(num1, num2));

		System.out.println(product(num1, num2));

		System.out.println(div(num1, num2));

		System.out.println(avg(num1, num2));

		sc.close();
	}

	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
		return num1 - num2;
	}

	public static int product(int num1, int num2) {
		return num1 * num2;
	}

	public static double div(double num1, double num2) {
		return num1 / num2;

	}

	public static double avg(int num1, int num2) {
		return (num1 + num2) / 2.0;
	}

}
