package exceptions;

public class finallyDemo {

	public static void main(String[] args) {
		try {
			System.out.println(4 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally Block : executes either exception occur or does'nt occur");
		}

		try {
			System.out.println(4 / 2);
		} finally {
			System.out.println("Finally block without catch");
		}
		System.out.println("Remaining code...................");

	}

}
