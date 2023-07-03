package Methods_Programs;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println("count is : " + DigitCountIs(num));
		sc.close();
	}

	public static int DigitCountIs(int num) {
		int count = 0;
		while (num > 0) {
			num /= 10; // num=num/10;
			++count; 
		}
		return count;
	}

}
