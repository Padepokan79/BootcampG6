
public class LensaKamera {
	String focalLength = "85mm", apertureMaks = "f/1.8", cropFactor = "1.5x", 
			mekanismeFocusing = "SSM", internalFocusing = "CPL";
	
	public LensaKamera() {
		// TODO Auto-generated constructor stub
	}
	
	void tambahLensaKamera(String focalLength, String apertueMaks, String cropFactor, String mekanismeFocusing, String internalFocusing) {
		this.focalLength = focalLength;
		this.apertureMaks = apertueMaks;
		this.cropFactor = cropFactor;
		this.mekanismeFocusing = mekanismeFocusing;
		this.internalFocusing = internalFocusing;
	}
	
	void tampilLensaKamera() {
		System.out.println("Spesifikasi: ");
		System.out.println("Focal Length :" + focalLength);
		System.out.println("Aperture Maksimal : " + apertureMaks);
		System.out.println("Crop Factor : " + cropFactor);
		System.out.println("Mekasime Focusing : " + mekanismeFocusing);
		System.out.println("Internal Focusing : " + internalFocusing);
	}
}
