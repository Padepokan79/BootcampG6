package DuaPuluhMaret2018;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestCollection13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
		
		hashMap1.put(1908, "Regi");
		hashMap1.put(1994, "Witanto");
		hashMap1.put(1020, "Arman");
		
		for (Map.Entry<Integer, String> entry : hashMap1.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println();
		
		Set<?> set = hashMap1.entrySet();
		Iterator<?> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("key is: " + mentry.getKey() + " & value is: ");
			System.out.println(mentry.getValue());
		}

	}

}
