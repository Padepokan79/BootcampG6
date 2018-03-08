import java.util.Scanner;

public class NomberDua{
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		//Fahreja
		int batas,panjangKalimat = 0;
		String kalimat;

		System.out.print("Batas segitiga : ");
		batas = nilai.nextInt();
		System.out.print("Kalimat :");
		nilai.nextLine();
		kalimat = nilai.nextLine();


		for (int baris = 0; baris < batas ; baris++) {
			for(int spasi = 0; spasi < batas-baris; spasi++){
				System.out.print(" ");
			}
			for (int kata = 0; kata <= baris ; kata++) {
				if (panjangKalimat < kalimat.length()) {
					System.out.print(kalimat.substring(panjangKalimat,panjangKalimat+1));
					System.out.print(" ");
					panjangKalimat++;
				}
			}
			System.out.println(" ");
		}
	}
}
