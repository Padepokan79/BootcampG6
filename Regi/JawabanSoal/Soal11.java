import java.util.Scanner;

public class Soal11 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[] array1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
      	int nilai;

      	System.out.println("\nOriginal Array: \n");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println();
		System.out.print("\nMasukkan Nilai: ");
		nilai = keyboard.nextInt();

		System.out.println();
		System.out.println(nilai + " adalah kombinasi dari: ");

		System.out.println();
		for (int j = 0; j < array1.length; j++) {
			for (int k = 0; k < array1.length; k++) {
				if (array1[j] + array1[k] == nilai && array1[j] == array1[k]) {
					System.out.print(array1[j] + " dan " + array1[k]);
					System.exit(0);
				}
				else if (array1[j] + array1[k] == nilai && array1[k] - array1[j] == 1) {
					System.out.print(array1[j] + " dan " + array1[k]);
					System.exit(0);
				}
				else if (array1[j] + array1[k] == nilai) {
					System.out.print(array1[j] + " dan " + array1[k] + ", ");
				}
			}
		}
	}
}