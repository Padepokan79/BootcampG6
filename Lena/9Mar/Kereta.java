
public class Kereta {
	String namaKereta, jenisGerbong, asal, tujuan, tanggalPerjalanan, jamBerangkat, jamSampai, noKursi;
	int noGerbong, waktuTempuh, jarakTempuh;
	
	public Kereta() {
		// TODO Auto-generated constructor stub
	}
	
	Kereta(String nama, String asl, String tuj, String tgl, String jBrgkt, String jTiba, int wktTempuh, int jarak, String jnsGrbg, int noGrbg, String noKrs){
		namaKereta = nama;
		asal = asl;
		tujuan = tuj;
		tanggalPerjalanan = tgl;
		jamBerangkat = jBrgkt;
		jamSampai = jTiba;
		waktuTempuh = wktTempuh;
		jarakTempuh = jarak;
		jenisGerbong = jnsGrbg;
		noGerbong = noGrbg;
		noKursi = noKrs;
	}
	
	void insertRecord(String nama, String asl, String tuj, String tgl, String jBrgkt, String jTiba, int wktTempuh, int jarak, String jnsGrbg, int noGrbg, String noKrs){
		namaKereta = nama;
		asal = asl;
		tujuan = tuj;
		tanggalPerjalanan = tgl;
		jamBerangkat = jBrgkt;
		jamSampai = jTiba;
		waktuTempuh = wktTempuh;
		jarakTempuh = jarak;
		jenisGerbong = jnsGrbg;
		noGerbong = noGrbg;
		noKursi = noKrs;
	}
	
	void display() {
		System.out.println("KERETA API");
		System.out.println("Nama Kereta Api: "+namaKereta);
		System.out.println("Asal Perjalanan: "+asal);
		System.out.println("Tujuan Perjalanan: "+tujuan);
		System.out.println("Tanggal Perjalanan: "+tanggalPerjalanan);
		System.out.println("Waktu perkiraan berangkat: "+jamBerangkat);
		System.out.println("Waktu perkiraan tiba: "+jamSampai);
		System.out.println("Waktu tempuh: "+waktuTempuh+" jam");
		System.out.println("Jarak tempuh: "+jarakTempuh+" km");
		System.out.println("Tempat duduk: "+jenisGerbong+noGerbong+" "+noKursi);
		System.out.println();
	}
}
