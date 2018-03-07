import java.util.Scanner;

public class jawabanSoal11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int nilai;

		for (int a : array) {
			System.out.print(a + " ");
		}

		System.out.print("\nMasukkan nilai : "); nilai = input.nextInt();

		System.out.println("Hasil : " + nilai + " adalah kombinasi dari");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] + array[j] == nilai && array[i] == array[j]) {
					System.out.print(array[i] + " dan " + array[j]);
					System.exit(0);		
				} else if (array[i] + array[j] == nilai && array[j] - array[i] == 1) {
					System.out.print(array[i] + " dan " + array[j]);
					System.exit(0);		
				} else if (array[i] + array[j] == nilai) {
					System.out.print(array[i] + " dan " + array[j] + ", ");
				}
			}
		}

	}
}