
public class Account {
	int deposit;
	String nama, identitas;
	
	Account() {
		
	}
	
	void cekSaldo() {
		System.out.println("Saldo Anda sekarang sebesar Rp. " + deposit);
	}
	
	void menabung(int besarUang) {
		deposit += besarUang;
		System.out.println("Selamat Uang sebesar Rp. " + besarUang + " telah ditambahkan");
		cekSaldo();
	}
	
	void mengambil(int besarUang) {
		if	(besarUang > deposit) {
			System.out.println("Deposit kurang.");
			cekSaldo();
		}
		else {
			deposit -= besarUang;
			System.out.println("Selamat Uang sebesar Rp. " + besarUang + " telah diambil");
			cekSaldo();
		}
	}
}
