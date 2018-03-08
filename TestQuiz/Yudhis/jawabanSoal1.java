import java.util.Scanner;

public class jawabanSoal1 {
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variable
		int batas = 0, n1 = 1, n2 = 1, n3;
		boolean inputBenar = false;

		// Input batas urutan angka
		while (inputBenar == false) {
			System.out.print("Jumlah urutan angka Fibonacci yang akan ditampilkan : "); String strBatas = input.nextLine();

			if (strBatas.matches("[ ]*") && strBatas.length() == 1) {
				System.out.println("Anda belum memasukkan batas.");
				System.out.println("Silahkan input kembali.");
			} else if (strBatas.length() == 0) {
				System.out.println("Anda belum memasukkan batas.");
				System.out.println("Silahkan input kembali.");
			} else if (strBatas.matches("[0-9-]*")) {
				if (Integer.valueOf(strBatas) <= 100 && Integer.valueOf(strBatas) >= 5) {
					batas = batas + Integer.valueOf(strBatas);

					inputBenar = true;
				} else if (Integer.valueOf(strBatas) > 100) {
					System.out.println("Maaf, jumlah urutan angka tidak boleh lebih dari 100.");
					System.out.println("Silahkan input kembali.");
				} else {
					System.out.println("Maaf, jumlah urutan angka tidak boleh kurang dari 5.");
					System.out.println("Silahkan input kembali.");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
			}
		}
  
  		// Menampilkan 0 dan 1 terlebih dahulu  
		System.out.print(n1 + " " + n2);   
		    
		// Memulai loop untuk menampilkan bil. Fibonacci dimulai dari 2 
		for(int i = 2; i < batas; i++) {    
		  	n3 = n1 + n2; 

		  	System.out.print(" " + n3);    
		  	
		  	n1 = n2;    
		  	n2 = n3;    
		}    

	}
}