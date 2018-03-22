package DuaPuluhMaret2018;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1010, "Let us C");
		map.put(1020, "Operating System");
		map.put(1030, "Data Communication Networking");
		
		System.out.println("Values before remove: " + map);
		map.remove(1020);
		System.out.println("Values after remove: " + map);
	}

}
