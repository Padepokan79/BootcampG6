import java.util.Random;

public class LatSoal3Yudhis {
	public static void main(String[] args) {

		Random rand = new Random();

		int [] array = new int [9];
		int indeks = 0;

		for (int i = 0; i < 9; i++) { // Memasukkan nilai acak
			array[i] = rand.nextInt(10);
		}

		for (int i = 0; i < 3; i++) { // Membuat baris 
			for (int j = 0; j < 3; j++) { // Membuat kolom
				System.out.print(array[indeks] + " ");
				indeks++; 
			}

			System.out.println();
		}
	}
}