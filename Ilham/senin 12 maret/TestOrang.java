import java.util.Scanner;

public class TestOrang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Orang orang1 = new Orang();		
		
		System.out.print("Masukan Nama Depan: ");
		orang1.namaDepan = input.next();
		System.out.print("Nama Belakang: ");
		orang1.namaBelakang = input.nextLine();
		System.out.print("Umur: ");
		orang1.umur = input.nextInt();
		System.out.print("Jenis Kelamin: ");
		orang1.jenisKelamin = input.next();
		System.out.print("Hobi: ");
		input.nextLine();
		orang1.hobi = input.nextLine();
		
		orang1.tampilDataOrangDariInput();		

	}

}
