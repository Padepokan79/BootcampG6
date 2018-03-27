//Author : Khairin Aulia
//Date Created : Monday, 26th March 2018

import java.util.Scanner;

public class TestPNS extends PNS {

	public static void main(String[] args) {
		Scanner inputMenu = new Scanner(System.in); // Input khusus menu
		Scanner input = new Scanner(System.in);
		Scanner angka = new Scanner(System.in);
		
		PNS pegawai = new PNS();
		
		// Menu
				int menu;

				do {
					System.out.println("\nPenghitungan Gaji PNS\n");
					System.out.println("1. NAMA " );
					System.out.println("2. NIP " );
					System.out.println("3. JENIS KELAMIN ");
					System.out.println("4. GOLONGAN ");
					System.out.println("5. MASA KERJA ");
					System.out.println("6. STATUS KAWIN ");
					System.out.println("7. JENIS PNS ");
					System.out.println("8. TUNJANGAN LAINNYA ");
					System.out.println("9. SLIP GAJI ");
					System.out.println("0. Keluar");
					System.out.print("Pilih menu : "); menu = inputMenu.nextInt();

					switch (menu) {	

						case 1 : // INPUT NAMA

		              		System.out.print("Masukkan nama : "); pegawai.setNama(input.nextLine());  

		            		while (!pegawai.isValidNama()) {
		            			System.out.print("Masukkan nama : "); pegawai.setNama(input.nextLine()); 
		            		}
		            		
		                	break;

						case 2 : // INPUT NIP
							System.out.print("Masukkan nomor NIP Anda : "); pegawai.setNip(input.nextLine()); 

							while (!pegawai.isValidNip()) {
								System.out.print("Masukkan NIP : "); pegawai.setNip(input.nextLine()); 
							}

							break;

						case 3 : // INPUT JENIS KELAMIN   
		                    String pilJenisKelamin;
							System.out.println("Masukkan jenis kelamin: \n1. Pria \n2. Wanita ");
		                    pegawai.setPilJenisKelamin(input.nextLine());
		                      
		                    while (!pegawai.isValidJenisKelamin()) {
								System.out.println("Masukkan jenis kelamin: \n1. Pria \n2. Wanita ");
								pegawai.setPilJenisKelamin(input.nextLine());
		                    }

		                        if (pegawai.getPilJenisKelamin().equals("1") || pegawai.getPilJenisKelamin().equalsIgnoreCase("pria")) {
		                            pegawai.setJenisKelamin("Pria");
		                        }
		                        else if (pegawai.getPilJenisKelamin().equals("2") || pegawai.getPilJenisKelamin().equalsIgnoreCase("wanita")) {
		                        	pegawai.setJenisKelamin("Wanita");
		                        }

		                        break;
		                                
		                case 4 : // INPUT GOLONGAN DAN KODE GOLONGAN
		                	boolean inputGolongan = false;
							String pilGolongan = "";

							while (inputGolongan == false) {
								System.out.print("Masukkan golongan (1-4) : "); pegawai.setGolongan(angka.nextInt());
								
								if (String.valueOf(pegawai.getGolongan()).matches("[ ]*") && String.valueOf(pegawai.getGolongan()).length() == 1) {
									System.out.println("Anda belum mengisi pilihan golongan.");	
								} else if (String.valueOf(pegawai.getGolongan()).length() == 0) {
									System.out.println("Anda belum mengisi pilihan golongan.");
								} else if (String.valueOf(pegawai.getGolongan()).matches("[1-4]*") && String.valueOf(pegawai.getGolongan()).length() == 1) {
									pegawai.setGolongan(Integer.valueOf(pegawai.getGolongan()));

									inputGolongan = true;
								} else {
									System.out.println("Anda hanya dapat memasukkan pilihan 1 - 4.");
								}
							} 

		                    System.out.print("Masukkan kode golongan (A - E) tanpa simbol atau angka: ");
		                    pegawai.setKodeGolongan(input.nextLine());

		                    while ( !(pegawai.getKodeGolongan().length() == 1)){
		                    	System.out.print("Masukkan hanya 1 digit Golongan dan 1 digit Kode Golongan : ");
		                    	pegawai.setKodeGolongan(input.nextLine());
		                    }

		                    while ( !(pegawai.getKodeGolongan().matches("[A-E]*")) ) {
		                    System.out.print("Masukkan kode golongan harus (A - E): ");
		                    pegawai.setKodeGolongan(input.nextLine());
		                    }

		                    while ( pegawai.getGolongan() != 4 && pegawai.getKodeGolongan().equalsIgnoreCase("E") ) {
		                    System.out.print("Tidak ada kode golongan E pada golongan 1 - 3\n");
		                    System.out.print("Masukkan kode golongan harus (A - D): ");
		                    pegawai.setKodeGolongan(input.nextLine());       
		                    }
		                    break;
						                
		                case 5 : // INPUT MASA KERJA
		                    System.out.print("Masukkan Masa Kerja (dalam tahun): ");
		                    pegawai.setMasaKerja(angka.nextInt());
		                    
		                    while ( pegawai.getMasaKerja() <= 2 && (pegawai.getGolongan() == 1 || pegawai.getGolongan() == 2) && pegawai.getKodeGolongan().matches("[B-D]*") ) {
		                    System.out.print("Masa Kerja Tidak tersedia dalam golongan " + pegawai.getGolongan() + pegawai.getKodeGolongan() + "\n");
		                    System.out.print("Masukkan Masa Kerja (dalam tahun): ");
		                    pegawai.setMasaKerja(angka.nextInt());                                               
		                    }
		                    break;

						case 6 : // STATUS KAWIN
							System.out.println("\n1. Belum Kawin");
							System.out.println("2. Kawin");
							System.out.println("3. Cerai");
							System.out.print("Masukkan pilihan : "); pegawai.setPilKawin(input.nextLine());
		                      
		                    while ( !(pegawai.getPilKawin().length() > 0 && (pegawai.getPilKawin().equals("1") || pegawai.getPilKawin().equals("2") || pegawai.getPilKawin().equals("3") || pegawai.getPilKawin().equalsIgnoreCase("belum kawin") || pegawai.getPilKawin().equalsIgnoreCase("kawin") || pegawai.getPilKawin().equalsIgnoreCase("cerai")))) {
		                    	if (pegawai.getPilKawin().matches("[\\W]*") ) { //SELAIN ANGKA DAN HURUF
		                    		System.out.println("Anda belum memilih pilihan ");
		                    	}
		                    	
		                    	else{
		                    		System.out.println("Inputan anda salah ");

		                    	}
								
								System.out.println("Masukkan status kawin: \n1. Belum Kawin \n2. Kawin \n3. Cerai ");
								pegawai.setPilKawin(input.nextLine());
		                    }

		                        if (pegawai.getPilKawin().equals("1") || pegawai.getPilKawin().equalsIgnoreCase("belum kawin")) {
		                            pegawai.setStatusKawin("Belum Kawin");
		                        }
		                        else if (pegawai.getPilKawin().equals("2") || pegawai.getPilKawin().equalsIgnoreCase("kawin")) {
		                        	pegawai.setStatusKawin("Kawin");
		                        }
		                        else if (pegawai.getPilKawin().equals("3") || pegawai.getPilKawin().equalsIgnoreCase("Cerai")) {
		                        	pegawai.setStatusKawin("Cerai");
		                        }
							
							// BANYAK ANAK
							String banyakAnak = "0";
							
								System.out.print("Masukkan jumlah anak : "); pegawai.setBanyakAnak(input.nextLine());
								while (!(pegawai.getBanyakAnak().matches("[0-9]*") && pegawai.getBanyakAnak().length() > 0)) {
									if (pegawai.getBanyakAnak().matches("[\\W]*") ){ //\\W untuk inputan selain angka dan huruf
										System.out.println("Anda belum memasukkan banyak Anak ");
									}
									else { 
										System.out.println("Inputan mengandung huruf atau simbol");
										}
									
									System.out.println("\nMasukkan angka.\n");
									System.out.print("Masukkan jumlah anak : "); pegawai.setBanyakAnak(input.nextLine());
								}		

							pegawai.setJumlahAnak(Integer.valueOf(pegawai.getBanyakAnak()));			

							break;

						case 7 : // JENIS PNS
		         		System.out.println("Pilih jenis PNS:");
							System.out.println("1. Pejabat");
							System.out.println("2. Pelayan Masyarakat");
							System.out.println("3. Lainnya");
							System.out.println("Masukkan pilihan : "); pegawai.setPilPNS(input.nextLine());

							while (pegawai.getPilPNS().matches("[\\W]*") ){ //\\W untuk inputan selain angka dan huruf
										System.out.println("Anda belum menginput pilihan ");
										System.out.println("Masukkan pilihan : "); pegawai.setPilPNS(input.nextLine());
									}

							while (!(pegawai.getPilPNS().matches("[0-9]*"))) {
								System.out.println("\nMasukkan angka.\n");
								System.out.println("1. Pejabat");
								System.out.println("2. Pelayan Masyarakat");
								System.out.println("3. Lainnya");
								System.out.println("Masukkan pilihan : "); pegawai.setPilPNS(input.nextLine());
							}

							while (!(Integer.valueOf(pegawai.getPilPNS()) >= 1 && Integer.valueOf(pegawai.getPilPNS()) <= 3)) {
								System.out.println("\nMasukkan pilihan 1-3.\n");
								System.out.println("1. Pejabat");
								System.out.println("2. Pelayan Masyarakat");
								System.out.println("3. Lainnya");
								System.out.println("Masukkan pilihan : "); pegawai.setPilPNS(input.nextLine());
							}

							if (Integer.valueOf(pegawai.getPilPNS()) == 1) {
								pegawai.setJenisPNS("Pejabat");
							} else if (Integer.valueOf(pegawai.getPilPNS()) == 2) {
								pegawai.setJenisPNS("Pelayan Masyarakat");
							} else {
								pegawai.setJenisPNS("Lainnya");
							}
							

		                    break;
		                    
						case 8 : // TUNJANGAN LAINNYA
			                System.out.print("Nama tunjangan lainnya : ");
			                pegawai.setNamaTunjanganLainnya(input.nextLine());
			                System.out.print("Besar tunjangan lainnya : "); 
			                pegawai.setTunjanganLainnya(input.next());
			                
		                    while ( !(pegawai.getTunjanganLainnya().matches("[0-9]*")) ) {
		                    System.out.println("\nBesar tunjangan harus berupa angka.");
		                    System.out.print("Besar tunjangan lainnya : "); pegawai.setTunjanganLainnya(input.next());
		                    }
		                    
		                    pegawai.setBesarTunjanganLainnya(Integer.valueOf(pegawai.getTunjanganLainnya()));

		                    break;

		                case 9 :
		                	
		                	System.out.println(pegawai.toString());

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
