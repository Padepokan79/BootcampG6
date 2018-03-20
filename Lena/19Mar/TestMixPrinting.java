package soal1MixPrinting;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMixPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Boolean isTrue = false;
		String validasi="";
		int panjang, lebar, tambahHarga, pendapatanSehari=0, index = 0;
		
		System.out.println("Mix Printing\n\nMelayani 3 jenis printing:\nKertas Biasa : Rp 4000 / kertas\nBanner : Rp 80000 / banner\nBaliho : Rp 150000 / baliho");
		System.out.println("\nRata-rata pengunjung per hari 150 : 100 untuk kertas biasa, 30 untuk banner, 20 untuk baliho");
		System.out.println("\nMinimal banner 2*1 m untuk harga diatas.\nJika pelanggan meminta lebih maka biaya bertambah Rp 10000/m dengan max 3*2 m.");
		System.out.println("Minimal banner 3*3 m untuk harga diatas.\nJika pelanggan meminta lebih maka biaya bertambah Rp 20000/m dengan max 4*5 m.");
		System.out.println("\nCari pendapatan sehari.\n\n");
		
		Printing kertasBiasa = new Printing("Kertas Biasa", 4000, 100);
		Printing banner = new Printing("Banner", 80000, 30);
		Printing baliho = new Printing("Baliho", 150000, 20);
		
		ArrayList<Integer> listPanjang = new ArrayList<Integer>();
		ArrayList<Integer> listLebar = new ArrayList<Integer>();
		
		ArrayList<Integer> listTambahHarga = new ArrayList<Integer>();
		
		ArrayList<Printing> listPrinting = new ArrayList<Printing>();
		
		listPrinting.add(kertasBiasa);
		listPrinting.add(banner);
		listPrinting.add(baliho);
		
		listPanjang.add(1);
		listLebar.add(1);
		
		listTambahHarga.add(0);
		
		while(!isTrue) {
			System.out.print("Apakah anda ingin mengubah ukuran banner yang akan di beli? (Y/N) ");
			validasi = scan.next();
			if(validasi.equalsIgnoreCase("y")) {
				while(!isTrue) {
					System.out.print("Masukkan panjang banner (min 2 meter, max 3 meter): ");
					panjang = scan.nextInt();
					if(panjang >= 2) {
						if(panjang <= 3) {
							listPanjang.add(panjang);
							break;
						}
						else {
							System.out.println("Panjang banner max 3 meter!");
						}
					}else {
						System.out.println("Panjang banner min 2 meter!");
					}
				}
				
				while(!isTrue) {
					System.out.print("Masukkan lebar banner (min 1 meter, max 2 meter): ");
					lebar = scan.nextInt();
					if(lebar >= 1) {
						if(lebar <= 2) {
							listLebar.add(lebar);
							break;
						}
						else {
							System.out.println("Lebar banner max 2 meter!");
						}
					}else {
						System.out.println("Lebar banner min 1 meter!");
					}
				}
				
				tambahHarga = ((listPanjang.get(1) * listLebar.get(1))-2)*10000;
				
				listTambahHarga.add(tambahHarga);
				
				break;
			}
			else if(validasi.equalsIgnoreCase("n")) {
				listPanjang.add(2);
				listLebar.add(1);
				listTambahHarga.add(0);
				break;
			}
			else {
				System.out.println("Inputan anda salah!");
			}
		}
	
		while(!isTrue) {
			System.out.print("\nApakah anda ingin mengubah ukuran baliho yang akan di beli? (Y/N) ");
			validasi = scan.next();
			if(validasi.equalsIgnoreCase("y")) {
				while(!isTrue) {
					System.out.print("Masukkan panjang banner (min 3 meter, max 4 meter): ");
					panjang = scan.nextInt();
					if(panjang >= 3) {
						if(panjang <= 4) {
							listPanjang.add(panjang);
							break;
						}
						else {
							System.out.println("Panjang banner max 4 meter!");
						}
					}else {
						System.out.println("Panjang banner min 3 meter!");
					}
				}
				
				while(!isTrue) {
					System.out.print("Masukkan lebar banner (min 3 meter, max 5 meter): ");
					lebar = scan.nextInt();
					if(lebar >= 3) {
						if(lebar <= 5) {
							listLebar.add(lebar);
							break;
						}
						else {
							System.out.println("Lebar banner max 5 meter!");
						}
					}else {
						System.out.println("Lebar banner min 3 meter!");
					}
				}
				
				tambahHarga = ((listPanjang.get(2)*listLebar.get(2))-9) * 20000;
				
				listTambahHarga.add(tambahHarga);
				
				break;
			}
			else if(validasi.equalsIgnoreCase("n")) {
				listPanjang.add(3);
				listLebar.add(3);
				listTambahHarga.add(0);
				break;
			}
			else {
				System.out.println("Inputan anda salah!");
			}
		}
		
		for(Printing printing : listPrinting) {
			pendapatanSehari = pendapatanSehari + (printing.getJumlahPengunjung()*printing.getHarga()+listTambahHarga.get(index)); 
			index++;
		}
		
		System.out.println("\n\nPendapatan sehari: Rp "+pendapatanSehari);
	}

}
