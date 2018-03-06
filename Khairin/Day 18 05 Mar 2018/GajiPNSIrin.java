//GAJI PNS IRIN

import java.util.Scanner;

public class GajiPNS {
	public static void main(String[] args) {
		
		// Inisialisasi variable
		Scanner inputMenu = new Scanner(System.in); // Input khusus menu
		Scanner input = new Scanner(System.in);
        int golongan = 0, masaKerja = 0, jumlahAnak = 0, besarTunjanganLainnya = 0, gajiPokok = 0, kg=10, beras=12500;
        String nama = "-", nip = "-", jenisKelamin = "-", kodeGolongan = "-", statusKawin = "-", jenisPNS = "-", tunjanganLainnya = "0", namaTunjanganLainnya = "-";
		boolean benar = false;
		double  tunjKawin, tunjAnak, tunjJabatan, tunjBeras, taperum, tunjangan, gajiKotor, iwp, salaryCut, brutoSalaryWT, nettoSalaryAT,
				biayaJabatan, iuranPensiun, pengurang, penghasilanNetto, penghasilanNetto12, pTKP, pKP, pphSetahun, pphSebulan, jumlAnggotaKeluarga,
				pkpLevel1 = 50000000,
				pkpLevel2 = 200000000,
				pkpLevel3 = 250000000;
		
		// Gaji Golongan 1
		int [] gol1A = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900,
						1790500, 1790500, 1846900, 1846900, 1905100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 
						2224600, 2224600};
		int [] gol1B = {0, 0, 0, 1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 
						1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 
						2355200};
		int [] gol1C = {0, 0, 0, 1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 
						2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 
						2454800};
		int [] gol1D = {0, 0, 0, 1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 
						2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 
						2558700};

		// Gaji Golongan 2 
		int [] gol2A = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 
						2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 
						2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100};
		int [] gol2B = {0, 0, 0, 2103300, 2103300, 2169500, 2169500, 2237900, 2237900, 2308300, 2308300, 2381100, 2381100, 2456000, 2456000, 
						2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 2867900, 2958300, 2958300, 3051400, 3051400, 
						3147600, 3147600, 3246700, 3246700, 3348900}; 
		int [] gol2C = {0, 0, 0, 2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 2481800, 2559900, 2559900, 
						2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 2989300, 3083400, 3083400, 3180500, 3180500, 
						3280700, 3280700, 3384000, 3384000, 3490600};
	    int [] gol2D = {0, 0, 0, 2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 2586700, 2586700, 2668200, 2668200, 
	    				2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 
	    				3419500, 3419500, 3527200, 3527200, 3638200};
		
		// Gaji Golongan 3
		int [] gol3A = {2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 2959000, 2959000, 
						3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 3564100, 3564100, 3676400, 3676400, 
						3792100, 3792100, 3911600, 3911600, 4034800};
		int [] gol3B = {2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 3084200, 3084200, 
						3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 3714900, 3714900, 3831900, 3831900, 
						3952600, 3952600, 4007000, 4007000, 4205400};
		int [] gol3C = {2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 3214700, 3214700, 
						3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 3872000, 3872000, 3994200, 3994200, 
						4119700, 4119700, 4249500, 4249500, 4383300};
		int [] gol3D = {2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 3350600, 3350600, 
						3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 3912600, 3912600, 4035800, 4035800, 4162900, 4162900, 
						4294000, 4294000, 4429300, 4429300, 4568800};

		// Gaji Golongan 4
	    int [] gol4A = {2899500, 2899500, 2990800, 2990800, 3085000, 3085000, 3182100, 3182100, 3282400, 3282400, 3385700, 3385700, 3492400, 3492400, 
	    				3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3953600, 4078100, 4078100, 4206500, 4206500, 4339000, 4339000, 
	    				4475700, 4475700, 4616600, 4616600, 4762000};
	    int [] gol4B = {3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3528900, 3528900, 3640100, 3640100, 
	    				3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 4384400, 4384400, 4522500, 4522500, 
	    				4665000, 4665000, 4811900, 4811900, 4963400};
	    int [] gol4C = {3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 3794100, 3794100, 
	    				3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 4569900, 4569900, 4713800, 4713800, 
	    				4862300, 4862300, 5015400, 5015400, 5173400};
	    int [] gol4D = {3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 3954600, 3954600, 
	    				4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 4763200, 4763200, 4913200, 4913200, 
	    				5068000, 5068000, 5227600, 5227600, 5392200};
		int [] gol4E = {3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755700, 3755700, 3874000, 3874000, 3996000, 3996000, 4121800, 4121800, 
						4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 4964700, 4964700, 5121100, 5121100, 
						5282300, 5282300, 5448700, 5448700, 5620300};

		// Menu
		int menu;

		do {
			System.out.println("\nPenghitungan Gaji PNS\n");
			System.out.println("1. Nama : " + nama);
			System.out.println("2. NIP : " + nip);
			System.out.println("3. Jenis Kelamin (1. Pria / 2. Wanita) : " + jenisKelamin);
			System.out.println("4. Golongan : " + golongan + kodeGolongan);
			System.out.println("5. Masa Kerja : " + masaKerja);
			System.out.println("6. Status Kawin : " + statusKawin);
			System.out.println("7. Jenis PNS : " + jenisPNS);
			System.out.println("8. Tunjangan Lainnya : " + namaTunjanganLainnya + besarTunjanganLainnya);
			System.out.println("9. Slip Gaji");
			System.out.println("0. Keluar");
			System.out.print("Pilih menu : "); menu = inputMenu.nextInt();

			switch (menu) {	

				case 1 : // INPUT NAMA
              		System.out.print("Masukkan nama : "); nama = input.nextLine(); 

                	while ( !(nama.length() < 50 && nama.matches("[A-Z a-z]*")) ) {
              			System.out.println("Nama harus alpabhet atau kurang dari 50 karakter.");
                 		System.out.print("Masukkan nama : "); nama = input.nextLine();         
              		 }
                
                	break;

				case 2 : // INPUT NIP
					System.out.print("Masukkan 12 sampai 18 karakter angka NIP  : "); nip = input.nextLine();

					while ( !(nip.length() >= 12 && nip.length() <= 18 && nip.matches("[0-9]*")) ){
						System.out.println("NIP yang anda masukkan mengandung karakter huruf atau jumlah karakter tidak sesuai");
						System.out.println("Masukkan NIP : "); nip = input.next();
					}

					break;

				case 3 : // INPUT JENIS KELAMIN   
                    String pilJenisKelamin;
					System.out.println("Masukkan jenis kelamin: \n1. Pria \n2. Wanita ");
                    pilJenisKelamin = input.next();
                      
                    while ( !(pilJenisKelamin.matches("[0-9]*")) ) {
                    System.out.println("Pilih angka.");
                    System.out.println("Masukkan jenis kelamin: \n1. Pria \n2. Wanita ");
                    pilJenisKelamin = input.next();
                    }

                    while ( !(Integer.valueOf(pilJenisKelamin) >= 1 && Integer.valueOf(pilJenisKelamin) <= 2) ) {
                    System.out.println("Pilih 1 atau 2.");
                    System.out.println("Masukkan jenis kelamin: \n1. Pria \n2. Wanita ");
                    pilJenisKelamin = input.next();
                    }

                        if (Integer.valueOf(pilJenisKelamin) == 1) {
                            jenisKelamin = "Pria";
                        }
                        else {
                            jenisKelamin = "Wanita";
                        }
                        break;
                                
                case 4 : // INPUT GOLONGAN DAN KODE GOLONGAN
                	System.out.print("Masukkan golongan (1 - 4): ");
                	golongan = input.nextInt();
                
	                while ( !(golongan >= 1 && golongan <= 4) ) {
	                System.out.println("Golongan harus 1 sampai 4");
	                System.out.print("Masukkan golongan dengan benar (1 - 4): ");
	                golongan = input.nextInt();                                                
	                }

                    System.out.print("Masukkan kode golongan (A - E): ");
                    kodeGolongan = input.next();

                    while ( !(kodeGolongan.matches("[A-E]*")) ) {
                    System.out.print("Masukkan kode golongan harus (A - E): ");
                    kodeGolongan = input.next();
                    }

                    while ( golongan != 4 && kodeGolongan.equalsIgnoreCase("E") ) {
                    System.out.print("Tidak ada kode golongan E pada golongan 1 - 3\n");
                    System.out.print("Masukkan kode golongan harus (A - D): ");
                    kodeGolongan = input.next();        
                    }
                    break;
                                
                case 5 : // INPUT MASA KERJA
                    System.out.print("Masukkan Masa Kerja (dalam tahun): ");
                    masaKerja = input.nextInt();

                    while ( masaKerja <= 2 && (golongan == 1 || golongan == 2) && kodeGolongan.matches("[B-D]*") ) {
                    System.out.print("Masa Kerja Tidak tersedia dalam golongan " + golongan + kodeGolongan + "\n");
                    System.out.print("Masukkan Masa Kerja (dalam tahun): ");
                    masaKerja = input.nextInt();                                                
                    }
                    break;

				case 6 : // STATUS KAWIN
					System.out.println("\n1. Belum Kawin");
					System.out.println("2. Kawin");
					System.out.println("3. Cerai");
					System.out.print("Masukkan pilihan : "); String pilKawin = input.next();

					while (!(pilKawin.matches("[0-9]*"))) {
						System.out.println("\nMasukkan angka.\n");
						System.out.println("1. Belum Kawin");
						System.out.println("2. Kawin");
						System.out.println("3. Cerai");
						System.out.print("Masukkan pilihan : "); pilKawin = input.next();	
					}

					while (!(Integer.valueOf(pilKawin) >= 1 && Integer.valueOf(pilKawin) <= 3)) {
						System.out.println("\nMasukkan pilihan 1-3.\n");
						System.out.println("1. Belum Kawin");
						System.out.println("2. Kawin");
						System.out.println("3. Cerai");
						System.out.print("Masukkan pilihan : "); pilKawin = input.next();
					}

					if (Integer.valueOf(pilKawin) == 1) {
						statusKawin = "Belum Menikah";
					} else if (Integer.valueOf(pilKawin) == 2) {
						statusKawin = "Menikah";
					} else {
						statusKawin = "Cerai";
					}

					// BANYAK ANAK
					String banyakAnak = "0";
					if (statusKawin.equals("Menikah") || statusKawin.equals("Cerai")) {
						System.out.print("Masukkan jumlah anak : "); banyakAnak = input.next();
						while (!(pilKawin.matches("[0-9]*"))) {
							System.out.println("\nMasukkan angka.\n");
							System.out.print("Masukkan jumlah anak : "); banyakAnak = input.next();
						}
					}		

					jumlahAnak = Integer.valueOf(banyakAnak);			

					break;

				case 7 : // JENIS PNS
         		System.out.println("Pilih jenis PNS:");
					System.out.println("1. Pejabat");
					System.out.println("2. Pelayan Masyarakat");
					System.out.println("3. Lainnya");
					System.out.println("Masukkan pilihan : "); String pilPNS = input.next();

					while (!(pilPNS.matches("[0-9]*"))) {
						System.out.println("\nMasukkan angka.\n");
						System.out.println("1. Pejabat");
						System.out.println("2. Pelayan Masyarakat");
						System.out.println("3. Lainnya");
						System.out.println("Masukkan pilihan : "); pilPNS = input.next();
					}

					while (!(Integer.valueOf(pilPNS) >= 1 && Integer.valueOf(pilPNS) <= 3)) {
						System.out.println("\nMasukkan pilihan 1-3.\n");
						System.out.println("1. Pejabat");
						System.out.println("2. Pelayan Masyarakat");
						System.out.println("3. Lainnya");
						System.out.println("Masukkan pilihan : "); pilPNS = input.next();
					}

					if (Integer.valueOf(pilPNS) == 1) {
						jenisPNS = "Pejabat";
					} else if (Integer.valueOf(pilPNS) == 2) {
						jenisPNS = "Pelayan Masyarakat";
					} else {
						jenisPNS = "Lainnya";
					}

                    break;

				
				case 8 : // TUNJANGAN LAINNYA
	                System.out.print("Nama tunjangan lainnya : ");
	                namaTunjanganLainnya = input.nextLine();
	                System.out.print("Besar tunjangan lainnya : "); 
	                tunjanganLainnya = input.next();

                    while ( !(tunjanganLainnya.matches("[0-9]*")) ) {
                    System.out.println("\nBesar tunjangan harus berupa angka.");
                    System.out.print("Besar tunjangan lainnya : "); tunjanganLainnya = input.next();
                    } 

                    besarTunjanganLainnya = Integer.valueOf(tunjanganLainnya);

                    break;


				case 9 :// 1. PENGHITUNGAN GAJI POKOK

					switch (golongan) {
						case 1 :
							if (kodeGolongan.equals("A")) {
								if (masaKerja > 27) {
									gajiPokok = gol1A[27];
								} else {
									gajiPokok = gol1A[masaKerja];
								}
							} else if (kodeGolongan.equals("B")) {
								if (masaKerja > 27) {
									gajiPokok = gol1B[27];
								} else {
									gajiPokok = gol1B[masaKerja];
								}
							} else if (kodeGolongan.equals("C")) {
								if (masaKerja > 27) {
									gajiPokok = gol1C[27];
								} else {
									gajiPokok = gol1C[masaKerja];
								}
							} else {
								if (masaKerja > 27) {
									gajiPokok = gol1D[27];
								} else {
									gajiPokok = gol1D[masaKerja];
								}
							}

							break;

						case 2 :
							if (kodeGolongan.equals("A")) {
								if (masaKerja > 33) {
									gajiPokok = gol2A[33];
								} else {
									gajiPokok = gol2A[masaKerja];
								}
							} else if (kodeGolongan.equals("B")) {
								if (masaKerja > 33) {
									gajiPokok = gol2B[33];
								} else {
									gajiPokok = gol2B[masaKerja];
								}
							} else if (kodeGolongan.equals("C")) {
								if (masaKerja > 33) {
									gajiPokok = gol2C[33];
								} else {
									gajiPokok = gol2C[masaKerja];
								}
							} else {
								if (masaKerja > 33) {
									gajiPokok = gol2D[33];
								} else {
									gajiPokok = gol2D[masaKerja];
								}
							}

							break;

						case 3 :
							if (kodeGolongan.equals("A")) {
								if (masaKerja > 32) {
									gajiPokok = gol3A[32];
								} else {
									gajiPokok = gol3A[masaKerja];
								}
							} else if (kodeGolongan.equals("B")) {
								if (masaKerja > 32) {
									gajiPokok = gol3B[32];
								} else {
									gajiPokok = gol3B[masaKerja];
								}
							} else if (kodeGolongan.equals("C")) {
								if (masaKerja > 32) {
									gajiPokok = gol3C[32];
								} else {
									gajiPokok = gol3C[masaKerja];
								}
							} else {
								if (masaKerja > 32) {
									gajiPokok = gol3D[32];
								} else {
									gajiPokok = gol3D[masaKerja];
								}
							}

							break;

						case 4 :
							if (kodeGolongan.equals("A")) {
								if (masaKerja > 32) {
									gajiPokok = gol4A[32];
								} else {
									gajiPokok = gol4A[masaKerja];
								}
							} else if (kodeGolongan.equals("B")) {
								if (masaKerja > 32) {
									gajiPokok = gol4B[32];
								} else {
									gajiPokok = gol4B[masaKerja];
								}
							} else if (kodeGolongan.equals("C")) {
								if (masaKerja > 32) {
									gajiPokok = gol4C[32];
								} else {
									gajiPokok = gol4C[masaKerja];
								}
							} else if (kodeGolongan.equals("D")) {
								if (masaKerja > 32) {
									gajiPokok = gol4D[32];
								} else {
									gajiPokok = gol4D[masaKerja];
								}
							} else {
								if (masaKerja > 32) {
									gajiPokok = gol4E[32];
								} else {
									gajiPokok = gol4E[masaKerja];
								}
							}

							break;
					}

					// 2. ALLOWANCE/TUNJANGAN
						tunjKawin = 0;
							if(statusKawin.equals("Menikah")){
								tunjKawin =0.1*gajiPokok;
							}

						tunjAnak  = 0;
							if(jumlahAnak>2){
								tunjAnak =0.02*gajiPokok*2;

							}
							else if(jumlahAnak>0){
								tunjAnak =0.02*gajiPokok*jumlahAnak;
							}
						
						jumlAnggotaKeluarga = 1;
						if(statusKawin.equals("Menikah")){
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
					
						tunjBeras =kg*jumlAnggotaKeluarga*beras;

						// TUNJANGAN (Umum, Struktural, Fungsional)
						tunjJabatan = 0;

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
                                                tunjJabatan = 18500;
                                                break;
                                                case 4 :
                                                tunjJabatan = 190000;
                                                break;
                                                default :
                                                tunjJabatan = 0;
                                                break;
                                        }        
                                    }

						tunjangan = tunjKawin+tunjAnak+tunjBeras+tunjJabatan+besarTunjanganLainnya;
					
					// 3A. BRUTO SALARY SEBELUM PAJAK /GAJIKOTOR
						gajiKotor = gajiPokok + tunjangan;

					// 6. PAJAK PENGHASILAN/PPH SALARY
						biayaJabatan = 0.05*gajiKotor;
							if (biayaJabatan>500000){
								biayaJabatan=500000;
							}

						iuranPensiun = 0.0475*(gajiKotor+tunjKawin+tunjAnak);
						pengurang = biayaJabatan-iuranPensiun;
					
						//PENGHASILAN NETTO	
							penghasilanNetto = gajiKotor-pengurang;
							penghasilanNetto12 = penghasilanNetto*12;
							
						//PERHITUNGAN PTKP
							pTKP = 0;
							if (statusKawin.equals("Menikah")){
								if(jumlahAnak>=3){
									pTKP=48000000; 
								}
								else if(jumlahAnak==2){
									pTKP=45000000;
								}
								else if(jumlahAnak==1){
									pTKP=42000000;
								}
								else if(jumlahAnak==0){
									pTKP=39000000;
								}
							}
							if (statusKawin.equals("Belum Menikah") && statusKawin.equals("Cerai") ){
								if(jumlahAnak>=3){
									pTKP=45000000; 
								}
								else if(jumlahAnak==2){
									pTKP=42000000;
								}
								else if(jumlahAnak==1){
									pTKP=39000000;
								}
								else if(jumlahAnak==0){
									pTKP=36000000;
								}
							}

							//PERHITUNGAN PKP
								pKP = penghasilanNetto12-pTKP;
								pphSetahun = 0;

								if(pKP <= 0){
									pphSetahun = 0;
								}

								// pkp 1
								if (pKP >0 && pKP <= pkpLevel1) {
									pphSetahun = pKP * 0.05;
								}

								// pkp 2
								if (pKP > pkpLevel1 && pKP <= (pkpLevel1+pkpLevel2)) {
									pphSetahun = pkpLevel1 * 0.05;
									pKP = pKP - pkpLevel1;
									pphSetahun += pKP * 0.15;
								}

								// pkp 3
								if (pKP > (pkpLevel1+pkpLevel2) && pKP <= (pkpLevel1+pkpLevel2+pkpLevel3)) {
									pphSetahun = pkpLevel1 * 0.05;
									pKP = pKP - pkpLevel1;
									pphSetahun = pphSetahun + (pkpLevel2 * 0.15);
									pKP = pKP - pkpLevel2;
									pphSetahun = pphSetahun + (pKP * 0.25);
								}

								// pkp 4
								if (pKP > (pkpLevel1+pkpLevel2+pkpLevel3)) {
									pphSetahun = pkpLevel1 * 0.05;
									pKP = pKP - pkpLevel1;
									pphSetahun += pkpLevel2 * 0.15;
									pKP = pKP - pkpLevel2;
									pphSetahun += pkpLevel3 * 0.25;
									pKP = pKP - pkpLevel3;
									pphSetahun += pKP * 0.3;
								}

							pphSebulan = pphSetahun/12;	
							
						// 4. SALARY CUT SETELAH PAJAK /POTONGAN GAJI
							// PERHITUNGAN POTONGAN IWP
							iwp = 0.1 * (gajiPokok + tunjKawin + tunjAnak);

							// PERHITUNGAN POTONGAN TAPERUM
							switch (golongan) {
								case 1 :
									taperum = 3000;
									break;
								case 2 :
									taperum = 5000;
									break;
								case 3 :
									taperum = 7000;
									break;
								case 4 :
									taperum = 10000;
									break;
			                    default :
				                    taperum = 0;
				                    break;
				       	}
								salaryCut = iwp+taperum+pphSebulan;
						// 3B. BRUTO SALARY WITH TAX
								brutoSalaryWT = gajiPokok+tunjangan+pphSebulan;
						// 5. TAKE HOME PAY/NETTO SALARY AFTER TAX
								nettoSalaryAT = brutoSalaryWT-salaryCut;

			System.out.println("---------------------------------SLIP GAJI PNS-----------------------------");
			System.out.println("Nama : " + nama);
			System.out.println("NIP : " + nip);
			System.out.println("\nGaji Pokok : " + gajiPokok);
			System.out.println("Tunjangan Suami / Istri : " + tunjKawin);
			System.out.println("Tunjangan Anak : " + tunjAnak);
			System.out.println("Tunjangan Jabatan : " + tunjJabatan);
			System.out.println("Tunjangan Lain : " + tunjanganLainnya);
			System.out.println("Nama Tunjangan : " + namaTunjanganLainnya);
			System.out.println("Besar Tunjangan : " + besarTunjanganLainnya);
			System.out.println("Tunjangan Beras : " + tunjBeras);
			System.out.println("Tunjangan Pajak : " + pphSebulan);
			System.out.println("\nPOTONGAN");
			System.out.println("IWP : " + iwp);
			System.out.println("Taperum : " + taperum);
			System.out.println("Potongan Pajak : " + pphSebulan);
			System.out.println("Jumlah Potongan : " + salaryCut);
			System.out.println("Jumlah Kotor : " + brutoSalaryWT);
			System.out.println("Take Home Pay : " + nettoSalaryAT);

			    break;

			    case 0 :
					break;

			    default :
				System.out.println("Pilih sesuai pilihan diatas!\n\n");

			    break;
	        }
	   } while (menu != 0);
	}
}	