package soal4PenjualMartabak;

import java.util.ArrayList;

public class TestMartabak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Penjual menjual martabak:\nMartabak manis Rp20000\nMartabak telor Rp 24000");
		System.out.println("Rata-rata penjualan selama weekday: manis 800, telor 500");
		System.out.println("Pada hari Sabtu penjualan meningkat 50%\nPada hari Minggu penjualan meningkat 40%");
		System.out.println("berapa penghasilan tukang martabak setiap harinya dan berapa penghasilan per minggunya?\n\n");
		
		Martabak manis = new Martabak("Martabak manis", 20000);
		Martabak telor = new Martabak("Martabak Telor", 24000);
		
		ArrayList<String> listHari = new ArrayList<String>();
		listHari.add("Senin");
		listHari.add("Selasa");
		listHari.add("Rabu");
		listHari.add("Kamis");
		listHari.add("Jumat");
		listHari.add("Sabtu");
		listHari.add("Minggu");
		
		ArrayList<Integer> listJumlahPenjualanManis = new ArrayList<Integer>();
		ArrayList<Integer> listJumlahPenjualanTelor = new ArrayList<Integer>();
		
		for(int i=0; i<7; i++) {
			int penjualanMartabakManis = 800, penjualanMartabakTelor = 500;
			if(i==5) {
				penjualanMartabakManis = (int) (penjualanMartabakManis*1.5);
				penjualanMartabakTelor = (int) (penjualanMartabakTelor*1.5);
			}
			else if(i==6) {
				penjualanMartabakManis = (int) (penjualanMartabakManis*1.4);
				penjualanMartabakTelor = (int) (penjualanMartabakTelor*1.4);
			}
			
			listJumlahPenjualanManis.add(penjualanMartabakManis);
			listJumlahPenjualanTelor.add(penjualanMartabakTelor);
			
		}
		
		int penghasilanPerMinggu=0, penghasilanPerHari;
		
		for(int i=0; i< 7 ; i++) {
			penghasilanPerHari = listJumlahPenjualanManis.get(i)*manis.getHarga() + listJumlahPenjualanTelor.get(i)*telor.getHarga();
			System.out.println("Hari "+listHari.get(i)+" : Rp "+penghasilanPerHari);
			
			penghasilanPerMinggu += penghasilanPerHari;
		}
		
		System.out.println("Total penghasilan seminggu: Rp "+penghasilanPerMinggu);
	}

}
