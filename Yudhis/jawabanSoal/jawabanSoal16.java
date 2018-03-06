public class jawabanSoal16 {
	public static void main(String[] args) {
		int [] array = {2, 6, 8, 6, 8, 10};

		int indeks = 0;

		System.out.print("Array : ");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (indeks < array.length) {
					System.out.print(array[indeks] + " ");
				    indeks++;
				}
			}
			System.out.println();
		}
	}
}