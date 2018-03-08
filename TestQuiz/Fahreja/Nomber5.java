//Fahreja
import java.util.Scanner;

public class Nomber5{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		int[] deretAngka = {2,39,47,14,36,56,57,49,43,79};
		int[] temp = new int[0];
		int key=0;
		String tempat,angka;

		System.out.println("Deretan Nomber : ");
		for (int urutan : deretAngka) {
			System.out.print(urutan+" ");
		}
		System.out.println("");

		do{
			System.out.print("Masukan Angka yang ingin anda sisipkan :");
			angka = nilai.next();

				if (angka.matches("[0-9]*")) {

					System.out.print("Sisipkan pada posisi :");
					tempat = nilai.next();

						if (tempat.matches("[0-9]*")) {
							if (Integer.parseInt(tempat) >= 1) {
								if (Integer.parseInt(tempat) <= 10) {

									temp = new int[deretAngka.length+1];
									int k = 0;
									for (int i = 0; i < deretAngka.length+1	; i++ ) {
										if (i == Integer.parseInt(tempat)-1) {
											temp[i] = Integer.parseInt(angka);
										}else{
											temp[i] = deretAngka[k];
											k++;
										}
									}
									for (int urutan : temp) {
										System.out.print(urutan+" ");
									}

									key =1;
									
								}else{
									System.out.println("Maaf, input posisi tidak boleh lebih dari 10");
								}
							}else {
								System.out.println("Maaf, input posisi tidak boleh kurang dari 1");
							}
						}else {
							System.out.println("Maaf, inputan Harus berupa angka");
						}
				}else{
					System.out.println("Maaf, inputan Harus berupa angka");
				}
		}while (key != 1);	
	}
	
}