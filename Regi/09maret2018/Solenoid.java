
public class Solenoid {
	int ukuran, voltase;
	String material, power, implementasi;
	
	public Solenoid() {
		// TODO Auto-generated constructor stub
	}
	
	Solenoid(int u, int v, String m, String p, String i) {
		ukuran = u;
		voltase = v;
		material = m;
		power = p;
		implementasi = i;
	}
	
	void inputData(int u, int v, String m, String p, String i) {
		ukuran = u;
		voltase = v;
		material = m;
		power = p;
		implementasi = i;
	}
	
	void tampilData() {
		System.out.println("\nSolenoid");
		System.out.println("Ukuran = " + ukuran);
		System.out.println("Voltase = " + voltase);
		System.out.println("Material = " + material);
		System.out.println("Power = " + power);
		System.out.println("Implementasi = " + implementasi);
	}
}
