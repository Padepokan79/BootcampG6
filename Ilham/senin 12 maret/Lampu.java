
public class Lampu {
	String[] lampu = new String[3];
	
	Lampu() {
		
	}
	
	String[] tambahLampu(String jenis, String status, String warna) {
		lampu[0] = jenis;
		lampu[1] = status;
		lampu[2] = warna;
		
		return lampu;
	}
	
	void tampilLampu(String[] arr) {
		for (String n : arr) {
			System.out.print(n + " ");
		}
	}
}


