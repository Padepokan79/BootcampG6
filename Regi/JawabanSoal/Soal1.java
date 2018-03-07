import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int bil, pembagi, batas, i;

		System.out.print("\nBatas: ");
		batas = keyboard.nextInt();

		System.out.println();
		for (bil = 1; bil <= batas; bil++) {
			i = 0;
			for (pembagi = 2; pembagi <= bil; pembagi++) {
				if (bil % pembagi == 0) {
					if (bil != pembagi) {
						i = 1;
					}
					if (i == 0 && bil == pembagi) {
						System.out.print(bil + " ");
					}
				}
			}
		}
		System.out.println();
	}
}