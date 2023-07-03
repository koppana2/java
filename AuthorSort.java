package collections.comparator;

import java.util.Comparator;

import collections.set.book.Book;

public class AuthorSort implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		String author1 = o1.getAuthor();
		String author2 = o2.getAuthor();

		int i = author1.compareToIgnoreCase(author2);
		if (i > 0) {
			return 1;
		} else if (i < 0) {
			return -1;
		}

		return 0;
	}

}