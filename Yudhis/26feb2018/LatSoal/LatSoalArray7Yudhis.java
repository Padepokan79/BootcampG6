public class LatSoalArray7Yudhis {
	public static void main(String[] args) {

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr2 = new int[10];

		// Tampilan arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

		// Penyalinan array arr1 ke arr2
		arr2 = arr1;

		// Tampilan arr2 hasil
		System.out.print("\narr2 : ");
		for (int a2 : arr2) {
			System.out.print(a2 + " ");
		}

	}
}