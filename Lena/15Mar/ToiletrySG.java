package exercise53;

public class ToiletrySG extends GoodsSGA implements Taxable{
	
	public ToiletrySG() {
		// TODO Auto-generated constructor stub
	}
	
	ToiletrySG(String des, double pr, int quant){
		super(des, pr, quant);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public double calculateTax(){
		return getPrice() * taxRate ;
	}
	
	public void display() {
		System.out.println(toString()+"\nTax is: "+calculateTax());
	}
}
