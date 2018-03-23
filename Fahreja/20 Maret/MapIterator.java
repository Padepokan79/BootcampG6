import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class MapIterator {
	public static void main(String[] args) {
		HashMap<Integer, String> namaMap = new HashMap<Integer,String>();
		namaMap.put(12, "Choirul");
		namaMap.put(2, "Ramus");
		namaMap.put(6, "Irman");
		namaMap.put(9, "Arsen");
		namaMap.put(15, "Lola");
		
		Set buat = namaMap.entrySet();
		Iterator rator = buat.iterator();
		while (rator.hasNext()) {
			Map.Entry daftar = (Map.Entry)rator.next();
			System.out.print("Key is "+daftar.getKey()+" & Value is ");
			System.out.println(daftar.getValue());
		}
		System.out.println();
		for (Map.Entry ulang : namaMap.entrySet()) {
			System.out.println("Key is "+ulang.getKey()+" & Value is "+ ulang.getValue());
		}
		
		String var = namaMap.get(2);
		System.out.println("\nValue at index 2 is : "+var);
		System.out.println();
		for (int i = 0; i < 100; i++) {
			var = namaMap.get(i);
			if (var != null) {
				System.out.println("Value at index "+(i)+" is :"+var);
			}
			
		}
	}
}
