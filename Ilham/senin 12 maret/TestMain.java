import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String namaDepan, namaBelakang, jenisKelamin, hobi, subjek;
		int umur;
		
		
		Guru guru1 = new Guru();		
		
		System.out.print("Masukan Nama Depan: ");
		namaDepan = input.next();
		System.out.print("Nama Belakang: ");
		input.nextLine();
		namaBelakang = input.nextLine();
		System.out.print("Umur: ");
		umur = input.nextInt();
		System.out.print("Jenis Kelamin: ");
		jenisKelamin = input.next();
		System.out.print("Hobi: ");
		input.nextLine();
		hobi = input.nextLine();
		System.out.print("Subjek: ");
		subjek = input.nextLine();
		
		guru1.tambahDataGuru(namaDepan, namaBelakang, jenisKelamin, umur, hobi, subjek);
		guru1.tampilDataGuru();		
	
	}

}
