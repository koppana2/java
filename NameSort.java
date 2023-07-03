package collections.comparator;

import java.util.Comparator;

import collections.set.book.Book;

public class NameSort implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		String name1=o1.getName();
		String name2=o2.getName();
		int i=name1.compareToIgnoreCase(name2);
		if(i>0) {
			return 1;
		}
		return -1;
	}

}
