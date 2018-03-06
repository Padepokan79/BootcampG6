import java.util.Scanner;

public class jawabanSoal9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int [] array = new int [0];

		int batas;

		System.out.print("Jumlah angka yg diinginkan ? "); batas = input.nextInt();

		array = new int [batas];

		for (int i = 0; i < batas; i++) {
			System.out.print("Angka " + (i+1) + " : "); array[i] = input.nextInt();
		}

		for (int a : array) {
			System.out.print(a + " ");
		}
	}
}