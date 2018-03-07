import java.util.Scanner;
	
public class jawabanSoal5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int batas, angka;

		do {
			System.out.print("Batas : "); batas = input.nextInt();
			
			if (batas > 5) {
				System.out.println("Batas tidak boleh melebihi 5.");
			}
		} while (batas > 5);
		
		for (int i = 0; i <= batas; i++) {
			angka = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(angka + " ");
				angka = angka * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}