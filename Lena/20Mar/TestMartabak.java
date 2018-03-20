package hashMapMartabak;

import java.util.HashMap;
import java.util.Map;

public class TestMartabak {
	public static void main(String[] args) {
		
		//object martabak
		Martabak martabakManis = new Martabak("Martabak Manis", 20000);
		Martabak martabakTelor = new Martabak("Martabak Telor", 24000);
		//hashmap martabak
		HashMap<String, Martabak> mapMartabak = new HashMap<String, Martabak>();
		mapMartabak.put("manis", martabakManis);
		mapMartabak.put("telor", martabakTelor);
		
		//hashmap hari
		HashMap<String, String> mapHari= new HashMap<String, String>();
		mapHari.put("senin", "Senin");
		mapHari.put("selasa", "Selasa");
		mapHari.put("rabu", "Rabu");
		mapHari.put("kamis", "Kamis");
		mapHari.put("jumat", "Jumat");
		mapHari.put("sabtu", "Sabtu");
		mapHari.put("minggu", "Minggu");
		
		//hashmap jumlah penjualan martabak manis dan telor
		HashMap<String, Integer> mapPenjualanManis = new HashMap<String, Integer>();
		HashMap<String, Integer> mapPenjualanTelor = new HashMap<String, Integer>();
		
		for(Map.Entry<String, String> map : mapHari.entrySet()) {
			int penjualanMartabakManis = 800, penjualanMartabakTelor = 500;
			if(map.getKey().equals("sabtu")) {
				penjualanMartabakManis = (int) (penjualanMartabakManis*1.5);
				penjualanMartabakTelor = (int) (penjualanMartabakTelor*1.5);
			}
			else if(map.getKey().equals("minggu")) {
				penjualanMartabakManis = (int) (penjualanMartabakManis*1.4);
				penjualanMartabakTelor = (int) (penjualanMartabakTelor*1.4);
			}
			mapPenjualanManis.put(map.getKey(), penjualanMartabakManis);
			mapPenjualanTelor.put(map.getKey(), penjualanMartabakTelor);
		}
		
		
		int penghasilanPerHari, penghasilanPerMinggu = 0;
		
		//cari penghasilan perhari dan perminggu, print hasil
		for(Map.Entry<String, String> map : mapHari.entrySet()) {
			penghasilanPerHari = mapPenjualanManis.get(map.getKey())*mapMartabak.get("manis").getHarga() + 
								 mapPenjualanTelor.get(map.getKey())*mapMartabak.get("telor").getHarga();
			
			System.out.println("Hari "+map.getValue()+" : Rp "+penghasilanPerHari);

			penghasilanPerMinggu += penghasilanPerHari;
		}
		System.out.println("Total penghasilan seminggu: Rp "+penghasilanPerMinggu);
		
		
	}
	
}
