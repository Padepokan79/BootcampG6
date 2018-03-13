
public class Acount {
	private final double DEFBALANCE = 500000;
	private double balance;
	private int acountNumber;
	double amount;
	
	Acount (){
		balance = DEFBALANCE;
		this.acountNumber = 999 + (int) (Math.random()*999999999);
	}
	
	Acount (double balance){
		this.balance = balance;
		this.acountNumber = 999 + (int) (Math.random()*999999999);
	}
	
	int getacountNumber() {
		return acountNumber;
	}
	double getbalance() {
		return balance;
	}
	
	void credit (double amount) {
		balance = balance + amount;
	}
	void debit (double amount) {
		if (amount > balance ) {
			System.out.println("Maaf saldo tidak mencukupi" + balance);
		}
		else {
			balance = balance - amount;
		}
	}
	public String toString() {
		return "A/C no : " + acountNumber + ", Saldo Rp." + balance;
	}
	
}
