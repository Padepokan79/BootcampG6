
public class Validasi {
	boolean key = false;
	boolean isKey() {
		return key = true;
	}
	void nama(String huruf) {
		key = false;
		if (huruf.matches("[a-zA-Z].*")) {
			if (huruf.length() > 0) {
				if (huruf.length() < 33) {
					isKey();
				}else {
					System.out.println("Inputan yang anda masukan lebih dari 32");
				}
			}else{
				System.out.println("Inputan yang anda masukan kurang dari 1");
			}
		}else {
			System.out.println("Inputkan huruf");
		}
	}
	
	void nik(String angka) {
		key = false;
		if (angka.matches("[0-9].*")) {
			if (angka.length() > 0) {
				if (angka.length() < 13) {
					isKey();
				}else {
					System.out.println("Inputan yang anda masukan lebih dari 12");
				}
			}else{
				System.out.println("Inputan yang anda masukan kurang dari 1");
			}
		}else {
			System.out.println("Inputkan Angka");
		}
	}
	
	void jenis(String huruf) {
		key = false;
		if (huruf.matches("[a-zA-Z].*")) {
			if (huruf.length() > 1) {
				if (huruf.length() < 3) {
					isKey();
				}else {
					System.out.println("Masukan inisial");
				}
			}else{
				System.out.println("Inputan yang anda masukan kurang dari 2");
			}
		}else {
			System.out.println("Inputkan huruf");
		}
	}
	
	void huruf(String huruf) {
		key = false;
		if (huruf.matches("[a-zA-Z].*")) {
			isKey();
		}else {
			System.out.println("Inputkan huruf");
		}
	}
	void angka(String angka) {
		key = false;
		if (angka.matches("[0-9].*")) {
			isKey();
		}else {
			System.out.println("Inputkan Angka");
		}
	}
	void status(String angka) {
		key = false;
		if (angka.matches("[0-9].*")) {
			if (angka.length() > 0) {
				if (angka.length() < 3) {
					isKey();
				}else {
					System.out.println("Tidak ada inputan lebih dari 2");
				}
			}else{
				System.out.println("Inputan yang anda masukan kurang dari 1");
			}
		}else {
			System.out.println("Inputkan Angka");
		}
	}
}
