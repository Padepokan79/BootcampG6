import java.util.Random;


public class AccountBank {
	Random angka = new Random();
	private double balance;
	private int AccNumber;
	double deposit, credit, debit;
	
	public AccountBank() {
		
	}
	
	public AccountBank(double balance) {
		this.balance = balance;
	}
	
	public double BalanceStandar() {
		return balance = 500000;
	}
	
	public double setBalancePlatinum(double balance) {
		return this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getAccountNumber() {
		return AccNumber = angka.nextInt(563782987);
	}
	
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getCredit() {
		return credit;
	}
	
	public void setDebit(double debit) {
		this.debit = debit;
	}
	
	public double getDebit() {
		return debit;
	}
	
	
	public double tambahDeposit() {
		return balance=balance+credit;
	}
	
	public double mengambilDeposit() {
		return balance=balance-debit;
	}
	
	public String toStringAkunBaru() {
		return "Selamat Datang \nAkun anda adalah " + getAccountNumber() + ", Dengan Saldo awal sebesar Rp" + getBalance(); 
	
	}
}	
	
	
	
	
	
