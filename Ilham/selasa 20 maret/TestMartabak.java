import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestMartabak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Martabak martabakManis = new Martabak("Manis", 20000);
		Martabak martabakTelor = new Martabak("Telor", 24000);
		
		HashMap<String, Integer> penjualanManis = new HashMap<String, Integer>();
		HashMap<String, Integer> penjualanTelor = new HashMap<String, Integer>();
		
		ArrayList<String> hari = new ArrayList<String>();
		hari.add("Senin");
		hari.add("Selasa");
		hari.add("Rabu");
		hari.add("Kamis");
		hari.add("Jumat");
		hari.add("Sabtu");
		hari.add("Minggu");
		
		int jumlahPenjualanManis = 800, jumlahPenjualanTelor = 500;
		long penghasilanPerhari = 0, penghasilanPerminggu = 0;
		
		for (int hariIndex = 0; hariIndex < hari.size(); hariIndex++) {
			if (hari.get(hariIndex).equalsIgnoreCase("Sabtu")) {
				jumlahPenjualanManis = (int) (jumlahPenjualanManis + (jumlahPenjualanManis * 0.5));
				jumlahPenjualanTelor = (int) (jumlahPenjualanTelor + (jumlahPenjualanTelor * 0.5));
				penjualanManis.put(hari.get(hariIndex), jumlahPenjualanManis);
				penjualanTelor.put(hari.get(hariIndex), jumlahPenjualanTelor);				
			}
			else if (hari.get(hariIndex).equalsIgnoreCase("Minggu")) {
				jumlahPenjualanManis = (int) (jumlahPenjualanManis + (jumlahPenjualanManis * 0.4));
				jumlahPenjualanTelor = (int) (jumlahPenjualanTelor + (jumlahPenjualanTelor * 0.4));
				penjualanManis.put(hari.get(hariIndex), jumlahPenjualanManis);
				penjualanTelor.put(hari.get(hariIndex), jumlahPenjualanTelor);				
			}
			else {
				penjualanManis.put(hari.get(hariIndex), jumlahPenjualanManis);
				penjualanTelor.put(hari.get(hariIndex), jumlahPenjualanTelor);
			}
			jumlahPenjualanManis = 800;
			jumlahPenjualanTelor = 500;
		}
		
		for (int hariIndex = 0; hariIndex < hari.size(); hariIndex++) {
			martabakManis.setRataRataPenjualanPerhari(penjualanManis.get(hari.get(hariIndex)));
			martabakTelor.setRataRataPenjualanPerhari(penjualanTelor.get(hari.get(hariIndex)));
			
			penghasilanPerhari =(long) ((martabakManis.getHargaMartabak() * martabakManis.getRataRataPenjualanPerhari()) + (martabakTelor.getHargaMartabak() * martabakTelor.getRataRataPenjualanPerhari()));
			penghasilanPerminggu += penghasilanPerhari;
			
			System.out.println("Penghasilan pada hari " + hari.get(hariIndex) + " sebesar Rp." + penghasilanPerhari);
		}
		System.out.println();
		System.out.println("Penghasilan selama seminggu sebesar Rp." + penghasilanPerminggu);
	}

}
