public class LatSoalArray11Yudhis {
	public static void main(String[] args) {

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int [] arr3 = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int [] temp = new int[arr1.length];

		// Inisialisasi variable
		int count, countTemp, indeks = 0;

		// Tampilan arr1 dan arr3
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

		System.out.print("\narr3 : ");
		for (int a3 : arr3) {
			System.out.print(a3 + " ");
		}

		// Proses pencarian duplikasi pada arr1
		for (int i = 0; i < arr1.length; i++) {

			count = 0;

			for (int a3 : arr3) {
				if (a3 == arr1[i]) {
					count++;
				}
			}

			if (count >= 1) {

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