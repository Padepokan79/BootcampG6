import java.util.Scanner;

public class SoalNo2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String kalimat, batas;
		int counter=0;

		System.out.println("2. Buatlah program untuk menampilkan kalimat dalam bentuk segitiga \n   hingga batas segitiga yg ditentukan");
		System.out.print("\n>> Masukkan batas segitiga: ");
		batas= input.nextLine();
		System.out.print(">> Masukkan kalimat: ");
		kalimat=input.nextLine();

		for(int i=0; i<Integer.parseInt(batas);i++){
			for(int j=Integer.parseInt(batas)-1;j>=i;j--){
				System.out.print(" ");
			}
			for (int k=0;k<=i;k++ ) {
				if(counter<kalimat.length()){
					System.out.print(kalimat.substring(counter,counter+1)+" ");
					counter++;
				}
			}
			System.out.println();
		}
	}
}