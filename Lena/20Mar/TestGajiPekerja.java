package hashMapGajiPekerja;

import java.util.HashMap;
import java.util.Map;

public class TestGajiPekerja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> mapGajiPerHari = new HashMap<String, Integer>();
		mapGajiPerHari.put("selain jumat", 120000);
		mapGajiPerHari.put("jumat", 80000);
		System.out.println("Penghasilan dalam setahun: "+ penghasilanSetahun(mapGajiPerHari, mencariTotalHari()));
		
	}
	
	public static int mencariTotalHari() {
		int totalHari=0;
		
		for(int bulan=1; bulan<=10; bulan++) {
			int jumlahHari = 31;
			
			if(bulan == 2) {
				jumlahHari = 28;
			}
			else if(bulan == 4 || bulan == 6 || bulan == 9) {
				jumlahHari = 30;
			}
			totalHari += jumlahHari;
		}
		
		return totalHari+24;
	}
	
	public static int penghasilanSetahun(HashMap<String, Integer> namaMap, int totalHari) {
		int totalHariJumat = (int)totalHari/7;
		int totalPenghasilan = 0;
		
		for(Map.Entry<String, Integer> map : namaMap.entrySet()) {
			if (map.getKey().equalsIgnoreCase("selain jumat")) {
				totalPenghasilan += (totalHari-totalHariJumat)*map.getValue();
			}
			else {
				totalPenghasilan += totalHariJumat*map.getValue();
			}
		}
		
		return totalPenghasilan;
	}

}
