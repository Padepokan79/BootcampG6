import java.util.ArrayList;
import java.util.Scanner;

public class CekAngka {
	public static void main(String[] args) {
		
		Scanner nilai = new Scanner(System.in);
		int pilih,banyakAngka = 0;
		
		ArrayList<Integer> angka = new ArrayList<Integer>();
		ArrayList<Integer> tampung = new ArrayList<Integer>();
		
		angka.add(4);
		angka.add(3);
		angka.add(2);
		angka.add(4);
		angka.add(2);
		angka.add(6);
		angka.add(2);
		angka.add(5);
		angka.add(5);
		angka.add(7);
		angka.add(5);
		angka.add(3);
		angka.add(5);
		angka.add(3);
		angka.add(3);
		angka.add(23);
		angka.add(4);
		angka.add(6);
		angka.add(4);
		angka.add(3);
		angka.add(4);
		angka.add(4);
		angka.add(2);
		angka.add(2);
		
		System.out.println("Masukan Angka yang dicari : ");
		pilih = nilai.nextInt();
		
		for (int cekAngka = 0; cekAngka < angka.size(); cekAngka++) {
			if (pilih < angka.get(cekAngka)) {
				tampung.add(angka.get(cekAngka));
				banyakAngka++;
			}
		}
		System.out.println("Yang lebih dari angka "+pilih+" ada "+banyakAngka+" yaitu :");
		for (Integer integer : tampung) {
			System.out.print(integer+" ");
		}
	}
}
