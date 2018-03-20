import java.util.*;
public class CekTiketGBLA {
	public static void main(String[] args) {
		int hitungTiketPerhari;
		long hitungTiketTotal = 0;
		
		TiketBola satu = new TiketBola(50000, "hargaBiasa");
		TiketBola dua = new TiketBola(100000, "hargaVip");
		
		ArrayList<Integer> kategoriSatu = new ArrayList<Integer>();
		ArrayList<Integer> kategoriDua = new ArrayList<Integer>();
		
		kategoriSatu.add(15000);
		kategoriSatu.add(18000);
		kategoriSatu.add(17000);
		kategoriSatu.add(18000);
		kategoriSatu.add(10000);
		
		kategoriDua.add(10000);
		kategoriDua.add(12000);
		kategoriDua.add(8000);
		kategoriDua.add(10000);
		kategoriDua.add(4000);
		
		System.out.println("Penjualan Tiket Stadion GBLA");
		for (int i = 0; i < kategoriDua.size(); i++) {
			hitungTiketPerhari = (satu.getTiket()*kategoriSatu.get(i))+(dua.getTiket()*kategoriDua.get(i));
			System.out.println("Pendapatan dari tiket penonton dari pertandingan "+(i+1)+" adalah Rp."+hitungTiketPerhari);
			hitungTiketTotal = hitungTiketTotal + hitungTiketPerhari;
		}
		System.out.println("Pendapatan Total dari 5 pertandingan adalah Rp. " +hitungTiketTotal);
	}
}
