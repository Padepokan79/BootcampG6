import java.util.Scanner;

public class Soal1 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int bilFibonacci, deretFibonacci=1, x=0, y=1, tambah;
		String urutanAngka;
		int urutanAngkaInt;

	System.out.println("Masukkan jumlah urutan angka Fibonacci yang akan ditampilkan : ");
	urutanAngka = keyboard.nextLine();

	while (urutanAngka.matches("[A-Za-z]") || Integer.valueOf(urutanAngka) < 5 || Integer.valueOf(urutanAngka) > 10){
		  if (urutanAngka.matches("[A-Za-z]")){
		  	System.out.println("Maaf, input yang diterima hanya berupa angka.");
			System.out.println("Silahkan input kembali."); urutanAngka = keyboard.nextLine();	
		}
		else if (Integer.valueOf(urutanAngka) < 5){
			System.out.println("Maaf, jumlah baris tidak boleh kurang dari 5.");
			System.out.println("Silahkan input kembali."); urutanAngka = keyboard.nextLine();	
		}
		else if (Integer.valueOf(urutanAngka) > 10){
			System.out.println("Maaf, jumlah baris tidak boleh lebih dari 10.");
			System.out.println("Silahkan input kembali."); urutanAngka = keyboard.nextLine();	
		}
	}

	urutanAngkaInt = Integer.valueOf(urutanAngka);

	System.out.println("\nDeret Fibonacci adalah : ");
		for (int i=1; i<=urutanAngkaInt; i++){
			if (i==1){
				System.out.print(i + " ");
			}
			else{tambah = x + y;
			System.out.print(tambah + " ");
			x = y;
			y = tambah;
			}
		}
	}
}

