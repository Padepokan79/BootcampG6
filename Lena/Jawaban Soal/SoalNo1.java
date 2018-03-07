import java.util.Scanner;

public class SoalNo1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int batas, counter;

		System.out.println("1. Buatlah bilangan prima hingga batas yang ditentukan.\n");
		System.out.print(">> Batas: ");
		batas = input.nextInt();


		for(int i = 1 ; i <= batas ; i++){

			counter = 0;

			for(int j = 1 ; j <= i ; j++){
				if(i%j == 0){
					counter++;
				}
			}

			if(counter == 2){
				System.out.print(i+" ");
			}
		}
	}
}