import java.util.Scanner;

public class SoalNo5{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int bil;
		int[][] pascal = new int[0][0]; 

		System.out.println("5. Buatlah segitiga pascal, dengan menerima sebuah inputan.\n   Ps: inputan yang dapat dimasukkan maksimal 5.\n");
		System.out.print(">> Masukkan angka (0-5): ");
		bil=input.nextInt();

		if(bil>=0 && bil<=5){

			pascal = new int[bil+1][bil+1];

			for (int x=0 ; x<=bil ; x++) {
				for(int y=0;y<=x;y++){
					if(y==0 || y==x){
						pascal[x][y]=1;
					}
					else{
						pascal[x][y] = pascal[x-1][y-1] + pascal[x-1][y];
					}
					System.out.print(pascal[x][y]+ " ");
				}
				System.out.println();
			}
		}else{
			System.out.println("Inputan anda tidak dalam range 0-5!");
		}


	}
}