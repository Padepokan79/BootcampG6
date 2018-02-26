public class LatSoalArray10Yudhis {
	public static void main(String[] args) {

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] temp = new int[arr1.length];

		// Inisialisasi variable
		int count, countTemp, indeks = 0;

		// Tampilan arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

		// Proses pencarian duplikasi pada arr1
		for (int i = 0; i < arr1.length; i++) {

			count = 0;

			for (int a1 : arr1) {
				if (a1 == arr1[i]) {
					count++;
				}
			}

			if (count > 1) {

				if (temp[0] == 0) {

					temp[0] = arr1[i]; 
					indeks++;

				} else {

					count = 0;

					for (int t : temp) {
						if (t == arr1[i]) {
							count++;
						}
					}

					if (count != 1) {
						temp[indeks] = arr1[i];
						indeks++;
					}

				}

			}
			
		}

		System.out.print("\nBilangan duplikasi : ");
		for (int t : temp) {
			if (t != 0) {
				System.out.print(t + " ");
			}
		}
	}
}