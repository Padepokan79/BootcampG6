import java.util.ArrayList;
import java.util.Random;
public class NilaiRandom {
	public static void main(String[] args) {
		Random nilai = new Random();
		int tempNilai, tempIndex=0;
		
		ArrayList<Integer>angka = new ArrayList<Integer>();
		ArrayList<Integer>prima = new ArrayList<Integer>();
		
			for (int i = 0; i < 29; i++) {
				angka.add(nilai.nextInt(1000));
			}
			System.out.println("Bilangan awal");
		
			for (Integer bilangan : angka) {
				System.out.print(bilangan+" ");
			}
			System.out.println("\nBilangan dari yang kecil ke besar");
		
			for (int i = 0; i < angka.size() ; i++ ) {
				tempNilai = angka.get(0);
				tempIndex = 0;
				for (int j = 0; j < angka.size()-i-1 ; j++ ) {
					if (angka.get(j) < angka.get(j+1)) {
						if (tempNilai > angka.get(j)) {
							tempNilai = angka.get(j);
							tempIndex = j;
						}
					}else {
						if (tempNilai > angka.get(j+1)) {
							tempNilai = angka.get(j+1);
							tempIndex = j+1;
					}
				}				
			}
				angka.remove(tempIndex);
				angka.add(tempNilai);
			}
			for (Integer integer : angka) {
				System.out.print(integer+" ");
			}
			System.out.println();
			System.out.println("Bilangan prima");
			
			for (int i = 0; i < angka.size(); i++) {
				if (angka.get(i) == 2 || angka.get(i) == 3 || angka.get(i) == 5 || angka.get(i) == 7) {
					prima.add(angka.get(i));
					angka.remove(i);
				} 
				else if ( !(angka.get(i) % 2 == 0 || angka.get(i) % 3 == 0 || angka.get(i) % 5 == 0 || angka.get(i) % 7 == 0) ) {
					prima.add(angka.get(i));
					angka.remove(i);
				}
			}
	
			for (int i = 0; i < prima.size(); i++) {
				System.out.print(prima.get(i)+" ");
			}
			
			System.out.println();
			System.out.println("Setelah di hapus");
			for (Integer integer : angka) {
				System.out.print(integer+" ");
			}
	}
}

