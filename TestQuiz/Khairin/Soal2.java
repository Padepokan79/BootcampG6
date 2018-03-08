import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String baris;
		int barisInt;


	System.out.println("Jumlah baris untuk segitiga paskal yang akan ditampilkan : ");
	baris = keyboard.nextLine();

	while (baris.matches("[A-Zaz]") || Integer.valueOf(baris) < 2 || Integer.valueOf(baris) > 20){
		if (baris.matches("[A-Zaz]")){
			System.out.println("Maaf, input yang diterima hanya berupa angka.");
			System.out.println("Silahkan input kembali."); baris = keyboard.nextLine();	
		}
		else if (Integer.valueOf(baris) < 2){
			System.out.println("Maaf, jumlah baris tidak boleh kurang dari 2.");
			System.out.println("Silahkan input kembali."); baris = keyboard.nextLine();	
		}
		else if (Integer.valueOf(baris) > 20){
			System.out.println("Maaf, jumlah baris tidak boleh lebih dari 20.");
			System.out.println("Silahkan input kembali."); baris = keyboard.nextLine();	
		}
	}

	barisInt = Integer.valueOf(baris);

	for (int barisSkrg=0; barisSkrg<barisInt; barisSkrg++){
		System.out.println(" ");
		int nilai=1; 
		for(int m=0; m<=barisSkrg; m++){
			System.out.print(nilai + " ");
			nilai = nilai * (barisSkrg - m) / (m + 1); 			
		}
	}
}
}
