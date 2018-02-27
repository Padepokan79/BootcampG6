public class UrutanArray{
	public static void main(String[] args) {
		//fahreja
		int[] arr1 = { 25,14,56,15,36,56,77,18,29,49 };
		int temp = 0;

		System.out.println("Array pertama: ");
		for (int angka : arr1) {
			System.out.print(angka + " ");
		}

		for (int i = 0; i < arr1.length ; i++ ) {
			for (int j = arr1.length-1; j > i ; j-- ) {
				if (arr1[j] < arr1[j-1]) {
					temp = arr1[j];
					arr1[j] = arr1[j-1];
					arr1[j-1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ururtan terendah: ");
		for (int angka : arr1) {
			System.out.print(angka + " ");
		}
	}
}

