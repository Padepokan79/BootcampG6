//Siska Pitriani 26 Februari 2018
import java.util.Scanner;

public class MengurutkanAngka{
	public static void main (String[]args){
	Scanner keyboard = new Scanner(System.in);
	String inputAngka;
	int awal, akhir;
	int [] arrno;
	int temp=0;

	System.out.print ("Masukan No: ");
	inputAngka = keyboard.next();
	arrno=new int [inputAngka.length()];

	for (awal= 0; awal < inputAngka.length();  awal++){
		akhir = awal + 1; 
		arrno[awal]=Integer.parseInt (inputAngka.substring(awal, akhir) );
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