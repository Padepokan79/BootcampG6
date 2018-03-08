import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int batas;
		String kalimat;

		System.out.print("\nMasukkan batas: ");
		batas = keyboard.nextInt();
		System.out.print("\nMasukkan Kalimat: ");
		kalimat = keyboard.next();

		int l = 0;
		int panjang = kalimat.length();

		System.out.println();

		for (int i = 1; i <= batas; i++) {
			for (int j = batas - 1; j >= i; j--) {
				System.out.println(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (l < panjang) {
					System.out.print(kalimat.substring(l, l + 1) + " ");
					l+=1;
				} else {
					break;
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}