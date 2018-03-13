import java.util.Scanner;
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nilai = new Scanner(System.in);
		Teacher guru1 = new Teacher();
		Student siswa1 = new Student();
		
		System.out.println("Nama Depan = ");
		guru1.setNamaDepan(nilai.nextLine());
		System.out.println("Nama Belakang = ");
		guru1.setNamaBelakang(nilai.nextLine());
		System.out.println("Gender  = ");
		guru1.setGender(nilai.nextLine());
		System.out.println("Hobi = ");
		guru1.setKesukaan(nilai.nextLine());
		System.out.println("Subject = ");
		guru1.subject = nilai.nextLine();
		System.out.println("Umur = ");
		guru1.setUmur(nilai.nextInt());
		guru1.tampil();
		guru1.greterT();
		
		//siswa1.tambah("Galih", "Panjaitan", "Laki-laki", "Bola", 16);
		//siswa1.tampil();
		//siswa1.greterS();
	}

}
