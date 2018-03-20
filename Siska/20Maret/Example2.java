package HasMapExample;

import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		HashMap <Integer, String> map = new HashMap <Integer, String>();
		map.put(101, "Let us C");
		map.put(102, "Operating System");
		map.put(103, "Data Communication and Networking");
		System.out.println("Value before remove: " + map);
		
		map.remove(102);
		System.out.println("Value after remove: " + map);
	}

}
