package hashMapPertandinganBola;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestTiketPertandinganBola {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double jumlahPendapatan;
		int jumlahPertandingan;
		String inputHari;
		
		Tiket normal = new Tiket("Normal", 35000);
		Tiket vip = new Tiket("VIP", 50000);
		Tiket vvip = new Tiket("VVIP", 70000);
		
		
		System.out.println("Masukkan nama hari: ");
		inputHari= scan.next();
		
		if(inputHari.equalsIgnoreCase("sabtu")) {
			normal.setHarga(normal.getHarga()*1.2);
			vip.setHarga(vip.getHarga()*1.2);
			vvip.setHarga(vvip.getHarga()*1.2);
		}
		else if(inputHari.equalsIgnoreCase("minggu")) {
			normal.setHarga(normal.getHarga()*1.5);
			vip.setHarga(vip.getHarga()*1.2);
			vvip.setHarga(vvip.getHarga()*1.2);
		}
		
		jumlahPendapatan = normal.getHarga()*50 + vip.getHarga()*25 + vvip.getHarga()*25;
		
		System.out.println("Jumlah pendapatan hari "+inputHari+" : Rp "+jumlahPendapatan);
		
		
	}
	
	public static void insertToAddHashMap(HashMap<Integer, String> namaMap, String[] hari) {
		for(int index=0; index<hari.length;index++) {
			namaMap.put(index+1,hari[index]);
		}
	}
}
