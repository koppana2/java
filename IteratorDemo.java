package iterator;

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {

		Set<Float> s1 = new LinkedHashSet<Float>();
		s1.add(2.3f);
		s1.add(2.6f);
		s1.add(2.13f);
		s1.add(0.36f);

		Iterator<Float> it = s1.iterator();
		while (it.hasNext()) {
			float element = it.next();
			if (element < 2)
				it.remove();
		}
		System.out.println(s1);
	}
}