import java.util.Scanner;

public class jawabanSoal3 {
	public static void main(String[] args) {
		
		// Inisialisasi object Scanner
		Scanner input = new Scanner(System.in);

		// Inisialisasi variable
		int jmlKeluarga = 0, lamaTabungan = 0, seluruhTabungan = 0;
		int [] tabungan = new int [0];
		boolean inputBenar = false;

		System.out.println("Tabungan Keluarga.");

		// Input jumlah keluarga
		while (inputBenar == false) {
			System.out.print("Masukan Jumlah keluarga : "); String strJmlKeluarga = input.nextLine();

			if (strJmlKeluarga.matches("[ ]*") && strJmlKeluarga.length() == 1) {
				System.out.println("Anda belum memasukkan jumlah keluarga.");
				System.out.println("Silahkan input kembali.");
			} else if (strJmlKeluarga.length() == 0) {
				System.out.println("Anda belum memasukkan jumlah keluarga.");
				System.out.println("Silahkan input kembali.");
			} else if (strJmlKeluarga.matches("[0-9-]*")) {
				if (Integer.valueOf(strJmlKeluarga) <= 6 && Integer.valueOf(strJmlKeluarga) >= 2) {
					jmlKeluarga = jmlKeluarga + Integer.valueOf(strJmlKeluarga);

					inputBenar = true;
				} else if (Integer.valueOf(strJmlKeluarga) > 6) {
					System.out.println("Maaf, Jumlah keluarga tidak boleh lebih dari 6.");
					System.out.println("Silahkan input kembali.");
				} else {
					System.out.println("Maaf, Jumlah keluarga Tidak boleh kurang dari 2.");
					System.out.println("Silahkan input kembali.");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
			}
		}

		// Set boolean untuk cek input selanjutnya
		inputBenar = false;

		// Input jumlah keluarga
		while (inputBenar == false) {
			System.out.print("Masukan Lama tabungan : "); String strLamaTabungan = input.nextLine();

			if (strLamaTabungan.matches("[ ]*") && strLamaTabungan.length() == 1) {
				System.out.println("Anda belum memasukkan lama tabungan.");
				System.out.println("Silahkan input kembali.");
			} else if (strLamaTabungan.length() == 0) {
				System.out.println("Anda belum memasukkan lama tabungan.");
				System.out.println("Silahkan input kembali.");
			} else if (strLamaTabungan.matches("[0-9-]*")) {
				if (Integer.valueOf(strLamaTabungan) <= 12 && Integer.valueOf(strLamaTabungan) >= 1) {
					lamaTabungan = lamaTabungan + Integer.valueOf(strLamaTabungan);

					inputBenar = true;
				} else if (Integer.valueOf(strLamaTabungan) > 12) {
					System.out.println("Maaf, Lama tabungan tidak boleh lebih dari 12.");
					System.out.println("Silahkan input kembali.");
				} else {
					System.out.println("Maaf, Lama tabungan tidak boleh kurang dari 1.");
					System.out.println("Silahkan input kembali.");
				}
			} else {
				System.out.println("Maaf, input yang diterima hanya berupa angka.");
				System.out.println("Silahkan input kembali.");
			}
		}

		// Menentukan panjang array tabungan
		tabungan = new int [lamaTabungan];

		// Menghitung tabungan perbulan
		for (int i = 0; i < lamaTabungan; i++) {
			tabungan[i] = hitungTabungan(i+1, jmlKeluarga);
		}

		// Menghitungan total tabungan
		for (int t : tabungan) {
			seluruhTabungan = seluruhTabungan + t;
		}

		System.out.println("\nTotal Tabungan Selama " + lamaTabungan + " Bulan dengan " + jmlKeluarga + " anggota keluarga adalah " + seluruhTabungan);
		
	}

	// Function penghitungan tabungan per bulan
	public static int hitungTabungan (int lamaTabungan, int jmlKeluarga) {
		int totalTabungan = 0;
		String bulan = "";

		switch (lamaTabungan) {
			case 1 :
				bulan = "pertama";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 31; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 2 :
				bulan = "kedua";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 28; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 3 :
				bulan = "ketiga";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 31; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 4 :
				bulan = "keempat";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 30; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 5 :
				bulan = "kelima";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 31; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 6 :
				bulan = "keenam";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 30; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 7 :
				bulan = "ketujuh";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 31; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 8 :
				bulan = "kedelapan";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 31; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 9 :
				bulan = "kesembilan";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 30; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 10 :
				bulan = "kesepuluh";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 31; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 11 :
				bulan = "kesebelas";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 30; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;

			case 12 :
				bulan = "keduabelas";
				for (int i = 0; i < jmlKeluarga; i++) {
					for (int k = 31; k >= 1; k--) {
						totalTabungan = totalTabungan + (k * 1000); 
					}
				}
				
				System.out.println("Tabungan Pada bulan " + bulan + " sebesar " + totalTabungan);
				break;
		}

		return totalTabungan;
	}

}