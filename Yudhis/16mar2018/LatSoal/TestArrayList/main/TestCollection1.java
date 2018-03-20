package main;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection1 {
	
	public static void main(String[] args) {
		// Creating ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		// Adding object in ArrayList
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		// Traversing list trough iterator
		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
}
