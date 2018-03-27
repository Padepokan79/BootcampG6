/*author	: Regi Witanto
dibuat	: 26/03/2018 - 27/03/2018
*/

package GajiPNS;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPNS implements GajiGolongan {
	static Scanner keyboard = new Scanner(System.in);
	
	// ArrayList
	static ArrayList<String> statusPernikahan = new ArrayList<String>();
	
	// Instantiate
	static PNSPejabat pejabat = new PNSPejabat();
	static PNSPelayanMasyarakat pelayanMasyarakat = new PNSPelayanMasyarakat();
	static PNSUmum umum = new PNSUmum();
	
	// Array Temp
	static int[] golTemp = new int[0];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Input ArrayList
		statusPernikahan.add("1");
		statusPernikahan.add("2");
		statusPernikahan.add("3");
		
		// Menu
		int pilih;
		do {
			System.out.println("\nData Pegawai Negeri Sipil");
			System.out.println("\nJenis PNS");
			System.out.println("1. Pejabat");
			System.out.println("2. Pelayan Masyarakat");
			System.out.println("3. PNS Umum");
			System.out.print("Masukkan jenis PNS anda (pilih angka 1 / 2 / 3): ");
			pilih = Integer.valueOf(validasiUntukInputanAngka("pilih"));
			
			switch (pilih) {
				case 1: {
					input(pejabat, pilih);
					break;
				}
				case 2: {
					input(pelayanMasyarakat, pilih);
					break;
				}
				case 3: {
					input(umum, pilih);
					break;
				}
			}
		} while (pilih != 0);
	}
	

	public static void input(PNS pns, int pilih) {
		// TODO Auto-generated method stub
		
		// Kondisi Pilihan Jenis PNS
		if (pilih == 1) {
			pejabat = new PNSPejabat(pns);
		}
		else if (pilih == 2) {
			pelayanMasyarakat = new PNSPelayanMasyarakat(pns);
		} 
		else if (pilih == 3) {
			umum = new PNSUmum(pns);
		}
		
		boolean isTrue = false;

		// Inputan NIP
		while (!isTrue) {
			System.out.print("\nNIP\t\t\t\t\t: ");
			pns.setNip(keyboard.next());

			if (pns.getNip().length() != 0) {
				if (pns.getNip().matches("[\\S]*")) {
					if (pns.getNip().matches("[0-9]*")) {
						if (pns.getNip().length() >= 12 && pns.getNip().length() <= 18) {
							break;
						} else {
							System.out.println("NIP tidak boleh kurang dari 12 angka / lebih dari 18 angka!");
						}
					} else {
						System.out.println("NIP hanya boleh berisi angka saja!");
					}
				} else {
					System.out.println("NIP tidak boleh ada spasi!");
				}
			} else {
				System.out.println("NIP tidak boleh dikosongkan!");
			}	
		}

		// Inputan Nama
		while (!isTrue) {
			System.out.print("Nama\t\t\t\t\t: ");
			pns.setNama(keyboard.next());

			if (pns.getNama().matches("[\\W]*")) {
				System.out.println("Data yang anda masukkan masih kosong / tidak sesuai ketentuan!");
			}
			else {
				if (pns.getNama().matches("[A-Za-z., ]*")) {
					if (pns.getNama().length() > 0 && pns.getNama().length() <= 32) {
						break;
					} else {
						System.out.println("Nama maksimal hanya 32 karakter!");
					}
				} else {
					System.out.println("Nama tidak boleh mengandung angka & simbol selain titik & koma!");
				}
			}
		}

		// Inputan Jenis Kelamin
		while (!isTrue) {
			System.out.print("Jenis Kelamin (pria / wanita)\t\t: ");
			pns.setJenisKelamin(keyboard.next());

			if (pns.getJenisKelamin().matches("[\\S]*")) {
				if (pns.getJenisKelamin().length() > 0) {
					if (pns.getJenisKelamin().equalsIgnoreCase("pria") || pns.getJenisKelamin().equalsIgnoreCase("wanita")) {
						break;
					} else {
						System.out.println("Jenis kelamin hanya boleh berisi pria / wanita saja!");
					}
				} else {
					System.out.println("Jenis kelamin tidak boleh dikosongkan!");
				}
			} else {
				System.out.println("Jenis Kelamin tidak boleh ada spasi!");
			}			
		}

		// Inputan Golongan dan Masa kerja
		while (!isTrue) {
			System.out.print("Golongan (contoh : 1A, 2B)\t\t: ");
			pns.setGolongan(keyboard.next());

			if (pns.getGolongan().matches("[//W]*")) {
				System.out.println("Data yang anda masukkan masih kosong atau tidak sesuai ketentuan!");
			} else {
				if (pns.getGolongan().length() == 2) {
					if (pns.getGolongan().substring(0,1).matches("[1-4]*") && pns.getGolongan().substring(1,2).matches("[A-E]*")) {

						while (!isTrue) {
							System.out.print("Masa Kerja (dalam tahun)\t\t: ");
							pns.setMasaKerja(keyboard.next());

							if (pns.getMasaKerja().length() > 0) {
								if (pns.getMasaKerja().matches("[0-9]*")) {
									if (Integer.parseInt(pns.getMasaKerja()) < 3 && pns.getGolongan().matches("[1-2B-D]*")) {
										System.out.println("Golongan dan Masa Kerja tidak tepat, mohon diisi sesuai data anda!");
										break;

									// Switch Case Golongan
									} else {
										switch (pns.getGolongan()) {
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
										if (Integer.parseInt(pns.getMasaKerja()) > golTemp.length-1) {
											pns.setMasaKerja(String.valueOf(golTemp.length-1));
										}
										pns.setGajiPokok(golTemp[Integer.parseInt(pns.getMasaKerja())]);
										break;
									}
								} else {
									System.out.println("Masa kerja tidak boleh mengandung huruf / simbol!");
								}
							} else {
								System.out.println("Masa kerja tidak boleh dikosongkan!");
							}
						}

						if (pns.getGajiPokok() != 0) {
							break;
						}

					} else {
						System.out.println("Kode Golongan harus huruf kapital!");
					}
				} else {
					System.out.println("Kode Golongan yang anda isi tidak sesuai, mohon ikuti contoh!");
				}
			}	
		}
		
		// Inputan Status Pernikahan
		while (!isTrue) {
			System.out.println("\n1. Menikah\n2. Belum Menikah\n3. Single Parents");
			System.out.print("Status Pernikahan (nomor saja)\t\t: ");
			pns.setStatusPernikahan(keyboard.next());
			
			if (pns.getStatusPernikahan().equalsIgnoreCase("1")) {
				pns.setStatusPernikahan(statusPernikahan.get(0));
			}
			else if (pns.getStatusPernikahan().equalsIgnoreCase("2")) {
				pns.setStatusPernikahan(statusPernikahan.get(1));
			}
			else if (pns.getStatusPernikahan().equalsIgnoreCase("3")) {
				pns.setStatusPernikahan(statusPernikahan.get(2));
			}

			if (pns.getStatusPernikahan().matches("[\\W]*")) {
				System.out.println("\nData yang anda masukkan masih kosong / tidak sesuai ketentuan!");
			} else {
				if (pns.getStatusPernikahan().matches("[1-3]*")) {	
					break;
				} else {
					System.out.println("\nStatus Pernikahan tidak sesuai, mohon isi dengan nomor 1 / 2 / 3!");
				}
			}
		}

		// Inputan Jumlah Anak
		while (!isTrue) {
			System.out.print("\nJumlah Anak (dalam angka)\t\t: ");
			pns.setJumlahAnak(keyboard.next());

			if (pns.getJumlahAnak().matches("[\\W]*")) {
				System.out.println("\nData yang anda masukkan masih kosong / tidak sesuai ketentuan!");
			} else {
				if (pns.getJumlahAnak().matches("[0-9]*")) {
					break;
				} else {
					System.out.println("\nJumlah Anak tidak boleh mengandung huruf / simbol!");
				}
			}
		}

		// Inputan Tunjangan Lain
		while (!isTrue) {
			System.out.print("Ada Tunjangan Lain (y / n)\t\t: ");
			pns.setTunjanganLain(keyboard.next());

			if (pns.getTunjanganLain().length() == 1) {
				if (pns.getTunjanganLain().equalsIgnoreCase("y")) {
					
					// Nama Tunjangan
					while (!isTrue) {
						System.out.print("Nama Tunjangan\t\t\t\t: ");
						pns.setNamaTunjanganLain(keyboard.next());

						if (pns.getNamaTunjanganLain().matches("[\\W]*")) {
							System.out.println("\nData yang anda masukkan masih kosong / tidak sesuai ketentuan!");
						} else {
							if (pns.getNamaTunjanganLain().matches("[A-Za-z\\s]*") ) {
								break;
							} else {
								System.out.println("\nNama Tunjangan tidak boleh mengandung angka / simbol!");
							}
						}
					}

					// Besar Tunjangan
					while (!isTrue) {
						System.out.print("Besar Tunjangan\t\t\t\t: ");
						pns.setBesarTunjanganLain(keyboard.next());

						if (pns.getBesarTunjanganLain().matches("[\\W]*")) {
							System.out.println("\nData yang anda masukkan masih kosong / tidak sesuai ketentuan!");
						} else {
							if (pns.getBesarTunjanganLain().matches("[0-9]*") ) {
								break;
							} else {
								System.out.println("\nBesar Tunjangan tidak boleh mengandung huruf / simbol!");
							}
						}
					}
					break;				
				}
				else if (pns.getTunjanganLain().equalsIgnoreCase("n")) {
					break;
				} else {
					System.out.println("\nJawaban tidak sesuai, silahkan isi dengan (Y / N) / (y / n)!");
				}
			} else {
				System.out.println("\nJawaban tidak boleh kosong, silahkan isi dengan (Y / N) / (y / n)!");
			}
		}
		
		// Call Methods
		pns.tunjanganMenikah();
		pns.tunjanganAnak();
		pns.tunjanganBeras();
		pns.bruto();
		pns.biayaJabatan();
		pns.iuranPensiun();
		pns.netto();
		pns.nettoSetahun();
		pns.ptkp();
		pns.pkp();
		pns.pph();
		pns.brutoPlusPPH();
		pns.iwp();
		pns.taperum();
		pns.jumlahPotongan();
		pns.jumlahBersih();
		System.out.println(pns.toString());
	}
	
	// Validasi
	public static String validasiUntukInputanAngka(String data) {
		String angka = "";
		boolean benar = false;
		do {
			angka = keyboard.next();
			if (angka.matches("[\\W]*")) {
				System.out.print("Data yang anda masukkan salah. Silahkan masukkan kembali: ");
			}
			else if (angka.matches("[0-9]*")) {				
				switch (data) {
					case "pilih":
						if (angka.length() == 1 && Integer.valueOf(angka) >= 0 && Integer.valueOf(angka) <= 3) {
							benar = true;
						} 
						else {
							System.out.print("Pilih angka 1 / 2 / 3. Silahkan masukkan kembali: ");
						}						
						break;
				}
			}
			else {
				System.out.print("Data yang anda masukkan harus berupa angka. Silahkan masukkan kembali: ");
			}
		} while (benar == false);
	return angka;
	}

}
