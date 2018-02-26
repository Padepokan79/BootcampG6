import java.util.Scanner;

public class SortingAngkaLena{
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);

		String angka;
		int temp;
		int [] arrAsc;
		int [] arrDesc;

		System.out.print("Masukkan kumpulan angka: ");
		angka = keyboard.next();

		arrAsc = new int[angka.length()]; 
		arrDesc = new int[angka.length()];


		for(int i=0; i<angka.length(); i++){
			arrAsc[i]=Integer.parseInt(angka.substring(i,i+1));
		}

		arrDesc=arrAsc;

		for(int i=0; i<arrAsc.length; i++){
			for(int j=arrAsc.length-1; j>i;j--){
				if(arrAsc[j]<arrAsc[j-1]){
					temp=arrAsc[j];
					arrAsc[j]=arrAsc[j-1];
					arrAsc[j-1]=temp;
				}
			}
		}

		System.out.println("\nSorting nilai dari kecil ke besar: ");
		for(int num : arrAsc){
			System.out.print(num+"  ");
		}

		for(int i=0; i<arrDesc.length; i++){
			for(int j=arrDesc.length-1; j>i;j--){
				if(arrDesc[j]>arrDesc[j-1]){
					temp=arrDesc[j];
					arrDesc[j]=arrDesc[j-1];
					arrDesc[j-1]=temp;
				}
			}
		}

		System.out.println("\nSorting nilai dari besar ke kecil: ");
		for(int num : arrDesc){
			System.out.print(num+"  ");
		}

	}
}