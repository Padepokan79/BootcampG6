public class JumlahArray{
	public static void main(String[] args) {
		//fahreja
		int[] arr1 = { 25,14,56,15,36,56,77,18,29,49 };
		int[] arr3 = { 2,39,47,14,36,56,57,49,43,79 };
		int[] arr4 = new int[10];

		System.out.println("Nilai Array 1: ");
		for (int angka : arr1) {
			System.out.print(angka + " ");
		}

		System.out.println();
		System.out.println("Nilai Array 3: ");
		for (int angka : arr3) {
			System.out.print(angka + " ");
		}

		System.out.println();
		System.out.println("Jumlah Array 1 dan Array 3 : ");

		for (int i = 0; i < arr4.length ; i++ ) {
			arr4[i] = arr1[i] + arr3[i];
			System.out.print(arr4[i] +" ");
		}
	}
}