import java.util.Scanner;

public class SoalNo11{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int []arr;
		int nilai;

		System.out.println("11. Carilah kombinasi penjumlahan dari angka yang diinputkan!\n");

		System.out.print(">> Masukkan nilai: ");
		nilai=input.nextInt();

		arr = new int[nilai+1];

		for(int k=0; k<=nilai;k++){
			arr[k]=k;
		}

		System.out.println("\n\nHasil: "+nilai+" adalah kombinasi dari");

		for(int i=0;i<arr.length;i++){
			for(int j=arr.length-1;j>=0;j--){
				
				if(i + j == nilai){
					System.out.print(i+" dan "+j+", ");
				}

				if (i==j) {
					break;
				}
			}
		}
	}
}