package main;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int menu;
		
		System.out.println("Volume dan Luas");
		
		do {
			System.out.println("\nPerhitungan Ruang");
			System.out.println("1. Kubus");
			System.out.println("2. Balok");
			System.out.println("3. Tabung");
			System.out.println("0. Exit");
			System.out.print("Pilihan : "); menu = input.nextInt();
			
			switch (menu) {
			case 1:
				Kubus kubus = new Kubus();
				
				break;
			
			case 2:
				Balok balok = new Balok();
				
				break;

			case 3:
				Tabung tabung = new Tabung();
				
				break;	
				
			default:
				break;
			}
			
		} while (menu != 0);
	}

}
