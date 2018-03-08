import java.util.Scanner;

public class SoalQuiz4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] temp = new int [10];
		String shift = "";
		boolean benar = false;
		int s = 0;

		System.out.println();
		for (int a = 0; a < deretAngka.length; a++) {
			System.out.print( deretAngka[a] + " " );
		}
		System.out.println();

		System.out.print("\nShift ke kiri sebanyak: ");
			shift = keyboard.nextLine();

		while(benar == false){
			if (shift.matches("[A-Za-z.,\\s]*")) {
				System.out.println("\nMaaf, input yang diterima hanya berupa angka.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nShift ke kiri sebanyak: ");
				shift = keyboard.nextLine();
			}
			else if (Integer.parseInt(shift) < 1) {
				System.out.println("\nPergeseran tidak boleh kurang dari 1.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nShift ke kiri sebanyak: ");
				shift = keyboard.nextLine();
			}
			else if (Integer.parseInt(shift) > 10) {
				System.out.println("\nMaaf, Pergeseran tidak boleh lebih dari 10.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nShift ke kiri sebanyak: ");
				shift = keyboard.nextLine();
			}
			else {
				benar = true;
				s = Integer.parseInt(shift);
				System.out.println();
				for (int a = 0; a < deretAngka.length; a++) {
					if ((a - s) < 0) {
						temp[deretAngka.length + a - s] = deretAngka[a];
					}
					else {
						temp[a - s] = deretAngka[a];
					}
				}
				deretAngka = temp;
			}
		}

		for (int a = 0; a < deretAngka.length; a++) {
			System.out.print( deretAngka[a] + " " );
		}
		System.out.println();
	}
}