package HasMapExample;

import java.util.*;
public class Example1 {
	public static void main (String []args) {
		HashMap <Integer, String > in = new HashMap <Integer, String > ();
		in.put(99, "Indah");
		in.put(100, "Rino");
		for(Map.Entry m:in.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
			 }  
			}  
		}  