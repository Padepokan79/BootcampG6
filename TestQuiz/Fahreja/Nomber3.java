//Fahreja
import java.util.Scanner;

public class Nomber3{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		int nominalAwal, potong = 1000, jumlah,total=0;
		int key=0;
		String bulan,keluarga;

		do{
			System.out.print("Masukan Jumlah keluarga :");
			keluarga = nilai.next();

				if (keluarga.matches("[0-9]*")) {
					if (Integer.parseInt(keluarga) >= 2) {
						if (Integer.parseInt(keluarga) <= 6) {

							System.out.print("Masukan lama tabungan :");
							bulan = nilai.next();
								if (bulan.matches("[0-9]*")) {
									if (Integer.parseInt(bulan) >= 2) {
										if (Integer.parseInt(bulan) <= 20) {

											for (int i = 1; i <= Integer.parseInt(bulan) ;i++ ) {
												jumlah = 0;
												nominalAwal = 31000;
												int[] lama = new int[31];

												if (i <= 7) {
													
												
													if (i % 2 == 0) {
														lama = new int[30];
														if (i == 2) {
															lama = new int[28];
														}
													}
												}else{
													if (i % 2 == 0) {
														lama = new int[31];
													}else{
														lama = new int[30];
													}
												}
												nominalAwal = lama.length * potong; 
													for (int j = 0; j < lama.length ;j++ ) {
														lama[j] = nominalAwal;
														jumlah = jumlah+lama[j];
														nominalAwal = nominalAwal - potong;
													}
													jumlah = jumlah *Integer.parseInt(keluarga);
													System.out.println("Tabungan pada bulan ke "+i +" sebesar : "+jumlah);
													total = total + jumlah;
												}
											System.out.println("Total tabungan selama " +bulan+" bulan dengan "+keluarga+" anggota keluarga adalah "+total);
											key =1;
												
										}else {
											System.out.println("Maaf, jumlah lama tabungan tidak boleh lebih dari 12");
										}
									}else {
										System.out.println("Maaf, jumlah lama tabungan tidak boleh kurang dari 1");
									}
								}else{
									System.out.println("Maaf, inputan Harus berupa angka");
								}
							
						}else{
							System.out.println("Maaf, jumlah keluarga tidak boleh lebih dari 6");
						}
					}else {
						System.out.println("Maaf, jumlah keluarga tidak boleh kurang dari 2");
					}
				}else {
					System.out.println("Maaf, inputan Harus berupa angka");
				}
		}while (key != 1);	
	}
	
}