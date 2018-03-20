package SembilanBelasMaret2018;

import java.util.ArrayList;

public class PenghasilanPekerja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int penghasilanPerTahun = 0;
		
		ArrayList<Integer> penghasilanPerHari = new ArrayList<>();
		ArrayList<String> hari = new ArrayList<String>();
		
		hari.add("senin");
		hari.add("selasa");
		hari.add("rabu");
		hari.add("kamis");
		hari.add("jumat");
		hari.add("sabtu");
		hari.add("minggu");

		int penghasilanPerMinggu = 0;
		
		for (int i = 0; i < 328; i++) {
			if (penghasilanPerMinggu > 6) {
				penghasilanPerMinggu = 0;
			}
			if (hari.get(penghasilanPerMinggu).equalsIgnoreCase("jumat")) {
				penghasilanPerHari.add(80000);
			}
			else {
				penghasilanPerHari.add(120000);
			}
			penghasilanPerTahun = penghasilanPerTahun + penghasilanPerHari.get(i);
			penghasilanPerMinggu++;
		}
		
		System.out.println("Penghasilan dalam setahun : Rp. " + penghasilanPerTahun);

	}

}
