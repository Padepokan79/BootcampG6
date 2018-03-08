import java.util.Scanner;

public class SoalQuiz3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String anggota = "", bulan = "";
		int hari, tabPerBulan = 0, totTabungan = 0, jumlahKeluarga = 0;
		boolean benar = false;

		System.out.print("\nMasukan Jumlah keluarga: ");
		anggota = keyboard.nextLine();
		System.out.print("\nMasukan Lama tabungan: ");
		bulan = keyboard.nextLine();

		while (benar == false) {
			if (anggota.matches("[A-Za-z.,\\s]*")) {
				System.out.println("\nMaaf, input yang diterima hanya berupa angka.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nMasukan Jumlah keluarga: ");
				anggota = keyboard.nextLine();
			}
			else if (Integer.parseInt(anggota) < 2) {
				System.out.println("\n-User input anggota keluarga tidak boleh kurang dari 2.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nMasukan Jumlah keluarga: ");
				anggota = keyboard.nextLine();
			}
			else if (Integer.parseInt(anggota) > 6) {
				System.out.println("\n-User input anggota keluarga tidak boleh lebih dari 6.");
				System.out.println("\nSilahkan input kembali.");
				System.out.print("\nMasukan Jumlah keluarga: ");
				anggota = keyboard.nextLine();
			}
			else {
				benar = true;
				jumlahKeluarga = Integer.parseInt(anggota);
				System.out.println();
				for(int a = 1 ; a <= Integer.parseInt(bulan); a++) {
					if (a == 2) {
						hari = 28;
					}
					else if (a == 4 || a == 6 || a == 9 || a == 11) {
						hari = 30;
					}
					else {
						hari = 31;
					}
					tabPerBulan = 0;

					for(int b = hari; b >= 1; b--) {
						tabPerBulan = tabPerBulan + (b * 1000);
					}
					totTabungan = totTabungan + (tabPerBulan * jumlahKeluarga) ;
					System.out.println("Tabungan pada bulan " + a + " sebesar " + (tabPerBulan * jumlahKeluarga));
				}
				System.out.println("\nTotal Tabungan Selama " + Integer.parseInt(bulan) + " bulan dengan " + jumlahKeluarga + " anggota keluarga adalah " + totTabungan);
			}
		}
	}
}