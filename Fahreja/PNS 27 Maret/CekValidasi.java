
//author fahreja 27 maret 2017
public class CekValidasi {
	String golongan;
	boolean key = false;
	boolean isKey() {
		return key = true;
	}
	
	//Method untuk validasi inputan berupa huruf
	void huruf(String inputanHuruf) {
		key = false;
		if (inputanHuruf.matches("^[\\S].*")){
			if(inputanHuruf.matches("[A-Za-z.,\\s]*") ){
				isKey();
			}else{
				System.out.println("Inputan mengandung angka/Simbol!");
			}
		}else{
			System.out.println("Tidak boleh di awali spasi");
		}
	}
	
	//Method untuk validasi inputan berupa angka
	void angka(String inputanAngka) {
		key = false;
		if (inputanAngka.length() != 0) {
			if (inputanAngka.matches("[\\S]*")) {
				if (inputanAngka.matches("[A-Za-z0-9]*")) {
					if(inputanAngka.matches("[0-9]*")){
						isKey();
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
	
	//Method validasi yang hanya ada pada pengambilan inputan nip
	void nip(String nip) {
		if (key) {
			key = false;
			if(nip.length() >= 12){
				if (nip.length() <= 18) {
					isKey();	
				}else{
					System.out.println("Inputan lebih dari 18 angka!");
				}
			}else{
				System.out.println("Inputan kurang dari 12 angka!");
			}
		}
			
	}
	
	//Method validasi yang hanya ada pada pengambilan inputan nama
	void nama(String nama) {
		if (key) {
			key = false;
			if (nama.trim().length()<=50) {
					isKey();
			}else{
				System.out.println("Inputan lebih dari 50 karakter!");
			}
		}
	}
	
	//Method validasi yang hanya ada pada pengambilan inputan gender
	void gender(String gender) {
		if (key) {
			key = false;
			if(gender.equalsIgnoreCase("pria") || gender.equalsIgnoreCase("wanita")){
				isKey();	
			}else{
				System.out.println("Masukan Pria atau Wanita!");
			}
		}
			
	}
	
	//Method validasi yang hanya ada pada pengambilan inputan golongan
	void golongan(String golongan) {
		key = false;
		this.golongan = golongan;
		if (golongan.length() !=0) {
			if(golongan.matches("[1-4]*[A-Ea-e]")){
				if(golongan.matches("[\\S]*")){
					if(!golongan.matches("[1-3]*[E]*")){
						isKey();
					}else {
						System.out.println("Tidak ada kode golongan E di golongan 1-3");
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
	public String getGolongan() {
		return golongan;
	}
	
	//Method validasi yang hanya ada pada pengambilan inputan masa kerja
	void masaKerja(String masaKerja) {
		if (key) {
			key = false;
			if(Integer.parseInt(masaKerja) < 3 && getGolongan().matches("[1-2B-D]*")){
				System.out.println("Masa kerja minimal 3 tahun pada golongan 1B/1C/1D dan 2B/2C/2D");
			}else {
				isKey();
			}
		}
		
	}
	
	//Method validasi yang hanya ada pada pengambilan inputan status nikah
	void statusNikah(String statusNikah) {
		if (key) {
			key = false;
			if (Integer.parseInt(statusNikah) < 3 && Integer.parseInt(statusNikah)>= 1) {
				isKey();		
			}else{
				System.out.println("Hanya bisa mengisi inputan dari 1-3!");	
			}	
		}		
	}
	//Method validasi yang hanya ada pada pengambilan inputan jumlah anak
	void jumlahAnak(String jumlahAnak) {
		if (key) {
			key = false;
			if (Integer.parseInt(jumlahAnak) < 10) {
				isKey();
			}else{
				System.out.println("Masukan jumlah anak yang realistis!");
			}
		}			
	}
	
	//Method validasi yang hanya ada pada pengambilan inputan jenis pns
	void jenisPNS(String jenisPNS) {
		if (key) {
			key = false;
			if (Integer.parseInt(jenisPNS) < 3 && Integer.parseInt(jenisPNS) >= 1) {
				isKey();
			}else{
				System.out.println("Masukan Inputan 1/2/3");
			}
		}			
	}
	
	//Method validasi yang hanya ada pada pengambilan inputan tunjangan lainnya
	void tunjanganLain(String tunjanganLain) {
		if (key) {
			key = false;
			if (Integer.parseInt(tunjanganLain) < 3 && Integer.parseInt(tunjanganLain)>= 1) {
				isKey();		
			}else{
				System.out.println("Hanya bisa mengisi inputan dari 1.Ya/2.Tidak!");	
			}
		}
		
	}
	
}
