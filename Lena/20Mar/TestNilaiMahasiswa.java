package hashMapNilaiMahasiswa;

import java.util.HashMap;
import java.util.Map;

public class TestNilaiMahasiswa {
	public static void main(String[] args) {
		String[] nama = {"Dinda", "Randi", "Joseph", "Diana", "Natalia"};
		int[] nilaiPajak = {80,20,70,95,75};
		int[] nilaiStatistika = {90,50,80,85,65};
		int[] nilaiEkonomi = {70,50,80,90,60};
		int[] nilaiManajemen = {80,70,85,80,50};
		
		HashMap<Integer, String> mapNama = new HashMap<Integer, String>();
		insertToAddHashMap(mapNama, nama);
				
		HashMap<Integer, Integer> mapPerpajakan = new HashMap<Integer, Integer>();
		insertToAddHashMap(mapPerpajakan, nilaiPajak);
		
		HashMap<Integer, Integer> mapStatistika = new HashMap<Integer, Integer>();
		insertToAddHashMap(mapStatistika, nilaiStatistika);
		
		HashMap<Integer, Integer> mapEkonomi = new HashMap<Integer, Integer>();
		insertToAddHashMap(mapEkonomi, nilaiEkonomi);
		
		HashMap<Integer, Integer> mapManajemen = new HashMap<Integer, Integer>();
		insertToAddHashMap(mapManajemen, nilaiManajemen);
		
		double rataRataTiapSiswa, rataRataSeluruhSiswa=0;
		
		System.out.println("Nilai rata-rata: ");
		
		for(Map.Entry<Integer, String> map : mapNama.entrySet()) {
			rataRataTiapSiswa = (mapPerpajakan.get(map.getKey())+mapEkonomi.get(map.getKey())+mapStatistika.get(map.getKey())+mapManajemen.get(map.getKey()))/4;
			System.out.println(map.getValue()+" : "+rataRataTiapSiswa);
			
			rataRataSeluruhSiswa += rataRataTiapSiswa;
		}
		
		rataRataSeluruhSiswa = rataRataSeluruhSiswa/mapNama.size();
		System.out.println("\nNilai rata-rata seluruh siswa: "+ rataRataSeluruhSiswa);
	}
	
	public static void insertToAddHashMap(HashMap<Integer,String> namaMap, String[] nama) {
		for(int index=0; index<nama.length; index++) {
			namaMap.put(index+1, nama[index]);
		}
	}
	
	public static void insertToAddHashMap(HashMap<Integer,Integer> namaMap, int[] nilai) {
		for(int index=0; index<nilai.length; index++) {
			namaMap.put(index+1, nilai[index]);
		}
	}
	
	
}
