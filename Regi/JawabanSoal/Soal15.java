public class Soal15 {
	public static void main(String[] args) {
		int[] numbers = { 3, -4, 2, 1, 0, -8, -12, 11, 200, -34, 21 };

		System.out.println("\nOriginal Array: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		System.out.println();
		System.out.println("\nTampilkan hanya bilangan negatif!");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
	}
}