import java.util.Scanner;

public class SoalNo8{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int angka;

		System.out.print("Input Angka: ");
		angka = input.nextInt();

		for(int i = 0 ; i < angka ; i++){
			for(int j = 0 ; j < angka ; j++){
				if(j >= i){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
	}
}