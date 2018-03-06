import java.util.Scanner;

class LatSoal1Yudhis{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Batas : "); int batas = input.nextInt();

		boolean prima;

		for (int i = 1; i <= batas; i++) { // Pengulangan i hingga batas
			prima = true;
			for (int j = 2; j < i; j++) { // Pengulangan pembagi
				if (i % j == 0) {
					prima = false;
					break;
				}
			}
			if (prima == true) { // Kondisi apabila bilangan tersebut bil. prima
				System.out.print(i + " ");
			}
		}

		System.out.println();
	}
}