
public class RotiKartikaSari {
	String namaRoti, rasa, warna, texture, ukuran;
	int harga;
	
	RotiKartikaSari() {
		
	}
	
	RotiKartikaSari(String namaRotiInput, String rasaInput, int hargaInput, String warnaInput, String textureInput, String ukuranInput) {
		namaRoti = namaRotiInput;
		rasa = rasaInput;
		harga = hargaInput;
		warna = warnaInput;
		texture = textureInput;
		ukuran = ukuranInput;
	}
	
	void tambahRoti(String namaRotiInput, String rasaInput, int hargaInput, String warnaInput, String textureInput, String ukuranInput) {
		namaRoti = namaRotiInput;
		rasa = rasaInput;
		harga = hargaInput;
		warna = warnaInput;
		texture = textureInput;
		ukuran = ukuranInput;
	}
	
	void tampilRoti() {
		System.out.println("Nama\t:" + namaRoti);
		System.out.println("Rasa\t:" + rasa);
		System.out.println("Harga\t:" + harga);
		System.out.println("Warna\t:" + warna);
		System.out.println("Texture\t:" + texture);
		System.out.println("Ukuran\t:" + ukuran);
		System.out.println();
	}

	
	
}
