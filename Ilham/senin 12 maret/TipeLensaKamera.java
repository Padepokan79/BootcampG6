
public class TipeLensaKamera extends LensaKamera {
	String tipeLensaKamera = "FE";
	
	void tambahTipeLensaKamera(String focalLength, String apertueMaks, String cropFactor, String mekanismeFocusing, String internalFocusing, String tipeLensaKamera) {
		tambahLensaKamera(focalLength, apertueMaks, cropFactor, mekanismeFocusing, internalFocusing);	
		this.tipeLensaKamera = tipeLensaKamera;
	}
	
	void tampilTipeLensaKamera() {
		System.out.println("Tipe Lensa Kamera : " + tipeLensaKamera);
		tampilLensaKamera();
	}
}
