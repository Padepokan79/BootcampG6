package JavaArrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> list1 = new ArrayList<Book>();
		
		Book book1 = new Book(101, "Menggapai Mimpi", "Regi", "Gramedia", 100);
		Book book2 = new Book(102, "Shalat 5 waktu", "Witanto", "Gramedia", 120);
		
		list1.add(book1);
		list1.add(book2);
		
		for (Book bookAll : list1) {
			System.out.println(bookAll.id + " " + bookAll.name + " " + bookAll.author + " " + bookAll.publisher + " " + bookAll.quantity);
		}

	}

}
