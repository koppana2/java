package while_loop;

import java.util.Scanner;

public class Sum_OddNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int i = 1, sum = 0;

		while (i <= num) {
			if (i % 2 != 0) {
				sum += i;
				// i=i+2;
			}
			i++;
		}
		System.out.println(sum);
		sc.close();
	}

}
