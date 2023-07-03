package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listDemo {
	public static void main(String[] args) {
		// collection<Generic> Object=new ClassName<Generic>()
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(50);
		l1.add(56);
		l1.add(12);
		l1.add(82);
		l1.add(8);
		System.out.println(l1);

		l1.add(1, 20);
		System.out.println(l1);
		l1.add(1, 82);
		System.out.println(l1);
		l1.set(2, 19); // replace the data
		System.out.println(l1);

		System.out.println("12 is available :" + l1.contains(12));
		System.out.println("5 is available :" + l1.contains(5));

		System.out.println("Index of 82 :" + l1.indexOf(82));
		System.out.println("LastIndex of 82 :" + l1.lastIndexOf(82));
		System.out.println("Element at 0 index :" + l1.get(0));
		l1.remove(4);

		System.out.println(l1);

		System.out.println("-------------------------------------------------------");

		List<Integer> l2 = new LinkedList<Integer>();
		l2.add(789);
		l2.add(745);
		l2.add(985);
		l2.add(846);
		l2.add(200);

		System.out.println(l2);
		l2.addAll(l1);
		System.out.println(l2);
		l2.removeAll(l1);
		System.out.println(l2);
		l2.addAll(2, l1);
		System.out.println(l2);

	}
}