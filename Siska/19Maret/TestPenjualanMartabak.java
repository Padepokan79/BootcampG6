package soalPenjualanMartabak;

import java.util.ArrayList;
public class TestPenjualanMartabak {
	public static void main(String[] args) {
		long total=0;
	
	PenjualanMartabak manis = new PenjualanMartabak("manis", 20000);
	PenjualanMartabak telor = new PenjualanMartabak("telor", 24000);
	
	//arrayList
	ArrayList<String> hari = new ArrayList<String>();
	hari.add("Senin");
	hari.add("Selasa");
	hari.add("Rabu");
	hari.add ("Kamis");
	hari.add ("Jumat");
	hari.add ("Sabtu");
	hari.add ("Minggu");
	
	for (int harif = 0; harif < 7; harif++) {
		manis.sethari(hari.get(harif));
		telor.sethari(hari.get(harif));
		System.out.println("Penghasilan hari " + hari.get(harif) + " "+ (manis.getpenghasilanmanis() + telor.getpenghasilantelor()));
		total = total + (manis.getpenghasilanmanis() + telor.getpenghasilantelor()) ;
	}
		System.out.println("Penghasilan per minggu " + total);
	}
}
