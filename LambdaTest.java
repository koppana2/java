package lambdaExpression;

public class LambdaTest {

	public static void main(String[] args) {
		MyInterface m=new MyInterface() {
			public void methodOne() {
				System.out.println("from methodOne");
			}
		};
		m.methodOne();
	}

}
