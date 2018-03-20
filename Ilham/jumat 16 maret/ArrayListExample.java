import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BookArrayList> list = new ArrayList<BookArrayList>();
		List<BookArrayList> listDua = new ArrayList<BookArrayList>();
		
		BookArrayList book1 = new BookArrayList(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookArrayList book2 = new BookArrayList(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookArrayList book3 = new BookArrayList(103, "Operating System", "Galvin", "Wiley", 6);
		BookArrayList book4 = new BookArrayList(104, "Arduino Uno Beginer", "William", "Wembley", 7);
		BookArrayList book5 = new BookArrayList(105, "Object Oriented", "Helmas", "Studio", 9);
		BookArrayList book6 = new BookArrayList(103, "Operating System", "Galvin", "Wiley", 6);
			
		if (list.add(book1)) {
			System.out.println("buku 1 berhasil ditambahkan");
		}
		list.add(book2);
		list.add(book3);
		
		listDua.add(book4);
		listDua.add(book5);
		listDua.add(book6);
		
		System.out.println(list.addAll(listDua));
		list.remove(book1);
		list.removeAll(listDua);
		
		for (BookArrayList b : list) {
			System.out.println(b.id + " " + b.name + " " + b.publisher + " " + b.quantity);
		}
		
		System.out.println(list.size());		
		list.set(0, book5);
		list.add(1, book1);
		list.add(book1);
	
		for (BookArrayList b : list) {
			System.out.println(b.id + " " + b.name + " " + b.publisher + " " + b.quantity);
		}
		
		
		if (list.indexOf(book1) == -1) {
			System.out.println("Buku yang di cari tidak ada");
		} else {
			System.out.println("Buku Tersedia");
			System.out.println("buku berada di index " + list.lastIndexOf(book1));
		}
		
		System.out.println(list.get(1));
	}

}
