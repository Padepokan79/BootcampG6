public class CopyArray{
	public static void main(String[] args) {
		//fahreja
		int[] arr1 = { 25,14,56,15,36,56,77,18,29,49 };
		int[] arr2 = new int[arr1.length];

		System.out.println("Array pertama: ");
		for (int angka : arr1) {
			System.out.print(angka + " ");
		}

		System.out.println();
		System.out.println("Array kedua : ");
		arr2 = arr1;

		for (int angka : arr2) {
			System.out.print(angka + " ");
		}
	}
}