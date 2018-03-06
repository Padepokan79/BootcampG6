import java.util.Scanner;

public class MengurutkanAngkaYudhis {
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variable
		int [] arrAngka = new int[0];
		String rentetAngka;
		int temp;

		// Masukan olahan angka yg akan disortir
		System.out.print("Masukkan angka : "); rentetAngka = input.next();
		arrAngka = new int[rentetAngka.length()];

		// Memasukkan nilai ke dalam arrAngka
		for (int i = 0; i < rentetAngka.length(); i++) {
			arrAngka[i] = Integer.valueOf(rentetAngka.substring(i, i+1));
		}

		// Mengurutkan dari terbesar
		for (int i = 0; i < arrAngka.length-1; i++) {
            for (int j = i+1; j < arrAngka.length; j++) {
                if (arrAngka[i] < arrAngka[j]) {
                    temp = arrAngka[j];
                    arrAngka[j] = arrAngka[i];
                    arrAngka[i] = temp;
                }
            }
        }

        System.out.print("\nUrutan dari yg terbesar : ");
        for (int a : arrAngka) {
        	System.out.print(a + " ");
        }

        // Mengurutkan dari terkecil
		for (int i = 0; i < arrAngka.length-1; i++) {
            for (int j = i+1; j < arrAngka.length; j++) {
                if (arrAngka[i] > arrAngka[j]) {
                    temp = arrAngka[j];
                    arrAngka[j] = arrAngka[i];
                    arrAngka[i] = temp;
                }
            }
        }

        System.out.print("\n\nUrutan dari yg terkecil : ");
        for (int a : arrAngka) {
        	System.out.print(a + " ");
        }

	}
}