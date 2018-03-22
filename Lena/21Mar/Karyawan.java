import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Karyawan extends AbstrakKaryawan implements InterfaceUMK, InterfaceTunjangan, InterfacePTKP, InterfacePPH{
	private boolean isTrue;
	private double lembur;
	
	//===========================================Constructor overloading================================================
	public Karyawan() {
		// TODO Auto-generated constructor stub
	}
	public Karyawan(String nama, String nik, double gapok, String penempatan, double lembur) {
		this.nama = nama;
		this.nik = nik;
		setGajiPokok(gapok);
		this.penempatanKerja =penempatan;
		this.lembur = lembur;
	}
	//==================================================================================================================
	
	public double getLembur() {
		return lembur;
	}
	public void setLembur(double lembur) {
		this.lembur = lembur;
	}

	public boolean isTrue() {
		return isTrue;
	}
	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}
	

	//===========================================method overloading=====================================================
	public void validasiInputan(String nilai, int panjangKarakter, boolean isTrue, String inputanBerupa) {
		
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
						isTrue =true;
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
						isTrue =true;
					}
				}
				else {
					System.out.println("Inputan tidak boleh huruf / simbol!");
				}
			}
		}
		setTrue(isTrue);
	}
	
	public void validasiInputan(String nilai, ArrayList<String> namaList, boolean isTrue, String inputanBerupa) {
		
		if(nilai.matches("[\\W]*")) {
			System.out.println("Inputan anda kosong atau salah!");
		}
		else {
			if(inputanBerupa.equalsIgnoreCase("huruf")) {
				if(nilai.matches("[a-zA-Z .,]*")) {
					for(String nilai2 : namaList) {
						if(nilai.equalsIgnoreCase(nilai2)) {
							isTrue = true;
						}
					}
					
					if(!isTrue) {
						System.out.println("Inputan anda salah!");
					}
				}
				else {
					System.out.println("Inputan tidak boleh angka / simbol!");
				}
			}
		}
		setTrue(isTrue);
	}
	
	public void validasiInputan(String nilai, HashMap<Integer, String> namaMap, boolean isTrue, String inputanBerupa) {
		
		if(nilai.matches("[\\W]*")) {
			System.out.println("Inputan anda kosong atau salah!");
		}
		else {
			if(inputanBerupa.equalsIgnoreCase("huruf")) {
				if(nilai.matches("[a-zA-Z .,]*")) {
					for(Map.Entry map : namaMap.entrySet()) {
						if(nilai.toLowerCase().equals(map.getValue())) {
							isTrue = true;
						}
					}
					
					if(!isTrue) {
						System.out.println("Inputan anda salah!");
					}
				}
				else {
					System.out.println("Inputan tidak boleh angka / simbol!");
				}
			}
		}
		setTrue(isTrue);
	}

	public void validasiInputan(String nilai, boolean isTrue, String inputanBerupa) {
		
		if(nilai.matches("[\\W]*")) {
			System.out.println("Inputan anda kosong atau salah!");
		}
		else {
			if(inputanBerupa.equalsIgnoreCase("huruf")) {
				if(nilai.matches("[a-zA-Z .,]*")) {
					isTrue = true;
				}
				else {
					System.out.println("Inputan tidak boleh angka / simbol!");
				}
			}
			else if(inputanBerupa.equalsIgnoreCase("angka")) {
				if(nilai.matches("[0-9]*")) {
					isTrue = true;
				}
				else {
					System.out.println("Inputan tidak boleh huruf / simbol / bernilai negatif!");
				}
			}
		}
		setTrue(isTrue);
	}
	//==================================================================================================================
	
	//==============================================ArrayList===========================================================
	public void insertToAddArrayList(ArrayList<String> namaList, String nilai1, String nilai2, String nilai3) {
		namaList.add(nilai1);
		namaList.add(nilai2);
		namaList.add(nilai3);
	}
	//==================================================================================================================
	
	//===============================================HashMap============================================================
	public void insertToAddHashMap(HashMap<Integer,String> namaMap, String nilai1, String nilai2, String nilai3) {
		namaMap.put(1, nilai1);
		namaMap.put(2, nilai2);
		namaMap.put(3, nilai3);
	}
	//==================================================================================================================
	
	//========================================override method===========================================================
	@Override
	public double mencariUMK(String penempatan) {
		// TODO Auto-generated method stub
		double umk=0;
		
		if(penempatan.equalsIgnoreCase("jakarta")) {
			umk = umkJakarta;
		}
		else if(penempatan.equalsIgnoreCase("bandung")) {
			umk = umkBandung;
		}
		else if(penempatan.equalsIgnoreCase("karawang")) {
			umk = umkKarawang;
		}
		
		return umk;
	}
	
	public double mencariGajiPokok(String posisi, String tingkatan, String lamaKerja, String penempatan) {
		double gapok = 0;
		double umk = mencariUMK(penempatan);
		
		switch (posisi.toLowerCase()) {
			case "pg":
				if(tingkatan.equalsIgnoreCase("junior")) {
					if(Double.parseDouble(lamaKerja) > 3) {
						gapok = umk * 1.5;
					}
					else if(Double.parseDouble(lamaKerja) > 1 && Double.parseDouble(lamaKerja) <= 3) {
						gapok = umk * 1.2;
					}
					else {
						gapok = umk;
					}
				}
				else if(tingkatan.equalsIgnoreCase("middle")) {
					if(Double.parseDouble(lamaKerja) > 4) {
						gapok = umk * 2.1;
					}
					else if(Double.parseDouble(lamaKerja) > 2 && Double.parseDouble(lamaKerja) <= 4) {
						gapok = umk * 1.8;
					}
					else {
						gapok = umk * 1.7;
					}
				}
				else if(tingkatan.equalsIgnoreCase("senior")) {
					if(Double.parseDouble(lamaKerja) > 4) {
						gapok = umk * 2.8;
					}
					else if(Double.parseDouble(lamaKerja) > 2 && Double.parseDouble(lamaKerja) <= 4) {
						gapok = umk * 2.7;
					}
					else {
						gapok = umk * 2.5;
					}
				}
			break;
			case "sa":
				if(tingkatan.equalsIgnoreCase("junior")) {
					if(Double.parseDouble(lamaKerja) > 3) {
						gapok = umk * 1.6;
					}
					else if(Double.parseDouble(lamaKerja) > 1 && Double.parseDouble(lamaKerja) <= 3) {
						gapok = umk * 1.3;
					}
					else {
						gapok = umk * 1.2;
					}
				}
				else if(tingkatan.equalsIgnoreCase("middle")) {
					if(Double.parseDouble(lamaKerja) > 4) {
						gapok = umk * 2.2;
					}
					else if(Double.parseDouble(lamaKerja) > 2 && Double.parseDouble(lamaKerja) <= 4) {
						gapok = umk * 1.9;
					}
					else {
						gapok = umk * 1.8;
					}
				}
				else if(tingkatan.equalsIgnoreCase("senior")) {
					if(Double.parseDouble(lamaKerja) > 4) {
						gapok = umk * 3;
					}
					else if(Double.parseDouble(lamaKerja) > 2 && Double.parseDouble(lamaKerja) <= 4) {
						gapok = umk * 2.9;
					}
					else {
						gapok = umk * 2.7;
					}
				}
			break;
			case "tester":
				if(tingkatan.equalsIgnoreCase("junior")) {
					if(Double.parseDouble(lamaKerja) > 3) {
						gapok = umk * 1.5;
					}
					else if(Double.parseDouble(lamaKerja) > 1 && Double.parseDouble(lamaKerja) <= 3) {
						gapok = umk * 1.2;
					}
					else {
						gapok = umk * 1.1;
					}
				}
				else if(tingkatan.equalsIgnoreCase("middle")) {
					if(Double.parseDouble(lamaKerja) > 4) {
						gapok = umk * 2.1;
					}
					else if(Double.parseDouble(lamaKerja) > 2 && Double.parseDouble(lamaKerja) <= 4) {
						gapok = umk * 1.9;
					}
					else {
						gapok = umk * 1.8;
					}
				}
				else if(tingkatan.equalsIgnoreCase("senior")) {
					if(Double.parseDouble(lamaKerja) > 4) {
						gapok = umk * 2.8;
					}
					else if(Double.parseDouble(lamaKerja) > 2 && Double.parseDouble(lamaKerja) <= 4) {
						gapok = umk * 2.7;
					}
					else {
						gapok = umk * 2.6;
					}
				}
			break;
		}
		
		return gapok;
	}
	
	public double mencariGajiSebulan(String tingkatan) {
		double tunjanganPegawai=0;
		
		if(tingkatan.equalsIgnoreCase("junior")) {
			tunjanganPegawai = tunjanganPegawaiJunior;
		}
		else if(tingkatan.equalsIgnoreCase("middle")) {
			tunjanganPegawai = tunjanganPegawaiMiddle;
		}
		else if(tingkatan.equalsIgnoreCase("senior")) {
			tunjanganPegawai = tunjanganPegawaiSenior;
		}
		
		return getGajiPokok()+tunjanganPegawai;
	}
	
	public double mencariUangLembur(String jumlahJam, String tingkatan) {
		
		return Double.parseDouble(jumlahJam)*1.5*mencariGajiSebulan(tingkatan)/173;
	}
	
	public double mencariBonus(String nilai) {
		return 0;
	}
	
	@Override
	public double mencariTunjanganKeluarga(String tingkatan, String status) {
		// TODO Auto-generated method stub
		double persen = 0;
		if(status.equalsIgnoreCase("menikah")) {
			persen = 0.02;
		}
		return persen*mencariGajiSebulan(tingkatan);
	}
	
	@Override
	public double mencariTunjanganTransport(String penempatan) {
		// TODO Auto-generated method stub
		double tunjangan = 0;
		if(penempatan.equalsIgnoreCase("jakarta")) {
			tunjangan = tunjanganTransportJakarta; 
		}
		return tunjangan;
	}
	
	@Override
	public double mencariGajiKotor(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		return mencariGajiSebulan(tingkatan)+mencariTunjanganKeluarga(tingkatan, status)+mencariTunjanganTransport(penempatan)+lembur;
	}
	
	@Override
	public double mencariBiayaJabatan(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		double total = 0.05*mencariGajiKotor(tingkatan, penempatan, status);
		if(total > 500000) {
			total = 500000;
		}
		return total;
	}
	
	@Override
	public double mencariGajiBersih(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		return mencariGajiKotor(tingkatan, penempatan, status) - mencariBiayaJabatan(tingkatan, penempatan, status);
	}
	
	@Override
	public double mencariGajiBersihSetahun(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		return 12*mencariGajiBersih(tingkatan, penempatan, status);
	}
	
	@Override
	public double mencariPTKP(String status) {
		// TODO Auto-generated method stub
		double ptkp = biayaPTKPdefault;
		if(status.equalsIgnoreCase("menikah")) {
			ptkp += biayaPTKPpenambahan;
		}
		
		return ptkp;
	}
	
	@Override
	public double mencariPKP(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		return mencariGajiBersihSetahun(tingkatan, penempatan, status) - mencariPTKP(status);
	}
	
	@Override
	public double mencariPPH(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		double pkp=mencariPKP(tingkatan, penempatan, status);
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
	public double mencariPotonganBPJSKesehatan(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		return 0.1 * mencariGajiKotor(tingkatan, penempatan, status);
	}
	
	@Override
	public double mencariPotonganBPJSKetenagakerjaan(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		return 0.1 * mencariGajiKotor(tingkatan, penempatan, status);
	}

	@Override
	public double mencariTotalPotongan(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		return mencariPotonganBPJSKesehatan(tingkatan, penempatan, status) +
				mencariPotonganBPJSKetenagakerjaan(tingkatan, penempatan, status) +
				mencariPPH(tingkatan, penempatan, status);
	}
	
	@Override
	public double mencariTakeHomePay(String tingkatan, String penempatan, String status) {
		// TODO Auto-generated method stub
		return mencariGajiKotor(tingkatan, penempatan, status) - mencariTotalPotongan(tingkatan, penempatan, status);
	}
	
	@Override
	public void displaySlipGaji(String posisi, String tingkatan, String status) {
		// TODO Auto-generated method stub
		System.out.println("SLIP GAJI\n");
		System.out.println("Pegawai : "+nama+"   ("+nik+")");
		System.out.println("Jabatan : "+tingkatan+" "+posisi);
		System.out.println("===================================================================================");
		
	}
	//==================================================================================================================
}
