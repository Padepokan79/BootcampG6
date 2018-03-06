public class jawabanSoal15 {
	public static void main(String[] args) {
		int [] numbers = {3, -4, 2, 1, 0, -8, -12, 11, 200, -34, 21};

		System.out.print("Array : ");
		for (int n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println();

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.print(numbers[i] + " ");
			}
		}
	}
}