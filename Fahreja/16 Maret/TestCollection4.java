import java.util.*;
public class TestCollection4 {
	public static void main(String[] args) {
		ArrayList<String> daftar = new ArrayList<String>();
		daftar.add("Ravi");	
		daftar.add("Vijay");
		daftar.add("Ajay");
		
		ArrayList<String> daftar2 = new ArrayList<String>();
		daftar2.add("Seno");
		daftar2.add("Kurwan");
		
		daftar.addAll(daftar2);
		Iterator iter = daftar.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			
		}
	}
	
}
