public class jawabanSoal10 {
	public static void main(String[] args) {
		int [] array = {0, 0, 80, 49, 0, 13, 57, 0, 0, 61, 0, 72, 0, 34, 26};

		int temp;

		for (int a : array ) {
			System.out.print(a + " ");
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j] && array[j] != 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		System.out.println();

		for (int a : array ) {
			System.out.print(a + " ");
		}
	}
}