import java.util.Scanner;

public class SoalNo9{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int batas, angka, sum=0;
		int [] arr;

		System.out.println("9. Tampung sejumlah angka kedalam array, (jumlah angka di tentukan oleh user),");  
        System.out.println("   kemudian tampilkan kembali angka yang di input \n   dan jumlahkan seluruh angka pada array tersebut.\n");
		System.out.print(">> Jumlah angka yang ingin dimasukkan: ");
		batas = input.nextInt();

		arr = new int[batas];

		for(int i=0; i<batas ; i++){
			System.out.print(">> Angka ke "+(i+1)+ " : ");
			angka = input.nextInt();

			arr[i] = angka;

			sum = sum+angka;
		}
		System.out.println("\n");

		for(int i : arr){
			System.out.print(i + ", ");
		}
		System.out.println("Jumlah: "+sum);
	}
}