import java.util.Random;

public class NomberTiga{
	public static void main(String[] args) {
		Random nilai = new Random();
		//Fahreja
		int[] array = new int[9];
		int indeks = 0;

		for (int i = 0; i < 9 ;i++ ) {
				array[i] = nilai.nextInt(10);
		}

		for (int i = 0 ; i < 3;i++ ) {
			for (int j = 0; j < 3;j++ ) {
				System.out.print(array[indeks]+ " ");
				indeks++;
			}
			System.out.println();
		}
	}
}