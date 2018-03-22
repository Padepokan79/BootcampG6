import java.util.*;

public class ArrayListExample {
public static void main(String[] args) {
	List<Book2> list= new ArrayList<Book2>();
	
	Book2 b1 =new Book2(101,"Let us C","Yashwant","BPB",8);
	Book2 b2 =new Book2(102,"Data Communications & Nerworking","Forouzan","Mc Graw Hill",4);
	Book2 b3 =new Book2(103,"Operation System","Galvin","Wiley",6);
	
	list.add(b1);
	list.add(b2);
	list.add(b3);
	
	for (Book2 b : list) {
		System.out.println(b.id+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
	}
}
