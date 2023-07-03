package variables_datatypes;

import java.util.Scanner;

public class timeformat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter seconds: ");
		int sec = sc.nextInt();

		int hrs = sec / 3600;
		int rsec = sec % 3600;
		int min = rsec / 60;
		rsec = rsec % 60;

		System.out.println(hrs + ":" + min + ":" + rsec);

		sc.close();
	}

}
