import java.util.Scanner;

public class PerhitunganGajiPNSRegi{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] gol1A = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 2224600, 2224600};
		int[] gol1B = {0, 0, 0, 1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 2335200};
		int[] gol1C = {0, 0, 0, 1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 2454800};
		int[] gol1D = {0, 0, 0, 1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 2558700};

		int[] gol2A = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100};
		int[] gol2B = {0, 0, 0, 2103300, 2103300, 2169500, 2169500, 2237900, 2237900, 2308300, 2308300, 2381100, 2381100, 2456000, 2456000, 2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 2867900, 2958300, 2958300, 3051400, 3051400, 3147600, 3147600, 3246700, 3246700, 3348900};
		int[] gol2C = {0, 0, 0, 2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 2481800, 2559900, 2559900, 2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 2989300, 3083400, 3083400, 3180500, 3180500, 3280700, 3280700, 3384000, 3384000, 3490600};
		int[] gol2D = {0, 0, 0, 2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 2586700, 2586700, 2668200, 2668200, 2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 3419500, 3419500, 3527200, 3527200, 3638200};

		int[] gol3A = {2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 2959000, 2959000, 3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 3564100, 3564100, 3676400, 3676400, 3792100, 3792100, 3911600, 3911600, 4034800};
		int[] gol3B = {2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 3084200, 3084200, 3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 3714900, 3714900, 3831900, 3831900, 3952600, 3952600, 4007000, 4007000, 4205400};
		int[] gol3C = {2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 3214700, 3214700, 3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 3872000, 3872000, 3994200, 3994200, 4119700, 4119700, 4249500, 4249500, 4383300};
		int[] gol3D = {2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 3350600, 3350600, 3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 3912600, 3912600, 4035800, 4035800, 4162900, 4162900, 4294000, 4294000, 4429300, 4429300, 4568800};

		int[] gol4A = {2899500, 2899500, 2990800, 2990800, 3085000, 3085000, 3182100, 3182100, 3282400, 3282400, 3385700, 3385700, 3492400, 3492400, 3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3593600, 4078100, 4078100, 4206500, 4206500, 4339000, 4339000, 4475700, 4475700, 4616600, 4616600, 4762000};
		int[] gol4B = {3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3258900, 3258900, 3640100, 3640100, 3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 4384400, 4384400, 4522500, 4522500, 4665000, 4665000, 4811900, 4811900, 4963400};
		int[] gol4C = {3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 3794100, 3794100, 3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 4569900, 4569900, 4713800, 4713800, 4862300, 4862300, 5015400, 5015400, 5173400};
		int[] gol4D = {3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 3954600, 3954600, 4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 4763200, 4763200, 4913200, 4193200, 5068000, 5068000, 5227600, 5227600, 5392200};
		int[] gol4E = {3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755700, 3755700, 3874000, 3874000, 3996000, 3996000, 4121800, 4121800, 4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 4964700, 4964700, 5121100, 5121100, 5282300, 5282300, 5448700, 5448700, 5620300};
		
		int[] golTemp = new int[0];

		final int hargaBeras = 12500;
		final int ptkpDefault = 36000000;
		final int ptkpPerOrang = 3000000;
		final int[] tunjanganUmumArr = {175000, 180000, 185000, 190000};
		final int[] potonganTaperumArr = {3000, 5000, 7000, 10000};

		String nip = "", nama = "", jenisKelamin, golongan = "", masaKerja, statusPernikahan = "", jumlahAnak = "0", jenisPNS = "", tunjanganLain, namaTunjanganLain, besarTunjanganLain = "0";

		double gajiPokok = 0, tunjanganMenikah = 0, tunjanganAnak, tunjanganBeras, bruto, biayaJabatan, iuranPensiun, netto, nettoSetahun, ptkp, pkp, pkpTemp = 0, pphSetahun = 0, pph = 0, iwp, jumlahPotongan, jumlahBersih;

		int tunjanganStruktural = 0, tunjanganFungsional = 0, tunjanganUmum = 0, jumlahAnggotaKeluarga = 1, jumlahAnakTemp = 0, jumlahAnggotaTunjangan, taperum = 0;

		boolean isTrue = false;

		System.out.println("\nDATA PNS");

		// Inputan NIP
		while (!isTrue) {
			System.out.print("\n- NIP\t\t\t\t\t: ");
			nip = input.nextLine();

			if (nip.length() != 0) {
				if (nip.matches("[\\S]*")) {
					if (nip.matches("[0-9]*")) {
						if (nip.length() >= 12 && nip.length() <= 18) {
							break;
						} else {
							System.out.println("\nNIP tidak boleh kurang dari 12 angka / lebih dari 18 angka!");
						}
					} else {
						System.out.println("\nNIP hanya boleh berisi angka saja!");
					}
				} else {
					System.out.println("\nNIP tidak boleh ada spasi!");
				}
			} else {
				System.out.println("\nNIP tidak boleh dikosongkan!");
			}	
		}

		// Inputan Nama
		while (!isTrue) {
			System.out.print("\n- Nama\t\t\t\t\t: ");
			nama = input.nextLine();

			if (nama.matches("[\\W]*")) {
				System.out.println("\nData yang anda masukkan masih kosong / tidak sesuai ketentuan!");
			}
			else {
				if (nama.matches("[A-Za-z., ]*")) {
					if (nama.length() > 0 && nama.length() <= 50) {
						break;
					} else {
						System.out.println("\nNama maksimal hanya 50 karakter!");
					}
				} else {
					System.out.println("\nNama tidak boleh mengandung angka & simbol selain titik & koma!");
				}
			}
		}

		// Inputan Jenis Kelamin
		while (!isTrue) {
			System.out.print("\n- Jenis Kelamin (pria / wanita)\t\t: ");
			jenisKelamin = input.nextLine();

			if (jenisKelamin.matches("[\\S]*")) {
				if (jenisKelamin.length() > 0) {
					if (jenisKelamin.equalsIgnoreCase("pria") || jenisKelamin.equalsIgnoreCase("wanita")) {
						break;
					} else {
						System.out.println("\nJenis kelamin hanya boleh berisi pria / wanita saja!");
					}
				} else {
					System.out.println("\nJenis kelamin tidak boleh dikosongkan!");
				}
			} else {
				System.out.println("\nJenis Kelamin tidak boleh ada spasi!");
			}			
		}

		// Inputan Golongan dan Masa kerja
		while (!isTrue) {
			System.out.print("\n- Golongan (contoh : 1A, 2B)\t\t: ");
			golongan = input.nextLine();

				if (golongan.matches("[//W]*")) {
					System.out.println("\nData yang anda masukkan masih kosong atau tidak sesuai ketentuan!");
				} else {
					if (golongan.length() == 2) {
						if (golongan.substring(0,1).matches("[1-4]*") && golongan.substring(1,2).matches("[A-E]*")) {

							while (!isTrue) {
								System.out.print("\n- Masa Kerja (dalam tahun)\t\t: ");
								masaKerja = input.nextLine();

								if (masaKerja.length() > 0) {
									if (masaKerja.matches("[0-9]*")) {
										if (Integer.parseInt(masaKerja) < 3 && golongan.matches("[1-2B-D]*")) {
											System.out.println("\nGolongan dan Masa Kerja tidak tepat, mohon diisi sesuai data anda!");
											break;

										// Switch Case Golongan
										} else {
											switch (golongan) {
												case "1A" : golTemp = gol1A; break;
												case "1B" : golTemp = gol1B; break;
												case "1C" : golTemp = gol1C; break;
												case "1D" : golTemp = gol1D; break;
												case "2A" : golTemp = gol2A; break;
												case "2B" : golTemp = gol2B; break;
												case "2C" : golTemp = gol2C; break;
												case "2D" : golTemp = gol2D; break;
												case "3A" : golTemp = gol3A; break;
												case "3B" : golTemp = gol3B; break;
												case "3C" : golTemp = gol3C; break;
												case "3D" : golTemp = gol3D; break;
												case "4A" : golTemp = gol4A; break;
												case "4B" : golTemp = gol4B; break;
												case "4C" : golTemp = gol4C; break;
												case "4D" : golTemp = gol4D; break;
												case "4E" : golTemp = gol4E; break;
											}
											if (Integer.parseInt(masaKerja) > golTemp.length-1) {
												masaKerja = String.valueOf(golTemp.length-1);
											}
											gajiPokok = golTemp[Integer.parseInt(masaKerja)];
											break;
										}
									} else {
										System.out.println("\nMasa kerja tidak boleh mengandung huruf / simbol!");
									}
								} else {
									System.out.println("\nMasa kerja tidak boleh dikosongkan!");
								}
							}

							if (gajiPokok != 0) {
								break;
							}

						} else {
							System.out.println("\nKode Golongan harus huruf kapital!");
						}
					} else {
						System.out.println("\nKode Golongan yang anda isi tidak sesuai, mohon ikuti contoh!");
					}
				}
					
		}

		// Inputan Status Pernikahan
		while (!isTrue) {
			System.out.println("\n1.Menikah\n2.Belum Menikah\n3.Single Parents");
			System.out.print("\n- Status Pernikahan (nomor saja)\t: ");
			statusPernikahan = input.nextLine();

			if (statusPernikahan.matches("[\\W]*")) {
				System.out.println("\nData yang anda masukkan masih kosong / tidak sesuai ketentuan!");
			} else {
				if (statusPernikahan.matches("[1-3]*")) {	
					break;
				} else {
					System.out.println("\nStatus Pernikahan tidak sesuai, mohon isi dengan nomor 1 / 2 / 3!");
				}
			}
		}

		// Inputan Jumlah Anak
		while (!isTrue) {
			System.out.print("\n- Jumlah Anak (dalam angka)\t\t: ");
			jumlahAnak = input.nextLine();

			if (jumlahAnak.matches("[\\W]*")) {
				System.out.println("\nData yang anda masukkan masih kosong / tidak sesuai ketentuan!");
			} else {
				if (jumlahAnak.matches("[0-9]*")) {
					break;
				} else {
					System.out.println("\nJumlah Anak tidak boleh mengandung huruf / simbol!");
				}
			}
		}

		// Inputan Jenis PNS
		while (!isTrue) {
			System.out.println("\n1.Pejabat\n2.Pelayan Masyarakat\n3.Lainnya");
			System.out.print("\n- Jenis PNS\t\t\t\t: ");
			jenisPNS = input.nextLine();

			if (jenisPNS.matches("[\\W]*")) {
				System.out.println("\nData yang anda masukkan masih kosong / tidak sesuai ketentuan!");
			} else {
				if (jenisPNS.equals("1")) {
					tunjanganStruktural = 1000000;
					break;
				}
				else if (jenisPNS.equals("2")) {
					tunjanganFungsional = 500000;
					break;
				}
				else if (jenisPNS.equals("3")) {
					for (int i = 0 ; i < 4 ; i++) {
						if (Integer.parseInt(golongan.substring(0,1)) == i+1) {
							tunjanganUmum = tunjanganUmumArr[i];
						}
					}
					break;
				} else {
					System.out.println("\nJenis PNS tidak sesuai, mohon isi dengan nomor 1 / 2 / 3!");
				}
			}
		}

		// Inputan Tunjangan Lain
		while (!isTrue) {
			System.out.print("\n- Ada Tunjangan Lain (Y / N) / (y / n)\t: ");
			tunjanganLain = input.nextLine();

			if (tunjanganLain.length() == 1) {
				if (tunjanganLain.equalsIgnoreCase("y")) {
					
					// Nama Tunjangan
					while (!isTrue) {
						System.out.print("\n- Nama Tunjangan\t\t: ");
						namaTunjanganLain = input.nextLine();

						if (namaTunjanganLain.matches("[\\W]*")) {
							System.out.println("\nData yang anda masukkan masih kosong / tidak sesuai ketentuan!");
						} else {
							if (namaTunjanganLain.matches("[A-Za-z\\s]*") ) {
								break;
							} else {
								System.out.println("\nNama Tunjangan tidak boleh mengandung angka / simbol!");
							}
						}
					}

					// Besar Tunjangan
					while (!isTrue) {
						System.out.print("\n- Besar Tunjangan\t\t: ");
						besarTunjanganLain = input.nextLine();

						if (besarTunjanganLain.matches("[\\W]*")) {
							System.out.println("\nData yang anda masukkan masih kosong / tidak sesuai ketentuan!");
						} else {
							if (besarTunjanganLain.matches("[0-9]*") ) {
								break;
							} else {
								System.out.println("\nBesar Tunjangan tidak boleh mengandung huruf / simbol!");
							}
						}
					}
					break;				
				}
				else if (tunjanganLain.equalsIgnoreCase("n")) {
					break;
				} else {
					System.out.println("\nJawaban tidak sesuai, silahkan isi dengan (Y / N) / (y / n)!");
				}
			} else {
				System.out.println("\nJawaban tidak boleh kosong, silahkan isi dengan (Y / N) / (y / n)!");
			}
		}

		// Perhitungan Tunjangan Menikah dan Anggota Keluarga
		if (statusPernikahan.equals("1")) {
			tunjanganMenikah = 0.1 * gajiPokok;
			jumlahAnggotaKeluarga++;
		}

		// Perhitungan Tunjangan Anak
		jumlahAnakTemp = Integer.parseInt(jumlahAnak);
		if (Integer.parseInt(jumlahAnak) > 2) {
			jumlahAnakTemp = 2;
		}
		tunjanganAnak = 0.02 * gajiPokok * jumlahAnakTemp;
		
		// Perhitungan Tunjangan Beras
		jumlahAnggotaTunjangan = jumlahAnggotaKeluarga + jumlahAnakTemp;
		tunjanganBeras = 10 * hargaBeras * jumlahAnggotaTunjangan;

		// Perhitungan Bruto
		bruto = gajiPokok + tunjanganMenikah + tunjanganAnak + tunjanganBeras + (tunjanganStruktural + tunjanganFungsional + tunjanganUmum) + Integer.parseInt(besarTunjanganLain);

		// Perhitungan Biaya Jabatan
		biayaJabatan = 0.05 * bruto;

		if(biayaJabatan > 500000){
			biayaJabatan = 500000;
		}

		// Perhitungan Iuran Pensiun
		iuranPensiun = 0.0475 * (gajiPokok + tunjanganMenikah + tunjanganAnak);
		
		// Perhitungan Netto
		netto = bruto - biayaJabatan - iuranPensiun;

		// Perhitungan Netto Setahun
		nettoSetahun = netto * 12;

		// Perhitungan PTKP
		jumlahAnakTemp = Integer.parseInt(jumlahAnak);

		if (Integer.parseInt(jumlahAnak) > 3) {
			jumlahAnakTemp = 3;
		}

		ptkp = ptkpDefault + (ptkpPerOrang * (jumlahAnggotaKeluarga - 1 + jumlahAnakTemp));

		// Perhitungan PKP
		pkp = nettoSetahun - ptkp;

		// PKP 0 - 50000000
		if (pkp > 0) {
			pkpTemp = pkp;
			if (pkpTemp - 50000000 > 0) {
				pkpTemp = 50000000;
			}
			pphSetahun = 0.05 * pkpTemp;
		}

		// PKP 50000000 - 250000000
		if (pkp > 50000000) {
			pkpTemp = pkp - 50000000;
			if (pkpTemp - 200000000 > 0) {
				pkpTemp = 200000000;
			}
			pphSetahun = pphSetahun + (0.15 * pkpTemp);
		}

		// PKP 250000000 - 500000000
		if (pkp > 250000000) {
			pkpTemp = pkp - 250000000;
			if (pkpTemp - 250000000 > 0) {
				pkpTemp = 250000000;
			}
			pphSetahun = pphSetahun + (0.25 * pkpTemp);
		}

		// PKP > 500000000
		if (pkp > 500000000) {
			pkpTemp = pkp - 500000000;
			pphSetahun = pphSetahun + (0.3 * pkpTemp);
		}

		// PPH Perbulan
		pph = pphSetahun / 12;

		// Bruto + PPH
		bruto = bruto + pph;

		// Perhitungan IWP
		iwp = 0.1 * (gajiPokok + tunjanganMenikah + tunjanganAnak);

		// Perhitungan Taperum
		for (int i = 0 ; i < 4 ; i++) {
			if (Integer.parseInt(golongan.substring(0,1)) == i + 1) {
				taperum = potonganTaperumArr[i];
			}
		}

		// Perhitungan Jumlah Potongan
		jumlahPotongan = iwp + pph + taperum;

		// Perhitungan Take Home Pay
		jumlahBersih = bruto - jumlahPotongan;

		// Tampilan Slip Gaji
		System.out.println("\n\n\t\t\t\tSLIP GAJI PNS");
		System.out.println("\n\nKANTOR PELAYANAN: ");
		System.out.println("\nPembayaran : Gaji Induk Bulan: ");
		System.out.println("\nPegawai : " + nama +" ( " + nip + " )");
		System.out.println("=========================================================================");
		System.out.println("\t   Penghasilan\t\t\t\t     Potongan");
		System.out.println("=========================================================================");
		System.out.println(" Gaji Pokok\t\t" + (int) gajiPokok               + "\t\t IWP\t\t\t" + (int) iwp);
		System.out.println(" T. Istri/Suami\t\t" + (int) tunjanganMenikah    + "\t\t Pot. PPH\t\t" + (int) pph);
		System.out.println(" T. Anak\t\t" + (int) tunjanganAnak              + "\t\t Taperum\t\t" + taperum);
		System.out.println(" T. Umum\t\t" + tunjanganUmum                    + "\t\t                 ---------------");
		System.out.println(" T. Struktural\t\t" + tunjanganStruktural);
		System.out.println(" T. Fungsional\t\t" + tunjanganFungsional        + "\t\t Jml. Pot\t\t" + (int) jumlahPotongan);
		System.out.println(" T. Lain\t\t" + besarTunjanganLain);
		System.out.println(" T. Beras\t\t" + (int) tunjanganBeras            + "\t\t                 ---------------");
		System.out.println(" T. Pajak\t\t" + (int) pph);
		System.out.println("                 ---------------"                + "\t Jml. Bersih\t\t" + (int) jumlahBersih);
		System.out.println(" Jml. Kotor\t\t"+ (int) bruto);
		System.out.println("=========================================================================");

	}
}