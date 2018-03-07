//MENGURUTKAN NOMOR DAN MEMISAHKAN

import java.util.Scanner;

public class TesArraySorting2Irin{
	public static void main ( String[] args ){
	Scanner keyboard = new Scanner(System.in);
	String angka;
	int temp=0, awal, akhir, pjgAngka, sub=0;;
	int [] numbers;


	//INPUT
	System.out.print ("Masukan Nomor: ");
	angka = keyboard.next();
	pjgAngka = angka.length();

	//GANJIL/GENAP?
		if (pjgAngka % 2 == 0){
			pjgAngka = pjgAngka/2;
		}
		else {
			pjgAngka =pjgAngka/2+1;
		}

	//INISIASI ARRAY NUMBERS
		numbers=new int [pjgAngka];
		
			for (awal= 0; awal < pjgAngka;  awal++){
				if (angka.length()  % 2 == 0 ) {
					akhir = sub + 2; 
					numbers[awal]=Integer.parseInt (angka.substring(sub, akhir) );
				}
				else {
					
					if ((sub + 1) == angka.length() ){
						akhir = sub + 1; 
						numbers[awal]=Integer.parseInt (angka.substring(sub, akhir) );
					}
					else {
						akhir = sub + 2; 
						numbers[awal]=Integer.parseInt (angka.substring(sub, akhir) );
					}
				}
				sub+=2;
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