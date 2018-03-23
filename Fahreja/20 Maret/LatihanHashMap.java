import java.util.*;
public class LatihanHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> mapBaru =new HashMap<Integer,String>();
		mapBaru.put(101, "Ilham");
		mapBaru.put(102, "Huda");
		mapBaru.put(104, "Kurni");
		
		for (Map.Entry baru : mapBaru.entrySet()) {
			System.out.println(baru.getKey()+" "+baru.getValue());
		}
	}
}
