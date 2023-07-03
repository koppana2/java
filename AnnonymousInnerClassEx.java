package InnerClasses;

public class AnnonymousInnerClassEx{

	public static void main(String[] args) {
		
		new Son(){
			void study() {
				System.out.println("google....");
			}
		}.study();;
	}
}
