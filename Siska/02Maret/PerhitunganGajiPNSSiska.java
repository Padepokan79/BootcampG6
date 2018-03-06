import java.util.Scanner;

public class PerhitunganGajiPNSSiska{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int tunjanganStruktural = 1000000;
		final int tunjanganFungsional = 500000;
		final int hargaBeras = 12500;
		final int ptkpDefault = 36000000;
		final int ptkpKeluarga = 3000000;

		String nama, nip, gender, golongan, maritalStatus, jumlahAnak, jenisPNS;
		String tunjanganLain, namaTunjanganLain, besarTunjanganLain;

		int masaKerja, jumlahKeluarga = 1, tempJumlahKeluarga, gajiPokok = 1000;
		int jumlahAnakTunjangan, jumlahTunanganLain = 0, tunjanganBeras, tunjanganUmum, tunjanganTemp;
		int nettoSetahun, ptkp, pkp, pkpTemp;

		double bruto, netto;
		double tunjanganMenikah = 0, tunjanganAnak = 0, biayaJabatan, iuranPensiun;
		double pkpAkhir;
		
		int [] gol1A = {1486500, 1486500, 1533400, 1533400, 1581700, 1581700, 1631500, 1631500, 1682900, 1682900, 1735900, 1735900, 1790500, 1790500, 1846900, 1846900, 1905100, 1905100, 1965100, 1965100, 2027000, 2027000, 2090800, 2090800, 2156700, 2156700, 2224600, 2224600};
		int [] gol1B = {0, 0, 0, 1623400, 1623400, 1674500, 1674500, 1727300, 1727300, 1781700, 1781700, 1837800, 1837800, 1895700, 1895700, 1955400, 1955400, 2016900, 2016900, 2080500, 2080500, 2146000, 2146000, 2213600, 2213600, 2283300, 2283300, 2335200};
		int [] gol1C = {0, 0, 0, 1692100, 1692100, 1745400, 1745400, 1800300, 1800300, 1857000, 1857000, 1915500, 1915500, 1975800, 1975800, 2038100, 2038100, 2102300, 2102300, 2168500, 2168500, 2236800, 2236800, 2307200, 2307200, 2379900, 2379900, 2454800};
		int [] gol1D = {0, 0, 0, 1763600, 1763600, 1819200, 1819200, 1876500, 1876500, 1935600, 1935600, 1996500, 1996500, 2059400, 2059400, 2124300, 2124300, 2191200, 2191200, 2260200, 2260200, 2331400, 2331400, 2404800, 2404800, 2480500, 2480500, 2558700};

		int [] gol2A = {1926000, 1956300, 1956300, 2017900, 2017900, 2081500, 2081500, 2147000, 2147000, 2214700, 2214700, 2284400, 2284400, 2356400, 2356400, 2430600, 2430600, 2507100, 2507100, 2586100, 2586100, 2667500, 2667500, 2751600, 2751600, 2838200, 2838200, 2927600, 2927600, 3019800, 3019800, 3114900, 3114900, 3213100};
		int [] gol2B = {0, 0, 0, 2103300, 2103300, 2169500, 2169500, 2237900, 2237900, 2308300, 2308300, 2381100, 2381100, 2456000, 2456000, 2533400, 2533400, 2613200, 2613200, 2695500, 2695500, 2780400, 2780400, 2867900, 2867900, 2958300, 2958300, 3051400, 3051400, 3147600, 3147600, 3246700, 3246700, 3348900};
		int [] gol2C = {0, 0, 0, 2192300, 2192300, 2261300, 2261300, 2332500, 2332500, 2406000, 2406000, 2481800, 2481800, 2559900, 2559900, 2640600, 2640600, 2723700, 2723700, 2809500, 2809500, 2898000, 2898000, 2989300, 2989300, 3083400, 3083400, 3180500, 3180500, 3280700, 3280700, 3384000, 3384000, 3490600};
		int [] gol2D = {0, 0, 0, 2285000, 2285000, 2357000, 2357000, 2431200, 2431200, 2507800, 2507800, 2586700, 2586700, 2668200, 2668200, 2752300, 2752300, 2838900, 2838900, 2928300, 2928300, 3020600, 3020600, 3115700, 3115700, 3213800, 3213800, 3315100, 3315100, 3419500, 3419500, 3527200, 3527200, 3638200};

		int [] gol3A = {2456700, 2456700, 2534000, 2534000, 2613800, 2613800, 2696200, 2696200, 2781100, 2781100, 2868700, 2868700, 2959000, 2959000, 3052200, 3052200, 3148300, 3148300, 3247500, 3247500, 3349800, 3349800, 3455300, 3455300, 3564100, 3564100, 3676400, 3676400, 3792100, 3792100, 3911600, 3911600, 4034800};
		int [] gol3B = {2560600, 2560600, 2641200, 2641200, 2724400, 2724400, 2810200, 2810200, 2898700, 2898700, 2990000, 2990000, 3084200, 3084200, 3181300, 3181300, 3281500, 3281500, 3384900, 3384900, 3491500, 3491500, 3601400, 3601400, 3714900, 3714900, 3831900, 3831900, 3952600, 3952600, 4007000, 4007000, 4205400};
		int [] gol3C = {2668900, 2668900, 2752900, 2752900, 2839700, 2839700, 2929100, 2929100, 3021300, 3021300, 3116500, 3116500, 3214700, 3214700, 3315900, 3315900, 3420300, 3420300, 3528100, 3528100, 3639200, 3639200, 3753800, 3753800, 3872000, 3872000, 3994200, 3994200, 4119700, 4119700, 4249500, 4249500, 4383300};
		int [] gol3D = {2781800, 2781800, 2869400, 2869400, 2959800, 2959800, 3053000, 3053000, 3149100, 3149100, 3248300, 3248300, 3350600, 3350600, 3456200, 3456200, 3565000, 3565000, 3677300, 3677300, 3912600, 3912600, 3912600, 3912600, 4035800, 4035800, 4162900, 4162900, 4294000, 4294000, 4429300, 4429300, 4568800};

		int [] gol4A = {2899500, 2899500, 2990800, 2990800, 3085000, 3085000, 3182100, 3182100, 3282400, 3282400, 3385700, 3385700, 3492400, 3492400, 3602400, 3602400, 3715800, 3715800, 3832800, 3832800, 3953600, 3593600, 4078100, 4078100, 4206500, 4206500, 4339000, 4339000, 4475700, 4475700, 4616600, 4616600, 4762000};
		int [] gol4B = {3022100, 3022100, 3117300, 3117300, 3215500, 3215500, 3316700, 3316700, 3421200, 3421200, 3258900, 3258900, 3640100, 3640100, 3754700, 3754700, 3873000, 3873000, 3995000, 3995000, 4120800, 4120800, 4250600, 4250600, 4384400, 4384400, 4522500, 4522500, 4665000, 4665000, 4811900, 4811900, 4963400};
		int [] gol4C = {3149900, 3149900, 3249100, 3249100, 3351500, 3351500, 3457000, 3457000, 3565900, 3565900, 3678200, 3678200, 3794100, 3794100, 3913600, 3913600, 4036800, 4036800, 4164000, 4164000, 4295100, 4295100, 4430400, 4430400, 4569900, 4569900, 4713800, 4713800, 4862300, 4862300, 5015400, 5015400, 5173400};
		int [] gol4D = {3283200, 3283200, 3386600, 3386600, 3493200, 3493200, 3603300, 3603300, 3716700, 3716700, 3833800, 3833800, 3954600, 3954600, 4079100, 4079100, 4207600, 4207600, 4340100, 4340100, 4476800, 4476800, 4617800, 4617800, 4763200, 4763200, 4913200, 4193200, 5068000, 5068000, 5227600, 5227600, 5392200};
		int [] gol4E = {3422100, 3422100, 3529800, 3529800, 3641000, 3641000, 3755700, 3755700, 3874000, 3874000, 3996000, 3996000, 4121800, 4121800, 4251600, 4251600, 4385600, 4385600, 4523700, 4523700, 4666100, 4666100, 4813100, 4813100, 4964700, 4964700, 5121100, 5121100, 5282300, 5282300, 5448700, 5448700, 5620300};
		int [] temp = new int[0];
		
		boolean isTrue = false;

		//inputan NIP
		while(isTrue == false){				
			System.out.print("Masukkan NIP anda\t: ");
			nip = input.nextLine();

			if(nip.length() >= 12 && nip.length() <= 18){
				if(nip.matches("[0-9]*") ){
					break;
				}
				else{
					System.out.println("NIP yang anda masukkan mengandung angka / simbol!");
				}
			}else{
				System.out.println("Anda belum mengisi NIP / \nNIP yang anda masukkan kurang dari 12 angka / \nlebih dari 18 angka!");
			}
		}

		//inputan nama
		while(isTrue == false){				
			System.out.print("Masukkan nama anda\t: ");
			nama = input.nextLine();

			if(nama.length()>0 && nama.length()<=50){
				if(nama.matches("[A-Za-z]*") ){
					break;
				}
				else{
					System.out.println("Nama yang anda masukkan mengandung angka / simbol!");
				}
			}else{
				System.out.println("Anda belum mengisi nama / nama yang anda masukkan melebihi 50 huruf!");
			}
		}

		//inputan gender
		while(isTrue == false){				
			System.out.print("Masukkan jenis kelamin anda (Pria / Wanita)\t: ");
			gender = input.nextLine();

			if(gender.equalsIgnoreCase("pria") || gender.equalsIgnoreCase("wanita")){
				break;
			}else{
				System.out.println("Jenis kelamin yang anda masukkan salah!");
			}
		}

		//inputan golongan dan masa kerja
		while(isTrue == false){
			System.out.print("Masukkan Golongan anda: ");
			golongan = input.next();
				if (golongan.matches("[1-4A-E]*")) {

						System.out.print("Masukkan Masa Kerja anda: ");
						masaKerja = input.nextInt();
									
							switch(golongan){
							case "1A" : 
										temp = new int [gol1A.length];
										temp = gol1A;
										break;
							case "1B" :
										if(masaKerja < 3){
											System.out.println("Masa kerja yang anda masukkan salah!");				
										}else{
											temp = new int [gol1B.length];
											temp = gol1B;
										}
										break;
							case "1C" :
										if(masaKerja < 3){
											System.out.println("Masa kerja yang anda masukkan salah!");
										}else{
											temp = new int [gol1C.length];
											temp = gol1C;
										}
										break;
							case "1D" :
										if(masaKerja < 3){
											System.out.println("Masa kerja yang anda masukkan salah!");
										}else{
											temp = new int [gol1D.length];
											temp = gol1D;
										}
										break;
							case "2A" : 
										temp = new int [gol2A.length];
										temp = gol2A;
										break;
							case "2B" :
										if(masaKerja < 3){
											System.out.println("Masa kerja yang anda masukkan salah!");
										}else{
											temp = new int [gol2B.length];
											temp = gol2B;
										}
										break;
							case "2C" :
										if(masaKerja < 3){
											System.out.println("Masa kerja yang anda masukkan salah!");
										}else{
											temp = new int [gol2C.length];
											temp = gol2C;
										}
										break;
							case "2D" :
										if(masaKerja < 3){
											System.out.println("Masa kerja yang anda masukkan salah!");
										}else{
											temp = new int [gol2D.length];
											temp = gol2D;
										}
										break;
							case "3A" : 
										temp = new int [gol3A.length];
										temp = gol3A;
										break;
							case "3B" : 
										temp = new int [gol3B.length];
										temp = gol3B;
										break;
							case "3C" : 
										temp = new int [gol3C.length];
										temp = gol3C;
										break;
							case "3D" : 
										temp = new int [gol3D.length];
										temp = gol3D;
										break;
							case "4A" : 
										temp = new int [gol4A.length];
										temp = gol4A;
										break;
							case "4B" : 
										temp = new int [gol4B.length];
										temp = gol4B;
										break;
							case "4C" : 
										temp = new int [gol4C.length];
										temp = gol4C;
										break;
							case "4D" : 
										temp = new int [gol4D.length];
										temp = gol4D;
										break;
							case "4E" : 
										temp = new int [gol4E.length];
										temp = gol4E;
										break;
							default: 
										System.out.println("Golongan anda salah!"); 
										break;
									}					
				}else{System.out.println("Golongan yang anda masukan salah!");}

			if(temp.length != 0 ){
				if (masaKerja >= temp.length) {
					masaKerja = temp.length-1;
					gajiPokok =temp[masaKerja];
					System.out.println("Gaji Pokok Anda : "+gajiPokok);
					break;
				}else{
					gajiPokok = temp[masaKerja];
					System.out.println("Gaji Pokok Anda : "+gajiPokok);
					break;
				}
			}
		}


		//inputan status pernikahan
		while(isTrue == false){
			System.out.print("Masukkan status pernikahan anda [ 1.Menikah 2.Belum Menikah 3.Single Parents ] : ");
			maritalStatus = input.next();

			if (maritalStatus.matches("[1-3]*")) {	
					if(maritalStatus.equals("1")){
						tunjanganMenikah = 0.1 * gajiPokok;
						System.out.println(tunjanganMenikah);
						jumlahKeluarga++;
						break;
					}else if(maritalStatus.equals("2") || maritalStatus.equals("3")){
						break;
					}
			}
			else{
				System.out.println("Inputan harus berupa angka / Inputan yang anda masukkan salah!");
			}
		}

		//inputan jumah anak
		while(isTrue == false){
			System.out.print("Masukkan jumlah anak anda: ");
			jumlahAnak = input.next();

			if(jumlahAnak.matches("[0-9]*")){
				if(Integer.parseInt(jumlahAnak) > 2){
					jumlahAnakTunjangan = 2;
				}else{
					jumlahAnakTunjangan = Integer.parseInt(jumlahAnak);
				}

				tunjanganAnak = 0.02 * gajiPokok * jumlahAnakTunjangan;
				TempJumlahKeluarga = jumlahKeluarga + jumlahAnakTunjangan;
				System.out.println(tunjanganAnak);
				break;
				
			}else{
				System.out.println("Jumlah anak yang anda masukkan salah!");
			}
		}

		//inputan jenis PNS
		while(isTrue == false){
			System.out.print("Masukkan jenis PNS anda [ 1.Pejabat 2.Pelayan Masyarakat 3.Lainnya ] : ");
			jenisPNS = input.next();

			if(jenisPNS.equals("1") || jenisPNS.equals("2") || jenisPNS.equals("3")){
				break;
			}else{
				System.out.println("Inputan harus berupa angka / Inputan yang anda masukkan salah!");
			}
		}

		//inputan tunjangan lainnya
		while(isTrue == false){				
			System.out.print("Apakah ada tunjangan lainnya (Ya / Tidak)\t: ");
			tunjanganLain = input.next();

			if(tunjanganLain.equalsIgnoreCase("ya")){
				while(isTrue == false){
					System.out.print("Nama Tunjangan : ");
					namaTunjanganLain = input.next();

					if(namaTunjanganLain.matches("[A-Za-z]*") ){
						break;
					}
					else{
						System.out.println("Inputan yang anda masukkan mengandung angka / simbol!");
					}
				}

				while(isTrue == false){
					System.out.print("Besar Tunjangan : ");
					besarTunjanganLain = input.next();

					if(besarTunjanganLain.matches("[0-9]*") ){
						jumlahTunjanganLain = Integer.parseInt(besarTunjanganLain);
						break;
					}
					else{
						System.out.println("Inputan yang anda masukkan mengandung huruf!");
					}
				}
				break;				
			}
			else if(tunjanganLain.equalsIgnoreCase("tidak")){
				break;
			}
			else{
				System.out.println("Inputan yang anda masukkan salah!");
			}
		}


		//hitung tunjangan beras
		tunjanganBeras = hargaBeras * tempJumlahKeluarga * 10;
		System.out.println("tunjangan beras: "+tunjanganBeras);

		//
		if (jenisPNS.equals("1")){
			tunjanganTemp = tunjanganStruktural;
		}
		else if (jenisPNS.equals("2")){
			tunjanganTemp = tunjanganFungsional;
		}
		else if (jenisPNS.equals("3")) {
			if (golongan.substring(0).equals("1")){
				tunjanganUmum = 175000;
			}
			else if (golongan.substring(0).equals("2")) {
				tunjanganUmum = 180000;
			}
			else if (golongan.substring(0).equals("3")) {
				tunjanganUmum = 185000;
			}
			else if (golongan.substring(0).equals("4")) {
				tunjanganUmum = 190000;
			}

			tunjanganTemp = tunjanganUmum;
		}
		System.out.println("tunjangan temp: "+tunjanganTemp);


		//hitung penghasilan kotor
		bruto = gajiPokok + tunjanganMenikah + tunjanganAnak + tunjanganBeras + tunjanganTemp + jumlahTunjanganLain;
		System.out.println("bruto: "+ bruto);

		//hitung biaya jabatan
		biayaJabatan = 0.05 * bruto;

		if(biayaJabatan > 500000){
			biayaJabatan = 500000;
		}
		System.out.println("biayaJabatan "+biayaJabatan);

		//hitung iuran pensiun
		iuranPensiun = 0.0475 * (gajiPokok + tunjanganMenikah + tunjanganAnak);
		System.out.println("pensiun "+iuranPensiun);

		//hitung penghasilan bersih
		netto = bruto - biayaJabatan - iuranPensiun;
		System.out.println("netto "+netto);

		//hitung penghasilan bersih setahun
		nettoSetahun = netto * 12;
		System.out.println("nettoSetahun "+nettoSetahun);

		//ptkp
		if(Integer.parseInt(jumlahAnak) > 3){
			jumlahAnakTunjangan = 3;
		}else{
			jumlahAnakTunjangan = Integer.parseInt(jumlahAnak);
		}

		ptkp = ptkpDefault + (ptkpKeluarga*(jumlahKeluarga-1+jumlahAnakTunjangan));
		System.out.println("ptkp "+ptkp);

		//pkp
		pkp = nettoSetahun - ptkp;

		//tarif pkp
		if ((pkp-50000000) > 0){
			pkpTemp = pkp - 500000;
		}
		
	}
}