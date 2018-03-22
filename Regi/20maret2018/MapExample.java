package DuaPuluhMaret2018;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Book> mapBook = new HashMap<Integer, Book>();
		
		Book book1 = new Book(101, "Laskar Pelangi", "Andrea Hirata", "Gramedia", 2032);
		Book book2 = new Book(102, "Novel", "Regi", "Gramedia", 2098);
		Book book3 = new Book(103, "Komik", "Masashi", "Gramedia", 2039);
		
		mapBook.put(1, book1);
		mapBook.put(2, book2);
		mapBook.put(3, book3);
		
		for (Map.Entry<Integer, Book> entry : mapBook.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}

	}

}
