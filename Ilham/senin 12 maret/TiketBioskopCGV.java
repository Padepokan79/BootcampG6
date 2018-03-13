
public class TiketBioskopCGV {
	int harga, noStudio;
	String waktu, noKursi, judulFilm, alamatBioskop;
	
	TiketBioskopCGV() {
		// TODO Auto-generated constructor stub
	}
	
	TiketBioskopCGV(String judulFilmInput, String waktuInput, String alamatBioskopInput, String noKursiInput, int noStudioInput, int hargaInput) {
		judulFilm = judulFilmInput;
		waktu = waktuInput;
		alamatBioskop = alamatBioskopInput;
		noKursi = noKursiInput;
		noStudio = noStudioInput;
		harga = hargaInput;
	}

	void tambahTiketBioskopCGV(String judulFilmInput, String waktuInput, String alamatBioskopInput, String noKursiInput, int noStudioInput, int hargaInput) {
		judulFilm = judulFilmInput;
		waktu = waktuInput;
		alamatBioskop = alamatBioskopInput;
		noKursi = noKursiInput;
		noStudio = noStudioInput;
		harga = hargaInput;
	}

	void tampilTiketBioskopCGV() {
		System.out.println("Judul\t:" + judulFilm);
		System.out.println("Waktu\t:" + waktu);
		System.out.println("Alamat\t:" + alamatBioskop);
		System.out.println("Kursi\t:" + noKursi);
		System.out.println("Studio\t:" + noStudio);
		System.out.println("Harga\t:" + harga);
		System.out.println();
	}
	
}

