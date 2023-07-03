package overloading;

public class Addition {
	void add(int a) {
		System.out.println(a + a);
	}

	void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	void add(float n1, float n2) {
		System.out.println(n1 + n2);
	}
}