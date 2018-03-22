package salonDiscountSystem;

import java.util.Date;
import java.util.Scanner;

public class DiscountMain {
	public static void main(String[] args) {
		Scanner scanNum = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		
		Date date = new Date();
		
		Visit visit = new Visit();
		
		int menu, menu2=1, menuMember, menuTipeMember;
		double price=0;
		String nama;
		
		System.out.println("Masukkan nama: ");
		nama = scanString.nextLine();
		visit = new Visit(nama, date);
		
		do {
			System.out.print("1.Member 2.Bukan Member: ");
			menuMember = scanNum.nextInt();
		}while(menuMember!=1 && menuMember!=2);
		if(menuMember == 1) {
			visit.setMember(true);
		
			do {
				System.out.print("1.Premium 2.Gold 3.Silver: ");
				menuTipeMember = scanNum.nextInt();
			}while(menuTipeMember!=1 && menuTipeMember!=2 && menuTipeMember!=3);
				
			if(menuTipeMember == 1) {
				visit.setMemberType("Premium");
			}
			else if(menuTipeMember == 2) {
				visit.setMemberType("Gold");
			}
			else if(menuTipeMember == 3) {
				visit.setMemberType("Silver");
			}
			else {
				System.out.println("Inputan anda salah!");
			}
		}
		else if(menuMember == 2) {
			visit.setMemberType("Non Member");
		}
		else if(menuMember!=1 && menuMember!=2) {
			System.out.println("Inputan anda salah!");
		}
		
		do {
			System.out.print("\n1. Produk\n2. Service\n0. Selesai\nMasukkan pilihan anda: ");
			menu=scanNum.nextInt();
			
			if(menu == 1) {
				do {
					System.out.println("\nPRODUK");
					System.out.println("1.Masker Rambut\n2.Serum\n0.Selesai");
					System.out.print("Masukkan pilihan yang akan anda belanjakan: ");
					menu2 = scanNum.nextInt();
					
					if(menu2 == 1) {
						price = 135000;
					}
					else if(menu2 == 2) {
						price = 350000;
					}
					else if(menu2 == 0) {
						price = 0;
					}
					else if(menu2!=0 && menu2!=1 && menu2!=2) {
						System.out.println("Inputan anda salah!");
						price = 0;
					}
					
					visit.setProductExpense(price);
				}while (menu2!=0);
				
			}
			else if(menu == 2) {
				do {
					System.out.println("\nSERVICE");
					System.out.println("1.Potong Rambut\n2.Creambath\n0.Selesai");
					System.out.print("Masukkan pilihan yang akan anda dapatkan: ");
					menu2 = scanNum.nextInt();
					
					if(menu2 == 1) {
						price = 50000;
					}
					else if(menu2 == 2) {
						price = 100000;
					}
					else if(menu2 == 0) {
						price = 0;
					}
					else if(menu2!=0 && menu2!=1 && menu2!=2) {
						System.out.println("Inputan anda salah!");
						price = 0;
					}
					
					visit.setServiceExpense(price);
				}while (menu2!=0);
			}
			else if(menu!=0 && menu!=1 && menu!=2){
				System.out.println("Menu yang anda masukkan salah!");
			}

		}while(menu != 0);

		System.out.println("\n\n=====================================================================");
		System.out.println(visit.toString());
			
		
	}
}
