public class LatSoalArray14Yudhis {
	public static void main(String[] args) {

		// Inisialisasi array
		int [] arr1 = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		// Inisialisasi variable
		int temp = 0;

		// Tampilan arr1 dan sortir nilai minimum arr1
		System.out.print("arr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

		for (int i = 0; i < arr1.length-1; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    temp = arr1[j];
                    arr1[j] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }

		// Tampilan hasil nilai sortir
		System.out.print("\narr1 : ");
		for (int a1 : arr1) {
			System.out.print(a1 + " ");
		}

	}
}