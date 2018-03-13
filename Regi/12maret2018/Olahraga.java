
public class Olahraga {
	String jenis, status, cabang, manfaat;
	
	public Olahraga() {
		// TODO Auto-generated constructor stub
	}
	
	Olahraga(String j, String s, String c, String m) {
		jenis = j;
		status = s;
		cabang = c;
		manfaat = m;
	}
	
	void tampilData() {
		System.out.println("\nJenis : " + jenis);
		System.out.println("Status : " + status);
		System.out.println("Cabang : " + cabang);
		System.out.println("Manfaat : " + manfaat);
	}
}
