import java.util.HashMap;
import java.util.Map;

public class HashMapBarangDagang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pedagang asongan = new Pedagang("Mamat", "Gang tilil", "Buah-buahan");
		BarangDagang apel = new BarangDagang("Apel", 2500, 5000);
		BarangDagang durian = new BarangDagang("Durian", 5000, 25000);
		BarangDagang mangga = new BarangDagang("Mangga", 3000, 15000);
		BarangDagang jeruk = new BarangDagang("Jeruk", 2000, 4000);
		BarangDagang pir = new BarangDagang("Pir", 5000, 25000);
		int keuntungan = 0, untung;
		
		HashMap<Integer, BarangDagang> daftar = new HashMap<Integer, BarangDagang>();
		daftar.put(105, apel);
		daftar.put(120, durian);
		daftar.put(100, mangga);
		daftar.put(200, pir);
		
		System.out.println("Data pedagang nama :"+ asongan.getNama()+" Alamat :"+asongan.getAlamat()+" Barang jualan :"+asongan.getBarang());
		System.out.println("Macam-macam "+ asongan.getBarang());
		System.out.println("Id\tNama Barang\tHarga Beli\tHarga Jual\tKeuntungan");
		
		for (Map.Entry ulang : daftar.entrySet()) {
			int key = (int) ulang.getKey();
			BarangDagang buah = (BarangDagang) ulang.getValue();
			untung = buah.hargaJual-buah.hargaBeli;
			System.out.println(key+"\t"+buah.namaBarang+"\t\t"+buah.hargaBeli+"\t\t"+buah.hargaJual+"\t\t"+untung);
			keuntungan = keuntungan + untung;
		}
		System.out.println("Total keuntungan sebesar Rp." +keuntungan);
	}

}
