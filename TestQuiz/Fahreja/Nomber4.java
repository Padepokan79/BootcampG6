//Fahreja
import java.util.Scanner;

public class Nomber4{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		int[] deretAngka = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		int[] temp = new int[0];
		int tempAngka;
		int key=0;
		String geser;

		System.out.println("Jumlah Deretan Awal :");
		for (int angka : deretAngka) {
			System.out.print(angka +" ");
		}
		System.out.println("");

		do{
			System.out.print("Shift kiri sebanyak :");
			geser = nilai.next();

				if (geser.matches("[0-9]*")) {
					if (Integer.parseInt(geser) >= 1) {
						if (Integer.parseInt(geser) <= 10) {
							temp = deretAngka;
							deretAngka = new int[10];
							for (int i = 0; i < deretAngka.length ; i++) {
								
								if (i+Integer.parseInt(geser) > deretAngka.length-1) {
								 	deretAngka[i] = temp[(i+Integer.parseInt(geser))-deretAngka.length];
								 }
								 else {
								 	deretAngka[i] = temp[i+Integer.parseInt(geser)];
								 }
								}
								for (int urutan : deretAngka) {
									System.out.print(urutan+ " ");
								}
							
							key =1;
						}else{
							System.out.println("Maaf, pergeseran tidak boleh lebih dari 10");
						}
					}else {
						System.out.println("Maaf, pergeseran tidak boleh kurang dari 1");
					}
				}else {
					System.out.println("Maaf, inputan Harus berupa angka");
			}
		}while (key != 1);	
	}
	
}