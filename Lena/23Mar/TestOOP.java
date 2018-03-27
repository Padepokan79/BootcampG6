package quizOOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestOOP {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		Karyawan karyawan = new Karyawan();
		Programmer programmer = new Programmer();
		SystemAnalyst analyst = new SystemAnalyst();
		Tester tester = new Tester();
		
		boolean isComplete = false;
		String nama="", nik="", posisiJabatan = "", tingkatanJabatan="", lamaKerja="", penempatanKerja="", statusPerkawinan="", jumlahJamLembur="", jumlahUntukDapatBonus="";
		
		//================================================arrayList=====================================================
		ArrayList<String> listPosisi = new ArrayList<String>();
		karyawan.insertToAddArrayList(listPosisi, "programmer", "system analyst", "tester");
			
		ArrayList<String> listTingkatan = new ArrayList<String>();
		karyawan.insertToAddArrayList(listTingkatan, "junior","middle","senior");
		//==============================================================================================================
				
		//==================================================hashMap=====================================================
		HashMap<Integer, String> mapStatus = new HashMap<Integer,String>();
		karyawan.insertToAddHashMap(mapStatus,"menikah","belum menikah");
			
		HashMap<Integer, String> mapPenempatan = new HashMap<Integer,String>();
		karyawan.insertToAddHashMap(mapPenempatan,"jakarta", "bandung", "karawang");
		//==============================================================================================================
				
		while(!isComplete) {
			System.out.print("Nama lengkap\t\t\t\t    : "); nama = scan.nextLine();
			karyawan.validasiInputan(nama, 32, isComplete, "huruf");
			isComplete = karyawan.isTrue;
		}
				
		isComplete = false;
		while(!isComplete) {
			System.out.print("NIK\t\t\t\t\t    : "); nik = scan.nextLine();
			karyawan.validasiInputan(nik, 12, isComplete, "angka");
			isComplete = karyawan.isTrue;
		}
				
		isComplete = false;
		while(!isComplete) {
			System.out.print("Posisi (Programmer/System Analyst/Tester)   : "); posisiJabatan = scan.nextLine();
			karyawan.validasiInputan(posisiJabatan, listPosisi, isComplete, "huruf");
			isComplete = karyawan.isTrue;
		}
				
		isComplete = false;
		while(!isComplete) {
			System.out.print("Tingkat (Junior/Middle/Senior)\t\t    : "); tingkatanJabatan = scan.nextLine();
			karyawan.validasiInputan(tingkatanJabatan, listTingkatan, isComplete, "huruf");
			isComplete = karyawan.isTrue;
		}
				
		isComplete = false;
		while(!isComplete) {
			System.out.print("Lama Bekerja (dalam tahun)\t\t    : "); lamaKerja = scan.nextLine();
			karyawan.validasiInputan(lamaKerja, isComplete, "angka");
			isComplete = karyawan.isTrue;
		}
				
		isComplete = false;
		while(!isComplete) {
			System.out.print("Penempatan (Jakarta/Bandung/Karawang)\t    : "); penempatanKerja = scan.nextLine();
			karyawan.validasiInputan(penempatanKerja, mapPenempatan, isComplete, "huruf");
			isComplete = karyawan.isTrue;
		}
				
		isComplete = false;
		while(!isComplete) {
			System.out.print("Status (Menikah/Belum Menikah)\t\t    : "); statusPerkawinan = scan.nextLine();
			karyawan.validasiInputan(statusPerkawinan, mapStatus, isComplete, "huruf");
			isComplete = karyawan.isTrue;
		}
				
		isComplete = false;
		while(!isComplete) {
			System.out.print("Jumlah jam lembur\t\t\t    : "); jumlahJamLembur = scan.nextLine();
			karyawan.validasiInputan(jumlahJamLembur, isComplete, "angka");
			isComplete = karyawan.isTrue;
		}
		
		switch (posisiJabatan.toLowerCase()) {
		case "programmer":
			isComplete = false;
			while(!isComplete) {
				System.out.print("Jumlah Fixing bug yang diselesaikan\t    : "); jumlahUntukDapatBonus= scan.nextLine();
				karyawan.validasiInputan(jumlahUntukDapatBonus, isComplete, "angka");
				isComplete = karyawan.isTrue;
			}
			programmer = new Programmer(nama, nik, posisiJabatan, tingkatanJabatan, Double.parseDouble(lamaKerja), penempatanKerja, statusPerkawinan, Double.parseDouble(jumlahJamLembur), Double.parseDouble(jumlahUntukDapatBonus));
			programmer.displaySlipGaji();
			break;
			
		case "system analyst":
			analyst = new SystemAnalyst(nama, nik, posisiJabatan, tingkatanJabatan, Double.parseDouble(lamaKerja), penempatanKerja, statusPerkawinan, Double.parseDouble(jumlahJamLembur));
			analyst.displaySlipGaji();
			break;
			
		case "tester":
			isComplete = false;
			while(!isComplete) {
				System.out.print("Jumlah TestCase yang dikerjakan\t\t    : "); jumlahUntukDapatBonus= scan.nextLine();
				karyawan.validasiInputan(jumlahUntukDapatBonus, isComplete, "angka");
				isComplete = karyawan.isTrue;
			}
			tester = new Tester(nama, nik, posisiJabatan, tingkatanJabatan, Double.parseDouble(lamaKerja), penempatanKerja, statusPerkawinan, Double.parseDouble(jumlahJamLembur), Double.parseDouble(jumlahUntukDapatBonus));
			tester.displaySlipGaji();
			break;
		}
	}
}
