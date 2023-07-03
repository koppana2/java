package Methods_Programs;

import java.util.Scanner;

public class EvenOddCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		if (isEven(num))
			System.out.println("Even number");
		else
			System.out.println("Odd number");
		sc.close();
	}

	public static boolean isEven(int num) {
		return (num % 2 == 0);
	}

}
