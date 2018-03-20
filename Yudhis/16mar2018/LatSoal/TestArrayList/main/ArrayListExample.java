package main;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// Creating list of Books
		ArrayList <Book> list = new ArrayList<Book>();
		
		// Creating books
		Book b1 = new Book(101, 8, "Let us C", "Yashwant Kanetkar", "BPB");
		Book b2 = new Book(102, 4, "Data Communications & Networking", "Forouzan", "Mc Graw Hill");
		Book b3 = new Book(103, 6, "Operating System", "Galvin", "Wiley");
		
		// Adding books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		// Traversing list
		for (Book book : list) {
			System.out.println(book.id + " " + book.name + " " + book.author + " " + book.publisher + " "
					+ book.quantity);
		}
	}
	
}
