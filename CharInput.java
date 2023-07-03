package RuntimeInputs;

import java.util.Scanner;

public class CharInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
		char a =sc.next().charAt(0);
		System.out.println(a);
		sc.close();
	}

}
