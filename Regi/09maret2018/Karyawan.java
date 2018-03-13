
public class Karyawan {
	int id;
	String nama;
	float gapok;
	
	Karyawan(int nip, String namaKaryawan, float gajiPokok){
		id  = nip;
		nama = namaKaryawan;
		gapok = gajiPokok;
	}
	
	void hasil() {
		System.out.println(id + " " + nama + " " + gapok);
	}
	
}
