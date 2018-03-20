import java.util.ArrayList;
import java.util.Scanner;

public class TestTiketBola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		TiketBola tiket = new TiketBola();
	
		ArrayList<String> hariPertandinganKe = new ArrayList<String>();
		
		long  totalPendapatanSebulan = 0;
		
		System.out.println("Masukan jumlah pertandingan dalam sebulan!");
		tiket.setJumlahPertandinganDalamSebulan(input.nextInt());
		
		for (int pertandinganKe = 1; pertandinganKe <= tiket.getJumlahPertandinganDalamSebulan(); pertandinganKe++) {
			System.out.println("Pertandingan Ke " + pertandinganKe);
			System.out.println("Masukan Hari bertanding!");
			hariPertandinganKe.add(input.next());
			System.out.println();
		}

		for (int pertandinganKe = 0; pertandinganKe < hariPertandinganKe.size(); pertandinganKe++) {
			tiket.setHari(hariPertandinganKe.get(pertandinganKe));
			System.out.println("Pendapatan pada pertandingan ke " + (pertandinganKe+1) + " (" + tiket.getHari() + ") sebesar Rp." + tiket.pendapatanPerHari());	
			totalPendapatanSebulan += tiket.pendapatanPerHari();
		}
		
		System.out.println("Total Perndapatan Dalam Sebulan sebesar Rp." + totalPendapatanSebulan);
		
	}

}
