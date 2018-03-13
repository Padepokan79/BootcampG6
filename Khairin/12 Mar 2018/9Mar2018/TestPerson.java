package eclipse;

import java.io.InputStream;
import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		Person person1= new Person();
		String nama, namaB, jenis, hobi;
		int umur;
		
		System.out.println("Masukkan nama depan : ");
		nama = keyboard.nextLine();
		System.out.println("Masukkan nama belakang : ");
		namaB = keyboard.nextLine();
		System.out.println("Masukkan umur : ");
		umur = in.nextInt();
		System.out.println("Masukkan jenis kelamin : " );
		jenis = keyboard.nextLine();
		System.out.println("Masukkan hobi : ");
		hobi = keyboard.nextLine();
		
		//PERSON 1
		person1.firstName= nama;
		person1.lastName= namaB;
		person1.age= umur;
		person1.gender= jenis;
		person1.interest= hobi;

		person1.displayBio();
	}
}
