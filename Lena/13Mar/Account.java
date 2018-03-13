package bankAccount;

public class Account {
	private int accountNo;
	private double balance = 0.0;
	private double depositAwal = 500000;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accountNo, double balance) {
		this.accountNo =accountNo;
		this.balance = balance;
	}
	
	public Account(int accountNo) {
		this.accountNo =accountNo;
		this.balance = depositAwal;
	}
	
	public int getAccountNo() {
		accountNo = (int) (Math.random()*1000000000);
		return accountNo;
	}
	
	public double getDepositAwal() {
		return depositAwal;
	}
	
	public void credit(double amount) {
		balance = balance+amount;
	}
	
	public void debit(double amount) {
		balance = balance-amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A/C no: "+accountNo+"\nBalance: Rp. "+getBalance();
	}
}
