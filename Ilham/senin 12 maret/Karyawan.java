
public class Karyawan {
	int noId;
	String nama;
	float gaji;
	
	void karyawan(int id, String nm, float gj) {
		noId = id;
		nama = nm;
		gaji = gj;
	}
	
	void tampilkan() {
		System.out.println(noId + " " + nama + " " + gaji);
	}
}
