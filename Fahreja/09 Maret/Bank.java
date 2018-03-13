
public class Bank {
	String nama;
	int saldo = 0,noIden, tabung,kurang;
	void depositA(int da,String nm,int nomber) {
		saldo = da;
		noIden = nomber;
		nama = nm;
	}
	void tambahDepo(int tb) {
		tabung = tb;
		saldo = saldo + tb;
	}
	void withDraw(int wd) {
		kurang = wd;
		saldo = saldo - wd;
	}
	void cekSaldo() {
		System.out.println("Sisa saldo anda Sebesar Rp."+saldo);
	}
	void tampilAwal() {
		System.out.println("Selamat datang "+nama);
		System.out.println("Akun Anda Adalah "+ noIden+ " a/n "+nama+" Dengan Saldo Sebesar Rp."+saldo);
	}
	void tampilDepo() {
		System.out.println("Sisa saldo anda sebesar Rp."+saldo);
	}
	void tambah() {
		System.out.println("Selamat uang sebesar Rp."+tabung+" telah ditambahkan");
	}
	void tarik() {
		System.out.println("Uang sebesar Rp."+kurang+" berhasil di tarik");
	}
}
