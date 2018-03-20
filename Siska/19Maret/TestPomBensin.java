package SoalPomBensin;

import java.util.ArrayList;

public class TestPomBensin {
	public static void main(String[] args) {
		long total=0;
	PomBensin premium1 = new PomBensin("Premium", 6000);
	PomBensin pertalite = new PomBensin("pertalite", 8000);
	
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
			premium1.sethari(hari.get(harif));
			pertalite.sethari(hari.get(harif));
			System.out.println("Hari " + hari.get(harif) + " "+ (premium1.getkeuntunganPremium() + pertalite.getkeuntunganPertalite()));
			total = total + (premium1.getkeuntunganPremium() + pertalite.getkeuntunganPertalite()) ;
		}
		System.out.println("Keuntungan per minggu " + total);
	}
}
