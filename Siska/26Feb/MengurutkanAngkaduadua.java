//Siska Pitriani 26 Februari 2018
import java.util.Scanner;

public class MengurutkanAngkaduadua{
	public static void main (String[]args){
	Scanner keyboard = new Scanner(System.in);
	String inputAngka;
	int awal, akhir;
	int [] arrno;
	int temp=0, panjangInputangka, sub=0;

	//input dari user
	System.out.print ("Masukan No: ");
	inputAngka = keyboard.next();

	panjangInputangka = inputAngka.length();
	//cek ganjil genap
	if (panjangInputangka % 2 == 0){
		panjangInputangka = panjangInputangka/2;
	}
	else {
		panjangInputangka =panjangInputangka/2+1;
	}
	//inisialisasi array arrno
	arrno=new int [panjangInputangka];
	
		for (awal= 0; awal < panjangInputangka;  awal++){
			if (inputAngka.length()  % 2 == 0 ) {
				akhir = sub + 2; 
				arrno[awal]=Integer.parseInt (inputAngka.substring(sub, akhir) );
			}
			else {
				
				if ((sub + 1) == inputAngka.length() ){
					akhir = sub + 1; 
					arrno[awal]=Integer.parseInt (inputAngka.substring(sub, akhir) );
				}
				else {
					akhir = sub + 2; 
					arrno[awal]=Integer.parseInt (inputAngka.substring(sub, akhir) );
				}
			}
			sub+=2;
		}
		//cari nilai terkecil
	for (int i = 0; i < arrno.length; i++){
			for (int k = arrno.length-1; k > i; k--){
				if (arrno[k] < arrno[k-1]){
					temp = arrno[k];

					arrno[k]=arrno[k-1];
					arrno[k-1]=temp;
				}
			}
		}
		System.out.print ("Urutan dari terkecil: ");
		for (int n : arrno) {
			System.out.print (n + " ");
		}
	//cari nilai terbesar
	for (int i = 0; i < arrno.length; i++){
			for (int k = arrno.length-1; k > i; k--){
				if (arrno[k] > arrno[k-1]){
					temp = arrno[k];

					arrno[k]=arrno[k-1];
					arrno[k-1]=temp;
				}
			}
		}
		System.out.print ("\nUrutan dari terbesar: ");
		for (int n : arrno) {
			System.out.print (n + " ");
		}
	}
}