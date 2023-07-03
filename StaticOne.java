package InnerClasses;

public class StaticOne {

	static int a=10;
	void dance() {
		System.out.println("Dancing");
	}
	static class Run{
		static int b=20;
	static void sing() {
		System.out.println("Singing...."+a);
	}
	}
}
