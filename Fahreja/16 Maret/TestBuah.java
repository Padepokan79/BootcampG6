import java.util.*;
public class TestBuah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalPemasukanPerHari = 0, totalPemasukanSeminggu = 0;
		
		PenjualBuah apel = new PenjualBuah("Apel", 20000, 20);
		PenjualBuah mangga = new PenjualBuah("Mangga", 16000, 20);
		PenjualBuah jeruk = new PenjualBuah("Jeruk", 15000, 20);
		PenjualBuah rambutan = new PenjualBuah("Rambutan", 10000, 20);
		
		ArrayList<String> hariDagang = new ArrayList<String>();
		hariDagang.add("Senin");
		hariDagang.add("Selasa");
		hariDagang.add("Rabu");
		hariDagang.add("Kamis");
		hariDagang.add("Jumat");
		hariDagang.add("Sabtu");
		hariDagang.add("Minggu");
		
		for (int namaHari = 0; namaHari < hariDagang.size(); namaHari++) {
			if (hariDagang.get(namaHari).equalsIgnoreCase("jumat")) {
				apel.setStokBuahDalamKg(20);
				mangga.setStokBuahDalamKg(20);
				jeruk.setStokBuahDalamKg(20);
				rambutan.setStokBuahDalamKg(20);
			}else {
				apel.setStokBuahDalamKg(12);
				mangga.setStokBuahDalamKg(10);
				jeruk.setStokBuahDalamKg(15);
				rambutan.setStokBuahDalamKg(13);
			}
			totalPemasukanPerHari = (apel.getHargaBuah()*apel.getStokBuahDalamKg())+(mangga.getHargaBuah()*mangga.getStokBuahDalamKg())+(jeruk.getHargaBuah()*jeruk.getStokBuahDalamKg())+(rambutan.getHargaBuah()*rambutan.getStokBuahDalamKg());
			 System.out.println("Hari "+hariDagang.get(namaHari)+" Pengehasilan : "+totalPemasukanPerHari);
			 totalPemasukanSeminggu= totalPemasukanSeminggu + totalPemasukanPerHari;
		}
		System.out.println("\nPemasukan selama Seminggu : " + totalPemasukanSeminggu);
		
	}

}
