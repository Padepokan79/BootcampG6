import java.util.Scanner;

public class CekPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nilai = new Scanner(System.in);
		Person orangSuami = new Person();
		
		System.out.println("Masukan Nama Depan : ");
	//	orangSuami.namaDepan = nilai.next();
		System.out.println("Masukan Nama Belakang : ");
	//	orangSuami.namaBelakang = nilai.next();
		System.out.println("Jenis Kelamin : ");
		//orangSuami.gender = nilai.next();
		System.out.println("Umur Anda : ");
		//orangSuami.umur = nilai.nextInt();
		System.out.println("Hobi :");
		nilai.nextLine();
		//orangSuami.kesukaan = nilai.nextLine();
		
		orangSuami.tampil();
	}

}
