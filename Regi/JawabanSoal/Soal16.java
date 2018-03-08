public class Soal16 {
	public static void main(String[] args) {
		int[] array1 = { 2, 6, 8, 6, 8, 10 };

		int index = 0;

		System.out.println();
		System.out.println("\nOriginal Array: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		System.out.println("\nDengan output: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (index < array1.length) {
					System.out.print(array1[index] + " ");
				    index++;
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}