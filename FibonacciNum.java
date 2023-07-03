package Methods_Programs;

import java.util.Scanner;

public class FibonacciNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println(Fibonacci(num));
		sc.close();
	}

	public static int Fibonacci(int num) {
		int num1 = 0, num2 = 1;
		for (int i = 1; i <= num; i++) {
			System.out.print(num1 + " ");
			int SumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = SumOfPrevTwo;
		}
		return num;
	}
}
