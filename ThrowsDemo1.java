package exceptions;

public class ThrowsDemo1 {

	public static void main(String[] args) {
		int n1 = 12, n2 = 89;

		try {
			getArithmeticException(n1, n2);
		} catch (Exception e) {
		  System.out.println(e.getLocalizedMessage());
		}

	}

	public static void getArithmeticException(int n1, int n2) throws Exception {
		System.out.println(n1 + n2);
		System.out.println(n1 / n2);
		String s = String.valueOf(n1);
		System.out.println(s);
		int res = Integer.parseInt(s);
		System.out.println(res);

	}

}
