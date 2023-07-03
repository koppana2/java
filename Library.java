package collections.comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import collections.set.book.Book;

public class Library {

	public static void main(String[] args) {
		Book b1 = new Book("THE ALCHEMIST", "PANLO COELHO", "Amazon Publishers");
		Book b2 = new Book("THINK AND GROW", "NAPOLEAN HILL", "Amazon Publishers");
		Book b3 = new Book("WINGS OF FIRE", "ABDUL KALAM", "SUN Publishers");
		Book b4 = new Book("2 STATES", "CHETAN BHAGAT", "READLINE Publishers");
		Book b5 = new Book("THE UNIVERSE", "CHETAN BHAGAT", "READLINE Publishers");

		List<Book> bookList = new LinkedList<Book>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);

		display(bookList);

		System.out.println("Author Sort");
		AuthorSort a = new AuthorSort();
		Collections.sort(bookList, a);
		display(bookList);

		Collections.reverse(bookList);
		display(bookList);

		System.out.println("Name Sort");
		NameSort n = new NameSort();
		Collections.sort(bookList, n);
		display(bookList);

	}

	private static void display(List<Book> bookList) {
		for (Book b : bookList) {
			System.out.println(b);
		}
		System.out.println("********************************************************************");
	}

	public static void CollectionSetBook(List<Book> bookList) {

		AuthorSort authorSort = new AuthorSort();
		NameSort nameSort = new NameSort();

		Set<Book> bookSet1 = new TreeSet<Book>(authorSort);
		bookSet1.addAll(bookList);
		displaySet(bookSet1);

		Set<Book> bookSet2 = new TreeSet<Book>(nameSort);
		bookSet2.addAll(bookSet1);
		displaySet(bookSet2);

	}

	private static void displaySet(Set<Book> bookSet) {
		for (Book b : bookSet) {
			System.out.println(b);
		}
		System.out.println("-------------------------------------------------------------------------");

	}

}
