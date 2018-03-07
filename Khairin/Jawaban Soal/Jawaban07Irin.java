/*Soal No.7

Andi mengadakan sebuah pesta, andi membuat syarat siapa saja yang boleh masuk atau ikut kedalam pesta tersebut.
Tamu harus mengisi data sebelum masuk yang kemudian di cocok kan dengan syarat yang telah ditentukan.
data yang perlu di isi:
1. Masukkan nama anda?
2. apakah anda memiliki undangan?
3. Apakah anda membawa sebuah hadiah?
4. Berapa umur anda
5. Jenis Kelamin
6. Penmpilan (0.0 - 10.0)
berikut syarat-syaratnya untuk bisa masuk:
1. memiliki undangan
atau
2. jika tidak memiliki undangan
	-> harus membawa hadiah
	-> dan maksimal umur 20
atau	
3. jika tidak memiliki undangan dan tidak membawa hadiah
	-> harus perempuan
	-> dan maksimal umur 20
	-> penampilan >= 8

Selain itu tidak bisa masuk*/

import java.util.Scanner;

public class Jawaban07Irin {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String nama, undangan, hadiah, gender; 
		int umur;
		double penampilan;
		boolean bisaMasuk;

		System.out.println("=============================================================================================="); 
		System.out.println("                    \t\t\t\tPESTA ANDI                  ");
		System.out.println("=============================================================================================="); 
		System.out.print("Masukkan nama Anda\t\t\t:");
		nama = keyboard.next();

		System.out.print(  "Apakah Anda memiliki undangan? (Ya/Tidak)\t\t: "    );
		undangan = keyboard.next();

		System.out.print(  "Apakah anda membawa sebuah hadiah? (Ya/Tidak)\t\t: " );
		hadiah = keyboard.next();

		System.out.print(  "Berapa umur Anda?\t\t\t\t\t: "                 );
		umur = keyboard.nextInt();

		System.out.print(  "Anda Pria atau Wanita?\t\t\t\t\t: "                 );
		gender = keyboard.next();

		System.out.print(  "Seberapa menarik Anda dari nilai 0.0 sampai 10.0?\t: " );
		penampilan = keyboard.nextDouble();

		bisaMasuk = ((undangan.equalsIgnoreCase("ya")) || (undangan.equalsIgnoreCase("tidak") && hadiah.equalsIgnoreCase("ya") && umur <= 20) 
			|| (undangan.equalsIgnoreCase("tidak") && hadiah.equalsIgnoreCase("tidak") && gender.equalsIgnoreCase("wanita") && umur <= 20 && penampilan >= 8));

		System.out.println("------------------------------------------------------------------------------------------------");

		System.out.println( "Diizinkan masuk?\t\t\t\t " );
		if (bisaMasuk == true) {
		System.out.println("Anda diizinkan masuk");
		}
		else{
		System.out.println("Anda tidak diizinkan masuk");
		}
		System.out.println("================================================================================================");
	}
}

