
public class AlatMakanDewasa extends AlatMakanAsal{
	String caraMenggunakan;
	
	void displayPenggunaan() {
		System.out.println("Alat makan untuk orang dewasa");
		displayAlatMakanAsal();
		System.out.println("Cara Menggunakan: "+caraMenggunakan);
	}
}
