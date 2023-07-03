package InnerClasses;

public class MemberInnerClassEx {

	public static void main(String[] args) {
		One o = new One();
		One.Two t = o.new Two();

		t.play();
		o.dog();
		o.sleep();
	}
}
