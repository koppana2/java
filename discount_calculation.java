package IF_condition;

import java.util.Scanner;

public class discount_calculation {

	public static void main(String[] args) {

		double price, discount, finalcost;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the price");
		price = sc.nextDouble();

		if (price <= 10000) {
			discount = (10 / 100.0) * price;
		} else if (price <= 20000) {
			discount = (20 / 100.0) * price;
		} else {
			discount = (25 / 100.0) * price;
		}
		finalcost = price - discount;
		System.out.println("discount = " + discount);
		System.out.println("final price is " + finalcost);

		sc.close();
	}

}
