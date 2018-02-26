import java.util.Scanner;

public class MengurutNilai{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//fahreja
		String nilai;
		int[] satuan = new int[0];
		int temp =0;
		int index = 0, panjangArray;

		System.out.println("Masukan No: ");
		nilai = keyboard.next();

		if (nilai.length() % 2 == 0){
			panjangArray = nilai.length()/2;
		}else{
			panjangArray = nilai.length()/2+1;
		}

		satuan = new int[panjangArray];


		for (int i = 0; i < satuan.length ; i++ ) {
			if (nilai.length() % 2 == 1) {
				if (index == nilai.length()-1) {
					satuan[i] =Integer.valueOf(nilai.substring(index,index+1));
				}else{
					satuan[i] =Integer.valueOf(nilai.substring(index,index+2));
				}

			}else {
				satuan[i] =Integer.valueOf(nilai.substring(index,index+2));
			}
			index += 2;
		}

		for (int i = 0; i < satuan.length ; i++ ) {
			for (int j = satuan.length-1; j > i ; j-- ) {
				if (satuan[j] > satuan[j-1]) {
					temp = satuan[j];
					satuan[j] = satuan[j-1];
					satuan[j-1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Urutan tertinggi: ");
		for (int angka : satuan) {
			System.out.print(angka+" ");
		}

		for (int i = 0; i < satuan.length ; i++ ) {
			for (int j = satuan.length-1; j > i ; j-- ) {
				if (satuan[j] < satuan[j-1]) {
					temp = satuan[j];
					satuan[j] = satuan[j-1];
					satuan[j-1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ururtan terendah: ");
		for (int angka : satuan) {
			System.out.print(angka+" ");
		}

	}
}
