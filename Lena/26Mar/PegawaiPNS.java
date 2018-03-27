/* @author : lenawidiani
 * @dibuat : 26 Maret 2018
 * 
 */

import java.util.HashMap;
import java.util.Map;

public abstract class PegawaiPNS implements GajiPokok, Tunjangan, Potongan{
	private String nama, nip, gender, golongan, statusNikah, namaTunjanganLain;
	private int masaKerja, jumlahAnak, besarTunjanganLain;
	
	//==================================================hashMap=========================================================
	HashMap<String, Integer> mapGajiPokok = new HashMap<String, Integer>();
	HashMap<Integer, Integer> mapTaperum = new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> mapTunjanganUmum = new HashMap<Integer, Integer>();
	//==================================================================================================================
	
	//===========================================Constructor overloading================================================
	public PegawaiPNS() {
		// TODO Auto-generated constructor stub
	}

	public PegawaiPNS(String nama, String nip, String gender, String golongan, int masaKerja, String statusNikah,
					  int jumlahAnak, String namaTunjanganLain, int besarTunjanganLain) {
		
		this.nama = nama;
		this.nip = nip;
		this.gender = gender;
		this.golongan = golongan;
		this.statusNikah = statusNikah;
		this.namaTunjanganLain = namaTunjanganLain;
		this.masaKerja = masaKerja;
		this.jumlahAnak = jumlahAnak;
		this.besarTunjanganLain = besarTunjanganLain;
	}
	//==================================================================================================================
	
	public String getGolongan() {
		return golongan;
	}
	
	private double mencariGajiPokok() {
		int gapok=0;
		insertHashMapGajiPokok();
		setMasaKerjaMax();		
		
		for(Map.Entry map : mapGajiPokok.entrySet()) {
			if((golongan.toUpperCase()+String.valueOf(masaKerja)).equals(map.getKey())) {
				gapok = (int) map.getValue();
			}
		}
		return gapok;
	}
	
	private void setMasaKerjaMax() {
		if(golongan.substring(0, 1).equals("1")) {
			if(masaKerja > 27) {
				masaKerja = 27;
			}
		}
		else if(golongan.substring(0, 1).equals("2")) {
			if(masaKerja > 33) {
				masaKerja = 33;
			}
		}
		else if(golongan.substring(0, 1).equals("3") || golongan.substring(0, 1).equals("4")) {
			if(masaKerja > 32) {
				masaKerja = 32;
			}
		}
	}
	
	//===================================================hashMap=======================================================
	private void insertHashMapGajiPokok() {
		
		insertToAddHashMap(mapGajiPokok, "1A", GOL1A);
		insertToAddHashMap(mapGajiPokok, "1B", GOL1B);
		insertToAddHashMap(mapGajiPokok, "1C", GOL1C);
		insertToAddHashMap(mapGajiPokok, "1D", GOL1D);
		
		insertToAddHashMap(mapGajiPokok, "2A", GOL2A);
		insertToAddHashMap(mapGajiPokok, "2B", GOL2B);
		insertToAddHashMap(mapGajiPokok, "2C", GOL2C);
		insertToAddHashMap(mapGajiPokok, "2D", GOL2D);
		
		insertToAddHashMap(mapGajiPokok, "3A", GOL3A);
		insertToAddHashMap(mapGajiPokok, "3B", GOL3B);
		insertToAddHashMap(mapGajiPokok, "3C", GOL3C);
		insertToAddHashMap(mapGajiPokok, "3D", GOL3D);
		
		insertToAddHashMap(mapGajiPokok, "4A", GOL4A);
		insertToAddHashMap(mapGajiPokok, "4B", GOL4B);
		insertToAddHashMap(mapGajiPokok, "4C", GOL4C);
		insertToAddHashMap(mapGajiPokok, "4D", GOL4D);
		insertToAddHashMap(mapGajiPokok, "4E", GOL4E);
	}
	
	private void insertToAddHashMap(HashMap<String,Integer> namaMap, String golongan, int[] nilaiArray) {
		for (int i = 0; i < nilaiArray.length; i++) {
			namaMap.put((golongan+String.valueOf(i)), nilaiArray[i]);
		}
	}
	
	public void insertToAddHashMap(HashMap<Integer, Integer> namaMap, int[] array) {
		for (int i = 0; i < array.length; i++) {
			namaMap.put(i+1, array[i]);			
		}
	}
	//==================================================================================================================
	
	private double menghitungTunjanganMenikah() {
		double tunjangan = 0;
		
		if(statusNikah.equalsIgnoreCase("menikah")) {
			tunjangan = PERSEN_TUNJANGAN_MENIKAH * mencariGajiPokok();
		}
		
		return tunjangan;
	}
	
	private double menghitungTunjanganAnak() {
		int jumlahAnakTemp = jumlahAnak;
		
		if(jumlahAnak > MAX_JUMLAH_ANAK_TUNJANGAN) {
			jumlahAnakTemp = MAX_JUMLAH_ANAK_TUNJANGAN;
		}
		
		return PERSEN_TUNJANGAN_ANAK * mencariGajiPokok() * jumlahAnakTemp;
	}
	
	private double menghitungTunjanganBeras() {
		int jumlahAnggota = 1;
		
		if(statusNikah.equalsIgnoreCase("menikah")) {
			jumlahAnggota++;
		}
		
		if(jumlahAnak > 0 && jumlahAnak <= MAX_JUMLAH_ANAK_TUNJANGAN) {
			jumlahAnggota += jumlahAnak;
		}
		else if(jumlahAnak > MAX_JUMLAH_ANAK_TUNJANGAN) {
			jumlahAnggota += MAX_JUMLAH_ANAK_TUNJANGAN;
		}
		
		return TOTAL_BERAS_PERBULAN * HARGA_BERAS * jumlahAnggota;
	}

	//========================================override method===========================================================
	public double setTunjanganStruktural() {
		return 0;
	}
	public double setTunjanganFungsional() {
		return 0;
	}
	public double setTunjanganUmum() {
		return 0;
	}
	//==================================================================================================================
	
	private double menghitungGajiKotorSebelumPPH() {
		return mencariGajiPokok() + menghitungTunjanganMenikah() + menghitungTunjanganAnak() +
			   menghitungTunjanganBeras() + setTunjanganStruktural() + setTunjanganFungsional() + setTunjanganUmum() + besarTunjanganLain;
	}
	
	private double menghitungBiayaJabatan() {
		double biaya = 0;
		
		biaya = PERSEN_BIAYA_JABATAN * menghitungGajiKotorSebelumPPH();
		if(biaya > MAX_BIAYA_JABATAN) {
			biaya = MAX_BIAYA_JABATAN;
		}
		
		return biaya;
	}

	private double menghitungIuranPensiun() {
		return PERSEN_IURAN_PENSIUN * (mencariGajiPokok()+menghitungTunjanganMenikah()+menghitungTunjanganAnak());
	}
	
	private double menghitungPenghasilanBersihSetahun() {
		return (menghitungGajiKotorSebelumPPH() - menghitungBiayaJabatan() - menghitungIuranPensiun())*12;
	}
	
	private double menghitungPTKP() {
		int jumlahAnggota = 0;
		
		if(statusNikah.equalsIgnoreCase("menikah")) {
			jumlahAnggota++;
		}
		
		if(jumlahAnak > 0 && jumlahAnak <= MAX_JUMLAH_ANAK_PTKP) {
			jumlahAnggota += jumlahAnak;
		}
		else if(jumlahAnak > MAX_JUMLAH_ANAK_PTKP) {
			jumlahAnggota += MAX_JUMLAH_ANAK_PTKP;
		}
		
		return PTKP_DEFAULT + (PTKP_PENAMBAHAN*jumlahAnggota);
	}

	private double menghitungPKP() {
		return menghitungPenghasilanBersihSetahun() - menghitungPTKP();
	}
	
	private double menghitungPPH() {
		double pkp=menghitungPKP();
		double pkpTemp;
		double pphSetahun=0;
		
		if(pkp>0) {
			pkpTemp = pkp;
			if(pkpTemp-PKP_RANGE_LAPIS_PERTAMA > 0) {
				pkpTemp = PKP_RANGE_LAPIS_PERTAMA;
			}
			pphSetahun = PERSEN_PKP_KURANG_DARI_50JUTA * pkpTemp;
		}
		
		if(pkp > PKP_RANGE_LAPIS_PERTAMA){
			pkpTemp = pkp - PKP_RANGE_LAPIS_PERTAMA;
			if(pkpTemp - PKP_RANGE_LAPIS_KEDUA > 0){
				pkpTemp = PKP_RANGE_LAPIS_KEDUA;
			}
			pphSetahun = pphSetahun + (PERSEN_PKP_RANGE_250JUTA * pkpTemp);
		}
		
		if(pkp > PKP_RANGE_LAPIS_KEDUA){
			pkpTemp = pkp - PKP_RANGE_LAPIS_KEDUA;
			if(pkpTemp - PKP_RANGE_LAPIS_KETIGA > 0){
				pkpTemp = PKP_RANGE_LAPIS_KETIGA;
			}
			pphSetahun = pphSetahun + (PERSEN_PKP_RANGE_500JUTA * pkpTemp);
		}

		if(pkp > PKP_RANGE_LAPIS_KETIGA){
			pkpTemp = pkp - PKP_RANGE_LAPIS_KETIGA;
			pphSetahun = pphSetahun + (PERSEN_PKP_LEBIH_DARI_500JUTA * pkpTemp);
		}
		
		return pphSetahun/12;
	}

	private double menghitungPenghasilanKotorDenganPPH() {
		return menghitungGajiKotorSebelumPPH() + menghitungPPH();
	}
	
	private double menghitungIWP() {
		return PERSEN_IWP * (mencariGajiPokok()+menghitungTunjanganMenikah()+menghitungTunjanganAnak());
	}
	
	private double setTaperum() {
		double biaya=0;
		
		insertToAddHashMap(mapTaperum, POTONGAN_TAPERUM);
		
		for(Map.Entry map : mapTaperum.entrySet()) {
			if(Integer.parseInt(golongan.substring(0, 1)) == (int) map.getKey()) {
				biaya = (int) map.getValue();
			}
		}
		return biaya;
	}

	private double menghitungTotalPotongan() {
		return menghitungIWP()+menghitungPPH()+setTaperum();
	}
	
	private double menghitungTakeHomePay() {
		return menghitungPenghasilanKotorDenganPPH() - menghitungTotalPotongan();
	}

	public void displayGaji() {
		System.out.println("\n\n\t\t\t\tSLIP GAJI");
		System.out.println("\nPegawai : " + nama +" ( " + nip + " )");
		System.out.println("=========================================================================");
		System.out.println("\t   Penghasilan\t\t\t\t     Potongan");
		System.out.println("=========================================================================");
		System.out.println(" Gaji Pokok\t\t" + (int) mencariGajiPokok()               + "\t\t IWP\t\t\t" + (int) menghitungIWP());
		System.out.println(" T. Istri/Suami\t\t" + (int) menghitungTunjanganMenikah() + "\t\t Pot. PPH\t\t" + (int) menghitungPPH());
		System.out.println(" T. Anak\t\t" + (int) menghitungTunjanganAnak()           + "\t\t Taperum\t\t" + (int) setTaperum());
		System.out.println(" T. Umum\t\t" + (int) setTunjanganUmum()                  + "\t\t                 ---------------");
		System.out.println(" T. Struktural\t\t" + (int) setTunjanganStruktural());
		System.out.println(" T. Fungsional\t\t" + (int) setTunjanganFungsional()      + "\t\t Jml. Pot\t\t" + (int) menghitungTotalPotongan());
		System.out.println(" T. Lain\t\t" + besarTunjanganLain);
		System.out.println(" T. Beras\t\t" + (int) menghitungTunjanganBeras()         + "\t\t                 ---------------");
		System.out.println(" T. Pajak\t\t" + (int) menghitungPPH());
		System.out.println("                 ---------------"                         + "\t Jml. Bersih\t\t" + (int) menghitungTakeHomePay());
		System.out.println(" Jml. Kotor\t\t"+ (int) menghitungPenghasilanKotorDenganPPH());
		System.out.println("=========================================================================");
	}
}
