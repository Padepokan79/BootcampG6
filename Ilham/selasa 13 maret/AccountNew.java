
public class AccountNew {
	private final int BALANCEDEFAULT = 500000;
	private int balance;
	private int accountNumber;
	
	public AccountNew() {
		this.balance = this.BALANCEDEFAULT;
		this.accountNumber = 999 + (int)(Math.random()*999999999);
	}
	
	public AccountNew(int balance) {
		this.balance = balance;
		this.accountNumber = 999 + (int)(Math.random()*999999999);
	}
	
	public String toString() {
		return "Your Account Number " + accountNumber + "\nBalance is " + balance;
	}
	
	public int getAccountNumber() {
		return getAccountNumber();
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void cekSaldo() {
		System.out.println("Saldo Anda sekarang sebesar Rp. " + balance);
	}
	
	public void credit(int besarUang) {
		balance += besarUang;
		System.out.println("Selamat Uang sebesar Rp. " + besarUang + " telah ditambahkan");
		cekSaldo();
	}
	
	public void deposit(int besarUang) {
		if	(besarUang > balance) {
			System.out.println("Deposit kurang.");
			cekSaldo();
		}
		else {
			balance -= besarUang;
			System.out.println("Selamat Uang sebesar Rp. " + besarUang + " telah diambil");
			cekSaldo();
		}
	}

}
