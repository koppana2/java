package collections.map;

import java.util.*;

public class UniqueElements {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 7, 4, 7, 2, 5, 6, 5, 4, 4, 4 };

		Map<Integer, Integer> occurence = new TreeMap<Integer, Integer>();

		for (int element : a) {
			int count = 1;
			if (occurence.containsKey(element)) {
				count = occurence.get(element);
				count++;
				occurence.put(element, count);
			} else
				occurence.put(element, count);
		}
		String uniqueElements = "";
		String oddElements = "";
		String evenElements = "";

		for (Map.Entry<Integer, Integer> e : occurence.entrySet()) {
			int count = e.getValue();
			int element = e.getKey();
			if (count == 1) {
				uniqueElements += element + ",";
			}
			if (element % 2 != 0) {
				oddElements += element + ",";
			} else {
				evenElements += element + ",";
			}
		}
		System.out.println("uniqueElements : " + uniqueElements);
		System.out.println("oddElements : " + oddElements);
		System.out.println("evenElements : " + evenElements);

	}

}
