//Fahreja
import java.util.Scanner;

public class Nomber2{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		int angka, key=0;
		String input;

		do{
			System.out.print("Masukan jumlah untuk segitiga paskal :");
			input = nilai.next();

				if (input.matches("[0-9]*")) {
					if (Integer.parseInt(input) >= 2) {
						if (Integer.parseInt(input) <= 20) {

							for (int i = 0; i < Integer.parseInt(input) ;i++ ) {
								angka=1;
								for (int j = 0; j <= i ; j++ ) {
									System.out.print(angka+" ");
									angka = angka * (i-j) / (j+1);
								}System.out.println();
							}
							key =1;
							
						}else{
							System.out.println("Maaf, jumlah baris tidak boleh lebih dari 20");
						}
					}else {
						System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2");
					}
				}else {
					System.out.println("Maaf, inputan Harus berupa angka");
				}
		}while (key != 1);	
	}
	
}