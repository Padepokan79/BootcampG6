import java.util.Scanner;

public class SoalNo8{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int angka;

		System.out.println("8. Buatlah sebuah tampilan # membentuk tangga.\n");
		System.out.print(">> Input Angka: ");
		angka = input.nextInt();

		for(int i = 0 ; i < angka ; i++){
			for(int j = 0 ; j < angka ; j++){
				if(i+j >= angka-1){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
}