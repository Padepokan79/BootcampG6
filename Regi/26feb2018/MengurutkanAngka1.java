import java.util.Scanner;

public class MengurutkanAngka1 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		String angka;
		int awal, akhir = 1, temp = 0;
		int[] arr1;
		
		System.out.println( "\nMengurutkan Angka " );
		System.out.print( "\nMasukan no: " );
		angka = keyboard.next();
		arr1 = new int[angka.length()];

		for ( awal = 0 ; awal < angka.length() ; awal++ ) {
			arr1[awal] = ( Integer.parseInt ( angka.substring(awal,akhir) ) );
			akhir++;
		}

		System.out.print("\nArr1: ");
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}

		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			for ( int j = i + 1 ; j < arr1.length ; j ++ ) {
				if ( arr1[i] > ( arr1[j] ) ) {
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;	
				}
			}
		}
		System.out.println();

		System.out.print("\nArr1 hasil pengurutan: ");
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}
		System.out.println();
	}
}