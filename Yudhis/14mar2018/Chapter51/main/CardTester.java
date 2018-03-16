package main;

import java.util.Scanner;

public class CardTester {
	public static void main(String[] args) {
		String me;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Your name: "); me = input.next();

	    Holiday hol = new Holiday(me);
	    hol.greeting();

	    Birthday bd = new Birthday(me, 21);
	    bd.greeting();

	    Valentine val = new Valentine(me, 7);
	    val.greeting();
	}
}
