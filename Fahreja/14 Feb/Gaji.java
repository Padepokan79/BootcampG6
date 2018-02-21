import java.util.Scanner;
//Fahreja
public class PerhitunganGajiFahreja{
	public static void main(String[]args){
		Scanner keyboard = new Scanner(System.in);
		String nama, nip;
		double gajiP, tunjangan, gajiK, potonganGaji, gajiB, phhGaji, uangRumah,tunjangAnak,tunjangKeluarga,tunjangNasi;
		double expenses,undangOrang; //salary
		double keluarga = 0.1, anak=0.2,fungsi=500000;//tunjangan
		double hargaNasiKg = 8000, orangPerNasi = 10, jmlOrang;//tunajangan
		double undang = 0.475, fungsioanlEx = 0.05, taperumContri=10000
		double pph = 0.05;

		System.out.print("Tuliskan Nama Anda : ");
		name = keyboard.next();

		System.out.print("NIP :");
		nip = keyboard.next();

		System.out.print("Gaji pokok anda :");
		gajiP = keyboard.nextDouble();


		//proses tunjangan
		tunjangKeluarga= gajiP*keluarga;
		tunjangAnak= gajiP*anak;
		tunjangNasi = jmlOrang*orangPerNasi*hargaNasiKg
		tunjangan =tunjangKeluarga + tunjangAnak+tunjangNasi+fungsi;
		gajiK = gajiP+tunajangan;

		//prosses tambahan
		undangOrang = gajiK*undang;
		expenses = gajiK*fungsioanlEx;

		potonganGaji = undangOrang + fungsioanlEx+ taperumContri;
		gajiB = gajiK-potonganGaji;
		phhGaji = gajiB * pph;
		uangRumah = gajiB - phhGaji;



		System.out.println("\nGaji Bapak/Ibu "+ name);
		System.out.println("NIP : "+nip);
		System.out.println("Gaji Pokok : " + gajiP);
		System.out.println("Tunjangan : "+tunajangan);
		System.out.println("Gaji Kotor : "+gajiK);
		System.out.println("Potongan : "+potonganGaji);
		System.out.println("Gaji Bersih : "+gajiB);
		System.out.println("PPH : "+phhGaji);
		System.out.println("Uang Rumah : "+uangRumah);


	}
}