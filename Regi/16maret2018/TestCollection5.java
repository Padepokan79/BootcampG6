package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList1 = new ArrayList<String>();
		
		arrayList1.add("Ravi");
		arrayList1.add("Vijay");
		arrayList1.add("Ajay");
		
		ArrayList<String> arrayList2 = new ArrayList<String>();
		
		arrayList2.add("Hanumat");
		arrayList2.add("Ravi");
		
		arrayList1.removeAll(arrayList2);
		
		System.out.println("After remove: ");
		
		Iterator iterator1 = arrayList1.iterator();
		
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

	}

}
