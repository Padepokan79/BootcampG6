package SoalGalon;

import java.util.ArrayList;

import SoalGalon.Galon;
public class TestGalon {
	public static void main(String[] args) {
		long total=0;
	Galon sega1 = new Galon("sega", 4000);
	Galon ron89 = new Galon("ron89", 4700);
	Galon leman = new Galon ("leman", 5400);
	
	//arrayList
		ArrayList<String> hari = new ArrayList<String>();
		hari.add("Senin");
		hari.add("Selasa");
		hari.add("Rabu");
		hari.add ("Kamis");
		hari.add ("Jumat");
		hari.add ("Sabtu");
		hari.add ("Minggu");
		int jmlLeman = 0;
		for (int harif = 0; harif < 7; harif++) {
			sega1.sethari(hari.get(harif));
			ron89.sethari(hari.get(harif));
			leman.sethari(hari.get(harif));
			System.out.println("Hari " + hari.get(harif) + " " + (sega1.getkeuntungansega() + ron89.getkeuntunganron89()+ leman.getkeuntunganleman()));
			total = total + (sega1.getkeuntungansega() + ron89.getkeuntunganron89() + leman.getkeuntunganleman()) ;
			if (harif >= 2) {
				jmlLeman += leman.getleman ();
			}
		}
			
		System.out.println("Keuntungan per minggu " + total);
		System.out.println("Leman yg terisi pada hari rabu - minggu: " + jmlLeman);
	}
}
