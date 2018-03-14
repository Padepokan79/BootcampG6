package eclipse;

public class Account {
	String nama, iD;
	double deposit, tambah, kurang;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	void dep (double dep) {
		deposit = dep;
	}
	
	double deposit () {
		return deposit;
	}
	
	void tambah (double add) {
		tambah = add;
	}
	
	double tambah () {
		return tambah;
	}
	
	void kurang(double less) {
		kurang = less;
	}
	
	double kurang () {
		return kurang;
	}
	
	double tambahSaldo () {
		return deposit = deposit + tambah;
	}
	
	double kurangSaldo () {
		return deposit = deposit - kurang;
	}
	
	void akunBaru() {
		System.out.println("Selamat Datang " + nama);
		System.out.println("Nomor akun Anda adalah " + iD + " Atas Nama " + nama + ", Dengan saldo sebesar: " + deposit );
	}
	
}
