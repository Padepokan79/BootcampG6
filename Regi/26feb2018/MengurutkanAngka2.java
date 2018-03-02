import java.util.Scanner;

public class MengurutkanAngka2 {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		String angka;
		int index = 0, temp = 0, length;
		int[] arr1;
		
		System.out.println( "\nMengurutkan Angka " );
		System.out.print( "\nMasukan no: " );
		angka = keyboard.next();

		// kondisi membuat length dari panjang inputan
		if ( angka.length() % 2 == 0 ) {
			length = angka.length() / 2;
		}
		else {
			length = angka.length() / 2 + 1;
		}
		arr1 = new int[length];

		// substring inputan dan jadikan array
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			if ( length % 2 == 1 && ( index + 1 ) == angka.length() ) {
				arr1[i] = ( Integer.parseInt ( angka.substring(index, index + 1) ) );
			}
			else {
				arr1[i] = ( Integer.parseInt ( angka.substring(index, index + 2) ) );
			}
			index += 2;
		}

		// menampilkan arr1 hasil substring
		System.out.print("\nArr1: ");
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}

		// proses mengurutkan dari kecil ke besar
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

		// menampilkan hasil urutan dari kecil ke besar
		System.out.print("\nArr1 hasil pengurutan dari kecil ke besar: ");
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}

		// proses mengurutkan dari besar ke kecil
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			for ( int j = arr1.length - 1 ; j > i ; j -- ) {
				if ( arr1[j] > ( arr1[j - 1] ) ) {
					temp = arr1[j];
					arr1[j] = arr1[j - 1];
					arr1[j - 1] = temp;	
				}
			}
		}
		System.out.println();

		// menampilkan hasil urutan dari besar ke kecil
		System.out.print("\nArr1 hasil pengurutan dari besar ke kecil: ");
		for ( int i = 0 ; i < arr1.length ; i ++ ) {
			System.out.print( arr1[i] + " " );
		}
		System.out.println();
	}
}