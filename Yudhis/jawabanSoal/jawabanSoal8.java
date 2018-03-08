import java.util.Scanner;

public class jawabanSoal8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int batas;

		System.out.print("Batas : "); batas = input.nextInt();

		for (int i = 0; i < batas; i++) {
			for (int j = batas-1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}