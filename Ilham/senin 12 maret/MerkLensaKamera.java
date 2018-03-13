
public class MerkLensaKamera extends JenisLensaKamera {
	String merk = "SONY", tipe = "FE 85mm f/1.8", ukuran = "78 x 82 mm";
	int harga = 8000000, garansi = 1;
	
	
	void tambahMerkLensaKamera(String focalLength, String apertueMaks, String cropFactor, String mekanismeFocusing, String internalFocusing, String tipeLensaKamera, String jenisLensaKamera, String merk, String ukuran, int harga, String tipe, int garansi) {
		tambahJenisLensaKamera(focalLength, apertueMaks, cropFactor, mekanismeFocusing, internalFocusing, tipeLensaKamera, jenisLensaKamera);	
		this.merk = merk;
		this.ukuran = ukuran;
		this.harga = harga;
		this.tipe = tipe;
		this.garansi = garansi;
	}
	
	void tampilMerkLensaKamera() {
		System.out.println("Merk : " + merk);
		System.out.println("Tipe : " + tipe);
		System.out.println("Ukuran : " + ukuran);
		System.out.println("Harga Rp." + harga);
		System.out.println("Garansi " + garansi + " Tahun");
		tampilJenisLensaKamera();
	}
}
