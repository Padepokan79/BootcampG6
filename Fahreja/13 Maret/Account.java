import java.util.Random;

public class Account {
	Random angka = new Random();
	private double balance;
	private int noAkun;
	double credit,debit,deposit;
	
	public Account() {
	}
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double balanceDefault() {
		return balance = 500000;
	}
	public double balancePlatinum() {
		return balance = deposit;
	}
	
	public double getBalance () {
		return balance;
	}
	
	public int getAccountNomber() {
		return noAkun = angka.nextInt(145693829);
	}
	
	public void credit(double credit) {
		this.credit = credit;
	}
	public void debit (double debit) {
		this.debit=debit;
	}
	public void deposit(double deposit) {
		this.deposit = deposit;
	}
	
	public double tabung() {
		return balance =  balance + credit;
	}
	
	public double tarik() {
		if (debit <= balance) {
			System.out.println("Selamat penarikan berhasil");
			return balance = balance - debit;
		}else {
			System.out.println("Maaf sisa saldo kurang dari uang yang ingin anda ambil ");
			return balance;
		}
	}
	public String ketAkun() {
		return "\nSelamat Pembuatan akun Berhasil \nA/C : "+noAkun+" Balance : "+balance;
	}
	
}
