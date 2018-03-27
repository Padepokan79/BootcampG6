import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Author : Khairin Aulia
//Date Created : Monday, 26th March 2018

public class PNS extends AbstrakPNS implements TunjanganKeluarga, Taperum, LevelPKP, PTKP, Potongan {
	String 			pilJenisKelamin, pilGolongan, banyakAnak, pilKawin, pilPNS, nama = "-", nip = "-", jenisKelamin = "-", kodeGolongan = "-", statusKawin = "-", jenisPNS = "-", tunjanganLainnya = "0", namaTunjanganLainnya = "-";
	int 			masaKerja, golongan, jumlahAnak, besarTunjanganLainnya;
	private int		gajiPokok;
	private double  tunjKawin, tunjAnak, tunjJabatan, tunjBeras, taperum, tunjangan, gajiKotor, iwp, salaryCut, brutoSalaryWT, nettoSalaryAT,
					biayaJabatan, iuranPensiun, pengurang, penghasilanNetto, penghasilanNetto12, pTKP, pKP, pphSetahun, pphSebulan, jumlAnggotaKeluarga;
	boolean 		benar = false, inputGolongan = false;
	
    //GAJI GOLONGAN 1
	private	Integer[]  gol1A = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900,
							1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 
							2224600, 2224600};
	private	Integer[]  gol1B = {0, 0, 0, 1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 
							1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 
							2355200};
	private	Integer[]  gol1C = {0, 0, 0, 1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 
							2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 
							2454800};
	private	Integer[]  gol1D = {0, 0, 0, 1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 
							2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 
							2558700};			
	// GAJI GOLONGAN 2 
	private	Integer[]  gol2A = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 
							2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 
							2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100};
	private	Integer[]  gol2B = {0, 0, 0, 2103300, 2103300, 2169500, 2169500, 2237900, 2237900, 2308300, 2308300, 2381100, 2381100, 2456000, 2456000, 
							2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 2867900, 2958300, 2958300, 3051400, 3051400, 
							3147600, 3147600, 3246700, 3246700, 3348900}; 
	private	Integer[]  gol2C = {0, 0, 0, 2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 2481800, 2559900, 2559900, 
							2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 2989300, 3083400, 3083400, 3180500, 3180500, 
							3280700, 3280700, 3384000, 3384000, 3490600};
	private	Integer[]  gol2D = {0, 0, 0, 2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 2586700, 2586700, 2668200, 2668200, 
							2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 
							3419500, 3419500, 3527200, 3527200, 3638200};			
	// GAJI GOLONGAN 3
	private	Integer[]  gol3A = {2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 2959000, 2959000, 
							3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 3564100, 3564100, 3676400, 3676400, 
							3792100, 3792100, 3911600, 3911600, 4034800};
	private	Integer[]  gol3B = {2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 3084200, 3084200, 
							3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 3714900, 3714900, 3831900, 3831900, 
							3952600, 3952600, 4007000, 4007000, 4205400};
	private	Integer[]  gol3C = {2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 3214700, 3214700, 
							3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 3872000, 3872000, 3994200, 3994200, 
							4119700, 4119700, 4249500, 4249500, 4383300};
	private	Integer[]  gol3D = {2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 3350600, 3350600, 
							3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 3912600, 3912600, 4035800, 4035800, 4162900, 4162900, 
							4294000, 4294000, 4429300, 4429300, 4568800};		
	// GAJI GOLONGAN 4
	private	Integer[]  gol4A = {2899500, 2899500, 2990800, 2990800, 3085000, 3085000, 3182100, 3182100, 3282400, 3282400, 3385700, 3385700, 3492400, 3492400, 
							3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3953600, 4078100, 4078100, 4206500, 4206500, 4339000, 4339000, 
							4475700, 4475700, 4616600, 4616600, 4762000};
	private	Integer[]  gol4B = {3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3528900, 3528900, 3640100, 3640100, 
							3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 4384400, 4384400, 4522500, 4522500, 
							4665000, 4665000, 4811900, 4811900, 4963400};
	private	Integer[]  gol4C = {3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 3794100, 3794100, 
							3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 4569900, 4569900, 4713800, 4713800, 
							4862300, 4862300, 5015400, 5015400, 5173400};
	private	Integer[]  gol4D = {3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 3954600, 3954600, 
							4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 4763200, 4763200, 4913200, 4913200, 
							5068000, 5068000, 5227600, 5227600, 5392200};
	private	Integer[]  gol4E = {3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755700, 3755700, 3874000, 3874000, 3996000, 3996000, 4121800, 4121800, 
							4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 4964700, 4964700, 5121100, 5121100, 
							5282300, 5282300, 5448700, 5448700, 5620300};

	//HASHMAP		
	Map<String, List<Integer>> mapGaji = new HashMap<String, List<Integer>>();
	
	//CONSTRUCTOR
	public PNS() {
		//LIST DAN HASHMAP
		
		List<Integer> listGol1A = Arrays.asList(gol1A);
		List<Integer> listGol1B = Arrays.asList(gol1B);
		List<Integer> listGol1C = Arrays.asList(gol1C);
		List<Integer> listGol1D = Arrays.asList(gol1D);
		List<Integer> listGol2A = Arrays.asList(gol2A);
		List<Integer> listGol2B = Arrays.asList(gol2B);
		List<Integer> listGol2C = Arrays.asList(gol2C);
		List<Integer> listGol2D = Arrays.asList(gol2D);
		List<Integer> listGol3A = Arrays.asList(gol3A);
		List<Integer> listGol3B = Arrays.asList(gol3B);
		List<Integer> listGol3C = Arrays.asList(gol3C);
		List<Integer> listGol3D = Arrays.asList(gol3D);
		List<Integer> listGol4A = Arrays.asList(gol4A);
		List<Integer> listGol4B = Arrays.asList(gol4B);
		List<Integer> listGol4C = Arrays.asList(gol4C);
		List<Integer> listGol4D = Arrays.asList(gol4D);
		List<Integer> listGol4E = Arrays.asList(gol4E);
		
		mapGaji.put("1A", listGol1A);
		mapGaji.put("1B", listGol1B);
		mapGaji.put("1C", listGol1C);
		mapGaji.put("1D", listGol1D);
		mapGaji.put("2A", listGol2A);
		mapGaji.put("2B", listGol2B);
		mapGaji.put("2C", listGol2C);
		mapGaji.put("2D", listGol2D);
		mapGaji.put("3A", listGol3A);
		mapGaji.put("3B", listGol3B);
		mapGaji.put("3C", listGol3C);
		mapGaji.put("3D", listGol3D);
		mapGaji.put("4A", listGol4A);
		mapGaji.put("4B", listGol4B);
		mapGaji.put("4C", listGol4C);
		mapGaji.put("4D", listGol4D);
		mapGaji.put("4E", listGol4E);
		
	}
 	
	//CONSTRUCTOR OVERLOADING
	public PNS(PNS pegawai) {
		setNama(pegawai.getNama());
		setNip(pegawai.getNip());
		setJenisKelamin(pegawai.getJenisKelamin());
		setStatusKawin(pegawai.getStatusKawin());
		setJumlahAnak(pegawai.getJumlahAnak());
		setGolongan(pegawai.getGolongan());
		setKodeGolongan(pegawai.getKodeGolongan());
		setMasaKerja(pegawai.getMasaKerja());
		setJenisPNS(pegawai.getJenisPNS());
		setTunjanganLainnya(pegawai.getTunjanganLainnya());
		setNamaTunjanganLainnya(pegawai.getNamaTunjanganLainnya());
	}
	
	//METHOD OVERRIDING DARI ABSTRACT CLASS
	@Override
	public void hitungGajiPokok() {
	String	key = getGolongan() + getKodeGolongan();
	List<Integer> listGolonganFromMap = mapGaji.get(key);
	if (listGolonganFromMap != null) {
		switch (getGolongan()) {
		case 1 :
			if (getMasaKerja() > 27) {
				gajiPokok = listGolonganFromMap.get(27);
			}
			else {
				gajiPokok = listGolonganFromMap.get(getMasaKerja());
			}
			break;
		case 2 :
			if (getMasaKerja() > 33) {
				gajiPokok = listGolonganFromMap.get(33);
			}
			else {
				gajiPokok = listGolonganFromMap.get(getMasaKerja());
			}
			break;
		case 3 :
		case 4 :
			if (getMasaKerja() > 32) {
				gajiPokok = listGolonganFromMap.get(32);
			}
			else {
				gajiPokok = listGolonganFromMap.get(getMasaKerja());
			}
			break;
		}
	}
}
	@Override
	public void hitungTunjKeluarga() {
		getGajiPokok();
			tunjKawin = 0;
			if(statusKawin.equalsIgnoreCase("kawin")){
				tunjKawin = 0.1*gajiPokok;
			}
	
		tunjAnak  = 0;
			if(jumlahAnak>2){
				tunjAnak = 0.02*gajiPokok*2;
	
			}
			else if(jumlahAnak>0){
				tunjAnak = 0.02*gajiPokok*jumlahAnak;
			}
		
		jumlAnggotaKeluarga = 1;
		if(statusKawin.equalsIgnoreCase("kawin")){
			if(jumlahAnak>2){
				jumlAnggotaKeluarga = 4;
			}
			else{
				jumlAnggotaKeluarga = 2 + jumlahAnak;
			}		
		}
		else {
			if(jumlahAnak>2){
				jumlAnggotaKeluarga = 1 + 2; 
			}
			else {
				jumlAnggotaKeluarga = 1 + jumlahAnak;
			}
		}
		
	}
	@Override
	public void hitungTunjBeras() {
		tunjBeras =kgBeras*jumlAnggotaKeluarga*hargaBeras;
		
	}
@Override
	public void hitungTunjJabatan() {
		if (jenisPNS.equalsIgnoreCase("Pejabat")) {
            tunjJabatan = 1000000;
            }
            else if (jenisPNS.equalsIgnoreCase("Pelayan Masyarakat")) {
                        tunjJabatan = 500000;
            } else {
                    switch (golongan) {
                        case 1 :
                        tunjJabatan = 175000;
                        break;
                        case 2 :
                        tunjJabatan = 180000;
                        break;
                        case 3 :
                        tunjJabatan = 185000;
                        break;
                        case 4 :
                        tunjJabatan = 190000;
                        break;
                        default :
                        tunjJabatan = 0;
                        break;
                }        
            }

	}
	public void hitungTotalTunjangan() {
		tunjangan = tunjKawin+tunjAnak+tunjBeras+tunjJabatan+besarTunjanganLainnya;
	}
	public void hitungBruto() {
		gajiKotor = gajiPokok + tunjangan;
	}
	public void hitungBiayaJabatan() {
		biayaJabatan = rateBiayaJabatan*gajiKotor;
		if (biayaJabatan>500000){
			biayaJabatan=500000;
		}
	}
	public void hitungIuranPensiun() {
		iuranPensiun = rateIuranPensiun*(gajiPokok+tunjKawin+tunjAnak);
		pengurang = biayaJabatan-iuranPensiun;
	}
	public void penghasilanNettoPajak() {
		penghasilanNetto = gajiKotor-pengurang;
		penghasilanNetto12 = penghasilanNetto*12;
	}
	public void nilaiPTKP() {
		pTKP = 0;
		if (statusKawin.equals("Menikah")){
			if(jumlahAnak>=3){
				pTKP=k3; 
			}
			else if(jumlahAnak==2){
				pTKP=k2;
			}
			else if(jumlahAnak==1){
				pTKP=k1;
			}
			else if(jumlahAnak==0){
				pTKP=k0;
			}
		}
		if (statusKawin.equals("Belum Menikah") && statusKawin.equals("Cerai") ){
			if(jumlahAnak>=3){
				pTKP=tK3; 
			}
			else if(jumlahAnak==2){
				pTKP=tK2;
			}
			else if(jumlahAnak==1){
				pTKP=tK1;
			}
			else if(jumlahAnak==0){
				pTKP=tK0;
			}
		}

	}
	public double getpTKP() {
		return pTKP;
	}
	public void hitungPPH() {
		pKP = penghasilanNetto12-pTKP;
		pphSetahun = 0;

		if(pKP <= 0){
			pphSetahun = 0;
		}

		// PKP LEVEL 1
		if (pKP >0 && pKP <= pkpLevel1) {
			pphSetahun = pKP * ratePKP50;
		}

		// PKP LEVEL 2
		if (pKP > pkpLevel1 && pKP <= (pkpLevel1+pkpLevel2)) {
			pphSetahun = pkpLevel1 * ratePKP250;
			pKP = pKP - pkpLevel1;
			pphSetahun += pKP * ratePKP250;
		}

		// PKP LEVEL 3
		if (pKP > (pkpLevel1+pkpLevel2) && pKP <= (pkpLevel1+pkpLevel2+pkpLevel3)) {
			pphSetahun = pkpLevel1 * ratePKP50;
			pKP = pKP - pkpLevel1;
			pphSetahun = pphSetahun + (pkpLevel2 * ratePKP250);
			pKP = pKP - pkpLevel2;
			pphSetahun = pphSetahun + (pKP * ratePKP250);
		}

		// PKP LEVEL 4
		if (pKP > (pkpLevel1+pkpLevel2+pkpLevel3)) {
			pphSetahun = pkpLevel1 * ratePKP50;
			pKP = pKP - pkpLevel1;
			pphSetahun += pkpLevel2 * ratePKP250;
			pKP = pKP - pkpLevel2;
			pphSetahun += pkpLevel3 * ratePKP500;
			pKP = pKP - pkpLevel3;
			pphSetahun += pKP * ratePKP500Lebih;
		}

	pphSebulan = pphSetahun/12;	
	}
	public void hitungPotongan() {
		// PERHITUNGAN POTONGAN IWP
		iwp = iWP * (gajiPokok + tunjKawin + tunjAnak);

		// PERHITUNGAN POTONGAN TAPERUM
		switch (golongan) {
			case 1 :
				taperum = taperumGol1;
				break;
			case 2 :
				taperum = taperumGol2;
				break;
			case 3 :
				taperum = taperumGol3;
				break;
			case 4 :
				taperum = taperumGol4;
				break;
            default :
                taperum = 0;
                break;
		}
			salaryCut = iwp+taperum+pphSebulan;
	}
	public void takeHomePay() {
		// 3B. BRUTO SALARY WITH TAX
		brutoSalaryWT = gajiPokok+tunjangan+pphSebulan;
		// 5. TAKE HOME PAY/NETTO SALARY AFTER TAX
		nettoSalaryAT = brutoSalaryWT-salaryCut;
	}
	public void getPerhitungan() {
		hitungGajiPokok();
		hitungTunjKeluarga();
		hitungTunjBeras();
		hitungTunjJabatan();
		hitungTotalTunjangan();
		hitungBruto();
		hitungIuranPensiun();
		hitungBiayaJabatan();
		penghasilanNettoPajak();
		nilaiPTKP();
		getpTKP();
		hitungPPH();
		hitungPotongan();
		takeHomePay();
		
	}
	public String toString() {
		getPerhitungan();
		
		return "----------------------------------------SLIP GAJI PNS------------------------------------------"
		+ "\nNama : " + nama 
		+"\nNIP : " + nip 
		+"\n---------------------------------------------------------------------------------------------------"
		+"\n\t\tPENGHASILAN \t\t\t\t       POTONGAN"
		+"\n\nGaji Pokok\t\t " + 	(int) gajiPokok + "\t\tIWP\t\t\t " + 					(int) iwp
		+"\nTunjangan Kawin\t\t " + (int) tunjKawin + "\t\tTaperum\t\t\t " + 				(int) taperum
		+"\nTunjangan Anak\t\t " + 	(int) tunjAnak + "\t\tPotongan Pajak\t\t " + 			(int) pphSebulan
		+"\nTunjangan Jabatan\t " + (int) tunjJabatan + "\t\tJumlah Potongan\t\t " + 		(int) salaryCut
		+"\nTunjangan Lainnya\t " +  namaTunjanganLainnya + "\t\tJumlah Kotor\t\t " + 		(int) brutoSalaryWT
		+"\nBesar Tunjangan\t\t " + (int) besarTunjanganLainnya
		+"\nTunjangan Beras\t\t " + (int) tunjBeras 
		+"\nTunjangan Pajak\t\t " + (int) pphSebulan
		+ "\n===================================================================================================="
		+"\nTAKE HOME PAY\t\t " + 	(int) nettoSalaryAT
		+"\n-----------------------------------------------------------------------------------------------------";
	}

	//VALIDASI
		public boolean isValidNama() {	
			if (nama == null || nama.equals("")) {
				return false;
			}
			
			if (nama.matches("[\\W]*") ){ //\\W untuk inputan selain angka dan huruf
				System.out.println("Anda belum menginput nama Anda ");
				return false;
			}
			else{
				if (nama.matches("[A-Za-z .,]*")){
					if (nama.length() > 32){
						System.out.println("Nama yang Anda masukkan lebih dari 32 karakter");
						return false;
					} else {
						return true;
					}
				}
				else { 
					System.out.println("Nama yang Anda masukkan mengandung Angka/Simbol");
					return false;
				}
			}

		}
		public boolean isValidNip() {
				if (nip.matches("[\\W]*") ){ //\\W untuk inputan selain angka dan huruf
					System.out.println("Anda belum menginput nomor NIP Anda/Nomor NIP Anda salah ");
					return false;
				}
				else{
					if (nip.matches("[0-9]*")){
						if(nip.length() < 12) {
							System.out.println("NIP yang Anda masukkan kurang dari 12 Angka");
							return false;
						}
						else if (nip.length() > 18){
							System.out.println("NIP yang Anda masukkan lebih dari 18 Angka");
							return false;
						}
						else {
							return true;
						}
					}
					else { 
						System.out.println("NIP mengandung huruf atau simbol");
						return false;
					}
				}
			}
		public boolean isValidJenisKelamin() {
			 if ( !(pilJenisKelamin.length() > 0 && (pilJenisKelamin.equals("1") || pilJenisKelamin.equals("2")|| pilJenisKelamin.equalsIgnoreCase("pria") || pilJenisKelamin.equalsIgnoreCase("wanita")))) {
             	if (pilJenisKelamin.matches("[\\W]*") ) { //SELAIN ANGKA DAN HURUF
             		System.out.println("Anda belum memilih pilihan ");
             	}
             	
             	else{
             		System.out.println("Inputan anda salah ");

             	}
             	return false;
			 }
			 else {
				 return true;
			 }
		}
		
	//GETTER & SETTER
	public int getGajiPokok() {
		return gajiPokok;
	}
	public int getGolongan() {
		return golongan;
	}
	public void setGolongan(int golongan) {
		this.golongan = golongan;
	}
	public int getMasaKerja() {
		return masaKerja;
	}
	public void setMasaKerja(int masaKerja) {
		this.masaKerja = masaKerja;
	}
	public int getJumlahAnak() {
		return jumlahAnak;
	}
	public void setJumlahAnak(int jumlahAnak) {
		this.jumlahAnak = jumlahAnak;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public String getStatusKawin() {
		return statusKawin;
	}
	public void setStatusKawin(String statusKawin) {
		this.statusKawin = statusKawin;
	}
	public String getJenisPNS() {
		return jenisPNS;
	}
	public void setJenisPNS(String jenisPNS) {
		this.jenisPNS = jenisPNS;
	}
	public String getTunjanganLainnya() {
		return tunjanganLainnya;
	}
	public void setTunjanganLainnya(String tunjanganLainnya) {
		this.tunjanganLainnya = tunjanganLainnya;
	}
	public String getNamaTunjanganLainnya() {
		return namaTunjanganLainnya;
	}
	public void setNamaTunjanganLainnya(String namaTunjanganLainnya) {
		this.namaTunjanganLainnya = namaTunjanganLainnya;
	}
	public String getKodeGolongan() {
		return kodeGolongan;
	}
	public void setKodeGolongan(String kodeGolongan) {
		this.kodeGolongan = kodeGolongan;
	}
	public String getPilJenisKelamin() {
		return pilJenisKelamin;
	}
	public void setPilJenisKelamin(String pilJenisKelamin) {
		this.pilJenisKelamin = pilJenisKelamin;
	}
	public String getPilGolongan() {
		return pilGolongan;
	}
	public void setPilGolongan(String pilGolongan) {
		this.pilGolongan = pilGolongan;
	}
	public String getBanyakAnak() {
		return banyakAnak;
	}
	public void setBanyakAnak(String banyakAnak) {
		this.banyakAnak = banyakAnak;
	}
	public boolean isInputGolongan() {
		return inputGolongan;
	}
	public void setInputGolongan(boolean inputGolongan) {
		this.inputGolongan = inputGolongan;
	}
	public String getPilKawin() {
		return pilKawin;
	}
	public void setPilKawin(String pilKawin) {
		this.pilKawin = pilKawin;
	}
	public String getPilPNS() {
		return pilPNS;
	}
	public void setPilPNS(String pilPNS) {
		this.pilPNS = pilPNS;
	}

	public int getBesarTunjanganLainnya() {
		return besarTunjanganLainnya;
	}

	public void setBesarTunjanganLainnya(int besarTunjanganLainnya) {
		this.besarTunjanganLainnya = besarTunjanganLainnya;
	}
	
}
