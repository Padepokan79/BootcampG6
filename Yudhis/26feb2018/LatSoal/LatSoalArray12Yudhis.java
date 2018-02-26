public class LatSoalArray12Yudhis {
	public static void main(String[] args) {
		
		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 77};
		int [] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int [] arr4 = new int[10];

		// Tampilan arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

		// Tampilan arr3
		System.out.print("\narr3 : ");
		for (int a3 : arr3) {
			System.out.print(a3 + " ");
		}

		// Proses penjumlahan arr1 + arr3
		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = arr1[i] + arr3[i];
		}

		// Tampilan arr4
		System.out.print("\narr4 : ");
		for (int a4 : arr4) {
			System.out.print(a4 + " ");
		}
	}
}