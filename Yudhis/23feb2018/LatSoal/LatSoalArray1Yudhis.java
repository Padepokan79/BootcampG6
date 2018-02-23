public class LatSoalArray1Yudhis {
	public static void main(String[] args) {

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		// Inisialisasi variable
		double totArr1 = 0, rerataArr1;

		// Penghitungan array 
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			totArr1 = totArr1 + a1;
			System.out.print(a1 + " ");
		}

		// Penghitungan rata-rata
		rerataArr1 = totArr1 / arr1.length;

		System.out.println("\nJumlah dari arr1 adalah " + totArr1);
		System.out.println("Rata-rata dari arr1 adalah " + rerataArr1);

	}
}