package exercise53;

public class ToySG extends GoodsSGA implements Taxable{
	private int minAge;
	
	public ToySG() {
		// TODO Auto-generated constructor stub
	}
	
	ToySG(String des, double pr, int quant, int minAge){
		super(des, pr, quant);
		this.minAge = minAge;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " minimum age: "+minAge;
	}
	
	public double calculateTax(){
		return getPrice() * taxRate ;
	}
	
	public void display() {
		System.out.println(toString()+"\nTax is: "+calculateTax());
	}
}
