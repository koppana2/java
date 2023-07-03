package HackerRank;

import java.util.Scanner;

public class print {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter int");
		int i = sc.nextInt();
		System.out.println("enter double");
		double d = sc.nextDouble();
		System.out.println("enter String");
		sc.nextLine();
		String s = sc.nextLine();

		System.out.println(s);
		System.out.println(d);
		System.out.println(i);
		sc.close();
	}

}
