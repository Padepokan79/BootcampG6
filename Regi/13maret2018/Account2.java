
public class Account2 {
	public final double DEF_BALANCE = 500000;
	
	private double balance;
	private int accountNumber;
	
	double amount;
	int depositPertama;
	
	public Account2() {
		this.balance = DEF_BALANCE;
		this.accountNumber = 0 + (int) (Math.random()*999999999);
	}
	
	public Account2(double balance) {
		this.balance = balance;
		this.accountNumber = 0 + (int) (Math.random()*999999999);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public String toString() {
		return "\nSelamat Datang\nAkun anda adalah " + accountNumber + " Dengan Saldo Sebesar Rp. " + balance;
	}
	
	double menabung() {
		return balance = balance + amount;
	}
	
	double mengambil() {
		return balance = balance - amount;
	}
	
}
