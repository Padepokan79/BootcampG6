import java.util.Scanner;

public class TestPerson {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		
		Person orang = new Person();
		
		String namaDepan, namaBelakang, jenisKelamin, hobi;
		int umur;
		
		System.out.print("Masukkan nama depan: ");
		namaDepan= input.nextLine();
		System.out.print("Masukkan nama belakang: ");
		namaBelakang= input.nextLine();
		System.out.print("Masukkan umur: ");
		umur= keyboard.nextInt();
		System.out.print("Masukkan jenis kelamin: ");
		jenisKelamin= input.nextLine();
		System.out.print("Masukkan hobi: ");
		hobi= input.nextLine();
		
		orang.insertRecord(namaDepan, namaBelakang, umur, jenisKelamin, hobi);
		orang.displayBio();
		
	}
}
