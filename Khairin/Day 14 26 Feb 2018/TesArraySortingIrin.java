//MENGURUTKAN NOMOR

import java.util.Scanner;

public class TesArraySortingIrin{
	public static void main ( String[] args ){
	Scanner keyboard = new Scanner(System.in);
	String angka;
	int temp=0, awal, akhir;
	int [] numbers;

	System.out.print ("Masukan nomor: ");
	angka = keyboard.next();
	numbers=new int [angka.length()];

	for (awal= 0; awal < angka.length();  awal++){
		akhir = awal + 1; 
		numbers[awal]=Integer.parseInt (angka.substring(awal, akhir) );
	}
	// URUTAN NOMOR DARI NILAI TERKECIL
	for ( int index=0; index < numbers.length; index++){
		for (int a = 1; a< (numbers.length-index); a++){
			if ( numbers[a-1] > numbers[a]){
				temp = numbers[a-1];
				numbers[a-1] = numbers[a];
				numbers[a] = temp;
			}
		}
	}
	System.out.print ("Urutan nomor dari nomor terkecil adalah: ");
	for (int n : numbers) {
		System.out.print (n + " ");
	}
	
	// URUTAN NOMOR DARI NILAI TERBESAR
	for ( int index=0; index < numbers.length; index++){
		for (int a = 1; a< (numbers.length-index); a++){
			if ( numbers[a-1] > numbers[a]){
				temp = numbers[a-1];
				numbers[a-1] = numbers[a];
				numbers[a] = temp;
			}
		}
	}
	System.out.print ("\nUrutan nomor dari nomor terbesar adalah: ");
	for (int n : numbers) {
		System.out.print (n + " ");
	}
	}
}