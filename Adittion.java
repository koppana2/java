package Methods_Programs;

import java.util.Scanner;

public class Adittion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		/*int sum = add(num1, num2);
		System.out.println("sum is : "+sum);*/
		System.out.println(add(num1,num2));
		sc.close();
	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}