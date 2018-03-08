//Fahreja
import java.util.Scanner;

public class Nomber1{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		int[] fibo = new int[0];
		int key=0;
		String input;

		do{
			System.out.print("Masukan jumlah urutan Fibonanci (5-100) :");
			input = nilai.next();

				if (input.matches("[0-9]*")) {
					if (Integer.parseInt(input) >= 5) {
						if (Integer.parseInt(input) <= 100) {

							fibo = new int[Integer.parseInt(input)];
							fibo[0]=1;
							fibo[1]=1;
							for (int i = 2; i < Integer.parseInt(input) ; i++ ) {
								fibo[i]=fibo[i-1]+fibo[i-2];
							}
							for (int angka : fibo) {
								System.out.print(angka+" ");
							}
							key =1;
							
						}else{
							System.out.println("Maaf, jumlah urutan tidak boleh lebih dari 100");
						}
					}else {
						System.out.println("Maaf, jumlah urutan tidak boleh kurang dari 5");
					}
				}else {
					System.out.println("Maaf, inputan Harus berupa angka");
				}
		}while (key != 1);	
	}
	
}