import java.util.Scanner;
import java.util.ArrayList;
public class AssosiasiDagang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nilai = new Scanner(System.in);
		Pedagang asongan = new Pedagang("Mamat", "Gang tilil", "Buah-buahan");
		BarangDagang apel = new BarangDagang("Apel", 2500, 5000);
		BarangDagang durian = new BarangDagang("Durian", 5000, 25000);
		BarangDagang mangga = new BarangDagang("Mangga", 3000, 15000);
		BarangDagang jeruk = new BarangDagang("Jeruk", 2000, 4000);
		BarangDagang pir = new BarangDagang("Pir", 5000, 25000);
		int keuntungan = 0, untung;
		
		ArrayList<BarangDagang> dagangan = new ArrayList<BarangDagang>();
		dagangan.add(apel);
		dagangan.add(durian);
		dagangan.add(mangga);
		dagangan.add(jeruk);
		dagangan.add(pir);
		
		System.out.println("Data pedagang nama :"+ asongan.getNama()+" Alamat :"+asongan.getAlamat()+" Barang jualan :"+asongan.getBarang());
		System.out.println("Macam-macam "+ asongan.getBarang());
		System.out.println("Nama Barang\tHarga Beli\tHarga Jual\tKeuntungan");
		
		for (BarangDagang barangDagang : dagangan) {
			untung =(barangDagang.hargaJual-barangDagang.hargaBeli);
			System.out.println(barangDagang.namaBarang+"\t\t"+barangDagang.hargaBeli+"\t\t"+barangDagang.hargaJual+"\t\t"+untung);
			keuntungan = keuntungan + untung;
		}
		System.out.println("Total keuntungan sebesar Rp." +keuntungan);
	}

}
