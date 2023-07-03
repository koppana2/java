package InnerClasses;

public class Animal {

	int a = 10;

	void dog() {
		class Toy {
			int j = 20;

			void car() {
				System.out.println("Racing....." + j);
			}
		}
		Toy t = new Toy();
		t.car();
		System.out.println("Bow Bow");
	}

	void cat() {
		System.out.println("Meow Meow");
	}

}
