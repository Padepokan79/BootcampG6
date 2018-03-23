import java.util.HashMap;
import java.util.Scanner;

public class TiketTanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nilai;
		double terJual;
		long keuntungan = 0;
		String hari;
		Scanner pilih = new Scanner(System.in);
		TiketBolaMeriah kursi1 = new TiketBolaMeriah(35000, "Biasa");
		TiketBolaMeriah kursi2 = new TiketBolaMeriah(50000, "VIP");
		TiketBolaMeriah kursi3 = new TiketBolaMeriah(70000, "VVIP");

		HashMap<Integer, Integer> tiket = new HashMap<Integer, Integer>();
			tiket.put(1, 50);
			tiket.put(2, 25);
			
		System.out.println("Berapa pertandingan dalam satu bulan ? ");
		nilai = pilih.nextInt();
		pilih.nextLine();
		
		for (int ulang = 0; ulang < nilai; ulang++) {
			System.out.println("Masukan Hari : ");
			hari = pilih.nextLine();
			kursi1.hari = hari;
			kursi1.hargaNaik();
			kursi2.hari = hari;
			kursi2.hargaNaik();
			kursi3.hari = hari;
			kursi3.hargaNaik();
			terJual = (kursi1.getHarga()*tiket.get(1))+(kursi2.getHarga()*tiket.get(2))+(kursi3.getHarga()*tiket.get(2));
			keuntungan = (long) (terJual + keuntungan);
			
		}
		System.out.println("Keuntungan dalam satu bulan adalah Rp. "+keuntungan);
	}
}
