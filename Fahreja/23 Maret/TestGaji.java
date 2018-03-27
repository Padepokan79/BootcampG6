import java.util.Scanner;

public class TestGaji {
	public static void main(String[] args) {
		String nama, nik = null, jenisPekerjaan = null, penempatanKerja=null,jabatan=null,inputLamaKerja = null
				,inputLembur = null,inputStatus = null;
		double gaji =0, tunjangan =0,bonus =0, potonganKesehatan =0, potonganKetenagakerjaan =0, bruto = 0,
				pphTahun=0, pphBulan=0,jamLembur  =0,lamaKerja = 0, status =0, tunjanganPegawai=0, jakarta =0;
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
		case "PG" : System.out.println("Banyak bug yang di perbaiki : ");
					bonus = nilai.nextInt();
					Programmer karyawan = new Programmer(nama, nik, penempatanKerja, jenisPekerjaan, jabatan, lamaKerja, jamLembur, status, bonus);
					gaji = karyawan.getGapok();
					tunjangan = karyawan.getTunjanganKeluarga();
					tunjanganPegawai = karyawan.getTunjangan();
					jakarta = karyawan.getTunjangJakarta();
					jamLembur = karyawan.getLembur();
					bonus = (int) karyawan.getBonus();
					bruto = karyawan.getBruto();
					potonganKesehatan = karyawan.getKesehatan();
					potonganKetenagakerjaan = karyawan.getKetenagaKerjaan();
					pphTahun = karyawan.getPphSetahun();
					pphBulan = karyawan.getPphPerbulan();
					break;
		case "SA" : SistemAnalis karyawan2 = new SistemAnalis(nama, nik, penempatanKerja, jenisPekerjaan, jabatan, lamaKerja, jamLembur, status);
					gaji = karyawan2.getGapok();
					tunjangan = karyawan2.getTunjanganKeluarga();
					tunjanganPegawai = karyawan2.getTunjangan();
					jakarta = karyawan2.getTunjangJakarta();
					jamLembur = karyawan2.getLembur();
					bruto = karyawan2.getBruto();
					potonganKesehatan = karyawan2.getKesehatan();
					potonganKetenagakerjaan = karyawan2.getKetenagaKerjaan();
					pphTahun = karyawan2.getPphSetahun();
					pphBulan = karyawan2.getPphPerbulan();
					break;
		case "TS" : System.out.println("Banyak Test Case yang di kerjakan(Perseratus) : ");
					bonus = nilai.nextInt();
					Tester karyawan3 = new Tester(nama, nik, penempatanKerja, jenisPekerjaan, jabatan, lamaKerja, jamLembur, status, bonus);
					gaji = karyawan3.getGapok();
					tunjangan = karyawan3.getTunjanganKeluarga();
					tunjanganPegawai = karyawan3.getTunjangan();
					jakarta = karyawan3.getTunjangJakarta();
					jamLembur = karyawan3.getLembur();
					bonus = (int) karyawan3.getBonus();
					bruto = karyawan3.getBruto();
					potonganKesehatan = karyawan3.getKesehatan();
					potonganKetenagakerjaan = karyawan3.getKetenagaKerjaan();
					pphTahun = karyawan3.getPphSetahun();
					pphBulan = karyawan3.getPphPerbulan();
					break;
		}
		
		System.out.println("Gaji Pokok           : \tRp."+(int)gaji);
		System.out.println("Tunjangan Keluarga   : \tRp."+(int)tunjangan);
		System.out.println("Tunjangan Pegawai    : \tRp."+(int)tunjanganPegawai);
		System.out.println("Tunjangan Transport  : \tRp."+(int)jakarta);
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
