package Test;

public class D_Test {

	public static void main(String[] args) {
		System.out.println(Dummy.method(10));
		Dummy d=new Dummy();
		Class s=d.getClass();
		System.out.println(s.getName());

	}

}
