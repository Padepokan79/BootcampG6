import java.util.Scanner;

public class MengurutkanAngka2Yudhis {
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variable
		int [] arrAngka = new int[0];
		String rentetAngka;
		int temp, indeks = 0;

		// Masukan olahan angka yg akan disortir
		System.out.print("Masukkan angka : "); rentetAngka = input.next();
		
        // Penghitungan length arrAngka
        arrAngka = new int[(rentetAngka.length()/2 + rentetAngka.length()%2)];

		// Memasukkan nilai ke dalam arrAngka
        if (rentetAngka.length() % 2 == 0) {
            for (int i = 0; i < arrAngka.length; i++) {
                arrAngka[i] = Integer.valueOf(rentetAngka.substring(indeks, indeks+2));

                indeks += 2;
            }
        } else {
            for (int i = 0; i < arrAngka.length; i++) {
                if (i == (arrAngka.length-1)) {
                    arrAngka[i] = Integer.valueOf(rentetAngka.substring(indeks, indeks+1));
                } else {
                    arrAngka[i] = Integer.valueOf(rentetAngka.substring(indeks, indeks+2));
                }

                indeks += 2;
            }
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