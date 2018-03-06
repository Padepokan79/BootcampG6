import java.util.Scanner;

public class TukarNilai{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//fahreja
		int[] arr1 = { 25,14,56,15,36,56,77,18,29,49 };

		int posisi1,posisi2,nilai1 = 0,nilai2 = 0;

		System.out.println("Nilai Array : ");
		for (int angka : arr1) {
			System.out.print(angka + " ");
		}
		System.out.println();
		System.out.print("Masukan posisi pertama : ");
		posisi1 = keyboard.nextInt();

		System.out.println();
		System.out.print("Masukan posisi kedua : ");
		posisi2 = keyboard.nextInt();

		nilai1 = arr1[posisi1-1] ;
		nilai2 = arr1[posisi2-1];

		arr1[posisi1-1] = nilai2;
		arr1[posisi2-1] = nilai1;

		System.out.println();

		System.out.println("Tukar : ");
		for (int angka : arr1) {
			System.out.print(angka + " ");
		}
		
	}
	
}