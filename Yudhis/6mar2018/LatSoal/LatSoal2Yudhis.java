import java.util.Scanner;

class LatSoal2Yudhis{
	public static void main(String args []){
		Scanner inpa = new Scanner(System.in);
		Scanner inpb = new Scanner(System.in);

		System.out.print("Batas segitiga : "); int batas = inpa.nextInt();
		System.out.print("Kalimat : "); String kata = inpb.nextLine();

		int pjgkata = kata.length();
		int pointer = 0;

		System.out.println();

		for (int i = 1; i <= batas; i++) {
			for (int k = batas-1; k >= i; k--) { // Membuat spasi
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { // Menampilkan indeks berurut
				if (pointer < pjgkata) {
					System.out.print(kata.substring(pointer, pointer+1) + " ");
					pointer+=1;
				} else {
					break;
				}
			}
			System.out.println();
		}
	}
}