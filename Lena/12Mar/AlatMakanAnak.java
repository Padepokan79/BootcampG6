
public class AlatMakanAnak extends AlatMakanAsal{
	String caraMenggunakan;
	
	void displayPenggunaan() {
		System.out.println("Alat makan untuk anak-anak");
		displayAlatMakanAsal();
		System.out.println("Cara Menggunakan: "+caraMenggunakan);
	}
}
