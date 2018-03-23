import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;


public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapNama = new HashMap<Integer, String>();
		HashMap<String, String> map = new HashMap<String, String>();
		Map<Integer, BookArrayList> mapBook = new HashMap<Integer, BookArrayList>();
		
		BookArrayList b1 = new BookArrayList(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		BookArrayList b2 = new BookArrayList(102, "Data Communication & Networking", "Forouzan", "Mc Graw Hill", 4);
		BookArrayList b3 = new BookArrayList(103, "Operating System", "Galvin", "Wiley", 6);
		
		mapNama.put(10, "Ilham");
		mapNama.put(1, "Galang");
		mapNama.put(29, "Pratama");
		
		for (Map.Entry m:mapNama.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		Set setMapNama = mapNama.entrySet();
		Iterator iteratorMapNama = setMapNama.iterator();
		while(iteratorMapNama.hasNext()) {
			Map.Entry mentryMapNama = (Map.Entry)iteratorMapNama.next();
			System.out.println("Key is: " + mentryMapNama.getKey() + " & Value is: " + mentryMapNama.getValue());
		}
		
		System.out.println(mapNama.get(1));
		System.out.println("\n\n");
		
		
		map.put("11", "Let us C");
		map.put("2", "Operating System");
		map.put("13", "Data Communication and Networking");
		
		
		for (Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Set setMap = map.entrySet();
		Iterator iteratorMap = setMap.iterator();
		while(iteratorMap.hasNext()) {
			Map.Entry mentryMap = (Map.Entry)iteratorMap.next();
			System.out.println("Key is: " + mentryMap.getKey() + " & Value is: " + mentryMap.getValue());
		}

		
		System.out.println("Values before remove: " + map);
		
		map.remove("11");
		
		System.out.println("Values after remove: " + map);
		System.out.println("\n\n");
		
		mapBook.put(1, b1);
		mapBook.put(2, b2);
		mapBook.put(3, b3);
		
		for (Map.Entry<Integer, BookArrayList> entryBook:mapBook.entrySet()) {
			int key = entryBook.getKey();
			BookArrayList book = entryBook.getValue();
			System.out.println(key + " Details:");
			System.out.println(book.id + " " + book.name + " " + book.author + " " + book.publisher + " " + book.quantity);
		}
		
		System.out.println("\n\n");
		/////////////////////////////////////
	     /* This is how to declare HashMap */
	      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");

	      /* Display content using Iterator*/
	      Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }

	      /* Get values based on key*/
	      String var= hmap.get(2);
	      System.out.println("Value at index 2 is: "+var);

	      /* Remove values based on key*/
	      hmap.remove(3);
	      System.out.println("Map key and values after removal:");
	      Set set2 = hmap.entrySet();
	      Iterator iterator2 = set2.iterator();
	      while(iterator2.hasNext()) {
	          Map.Entry mentry2 = (Map.Entry)iterator2.next();
	          System.out.print("Key is: "+mentry2.getKey() + " & Value is: ");
	          System.out.println(mentry2.getValue());
	       }

	}

}
