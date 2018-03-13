import java.util.Scanner;

public class TestLensaKamera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		MerkLensaKamera merk1 = new MerkLensaKamera();

		String focalLength, apertueMaks, cropFactor, mekanismeFocusing, internalFocusing, tipeLensaKamera, jenisLensaKamera, merk, tipe, ukuran;
		int harga, garansi;
		String jawaban;
		
		System.out.println("Mau isi data (Y/N)");
		jawaban = input.next();
		
		if (jawaban.equalsIgnoreCase("y")) {
			System.out.print("Focal Length : ");
			focalLength = input.next();
			System.out.print("Apertue Maksimal : ");
			apertueMaks = input.next();
			System.out.print("Crop Factor : ");
			cropFactor = input.next();
			System.out.print("Mekanisme Focusing : ");
			mekanismeFocusing = input.next();
			System.out.print("Internal Focusing : ");
			internalFocusing = input.next();
			System.out.print("Tipe Lensa Kamera : ");
			tipeLensaKamera = input.next();
			System.out.print("Jenis Lensa Kamera : ");
			jenisLensaKamera = input.next();
			System.out.print("Merk : ");
			merk = input.nextLine();
			System.out.print("Tipe : ");
			tipe = input.nextLine();
			System.out.print("Ukuran : ");
			ukuran = input.nextLine();
			System.out.print("Harga : ");
			harga = input.nextInt();
			System.out.print("Garansi (Tahun) : ");
			garansi = input.nextInt();
		
			merk1.tambahMerkLensaKamera(focalLength, apertueMaks, cropFactor, mekanismeFocusing, internalFocusing, tipeLensaKamera, jenisLensaKamera, merk, ukuran, harga, tipe, garansi);		
		}
		
		merk1.tampilMerkLensaKamera();
	}

}
