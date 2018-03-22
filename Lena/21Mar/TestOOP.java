import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		
		Karyawan karyawan = new Karyawan();
		Programmer programmer = new Programmer();
		SystemAnalyst analyst = new SystemAnalyst();
		Tester tester = new Tester();
		
		boolean isComplete = false;
		String nama="", nik="", posisi = "", tingkatan="", lamaKerja="", penempatan="", status="", lembur="", jumlahUntukDapatBonus="";
		
		//================================================arrayList=====================================================
		ArrayList<String> listPosisi = new ArrayList<String>();
		karyawan.insertToAddArrayList(listPosisi, "pg", "sa", "tester");
		
		ArrayList<String> listTingkatan = new ArrayList<String>();
		karyawan.insertToAddArrayList(listTingkatan, "junior","middle","senior");
		//==============================================================================================================
		
		//==================================================hashMap=====================================================
		HashMap<Integer, String> mapStatus = new HashMap<Integer,String>();
		karyawan.insertToAddHashMap(mapStatus,"menikah","belum menikah", "single parent");
		
		HashMap<Integer, String> mapPenempatan = new HashMap<Integer,String>();
		karyawan.insertToAddHashMap(mapPenempatan,"jakarta", "bandung", "karawang");
		//==============================================================================================================
		
		while(!isComplete) {
			System.out.print("Nama: "); nama = scan.nextLine();
			karyawan.validasiInputan(nama, 32, isComplete, "huruf");
			isComplete = karyawan.isTrue();
		}
		
		isComplete = false;
		while(!isComplete) {
			System.out.print("NIK: "); nik = scan.nextLine();
			karyawan.validasiInputan(nik, 12, isComplete, "angka");
			isComplete = karyawan.isTrue();
		}
		
		isComplete = false;
		while(!isComplete) {
			System.out.print("Posisi (PG/SA/Tester): "); posisi = scan.nextLine();
			karyawan.validasiInputan(posisi, listPosisi, isComplete, "huruf");
			isComplete = karyawan.isTrue();
		}
		
		isComplete = false;
		while(!isComplete) {
			System.out.print("Tingkat (Junior/Middle/Senior): "); tingkatan = scan.nextLine();
			karyawan.validasiInputan(tingkatan, listTingkatan, isComplete, "huruf");
			isComplete = karyawan.isTrue();
		}
		
		isComplete = false;
		while(!isComplete) {
			System.out.print("Lama Bekerja (dalam tahun): "); lamaKerja = scan.nextLine();
			karyawan.validasiInputan(lamaKerja, isComplete, "angka");
			isComplete = karyawan.isTrue();
		}
		
		isComplete = false;
		while(!isComplete) {
			System.out.print("Penempatan (Jakarta/Bandung/Karawang): "); penempatan = scan.nextLine();
			karyawan.validasiInputan(penempatan, mapPenempatan, isComplete, "huruf");
			isComplete = karyawan.isTrue();
		}
		
		isComplete = false;
		while(!isComplete) {
			System.out.print("Status (Menikah/Belum Menikah/Single Parent): "); status = scan.nextLine();
			karyawan.validasiInputan(status, mapStatus, isComplete, "huruf");
			isComplete = karyawan.isTrue();
		}
		
		isComplete = false;
		while(!isComplete) {
			System.out.print("Jumlah jam lembur: "); lembur = scan.nextLine();
			karyawan.validasiInputan(lembur, isComplete, "angka");
			isComplete = karyawan.isTrue();
		}
			
		switch (posisi.toLowerCase()) {
		case "pg":
			isComplete = false;
			while(!isComplete) {
				System.out.print("Jumlah Fixing bug yang diselesaikan: "); jumlahUntukDapatBonus= scan.nextLine();
				karyawan.validasiInputan(jumlahUntukDapatBonus, isComplete, "angka");
				isComplete = karyawan.isTrue();
			}
			programmer = new Programmer(nama, nik, karyawan.mencariGajiPokok(posisi, tingkatan, lamaKerja, penempatan), penempatan, Double.parseDouble(lembur), programmer.mencariBonus(jumlahUntukDapatBonus));
			programmer.displaySlipGaji(posisi, tingkatan, status);
			break;
		case "sa":
			analyst = new SystemAnalyst(nama, nik, karyawan.mencariGajiPokok(posisi, tingkatan, lamaKerja, penempatan), penempatan, Double.parseDouble(lembur));
			analyst.displaySlipGaji(posisi, tingkatan, status);
			break;
		case "tester":
			isComplete = false;
			while(!isComplete) {
				System.out.print("Jumlah TestCase yang dikerjakan: "); jumlahUntukDapatBonus= scan.nextLine();
				karyawan.validasiInputan(jumlahUntukDapatBonus, isComplete, "angka");
				isComplete = karyawan.isTrue();
			}
			tester = new Tester(nama, nik, karyawan.mencariGajiPokok(posisi, tingkatan, lamaKerja, penempatan), penempatan, Double.parseDouble(lembur), tester.mencariBonus(jumlahUntukDapatBonus));
			tester.displaySlipGaji(posisi, tingkatan, status);
			break;
		}
	}

}
