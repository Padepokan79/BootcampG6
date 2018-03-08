import java.util.Random;

public class Soal3 {
	public static void main(String[] args) {

		Random rand = new Random();

		int[] array1 = new int [9];
		int x = 0;

		System.out.println();
		for (int i = 0; i < 9; i++) {
			array1[i] = rand.nextInt(10);
		}

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(array1[x] + " ");
				x++;
			}
			System.out.println();
		}
		System.out.println();
	}
}