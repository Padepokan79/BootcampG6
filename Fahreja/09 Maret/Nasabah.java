import java.util.Scanner;
import java.util.Random;
public class Nasabah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nilai = new Scanner(System.in);
		Random angka = new Random();
		Bank pelanggan = new Bank();
		int pilih;
		
		System.out.println("Selamat Datang di Bank 79");
		System.out.println("\nUntuk pembuatan akun baru.");
		System.out.println("Silahkan masukan nama anda : ");
		pelanggan.nama = nilai.nextLine();
		System.out.println("\nSilahkan masukan besar deposit pertama anda :");
		pelanggan.saldo = nilai.nextInt();
		pelanggan.noIden = angka.nextInt(145693829);
		
		pelanggan.depositA(pelanggan.saldo, pelanggan.nama, pelanggan.noIden);
		pelanggan.tampilAwal();
		
		do {
			System.out.println("Menu : \n");
			System.out.println("1. Untuk Mengecek Saldo");
			System.out.println("2. Deposit/Menabung.");
			System.out.println("3. Withdraw/Mengambil.");
			System.out.println("0. Exit");
			System.out.print(">");
			pilih = nilai.nextInt();
			
			if (pilih == 1) {
				pelanggan.tampilDepo();
			}else if (pilih == 2) {
				System.out.println("Masukkan besar uang yang akan dimasukkan : ");
				pelanggan.tabung = nilai.nextInt();
				pelanggan.tambahDepo(pelanggan.tabung);
				pelanggan.tambah();
			}else if (pilih == 3) {
				System.out.println("Masukkan besar uang yang akan ditarik : ");
				pelanggan.kurang = nilai.nextInt();
				pelanggan.withDraw(pelanggan.kurang);
				pelanggan.tarik();
				pelanggan.tampilDepo();
			}
			
		} while (pilih != 0);
	}

}
