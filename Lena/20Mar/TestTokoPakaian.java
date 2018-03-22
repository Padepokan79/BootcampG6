package hashMapTokoPakaian;

import java.util.HashMap;
import java.util.Map;

public class TestTokoPakaian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pakaian celana = new Pakaian("Celana", 110000);
		Pakaian kemeja = new Pakaian("Kemeja", 70000);
		Pakaian kaos = new Pakaian("Kaos", 50000);
		Pakaian jas = new Pakaian("Jas", 500000);
		String[] hari = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};

		
		HashMap<String, Integer> mapKemeja = new HashMap<String,Integer>();
		insertToAddHashMap(mapKemeja, 20, 15);
		
		HashMap<String, Integer> mapCelana = new HashMap<String,Integer>();
		insertToAddHashMap(mapCelana, 5, 10);
		
		HashMap<String, Integer> mapKaos = new HashMap<String,Integer>();
		insertToAddHashMap(mapKaos, 30, 25);
		
		HashMap<String, Integer> mapJas = new HashMap<String,Integer>();
		insertToAddHashMap(mapJas, 11, 7);
		
		HashMap<Integer, String> mapHari = new HashMap<Integer, String>();
		insertToAddHashMap(mapHari, hari);
		
		int totalPendapatanPerhari, totalPendapatan = 0;
		
		System.out.println("Pendapatan tiap hari di minggu pertama:");
		for(Map.Entry<Integer, String> map : mapHari.entrySet()) {
			totalPendapatanPerhari = mapKemeja.get("minggu pertama")*kemeja.getHarga() + mapCelana.get("minggu pertama")*celana.getHarga() + 
									 mapKaos.get("minggu pertama")*kaos.getHarga() + mapJas.get("minggu pertama")*jas.getHarga();
			System.out.println(map.getValue()+" : "+totalPendapatanPerhari);
			
			totalPendapatan += totalPendapatanPerhari;
		}
		
		for(int i=0; i< 4; i++) {
			totalPendapatanPerhari = mapCelana.get("minggu kedua")*celana.getHarga() + mapJas.get("minggu kedua")*jas.getHarga() + 
									 mapKaos.get("minggu kedua")*kaos.getHarga() + mapKemeja.get("minggu kedua")*kemeja.getHarga();
			
			totalPendapatan += totalPendapatanPerhari;
		}
		
		System.out.println("\nPendapatan selama 2 minggu: "+totalPendapatan);
	}
	
	public static void insertToAddHashMap(HashMap<String,Integer> namaMap, int nilai1, int nilai2) {
		namaMap.put("minggu pertama", nilai1);
		namaMap.put("minggu kedua", nilai2);
	}
	
	public static void insertToAddHashMap(HashMap<Integer, String> namaMap, String[] hari) {
		for(int i=0; i<hari.length;i++) {
			namaMap.put(i+1, hari[i]);
		}
	}
	
	

}
