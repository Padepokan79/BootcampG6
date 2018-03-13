
public class TiketKeretaApi {
	String tujuan, jenisKereta, berangkatDari, waktuBerangkat;
	int harga;
	
	TiketKeretaApi() {

	}
	
	TiketKeretaApi(String tujuanInput, String berangkatDariInput, String waktuBerangkatInput, String jenisKeretaInput, int hargaInput) {
		tujuan = tujuanInput;
		jenisKereta = jenisKeretaInput;
		berangkatDari = berangkatDariInput;
		waktuBerangkat = waktuBerangkatInput;
		harga = hargaInput;
	}
	
	void tambahTiketKeretaApi(String tujuanInput, String berangkatDariInput, String waktuBerangkatInput, String jenisKeretaInput, int hargaInput) {
		tujuan = tujuanInput;
		jenisKereta = jenisKeretaInput;
		berangkatDari = berangkatDariInput;
		waktuBerangkat = waktuBerangkatInput;
		harga = hargaInput;
	}
	
	void tampilTiketKeretaApi() {
		System.out.println("Tujuan\t:" + tujuan);
		System.out.println("Pemberangkatan\t:" + berangkatDari);
		System.out.println("Waktu\t:" + waktuBerangkat);
		System.out.println("Kelas\t:" + jenisKereta);
		System.out.println("Harga\t:" + harga);
		System.out.println();
	}
}
