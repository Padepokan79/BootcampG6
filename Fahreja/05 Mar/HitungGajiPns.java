import java.util.Scanner;

public class HitungGajiPns{
	public static void main(String[] args) {

		//inisialisasi nama variable input
		Scanner input = new Scanner(System.in);

		//inisialisasi tipe data konstanta
		final int hargaBeras = 12500;
		final int ptkpDefault = 36000000;
		final int ptkpPerOrang = 3000000;
		final int [] tunjanganUmumArr = {175000, 180000, 185000, 190000};
		final int [] potonganTaperumArr = {3000, 5000, 7000, 10000};
		
		//inisialisasi tipe data boolean
		boolean isTrue = false;

		//inisialisasi tipe data string
		String nip = "", nama = "", gender, golongan = "", masaKerja, statusNikah = "", jumlahAnak = "0", jenisPNS ="";
		String adaTunjanganLain, namaTunjanganLain, tunjanganLain = "0";

		//inisialisasi tipe data desimal
		double gajiPokok = 0, bruto, netto, nettoSetahun, jumlahPotongan, jumlahBersih;
		double tunjanganMenikah = 0, tunjanganAnak, tunjanganBeras;
		double biayaJabatan, iuranPensiun, ptkp, pkp, pkpTemp = 0, pphSetahun = 0, pph = 0, iwp;

		//inisialisasi tipe data integer
		int jumlahAnggotaKeluarga = 1, jumlahAnggotaTunjangan, jumlahAnakTemp = 0;
		int tunjanganStruktural = 0, tunjanganFungsional = 0, tunjanganUmum = 0 , taperum = 0;

		//inisialisasi golongan 1
		int [] gol1A = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 2224600, 2224600};
		int [] gol1B = {0, 0, 0, 1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 2335200};
		int [] gol1C = {0, 0, 0, 1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 2454800};
		int [] gol1D = {0, 0, 0, 1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 2558700};

		//inisialisasi golongan 2
		int [] gol2A = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100};
		int [] gol2B = {0, 0, 0, 2103300, 2103300, 2169500, 2169500, 2237900, 2237900, 2308300, 2308300, 2381100, 2381100, 2456000, 2456000, 2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 2867900, 2958300, 2958300, 3051400, 3051400, 3147600, 3147600, 3246700, 3246700, 3348900};
		int [] gol2C = {0, 0, 0, 2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 2481800, 2559900, 2559900, 2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 2989300, 3083400, 3083400, 3180500, 3180500, 3280700, 3280700, 3384000, 3384000, 3490600};
		int [] gol2D = {0, 0, 0, 2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 2586700, 2586700, 2668200, 2668200, 2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 3419500, 3419500, 3527200, 3527200, 3638200};

		//inisialisasi golongan 3
		int [] gol3A = {2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 2959000, 2959000, 3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 3564100, 3564100, 3676400, 3676400, 3792100, 3792100, 3911600, 3911600, 4034800};
		int [] gol3B = {2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 3084200, 3084200, 3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 3714900, 3714900, 3831900, 3831900, 3952600, 3952600, 4007000, 4007000, 4205400};
		int [] gol3C = {2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 3214700, 3214700, 3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 3872000, 3872000, 3994200, 3994200, 4119700, 4119700, 4249500, 4249500, 4383300};
		int [] gol3D = {2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 3350600, 3350600, 3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 3912600, 3912600, 4035800, 4035800, 4162900, 4162900, 4294000, 4294000, 4429300, 4429300, 4568800};

		//inisialisasi golongan 4
		int [] gol4A = {2899500, 2899500, 2990800, 2990800, 3085000, 3085000, 3182100, 3182100, 3282400, 3282400, 3385700, 3385700, 3492400, 3492400, 3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3593600, 4078100, 4078100, 4206500, 4206500, 4339000, 4339000, 4475700, 4475700, 4616600, 4616600, 4762000};
		int [] gol4B = {3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3258900, 3258900, 3640100, 3640100, 3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 4384400, 4384400, 4522500, 4522500, 4665000, 4665000, 4811900, 4811900, 4963400};
		int [] gol4C = {3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 3794100, 3794100, 3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 4569900, 4569900, 4713800, 4713800, 4862300, 4862300, 5015400, 5015400, 5173400};
		int [] gol4D = {3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 3954600, 3954600, 4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 4763200, 4763200, 4913200, 4193200, 5068000, 5068000, 5227600, 5227600, 5392200};
		int [] gol4E = {3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755700, 3755700, 3874000, 3874000, 3996000, 3996000, 4121800, 4121800, 4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 4964700, 4964700, 5121100, 5121100, 5282300, 5282300, 5448700, 5448700, 5620300};
		
		int [] golTemp = new int[0];

		


		//inputan NIP
		while(!isTrue){
			System.out.print(">> Masukkan NIP anda\t\t\t\t: ");
			nip = input.nextLine();

				//validasi nip
				if (nip.length() != 0) {
					if (nip.matches("[\\S]*")) {
						if (nip.matches("[A-Za-z0-9]*")) {
							if(nip.matches("[0-9]*")){
								if(nip.length() >= 12){
									if (nip.length() <= 18) {
										break;	
									}else{
										System.out.println("Inputan lebih dari 18 angka!");
									}
								}else{
									System.out.println("Inputan kurang dari 12 angka!");
								}
							}else{
								System.out.println("Inputan mengandung huruf!");
							}
						}else{
							System.out.println("Inputan mengandung simbol!");
						}
					}else{
						System.out.println("Inputan mengandung spasi/tab!");
					}
				}else{
					System.out.println("Inputan tidak boleh kosong!");
				}
		}

		//inputan nama
		while(!isTrue){
			System.out.print(">> Masukkan nama lengkap anda\t\t\t: ");
			nama = input.nextLine();

			//validasi nama
			if(nama.length()>0){
				if (nama.matches("^[\\S].*")){
					if(nama.matches("[A-Za-z.,\\s]*") ){
						if (nama.trim().length()<=50) {
							break;	
						}else{
							System.out.println("Inputan lebih dari 50 karakter!");
						}
					}else{
						System.out.println("Inputan mengandung angka/Simbol!");
					}
				}else{
					System.out.println("Tidak boleh di awali spasi");
				}
			}else{
				System.out.println("Input tidak boleh kosong!");
			}
		}

		//inputan gender
		while(!isTrue){
			System.out.print(">> Masukkan jenis kelamin anda (Pria / Wanita)\t: ");
			gender = input.nextLine();

			//validasi gender
			if(gender.length() > 0){
				if (gender.matches("[A-Za-z\\s]*")) {
					if (gender.matches("[\\S]*")) {
						if(gender.equalsIgnoreCase("pria") || gender.equalsIgnoreCase("wanita")){
							break;
						
						}else{
							System.out.println("Inputan salah!");
						}
					}else{
						System.out.println("Inputan mengandung spasi / tab");
					}
				}else{
					System.out.println("Inputan mengandung angka / simbol");
				}
			}else{
				System.out.println("Anda belum mengisi jenis kelamin!");
			}
		}

		//inputan golongan dan masa kerja
		while(!isTrue){
			System.out.print(">> Masukkan Golongan anda(contoh :1A)\t\t: ");
			golongan = input.nextLine();

			//validasi golongan
			if (golongan.length() !=0) {
				if(golongan.matches("[1-4]*[A-Ea-e]")){
					if(golongan.matches("[\\S]*")){
						if(golongan.matches("[1-3]*[E]*")){
							System.out.println("Tidak ada kode golongan E di golongan 1-3");
						}else{

							//inputan masa kerja
							while(!isTrue){
								System.out.print(">> Masukkan Masa Kerja anda(dalam tahun)\t: ");
								masaKerja = input.nextLine();

								//validasi masa kerja
								if(masaKerja.length() >= 0){
									if(masaKerja.matches("[0-9]*")){

										//validasi gajipokok
										if(Integer.parseInt(masaKerja) < 3 && golongan.matches("[1-2B-D]*")){
											System.out.println("Golongan dan Masa Kerja yang anda inputkan tidak tepat!");

										}else{
											switch(golongan.toUpperCase()){
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
											if(Integer.parseInt(masaKerja) > golTemp.length-1){
												masaKerja = String.valueOf(golTemp.length-1);
											}

											gajiPokok = golTemp[Integer.parseInt(masaKerja)];
											break;
										}
									}else{
										System.out.println("Inputan harus berupa angka!");
									}
								}else{
									System.out.println("Anda belum mengisi masa kerja!");
								}
							}

							if(gajiPokok != 0){
								break;
							}
						}
					}else{
						System.out.println("Inputan mengandung spasi / tab!");
					}
				}else{
					System.out.println("Inputan salah!");
				}
			}else{
				System.out.println("Inputan tidak boleh kosong!");
			}
		}

		//inputan status pernikahan
		while(!isTrue){
			System.out.print(">> Masukkan status pernikahan anda (Nomor) \n  [1.Menikah 2.Belum Menikah 3.Single Parents]\t: ");
			statusNikah = input.nextLine();

			//validasi status nikah
			if(statusNikah.length() !=0){
				if (statusNikah.matches("[\\S]*")) {
					if (statusNikah.matches("[0-9]*")){
						if (Integer.parseInt(statusNikah) > 3) {
								System.out.println("Nomor hanya 1-3!");
							}else{
								break;		
							}	
					}else{
						System.out.println("Inputan hanya berupa angka!");
					}
				}else{
					System.out.println("Inputan mengandung spasi / tab!");
				}
			}else{
				System.out.println("Inputan tidak boleh kosong!");
			}
		}

		//inputan jumah anak
		while(!isTrue){
			System.out.print(">> Masukkan jumlah anak anda\t\t\t: ");
			jumlahAnak = input.nextLine();

			//validasi jumlah anak
			if(jumlahAnak.length() !=0){
				if (statusNikah.matches("[\\S]*")) {
					if(jumlahAnak.matches("[0-9]*")){
						if (Integer.parseInt(jumlahAnak) > 20) {
								System.out.println("Masukan jumlah anak yang realistis!");
							}else{
								break;
							}
					}else{
						System.out.println("Inputan harus berupa angka!");
					}
				}else{
					System.out.println("Inputan mengandung spasi / tab!");
				}
			}else{
				System.out.println("Inputan tidak boleh kosong!");
			}
		}

		//inputan jenis PNS & mencari tunjungan struktural / fungsional / umum
		while(!isTrue){
			System.out.print(">> Masukkan jenis PNS anda (Nomor) \n   [1.Pejabat 2.Pelayan Masyarakat 3.Lainnya]\t: ");
			jenisPNS = input.nextLine();

			//validasi jenis pns
			if(jenisPNS.length() != 0){
				if (jenisPNS.matches("[\\S]*")) {
					if(jenisPNS.matches("[0-9]*")){
						if (Integer.parseInt(jenisPNS) > 3) {
								System.out.println("Nomor hanya 1-3!");
							}else{
									
							//mencari tunjungan struktural / fungsional / umum
							if(jenisPNS.equals("1")){
								tunjanganStruktural = 1000000;
								break;
							}
							else if (jenisPNS.equals("2")) {
								tunjanganFungsional = 500000;
								break;
							}
							else if (jenisPNS.equals("3")) {
								for(int i = 0 ; i < 4 ; i++){
									if(Integer.parseInt(golongan.substring(0,1)) == i+1){
										tunjanganUmum = tunjanganUmumArr[i];
									}
								}
								break;
							}
							}
					}else{
						System.out.println("Input harus berupa angka!");
					}
				}else{
					System.out.println("Inputan mengandung spasi / tab");
				}
			}else{
				System.out.println("Anda belum mengisi jenis PNS / Inputan yang anda masukan salah!");
			}
		}

		//inputan tunjangan lainnya
		while(!isTrue){
			System.out.print(">> Apakah ada tunjangan lainnya (Y / N)\t\t: ");
			adaTunjanganLain = input.nextLine();

			//validasi ada atau tidak tunjangan
			if(adaTunjanganLain.length() != 0){
				if(jenisPNS.matches("[\\S]*")) {
					if (jenisPNS.matches("[0-9]*")) {
						if(adaTunjanganLain.equalsIgnoreCase("y") || adaTunjanganLain.equalsIgnoreCase("ya")){
							
							//input nama tunjangan lainnya
							while(!isTrue){
								System.out.print("   >> Nama Tunjangan\t\t: ");
								namaTunjanganLain = input.nextLine();

								//validasi nama tunjangan lainnya
								if(namaTunjanganLain.length() != 0){
									if (namaTunjanganLain.matches("^[\\S].*")) {
										if(namaTunjanganLain.matches("[A-Za-z\\s]*") ){
											break;
										}
										else{
											System.out.println("Inputan mengandung angka / simbol!");
										}
									}else{
										System.out.println("Tidak boleh di awali spasi");
									}
								}else{
									System.out.println("Inputan tidak boleh kosong!");
								}
							}

							//input nilai tunjangan lainnya
							while(!isTrue){
								System.out.print("   >> Besar Tunjangan\t\t: ");
								tunjanganLain = input.nextLine();

								//validasi nilai tunjangan
								if(tunjanganLain.length() != 0){
									if (tunjanganLain.matches("[\\S]*")) {
										if (tunjanganLain.length() < 5) {
											if(tunjanganLain.matches("[0-9]*") ){
												break;
											}else{
												System.out.println("Inputan mengandung huruf / simbol");
											}
										}else{
											System.out.println("Minimal tunjangan Rp.10.000");
										}
									}else{
										System.out.println("Inputan mengandung spasi");
									}
								}else{
									System.out.println("Inputan tidak boleh kosong!");
								}
							}
							break;				
						}else if(adaTunjanganLain.equalsIgnoreCase("n") || adaTunjanganLain.equalsIgnoreCase("tidak")){
							break;
						}	else{
							System.out.println("Inputan salah!");
						}
					}else{
						System.out.println("Input Ya atau Tidak!");
					}
				}else{
					System.out.println("Inputan mengandung spasi / tab");
				}
			}else{
				System.out.println("Inputan tidak boleh kosong!");
			}
		}


		//-------------------------------???????????????????????-------------------------------------//

		//----------------------------------------------------------//
		//                      Penghasilan                         //
		//----------------------------------------------------------//

		//hitung tunjangan suami/istri & jumlah anggota keluarga jika sudah menikah
		if(statusNikah.equals("1")){
			tunjanganMenikah = 0.1 * gajiPokok;
			jumlahAnggotaKeluarga++;
		}

		//hitung tunjangan anak
		jumlahAnakTemp = Integer.parseInt(jumlahAnak);
		if(Integer.parseInt(jumlahAnak) > 2){
			jumlahAnakTemp = 2;
		}
		tunjanganAnak = 0.02 * gajiPokok * jumlahAnakTemp;
		
		//hitung tunjangan beras & jumlah anggota keluarga yang mendapat tunjangan
		jumlahAnggotaTunjangan = jumlahAnggotaKeluarga + jumlahAnakTemp;
		tunjanganBeras = 10 * hargaBeras * jumlahAnggotaTunjangan;

		//hitung penghasilan kotor
		bruto = gajiPokok + tunjanganMenikah + tunjanganAnak + tunjanganBeras + 
				(tunjanganStruktural + tunjanganFungsional + tunjanganUmum) + Integer.parseInt(tunjanganLain);

		//hitung biaya jabatan
		biayaJabatan = 0.05 * bruto;
		if(biayaJabatan > 500000){
			biayaJabatan = 500000;
		}

		//hitung iuran pensiun
		iuranPensiun = 0.0475 * (gajiPokok + tunjanganMenikah + tunjanganAnak);
		
		//hitung penghasilan bersih
		netto = bruto - biayaJabatan - iuranPensiun;

		//hitung penghasilan bersih setahun
		nettoSetahun = netto * 12;

		//hitung penghasilan tidak kena pajak
		jumlahAnakTemp = Integer.parseInt(jumlahAnak);
		if(Integer.parseInt(jumlahAnak) > 3){
			jumlahAnakTemp = 3;
		}
		ptkp = ptkpDefault + (ptkpPerOrang * (jumlahAnggotaKeluarga - 1 + jumlahAnakTemp));

		//hitung penghasilan kena pajak
		pkp = nettoSetahun - ptkp;

		//hitung tunjangan & potongan pph setahun
		//pkp 0-50000000
		if(pkp > 0){
			pkpTemp = pkp;
			if(pkpTemp - 50000000 > 0){
				pkpTemp = 50000000;
			}
			pphSetahun = 0.05 * pkpTemp;
		}
		//pkp 50000000 - 250000000
		if(pkp > 50000000){
			pkpTemp = pkp - 50000000;
			if(pkpTemp - 200000000 > 0){
				pkpTemp = 200000000;
			}
			pphSetahun = pphSetahun + (0.15 * pkpTemp);
		}
		//pkp 250000000 - 500000000
		if(pkp > 250000000){
			pkpTemp = pkp - 250000000;
			if(pkpTemp - 250000000 > 0){
				pkpTemp = 250000000;
			}
			pphSetahun = pphSetahun + (0.25 * pkpTemp);
		}
		//pkp > 500000000
		if(pkp > 500000000){
			pkpTemp = pkp - 500000000;
			pphSetahun = pphSetahun + (0.3 * pkpTemp);
		}

		//hitung tunjangan & potongan pph perbulan
		pph = pphSetahun / 12;

		//hitung bruto dengan tunjangan pph
		bruto = bruto + pph;

		//----------------------------------------------------------//
		//                      Potongan                            //
		//----------------------------------------------------------//

		//hitung potongan iuran wajib pajak
		iwp = 0.1 * (gajiPokok + tunjanganMenikah + tunjanganAnak);

		//hitung potongan taperum
		for(int i = 0 ; i < 4 ; i++){
			if(Integer.parseInt(golongan.substring(0,1)) == i+1){
				taperum = potonganTaperumArr[i];
			}
		}

		//hitung jumlah potongan
		jumlahPotongan = iwp + pph + taperum;

		//----------------------------------------------------------//
		//                     Penghasilan Bersih                   //
		//----------------------------------------------------------//

		jumlahBersih = bruto - jumlahPotongan;

		//-------------------------------???????????????????????-------------------------------------//

		//output
		System.out.println("\n\n\t\t\t\tSLIP GAJI");
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
		System.out.println(" T. Lain\t\t" + tunjanganLain);
		System.out.println(" T. Beras\t\t" + (int) tunjanganBeras            + "\t\t                 ---------------");
		System.out.println(" T. Pajak\t\t" + (int) pph);
		System.out.println("                 ---------------"                + "\t Jml. Bersih\t\t" + (int) jumlahBersih);
		System.out.println(" Jml. Kotor\t\t"+ (int) bruto);
		System.out.println("=========================================================================");

	}
}