package quizOOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Karyawan extends AbstrakKaryawan implements InterfaceUMK, InterfaceTunjangan, InterfacePTKP, InterfacePPH{
	public boolean isTrue;
	private double gajiPokok, tunjanganPegawai, tunjanganMenikah, tunjanganTransportasi;
	
	//===========================================Constructor overloading================================================
	public Karyawan() {
	// TODO Auto-generated constructor stub
	}
	public Karyawan(String nama, String nik, String posisiJabatan, String tingkatanJabatan, double lamaKerja,
					String penempatanKerja, String statusPerkawinan, double jumlahJamLembur) {
		this.nama = nama;
		this.nik = nik;
		this.posisiJabatan = posisiJabatan;
		this.tingkatanJabatan = tingkatanJabatan;
		this.lamaKerja = lamaKerja;
		this.penempatanKerja = penempatanKerja;
		this.statusPerkawinan = statusPerkawinan;
		this.jumlahJamLembur = jumlahJamLembur;
	}
	//==================================================================================================================
	
	//===========================================method overloading=====================================================
	public void validasiInputan(String nilai, int panjangKarakter, boolean isComplete, String inputanBerupa) {	
		if(nilai.matches("[\\W]*")) {
			System.out.println("Inputan anda kosong atau salah!");
		}
		else {
			if(inputanBerupa.equalsIgnoreCase("huruf")) {
				if(nilai.matches("[a-zA-Z .,]*")) {
					if(nilai.length() < 1) {
						System.out.println("Inputan anda tidak boleh kosong!");
					}
					else if(nilai.length() > panjangKarakter) {
						System.out.println("Inputan anda lebih dari "+panjangKarakter+" karakter");
					}
					else {
						isComplete =true;
					}
				}
				else {
					System.out.println("Inputan tidak boleh angka / simbol!");
				}
			}
			else if(inputanBerupa.equalsIgnoreCase("angka")) {
				if(nilai.matches("[0-9]*")) {
					if(nilai.length() < 1) {
						System.out.println("Inputan anda tidak boleh kosong!");
					}
					else if(nilai.length() > panjangKarakter) {
						System.out.println("Inputan anda lebih dari "+panjangKarakter+" karakter");
					}
					else {
						isComplete =true;
					}
				}
				else {
					System.out.println("Inputan tidak boleh huruf / simbol!");
				}
			}
		}
		isTrue = isComplete;
	}
		
	public void validasiInputan(String nilai, ArrayList<String> namaList, boolean isComplete, String inputanBerupa) {
		if(nilai.matches("[\\W]*")) {
			System.out.println("Inputan anda kosong atau salah!");
		}
		else {
			if(inputanBerupa.equalsIgnoreCase("huruf")) {
				if(nilai.matches("[a-zA-Z .,]*")) {
					for(String nilai2 : namaList) {
						if(nilai.equalsIgnoreCase(nilai2)) {
							isComplete = true;
						}
					}
					
					if(!isComplete) {
						System.out.println("Inputan anda salah!");
					}
				}
				else {
					System.out.println("Inputan tidak boleh angka / simbol!");
				}
			}
		}
		isTrue = isComplete;
	}
		
	public void validasiInputan(String nilai, HashMap<Integer, String> namaMap, boolean isComplete, String inputanBerupa) {
		if(nilai.matches("[\\W]*")) {
			System.out.println("Inputan anda kosong atau salah!");
		}
		else {
			if(inputanBerupa.equalsIgnoreCase("huruf")) {
				if(nilai.matches("[a-zA-Z .,]*")) {
					for(Map.Entry map : namaMap.entrySet()) {
						if(nilai.toLowerCase().equals(map.getValue())) {
							isComplete = true;
						}
					}
					
					if(!isComplete) {
						System.out.println("Inputan anda salah!");
					}
				}
				else {
					System.out.println("Inputan tidak boleh angka / simbol!");
				}
			}
		}
		isTrue = isComplete;
	}

	public void validasiInputan(String nilai, boolean isComplete, String inputanBerupa) {
		if(nilai.matches("[\\W]*")) {
			System.out.println("Inputan anda kosong atau salah!");
		}
		else {
			if(inputanBerupa.equalsIgnoreCase("huruf")) {
				if(nilai.matches("[a-zA-Z .,]*")) {
					isComplete = true;
				}
				else {
					System.out.println("Inputan tidak boleh angka / simbol!");
				}
			}
			else if(inputanBerupa.equalsIgnoreCase("angka")) {
				if(nilai.matches("[0-9]*")) {
					isComplete = true;
				}
				else {
					System.out.println("Inputan tidak boleh huruf / simbol / bernilai negatif!");
				}
			}
		}
		isTrue = isComplete;
	}
	//==================================================================================================================
	
	//==============================================ArrayList===========================================================
	public void insertToAddArrayList(ArrayList<String> namaList, String nilai1, String nilai2, String nilai3) {
		namaList.add(nilai1);
		namaList.add(nilai2);
		namaList.add(nilai3);
	}
	//==================================================================================================================
	
	//======================================HashMap & method overloading================================================
	public void insertToAddHashMap(HashMap<Integer,String> namaMap, String nilai1, String nilai2) {
		namaMap.put(1, nilai1);
		namaMap.put(2, nilai2);
	}
	public void insertToAddHashMap(HashMap<Integer,String> namaMap, String nilai1, String nilai2, String nilai3) {
		namaMap.put(1, nilai1);
		namaMap.put(2, nilai2);
		namaMap.put(3, nilai3);
	}
	//==================================================================================================================
	

	private double mencariUMK() {
		// TODO Auto-generated method stub
		double umk=0;
		
		if(penempatanKerja.equalsIgnoreCase("jakarta")) {
			umk = umkJakarta;
		}
		else if(penempatanKerja.equalsIgnoreCase("bandung")) {
			umk = umkBandung;
		}
		else if(penempatanKerja.equalsIgnoreCase("karawang")) {
			umk = umkKarawang;
		}
		
		return umk;
	}
	
	private void mencariGajiPokok() {
		double gapok = 0;
		double umk = mencariUMK();
		
		switch (posisiJabatan.toLowerCase()) {
			case "programmer":
				if(tingkatanJabatan.equalsIgnoreCase("junior")) {
					if(lamaKerja > 3) {
						gapok = umk * 1.5;
					}
					else if(lamaKerja > 1 && lamaKerja <= 3) {
						gapok = umk * 1.2;
					}
					else {
						gapok = umk;
					}
				}
				else if(tingkatanJabatan.equalsIgnoreCase("middle")) {
					if(lamaKerja > 4) {
						gapok = umk * 2.1;
					}
					else if(lamaKerja > 2 && lamaKerja <= 4) {
						gapok = umk * 1.8;
					}
					else {
						gapok = umk * 1.7;
					}
				}
				else if(tingkatanJabatan.equalsIgnoreCase("senior")) {
					if(lamaKerja > 4) {
						gapok = umk * 2.8;
					}
					else if(lamaKerja > 2 && lamaKerja <= 4) {
						gapok = umk * 2.7;
					}
					else {
						gapok = umk * 2.5;
					}
				}
			break;
			case "system analyst":
				if(tingkatanJabatan.equalsIgnoreCase("junior")) {
					if(lamaKerja > 3) {
						gapok = umk * 1.6;
					}
					else if(lamaKerja > 1 && lamaKerja <= 3) {
						gapok = umk * 1.3;
					}
					else {
						gapok = umk * 1.2;
					}
				}
				else if(tingkatanJabatan.equalsIgnoreCase("middle")) {
					if(lamaKerja > 4) {
						gapok = umk * 2.2;
					}
					else if(lamaKerja > 2 && lamaKerja <= 4) {
						gapok = umk * 1.9;
					}
					else {
						gapok = umk * 1.8;
					}
				}
				else if(tingkatanJabatan.equalsIgnoreCase("senior")) {
					if(lamaKerja > 4) {
						gapok = umk * 3;
					}
					else if(lamaKerja > 2 && lamaKerja <= 4) {
						gapok = umk * 2.9;
					}
					else {
						gapok = umk * 2.7;
					}
				}
			break;
			case "tester":
				if(tingkatanJabatan.equalsIgnoreCase("junior")) {
					if(lamaKerja > 3) {
						gapok = umk * 1.5;
					}
					else if(lamaKerja > 1 && lamaKerja <= 3) {
						gapok = umk * 1.2;
					}
					else {
						gapok = umk * 1.1;
					}
				}
				else if(tingkatanJabatan.equalsIgnoreCase("middle")) {
					if(lamaKerja > 4) {
						gapok = umk * 2.1;
					}
					else if(lamaKerja > 2 && lamaKerja <= 4) {
						gapok = umk * 1.9;
					}
					else {
						gapok = umk * 1.8;
					}
				}
				else if(tingkatanJabatan.equalsIgnoreCase("senior")) {
					if(lamaKerja > 4) {
						gapok = umk * 2.8;
					}
					else if(lamaKerja > 2 && lamaKerja <= 4) {
						gapok = umk * 2.7;
					}
					else {
						gapok = umk * 2.6;
					}
				}
			break;
		}
		gajiPokok = gapok;
	}
	
	private void mencariTunjanganPegawai() {
		// TODO Auto-generated method stub
		double tunjanganPegawai=0;
		
		if(tingkatanJabatan.equalsIgnoreCase("junior")) {
			tunjanganPegawai = tunjanganPegawaiJunior;
		}
		else if(tingkatanJabatan.equalsIgnoreCase("middle")) {
			tunjanganPegawai = tunjanganPegawaiMiddle;
		}
		else if(tingkatanJabatan.equalsIgnoreCase("senior")) {
			tunjanganPegawai = tunjanganPegawaiSenior;
		}
		
		this.tunjanganPegawai = tunjanganPegawai;
	}
	
	private void mencariTunjanganMenikah() {
		// TODO Auto-generated method stub
		double persen = 0;
		if(statusPerkawinan.equalsIgnoreCase("menikah")) {
			persen = 0.02;
		}
		tunjanganMenikah = persen*(gajiPokok+tunjanganPegawai); 
	}
	
	private void mencariTunjanganTransport() {
		// TODO Auto-generated method stub
		double tunjangan = 0;
		if(penempatanKerja.equalsIgnoreCase("jakarta")) {
			tunjangan = tunjanganTransportJakarta; 
		}
		tunjanganTransportasi = tunjangan;
	}
	
	//========================================override method===========================================================
	@Override
	public double mencariUangLembur() {
		// TODO Auto-generated method stub
		return jumlahJamLembur*1.5*(gajiPokok+tunjanganPegawai)/173;
	}

	public double mencariBonus() {
		return 0;
	}
	
	@Override
	public double mencariGajiKotor() {
		// TODO Auto-generated method stub
		return gajiPokok+tunjanganPegawai+tunjanganMenikah+tunjanganTransportasi+mencariUangLembur();
	}
	
	@Override
	public double mencariBiayaJabatan() {
		// TODO Auto-generated method stub
		double total = 0.05*mencariGajiKotor();
		if(total > 500000) {
			total = 500000;
		}
		return total;
	}
	
	@Override
	public double mencariGajiBersihSetahun() {
		// TODO Auto-generated method stub
		return (mencariGajiKotor() - mencariBiayaJabatan())*12;
	}
	
	@Override
	public double mencariPTKP() {
		// TODO Auto-generated method stub
		double ptkp = biayaPTKPdefault;
		if(statusPerkawinan.equalsIgnoreCase("menikah")) {
			ptkp += biayaPTKPpenambahan;
		}
		
		return ptkp;
	}

	@Override
	public double mencariPKP() {
		// TODO Auto-generated method stub
		return mencariGajiBersihSetahun() - mencariPTKP();
	}
	
	@Override
	public double mencariPPH() {
		// TODO Auto-generated method stub
		double pkp=mencariPKP();
		double pkpTemp;
		double pphSetahun=0;
		
		if(pkp>0) {
			pkpTemp = pkp;
			if(pkpTemp-rangeLapisPertama > 0) {
				pkpTemp = rangeLapisPertama;
			}
			pphSetahun = tarifKurangDari50Juta * pkpTemp;
		}
		
		if(pkp > 50000000){
			pkpTemp = pkp - rangeLapisPertama;
			if(pkpTemp - rangeLapisKedua > 0){
				pkpTemp = rangeLapisKedua;
			}
			pphSetahun = pphSetahun + (tarifRange250Juta * pkpTemp);
		}
		
		if(pkp > 250000000){
			pkpTemp = pkp - rangeLapisKedua;
			if(pkpTemp - rangeLapisKetiga > 0){
				pkpTemp = rangeLapisKetiga;
			}
			pphSetahun = pphSetahun + (tarifRange500Juta * pkpTemp);
		}

		if(pkp > 500000000){
			pkpTemp = pkp - rangeLapisKetiga;
			pphSetahun = pphSetahun + (tarifLebihDari500Juta * pkpTemp);
		}
		
		return pphSetahun/12;
	}
	
	@Override
	public double mencariPotonganBPJSKesehatan() {
		// TODO Auto-generated method stub
		return 0.01 * mencariGajiKotor();
	}
	
	@Override
	public double mencariPotonganBPJSKetenagakerjaan() {
		// TODO Auto-generated method stub
		return 0.01 * mencariGajiKotor();
	}

	@Override
	public double mencariTotalPotongan() {
		// TODO Auto-generated method stub
		return mencariPotonganBPJSKesehatan() +
				mencariPotonganBPJSKetenagakerjaan() +
				mencariPPH();
	}

	@Override
	public double mencariTakeHomePay() {
		// TODO Auto-generated method stub
		return mencariGajiKotor() - mencariTotalPotongan();
	}
	
	@Override
	public void displaySlipGaji() {
		// TODO Auto-generated method stub
		setNilai();
		System.out.println("\n\t\t\t\tSLIP GAJI\n");
		System.out.println("Pegawai\t: "+nama+"   ("+nik+")");
		System.out.println("Jabatan\t: "+tingkatanJabatan+" "+posisiJabatan);
		System.out.println("=============================================================================");
		System.out.println("\t\tPenghasilan\t\t\t\tPotongan");
		System.out.println("=============================================================================");
		System.out.println("Gaji Pokok\t\t"+(int)gajiPokok+"\t\tBPJS Kesehatan\t\t"+(int)mencariPotonganBPJSKesehatan());
		System.out.println("Tjn Pegawai\t\t"+(int)tunjanganPegawai+"\t\tBPJS Ketenagakerjaan\t"+(int)mencariPotonganBPJSKetenagakerjaan());
		System.out.println("Tjn Menikah\t\t"+(int)tunjanganMenikah+"\t\tPPH\t\t\t"+(int)mencariPPH());
		System.out.println("Tjn Transport\t\t"+(int)tunjanganTransportasi+"\t\t\t\t     ---------------");
		System.out.println("Lembur\t\t\t"+(int)mencariUangLembur()+"\t\tTotal Potongan\t\t"+(int)mencariTotalPotongan());
		System.out.println("Bonus\t\t\t"+(int)mencariBonus()+"\t\t\t\t     ---------------");
		System.out.println("                     ---------------");
		System.out.println("Gaji Kotor\t\t"+(int)mencariGajiKotor()+"\t\tTake Home Pay\t\t"+(int)mencariTakeHomePay());
		System.out.println("=============================================================================");

	}
	//==================================================================================================================
	
	private void setNilai() {
		mencariGajiPokok();
		mencariTunjanganPegawai();
		mencariTunjanganMenikah();
		mencariTunjanganTransport();
	}
}
