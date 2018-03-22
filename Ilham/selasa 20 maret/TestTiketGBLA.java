import java.util.HashMap;
import java.util.Map;

public class TestTiketGBLA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TiketGBLA kategoriSatu = new TiketGBLA("Kategori 1", 50000);
		TiketGBLA kategoriDua = new TiketGBLA("Kategori 2", 100000);
		
		HashMap<String, Integer> penjualanTiketKategori1 = new HashMap<String, Integer>();
		HashMap<String, Integer> penjualanTiketKategori2 = new HashMap<String, Integer>();
		
		long totalPendapatan = 0;
		
		penjualanTiketKategori1.put("pertandingan1", 15000);
		penjualanTiketKategori2.put("pertandingan1", 10000);
		penjualanTiketKategori1.put("pertandingan2", 18000);
		penjualanTiketKategori2.put("pertandingan2", 12000);
		penjualanTiketKategori1.put("pertandingan3", 17000);
		penjualanTiketKategori2.put("pertandingan3", 8000);
		penjualanTiketKategori1.put("pertandingan4", 18000);
		penjualanTiketKategori2.put("pertandingan4", 10000);
		penjualanTiketKategori1.put("pertandingan5", 10000);
		penjualanTiketKategori2.put("pertandingan5", 4000);
		
		for (int pertandinganKe = 1; pertandinganKe <= penjualanTiketKategori1.size(); pertandinganKe++) {
			kategoriSatu.setJumlahPenonton(penjualanTiketKategori1.get("pertandingan" + pertandinganKe));
			kategoriDua.setJumlahPenonton(penjualanTiketKategori2.get("pertandingan" + pertandinganKe));
			System.out.println("Pendapatan pada Pertandingan Ke " + pertandinganKe + " Sebesar Rp." + (kategoriSatu.pendapatanPerpertandingan() + kategoriDua.pendapatanPerpertandingan()));
			totalPendapatan += (kategoriSatu.pendapatanPerpertandingan() + kategoriDua.pendapatanPerpertandingan());
		}
		
		System.out.println("Total Pendapatan Rp." + totalPendapatan);
	
	}

}
