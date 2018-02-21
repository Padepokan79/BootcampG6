import java.util.Scanner;

public class OctopusYudhis{
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variabel yg diperlukan
		String kata;
		int indexAwal = 0;

		// Proses pengulangan
		System.out.print("Masukkan string : "); kata = input.next();

		for (int i = 1; i <= kata.length(); i++) {
			System.out.println(kata.substring(indexAwal, i));
			indexAwal++;
		}
	}
}