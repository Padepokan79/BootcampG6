import java.util.Scanner;

public class TestOrang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Orang orang1 = new Orang();		
		
		String namaDepan, namaBelakang, jenisKelamin, hobi, bio, greeting;
		int umur;
		
		System.out.print("Masukan Nama Depan: ");
		namaDepan = input.next();
		orang1.setNamaDepan(namaDepan);
		System.out.print("Nama Belakang: ");
		input.nextLine();
		namaBelakang = input.nextLine();
		orang1.setNamaBelakang(namaBelakang);
		System.out.print("Umur: ");
		umur = input.nextInt();
		orang1.setUmur(umur);
		System.out.print("Jenis Kelamin: ");
		jenisKelamin = input.next();
		orang1.setJenisKelamin(jenisKelamin);
		System.out.print("Hobi: ");
		input.nextLine();
		hobi = input.nextLine();
		orang1.setHobi(hobi);
		
		bio = orang1.getNamaDepan() + " is " + orang1.getUmur() + " years old. They like " + orang1.getHobi() + ".";
		greeting = "Hi! i'm " + orang1.getNamaDepan();
	
		System.out.println("Bio {" + bio + "}");
		System.out.println("Greeting {" + greeting + "}");	
		
		
			

	}

}
