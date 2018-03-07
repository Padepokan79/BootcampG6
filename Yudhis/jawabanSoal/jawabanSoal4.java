import java.util.Scanner;

public class jawabanSoal4 {
	public static void main(String[] args) {
		int batasTengah = 5, pointer = 1;

		for (int i = 1; i <= 5; i++) {
			for (int j = batasTengah-1; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= pointer; k++) {
				if (i == 1) {
					System.out.print("*");
				} else if (k == 1 || k == pointer) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}		
			}

			batasTengah--;
			pointer+=2;
			System.out.println();
		}

		batasTengah = 1;
		pointer = 7;

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= pointer; k++) {
				if (i == 4) {
					System.out.print("*");
				} else if (k == 1 || k == pointer) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}		
			}

			batasTengah++;
			pointer-=2;
			System.out.println();
		}
	}
}