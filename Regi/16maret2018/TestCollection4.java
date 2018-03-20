package JavaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrayList1 = new ArrayList<String>();
		
		arrayList1.add("Regi");
		arrayList1.add("Witanto");
		arrayList1.add("Arman");
		
		ArrayList<String> arrayList2 = new ArrayList<String>();
		
		arrayList2.add("Andi");
		arrayList2.add("Jufri");
		
		arrayList1.addAll(arrayList2);
		
		Iterator iterator1 = arrayList1.iterator();
		
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());			
		}

	}

}
