package while_loop;

import java.util.Scanner;

public class ProductOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int i = 1, product = 1;

		while (i <= num) {
			product *= i;
			i++;
		}
		System.out.println(product);
		sc.close();
	}

}
