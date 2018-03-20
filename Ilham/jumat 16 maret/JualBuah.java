import java.util.ArrayList;

public class JualBuah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buah apel = new Buah("Apel", 20, 20000);
		Buah mangga = new Buah("Mangga", 20, 16000);
		Buah jeruk = new Buah("Jeruk", 20, 15000);
		Buah rambutan = new Buah("Rambutan", 20, 10000);
		
		int penghasilanPerHari, penghasilanPerMinggu = 0;
		
		//array hari
		ArrayList<String> hari = new ArrayList<String>();
		//tambah hari
		hari.add("Senin");
		hari.add("Selasa");
		hari.add("Rabu");
		hari.add("Kamis");
		hari.add("Jumat");
		hari.add("Sabtu");
		hari.add("Minggu");
		
		//array jumlah buah yang laku berdasarkan kg
		ArrayList<Integer> jumlahBuahApelLakuDalamKg = new ArrayList<Integer>();
		ArrayList<Integer> jumlahBuahManggaLakuDalamKg = new ArrayList<Integer>();
		ArrayList<Integer> jumlahBuahJerukLakuDalamKg = new ArrayList<Integer>();
		ArrayList<Integer> jumlahBuahRambutanLakuDalamKg = new ArrayList<Integer>();
		
		//tambah jumlah buah yang laku berdasarkan kg perhari ke array
		for (int hariKe = 0; hariKe < hari.size(); hariKe++) {
			if (hari.get(hariKe).equalsIgnoreCase("Jumat")) {
				jumlahBuahApelLakuDalamKg.add(20);
				jumlahBuahManggaLakuDalamKg.add(20);
				jumlahBuahJerukLakuDalamKg.add(20);
				jumlahBuahRambutanLakuDalamKg.add(20);
			} else {
				jumlahBuahApelLakuDalamKg.add(12);
				jumlahBuahManggaLakuDalamKg.add(10);
				jumlahBuahJerukLakuDalamKg.add(15);
				jumlahBuahRambutanLakuDalamKg.add(13);
			}
		}

		for (int index = 0; index < 7; index++) {
			penghasilanPerHari = (apel.getHargaPerKg() * jumlahBuahApelLakuDalamKg.get(index)) +
								 (mangga.getHargaPerKg() * jumlahBuahManggaLakuDalamKg.get(index)) +
								 (jeruk.getHargaPerKg() * jumlahBuahJerukLakuDalamKg.get(index)) +
								 (rambutan.getHargaPerKg() * jumlahBuahRambutanLakuDalamKg.get(index));
			penghasilanPerMinggu += penghasilanPerHari;
			System.out.println("Penghasilan Setiap Hari " + hari.get(index) + " sebesar Rp." + penghasilanPerHari);
		}
		System.out.println("\nPenghasilan Selama Seminggu sebesar Rp." + penghasilanPerMinggu);
		
	}

}
