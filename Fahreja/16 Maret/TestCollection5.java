import java.util.*;

public class TestCollection5 {
	public static void main(String[] args) {
		ArrayList<String> daftarNama = new ArrayList<String>();
		daftarNama.add("Ravi");
		daftarNama.add("Vijay");
		daftarNama.add("Ajay");
		
		ArrayList<String> daftarNama2 = new ArrayList<String>();
		daftarNama2.add("Ravi");
		daftarNama2.add("Hanumat");
		daftarNama.removeAll(daftarNama2);
		System.out.println("iterating the elements after removing the elements of daftarNama2");
		
		Iterator iter = daftarNama.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
				
			}
	}
}
