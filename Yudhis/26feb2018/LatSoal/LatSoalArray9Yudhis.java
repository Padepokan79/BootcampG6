public class LatSoalArray9Yudhis {
	public static void main(String[] args) {

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		// Inisialisasi variable
		int nilaiMax = 0;

		// Tampilan arr1 dan pencarian nilai maksimum arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
			if (nilaiMax == 0) {
				nilaiMax = a1;
			} else if (nilaiMax < a1) {
				nilaiMax = a1;
			}
		}

		// Tampilan hasil nilai maksimum
		System.out.print("\nNilai maksimum arr1 adalah " + nilaiMax);

	}
}