import java.util.Scanner;

public class Soal5 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int[] array = {2, 39, 47, 14, 36, 56, 57, 49, 43, 79};
		int[] temp = new int[array.length+1];
		int input, index=0; 
		String angkaSisip, posisi;
		int angkaSisipInt, posisiInt;
		boolean kondisi = false;


		System.out.println("Bilangan pada array 1 adalah : ");
		for (int num : array){
			System.out.print(num + " ");
		}

		System.out.println("\nMasukkan angka yang ingin disisipkan : ");
		angkaSisip = keyboard.nextLine();

		while (angkaSisip.matches("[A-Zaz]")){
			System.out.println("Maaf, input yang diterima hanya berupa angka.");
			System.out.println("Silahkan input kembali."); angkaSisip = keyboard.nextLine();	
		}
		angkaSisipInt = Integer.valueOf(angkaSisip);

		System.out.println("\nSisipkan pada posisi ke : ");
		posisi = keyboard.nextLine();

		while (posisi.matches("[A-Zaz]") || Integer.valueOf(posisi) < 1 || Integer.valueOf(posisi) > 10){
		if (posisi.matches("[A-Zaz]")){
			System.out.println("Maaf, input yang diterima hanya berupa angka.");
			System.out.println("Silahkan input kembali."); posisi = keyboard.nextLine();	
		}
		else if (Integer.valueOf(posisi) < 1){
			System.out.println("Maaf, jumlah posisi tidak boleh kurang dari 1.");
			System.out.println("Silahkan input kembali."); posisi = keyboard.nextLine();	
		}
		else if (Integer.valueOf(posisi) > 10){
			System.out.println("Maaf, jumlah posisi tidak boleh lebih dari 10.");
			System.out.println("Silahkan input kembali."); posisi = keyboard.nextLine();	
		}
	}

		posisiInt = Integer.valueOf(posisi);


		for (int f = 0 ; f < temp.length ; f++){
			if( f == (posisiInt-1)){
				temp[f]= angkaSisipInt;
			}
			else{
				temp[f] = array[index];
				index++;
			}
		}
		
		array =  new int[temp.length];

		for (int f = 0 ; f < temp.length ; f++){
			array[f] = temp[f];
		}
		
		for ( int f = 0 ; f < array.length ; f++){
		System.out.print(array[f] + " " );
		}
	}
}