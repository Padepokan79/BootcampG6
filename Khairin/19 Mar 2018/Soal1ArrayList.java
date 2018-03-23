//SOAL teh lena no.1
import java.util.ArrayList;

/*Buat sebuah arraylist yang menampung 30 nilai random 1-1000
 *-urutkan isi arraylist tersebut dari nilai kecil ke besar
 *-hapus bilangan primanya
 *-tampilkan before afternya
 *-tampilkan juga list bilangan primanya 
 */

public class Soal1ArrayList {

	public static void main(String[] args) {
		int rand;
		int listAngkaTemp, listPrimaTemp;
		int m=0, index2=0;
		ArrayList<Integer> listAngka = new ArrayList<Integer>();
		ArrayList<Integer> listTanpaPrima = new ArrayList<Integer>();
		
		for (int i=0; i<30; i++) {
		rand = ((int) (1000*Math.random()+1));
		listAngka.add(i, rand);
		}
		
		System.out.println();
		System.out.println("A. Angka pada sebuah Arraylist: ");
		for(int angka: listAngka) {
			System.out.print(angka + " ");
		}
		
		//URUTAN NIAI ARRAYLIST DARI YANG TERKECIL KE YANG TERBESAR
		System.out.println("\n\nB. Urutan nilai Arraylist dari nilai terkecil ke nilai terbesar dengan bilangan prima : ");
		for ( int index=0; index < listAngka.size(); index++){
			for (int k = index+1; k< listAngka.size(); k++){
				if ( (listAngka.get(k)).compareTo(listAngka.get(index)) < 0){
				listAngkaTemp = listAngka.get(index);
				listAngka.set(index, listAngka.get(k));
				listAngka.set(k, listAngkaTemp);
				}
			}
		}
		for (int angkaBaru : listAngka)
		System.out.print(angkaBaru + " ");
		System.out.println();
		
		
		//MENENTUKKAN BILANGAN PRIMA DAN MENGHAPUS BILANGAN PRIMA
		System.out.println("\nC. Bilangan prima dalam Arraylist: ");
		for (int i = 2; i <= listAngka.size() ; i++) {
			if (listAngka.get(m) == 2 || listAngka.get(m) == 3 || listAngka.get(m) == 5 || listAngka.get(m) == 7) {
				System.out.print(listAngka.get(m) + " ");
				listAngka.remove(m);
					
				
			} 
			else if ( !(listAngka.get(m) % 2 == 0 ||listAngka.get(m) % 3 == 0 ||listAngka.get(m) % 5 == 0 ||listAngka.get(m) % 7 == 0) ) {
				System.out.print(listAngka.get(m) + " ");
				listAngka.remove(m);	
				}
			m++;
		}
		
		System.out.println("\n\nD. Urutan nilai Arraylist dari nilai terkecil ke nilai terbesar tanpa bilangan prima : ");
		for(int angkaTanpaPrima:listAngka) {
			System.out.print(angkaTanpaPrima + " ");
		}
		

	}

}
