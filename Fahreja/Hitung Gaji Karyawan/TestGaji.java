import java.util.Scanner;

public class TestGaji {
	public static void main(String[] args) {
		String nama, nik = null, jenisPekerjaan = null, penempatanKerja=null,jabatan=null,inputLamaKerja = null
				,inputLembur = null,inputStatus = null;
		double gaji =0, tunjangan =0,bonus =0, potonganKesehatan =0, potonganKetenagakerjaan =0, bruto = 0,
				pphTahun=0, pphBulan=0,jamLembur  =0,lamaKerja = 0, status =0, tunjanganPegawai=0;
		Scanner nilai = new Scanner(System.in);
		Validasi cek = new Validasi();
		
		do {
		System.out.print("Masukan nama : ");
		cek.nama(nama = nilai.nextLine());
			if (cek.key) {
				System.out.print("Masukan NIK : ");
				cek.angka(nik = nilai.nextLine());
					if (cek.key) {
						System.out.print("Jenis Pekerjaan (PG/SA/TS) : ");
						cek.jenis(jenisPekerjaan = nilai.nextLine());
							if (cek.key) {
								System.out.print("Penempatan kerja(Bandung/Jakarta/Karawang) : ");
								cek.huruf(penempatanKerja = nilai.nextLine());
									if (cek.key) {
										System.out.print("Status kerja(Junior/Middle/Senior) : ");
										cek.huruf(jabatan = nilai.nextLine());
										if (cek.key) {
											System.out.print("Lama kerja : ");
											cek.angka(inputLamaKerja = nilai.nextLine());
												if (cek.key) {
													System.out.print("Status(1.Menikah/2.Lajang) : ");
													cek.status(inputStatus = nilai.nextLine());
														if (cek.key) {
															System.out.print("Total jam lembur : ");
															cek.angka(inputLembur = nilai.nextLine());
														}
													}
											}
									}
							}
					}
			}
		}while (cek.isKey() != true);
		
		jamLembur = Double.parseDouble(inputLembur);
		status = Double.parseDouble(inputStatus);
		lamaKerja = Double.parseDouble(inputLamaKerja);
		penempatanKerja = penempatanKerja.toLowerCase();
		jenisPekerjaan = jenisPekerjaan.toUpperCase();
		jabatan = jabatan.toLowerCase();
		
		switch (jenisPekerjaan) {
		case "PG" : Programmer karyawan = new Programmer(nama, nik, penempatanKerja, jenisPekerjaan, jabatan, lamaKerja, jamLembur, status, bonus);
					gaji = karyawan.getGapok();
					karyawan.cariTunjangan();
					karyawan.tunjangan();
					tunjangan = karyawan.tunjanganKeluarga;
					tunjanganPegawai = karyawan.getTunjangan();
					jamLembur = karyawan.getLembur();
					System.out.println("Banyak bug yang di perbaiki : ");
					karyawan.bonus = nilai.nextInt();
					karyawan.cariBonus();
					bonus = (int) karyawan.bonus;
					karyawan.getBruto();
					bruto = karyawan.bruto;
					karyawan.hitungKesehatan();
					karyawan.hitungKetenagakerjaan();
					potonganKesehatan = karyawan.kesehatan;
					potonganKetenagakerjaan = karyawan.ketenagaKerjaan;
					karyawan.hitungBiayaJabatan();
					karyawan.cariGajiBersih();
					karyawan.hitungGajiBersihSetahun();
					karyawan.hitungPTKP();
					karyawan.pkp();
					karyawan.hitungPPHSetahun();
					pphTahun = karyawan.pphSetahun;
					karyawan.hitungPPHPerbulan();
					pphBulan = karyawan.pphPerbulan;
					break;
		case "SA" : SistemAnalis karyawan2 = new SistemAnalis(nama, nik, penempatanKerja, jenisPekerjaan, jabatan, lamaKerja, jamLembur, status);	
					gaji = karyawan2.getGapok();
					karyawan2.cariTunjangan();
					karyawan2.tunjangan();
					tunjangan = karyawan2.tunjanganKeluarga;
					tunjanganPegawai = karyawan2.getTunjangan();
					jamLembur = karyawan2.getLembur();
					bruto = karyawan2.getBruto();
					potonganKesehatan = karyawan2.hitungKesehatan();
					potonganKetenagakerjaan = karyawan2.hitungKetenagakerjaan();
					karyawan2.hitungBiayaJabatan();
					karyawan2.cariGajiBersih();
					karyawan2.hitungGajiBersihSetahun();
					karyawan2.hitungPTKP();
					karyawan2.pkp();
					pphTahun = karyawan2.hitungPPHSetahun();
					pphBulan = karyawan2.hitungPPHPerbulan();
					break;
		case "TS" : Tester karyawan3 = new Tester(nama, nik, penempatanKerja, jenisPekerjaan, jabatan, lamaKerja, jamLembur, status, bonus);
					gaji = karyawan3.getGapok();
					karyawan3.cariTunjangan();
					karyawan3.tunjangan();
					tunjangan = karyawan3.tunjanganKeluarga;
					tunjanganPegawai = karyawan3.getTunjangan();
					karyawan3.getLembur();
					jamLembur = (int) karyawan3.lembur;
					System.out.println("Test Case yang di kerjakan (Perseratus case) ");
					karyawan3.bonus = nilai.nextInt();
					karyawan3.cariBonus();
					bonus = (int) karyawan3.bonus;
					karyawan3.getBruto();
					bruto = karyawan3.bruto;
					karyawan3.hitungKesehatan();
					karyawan3.hitungKetenagakerjaan();
					potonganKesehatan = karyawan3.kesehatan;
					potonganKetenagakerjaan = karyawan3.ketenagaKerjaan;
					karyawan3.hitungBiayaJabatan();
					karyawan3.cariGajiBersih();
					karyawan3.hitungGajiBersihSetahun();
					karyawan3.hitungPTKP();
					karyawan3.pkp();
					karyawan3.hitungPPHSetahun();
					pphTahun = karyawan3.pphSetahun;
					karyawan3.hitungPPHPerbulan();
					pphBulan = karyawan3.pphPerbulan;
					break;
		}
		
		System.out.println("Gaji Pokok           : \tRp."+(int)gaji);
		System.out.println("Tunjangan Keluarga   : \tRp."+(int)tunjangan);
		System.out.println("Tunjangan Pegawai    : \tRp."+(int)tunjanganPegawai);
		System.out.println("Lembur               : \tRp."+(int)jamLembur);
		System.out.println("Bonus                : \tRp."+(int)bonus);
		System.out.println("Bruto                : \tRp."+(int)bruto);
		System.out.println("BPJS Kesehatan       : \tRp."+(int)potonganKesehatan);
		System.out.println("BPJS Ketenagakerjaan : \tRp."+(int)potonganKetenagakerjaan);
		System.out.println("PPH Setahun          : \tRp."+(int)pphTahun);
		System.out.println("PPH Perbulan         : \tRp."+(int)pphBulan);
		
		System.out.println("\nTake Home Pay        : \tRP."+(int) (bruto - potonganKesehatan-potonganKetenagakerjaan-pphBulan));
	}
}
