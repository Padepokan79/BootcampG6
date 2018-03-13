package main;

import java.util.Scanner;

public class MainApp {
	private static Scanner input;

	public static void main(String[] args) {
		int menu;
		
		input = new Scanner(System.in);
		
		jawabanSoal1 jSoal1 = new jawabanSoal1();
		jawabanSoal2 jSoal2 = new jawabanSoal2();
		jawabanSoal3 jSoal3 = new jawabanSoal3();
		jawabanSoal4 jSoal4 = new jawabanSoal4();
		jawabanSoal5 jSoal5 = new jawabanSoal5();
		
		do {
			System.out.println("\n1. Soal 1");
			System.out.println("2. Soal 2");
			System.out.println("3. Soal 3");
			System.out.println("4. Soal 4");
			System.out.println("5. Soal 5");
			System.out.println("0. Keluar");
			System.out.print("Masukkan pilihan soal : "); menu = input.nextInt();	
			
			switch (menu) {
				case 1:
					jSoal1.soal1();
					break;
				
				case 2:
					jSoal2.soal2();
					break;
					
				case 3:
					jSoal3.soal3();
					break;
					
				case 4:
					jSoal4.soal4();
					break;
					
				case 5:
					jSoal5.soal5();
					break;
	
				default:
					System.exit(0);
					break;
			}
			
		} while (menu != 0);
	}
}
