
public class JenisLensaKamera extends TipeLensaKamera {
	String jenisLensaKamera = "Prime Lens/Fix Lens";

	void tambahJenisLensaKamera(String focalLength, String apertueMaks, String cropFactor, String mekanismeFocusing, String internalFocusing, String tipeLensaKamera, String jenisLensaKamera) {
		tambahTipeLensaKamera(focalLength, apertueMaks, cropFactor, mekanismeFocusing, internalFocusing, tipeLensaKamera);	
		this.jenisLensaKamera = jenisLensaKamera;
	}	
	
	void tampilJenisLensaKamera() {
		System.out.println("Jenis Lensa Kamera : " + jenisLensaKamera);
		tampilTipeLensaKamera();
	}
}
