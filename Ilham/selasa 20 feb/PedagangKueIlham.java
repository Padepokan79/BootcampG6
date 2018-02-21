public class PedagangKueIlham {
	public static void main(String[] args) {
		int waktu, kue = 200;

		for (waktu = 15; waktu <= 450; waktu += 15) {
			kue -= 3;
		}
		System.out.println("Jumlah sisa kue yang tersisa adalah " + kue);
	}
}