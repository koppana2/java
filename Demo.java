package exceptions;

public class Demo {

	public static void main(String[] args) {
		System.out.println(8 / 2);
		System.out.println(4 + 5);
		try {
			System.out.println(4 / 0);
		} catch (ArithmeticException a) {
			System.out.println(a.getMessage());
		}

		System.out.println(4 - 2);
		System.out.println("Remaining Program.........");

	}
}