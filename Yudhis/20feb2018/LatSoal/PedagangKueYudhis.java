public class PedagangKueYudhis {
	public static void main(String[] args) {
		
		// Inisialisasi variabel
		int kue = 200;

		for (int i = 15; i <= ((7 * 60) + 30); i += 15){
			kue = kue - 3;
		}

		System.out.println("Kue yg tersisa : " + kue);
	}
}