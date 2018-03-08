import java.util.Scanner;

public class jawabanSoal4 {
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);
		
		// Inisialisasi variable
		int [] deretAngka = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int [] temp = new int [0];
		int shift = 0, indeks = 0, indeksBelakang = 0;
		boolean inputBenar = false;

		System.out.print("{ ");
		for (int d : deretAngka) {
			System.out.print(d + " ");
		}
		System.out.print("}\n");

		// Input posisi shift
		while (inputBenar == false) {
			System.out.print("Shift ke kiri Sebanyak : "); String strShift = input.nextLine();

			if (strShift.matches("[ ]*") && strShift.length() == 1) {
				System.out.println("Anda belum memasukkan shift.");
				System.out.println("Silahkan input kembali.");
			} else if (strShift.length() == 0) {
				System.out.println("Anda belum memasukkan shift.");
				System.out.println("Silahkan input kembali.");
			} else if (strShift.matches("[0-9-]*")) {
				if (Integer.valueOf(strShift) <= 10 && Integer.valueOf(strShift) >= 1) {
					shift = shift + Integer.valueOf(strShift);

					inputBenar = true;
				} else if (Integer.valueOf(strShift) > 10) {
					System.out.println("Maaf, Pergeseran tidak boleh lebih dari 10.");
					System.out.println("Silahkan input kembali.");
				} else {
					System.out.println("Maaf, Pergeseran tidak boleh kurang dari 1.");
					System.out.println("Silahkan input kembali.");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
			}
		}

		// Set panjang array temp
		temp = new int [shift];

		// Memasukkan nilai ke array temp
		for (int i = 0; i < shift; i++) {
			temp[i] = deretAngka[i];
		}

		// Set indeks re-insert nilai deretAngka
		indeks = indeks + shift;

		// Re-insert nilai array deretAngka 
		for (int i = 0; i < deretAngka.length; i++) {
			if (indeks > deretAngka.length-1) {
				deretAngka[i] = temp[indeksBelakang];
				indeksBelakang++;
			} else {
				deretAngka[i] = deretAngka[indeks];
				indeks++;
			}
		}

		for (int d : deretAngka) {
			System.out.print(d + " ");
		}
	}
}