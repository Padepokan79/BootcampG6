import java.util.ArrayList;

public class TestMartabakManis {

	public static void main(String[] args) {
		Martabak manis = new Martabak("Manis", 20000);
		Martabak telor = new Martabak("Telor", 24000);
		double penghasilanHari=0, penghasilanMinggu=0;
		String namaHari = " ";

		ArrayList<Double> listManis = new ArrayList<Double>();
		ArrayList<Double> listTelor = new ArrayList<Double>();
		
		listManis.add((double) 800);
		listManis.add(800*1.5);
		listManis.add(800*1.4);
		
		listTelor.add((double) 500);
		listTelor.add(500*1.5);
		listTelor.add(500*1.4);
		
		for (int hari = 0; hari<7; hari++ ) {
			if (hari == 6) {
				penghasilanHari = manis.getHargaMartabak()*listManis.get(2) + telor.getHargaMartabak()*listTelor.get(2);
				System.out.println("Penghasilan hari" + " Minggu\t\t\t: Rp" + (int) penghasilanHari );
			}
			else if (hari == 5) {
				penghasilanHari = manis.getHargaMartabak()*listManis.get(1) + telor.getHargaMartabak()*listTelor.get(1);
				System.out.println("Penghasilan hari" + " Sabtu\t\t\t: Rp" + (int) penghasilanHari );
			}
			else {
				if (hari == 0) {
				namaHari = "Senin";
				}
				else if(hari == 1) {
				namaHari ="Selasa";	
				}
				else if(hari == 2) {
				namaHari = "Rabu";
				}
				else if (hari == 3) {
				namaHari = "Kamis";
				}
				else if (hari == 4) {
				namaHari = "Jum'at";
				}
				penghasilanHari = manis.getHargaMartabak()*listManis.get(0) + telor.getHargaMartabak()*listTelor.get(0);
				System.out.println("Penghasilan hari " + namaHari + "\t\t\t: Rp" + (int) penghasilanHari );
			}
			penghasilanMinggu = penghasilanMinggu + penghasilanHari;
		}
		
		System.out.println("\nTotal penghasilan minggu ini adalah\t: Rp" + (int) penghasilanMinggu);
			
	}

}
