
public class Kucing {
	String namaKucing, namaPemilik, jenis, warnaBadan, warnaMata, jenisKelamin;
	int umur;
	double berat;
	
	public Kucing() {
		// TODO Auto-generated constructor stub
	}
	
	Kucing(String nmKucing, String nmPemilik, String jns,  String bdn, String mt, String jk, int u, double brt){
		namaKucing = nmKucing;
		namaPemilik = nmPemilik;
		jenis = jns;
		warnaBadan = bdn;
		warnaMata = mt;
		jenisKelamin = jk;
		umur = u;
		berat = brt;
	}
	
	void insertRecord(String nmKucing, String nmPemilik, String jns,  String bdn, String mt, String jk, int u, double brt){
		namaKucing = nmKucing;
		namaPemilik = nmPemilik;
		jenis = jns;
		warnaBadan = bdn;
		warnaMata = mt;
		jenisKelamin = jk;
		umur = u;
		berat = brt;
	}
	
	void display() {
		System.out.println("KUCING");
		System.out.println("Nama: "+namaKucing);
		System.out.println("Pemilik: "+namaPemilik);
		System.out.println("Umur: "+umur+" tahun");
		System.out.println("Jenis: "+jenis);
		System.out.println("Jenis Kelamin: "+jenisKelamin);
		System.out.println("Warna Badan: "+warnaBadan);
		System.out.println("Warna Bola Mata: "+warnaMata);
		System.out.println("Berat badan: "+berat+" kg");
		System.out.println();
		
	}
}
