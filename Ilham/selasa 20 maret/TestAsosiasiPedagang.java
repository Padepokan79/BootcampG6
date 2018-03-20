import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestAsosiasiPedagang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barang pensil = new Barang("Pensil", 10000, 5000);
		Barang pulpen = new Barang("Pulpen", 15000, 7000);
		Barang buku = new Barang("Buku", 30000, 20000);
		Barang penghapus = new Barang("Penghapus", 5000, 2000);
		Barang tipeX = new Barang("Tipe-X", 11000, 5000);
		Barang sosro = new Barang("Teh Botol Sosro", 5000, 4000);
		Barang tehPucuk = new Barang("Teh Pucuk", 5000, 3000);
		
		Pedagang tukangFotoCopy = new Pedagang("Udin", "Bandung");
		Pedagang minuman = new Pedagang("Entis", "Jakarta");

		ArrayList<Barang> barangTukangFotoCopy = new ArrayList<Barang>();
		barangTukangFotoCopy.add(pensil);
		barangTukangFotoCopy.add(pulpen);
		barangTukangFotoCopy.add(penghapus);
		barangTukangFotoCopy.add(tipeX);
		barangTukangFotoCopy.add(buku);
		
		ArrayList<Barang> barangMinuman = new ArrayList<Barang>();
		barangMinuman.add(sosro);
		barangMinuman.add(tehPucuk);
		

		setObjekBarang(barangMinuman, minuman);
		tampilData(minuman);
		
		setObjekBarang(barangTukangFotoCopy, tukangFotoCopy);
		tampilData(tukangFotoCopy);
		

	}

	public static void setObjekBarang(ArrayList<Barang> array, Pedagang objek) {
		for (Barang barang : array) {
			objek.setBarang(barang);
		}
	}
	
	public static void tampilData(Pedagang objek) {
		long totalKeuntungan = 0;
		
		System.out.println("Nama Pedagang " + objek.getNamaPedagang());
		System.out.println("Alamat Pedagang " + objek.getAlamatPedagang());
		System.out.println("Barang yang Di jual: ");
		for (Map.Entry<String, Barang> bentry:objek.getBarang().entrySet()) {
			String namaBarang = bentry.getKey();
			Barang barang = bentry.getValue();
			System.out.println(barang.getNamaBarang() + " \t" + barang.getHargaJual() + " \t" + barang.getHargaBeli());
			System.out.println("Keuntungan : " + (barang.getHargaJual()-barang.getHargaBeli()));
			totalKeuntungan += barang.getHargaJual()-barang.getHargaBeli();
		}
		System.out.println("Total Keuntungan : " + totalKeuntungan);
		System.out.println();
	}
}
