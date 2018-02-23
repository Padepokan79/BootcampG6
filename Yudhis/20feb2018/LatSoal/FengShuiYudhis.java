import java.util.Scanner;

public class FengShuiYudhis {
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variable
		int nomor, indexAwal = 0;

		// Masukan
		System.out.print("Masukkan No. HP anda: "); nomor = input.next();

		// Proses persamaan String
		System.out.println();
		for (int i = 1; i <= nomor.length(); i++) {
			
			if (nomor.substring(indexAwal, i).equals("1")) {
				System.out.println("1 satu, satu-satunya, diri sendiri");
			} else if (nomor.substring(indexAwal, i).equals("2")) {
				System.out.println("2 mudah, gampang, tidak sulit");
			} else if (nomor.substring(indexAwal, i).equals("3")) {
				System.out.println("3 menemukan, mendapatkan, hidup");
			} else if (nomor.substring(indexAwal, i).equals("4")) {
				System.out.println("4 mati, miskin, susah");
			} else if (nomor.substring(indexAwal, i).equals("5")) {
				System.out.println("5 tidak akan, tidak pernah, tidak bisa");
			} else if (nomor.substring(indexAwal, i).equals("6")) {
				System.out.println("6 menuju, akan");
			} else if (nomor.substring(indexAwal, i).equals("7")) {
				System.out.println("7 tepat, hoki, atau bisa disebut juga ketuhanan");
			} else if (nomor.substring(indexAwal, i).equals("8")) {
				System.out.println("8 makmur");
			} else if (nomor.substring(indexAwal, i).equals("9")) {
				System.out.println("9 sukses");
			} else if (nomor.substring(indexAwal, i).equals("0")){
				System.out.println("0 khusus, special, langka");
			}

			indexAwal++;
		}
	}
}