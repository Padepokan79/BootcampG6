public class LatSoalArray8Yudhis {
	public static void main(String[] args) {

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		// Inisialisasi variable
		int nilaiMin = 0;

		// Tampilan arr1 dan pencarian nilai minimum arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
			if (nilaiMin == 0) {
				nilaiMin = a1;
			} else if (nilaiMin > a1) {
				nilaiMin = a1;
			}
		}

		// Tampilan hasil nilai minimum
		System.out.print("\nNilai minimum arr1 adalah " + nilaiMin);

	}
}