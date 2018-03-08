import java.util.Scanner;

public class NomberSatu{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		//Fahreja
		int batas;

		System.out.println("Masukan batas :");
		batas = nilai.nextInt();

		for (int i = 1 ; i <= batas ; i++ ) {
			boolean bilangan = true;

			for (int j = 2; j < i ; j++ ) {
				if (i%j == 0) {
					bilangan = false;
				}
			}

			if (bilangan == true) {
				System.out.print(i + " ");
			}
		}
	}
}

