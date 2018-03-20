package EnamBelasMaret2018;

import java.util.ArrayList;

public class TestBuah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int penghasilanSetiapHari, penghasilanSelamaSeminggu = 0;
		
		Buah apel = new Buah("Apel", 20000);
		Buah mangga = new Buah("Mangga", 16000);
		Buah jeruk = new Buah("Jeruk", 15000);
		Buah rambutan = new Buah("Rambutan", 10000);
		
		ArrayList<Integer> jumlahApelYangLaku = new ArrayList<Integer>();
		ArrayList<Integer> jumlahManggaYangLaku = new ArrayList<Integer>();
		ArrayList<Integer> jumlahJerukYangLaku = new ArrayList<Integer>();
		ArrayList<Integer> jumlahRambutanYangLaku = new ArrayList<Integer>();
		
		ArrayList<String> hari = new ArrayList<String>();
		
		hari.add("senin");
		hari.add("selasa");
		hari.add("rabu");
		hari.add("kamis");
		hari.add("jumat");
		hari.add("sabtu");
		hari.add("minggu");
		
		for (int i = 0; i < hari.size(); i++) {
			if (hari.get(i).equalsIgnoreCase("jumat")) {
				jumlahApelYangLaku.add(20);
				jumlahManggaYangLaku.add(20);
				jumlahJerukYangLaku.add(20);
				jumlahRambutanYangLaku.add(20);
			} else {
				jumlahApelYangLaku.add(12);
				jumlahManggaYangLaku.add(10);
				jumlahJerukYangLaku.add(15);
				jumlahRambutanYangLaku.add(13);
			}
			penghasilanSetiapHari = apel.getHargaBuahPerKg()*jumlahApelYangLaku.get(i) + mangga.getHargaBuahPerKg()*jumlahManggaYangLaku.get(i)
					+ jeruk.getHargaBuahPerKg()*jumlahJerukYangLaku.get(i) + rambutan.getHargaBuahPerKg()*jumlahRambutanYangLaku.get(i);	
			System.out.println("Penghasilan hari " + hari.get(i) + " : " + penghasilanSetiapHari);
			penghasilanSelamaSeminggu = penghasilanSelamaSeminggu + penghasilanSetiapHari;
		}
		
		System.out.println("Penghasilan selama Seminggu : " + penghasilanSelamaSeminggu);
		
	}

}