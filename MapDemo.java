package collections.map;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {

		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(20, "Guava");
		m1.put(55, "Apple");
		m1.put(100, "parrot");
		m1.put(40, "Orange");
		m1.put(100, "Mango");
		m1.put(85, "Apple");

		System.out.println(m1);
		System.out.println("contains key of 100" + m1.containsKey(100));
		System.out.println("contains value of Orange" + m1.containsValue("Orange"));

		Set<Integer> keys = m1.keySet();
		System.out.println("keys : " + keys);

		Collection<String> values = m1.values();
		System.out.println("values : " + values);

		System.out.println("value of key 2 : " + m1.get(20));

		for (Map.Entry<Integer, String> entry : m1.entrySet()) {

			String v = entry.getValue();
			if (v.endsWith("e"))
				System.out.println(v);
		}
		System.out.println("===============================");

		Map<Integer, String> m2 = new TreeMap<Integer, String>();
		m2.putAll(m1);
		System.out.println(m2);
	}
}