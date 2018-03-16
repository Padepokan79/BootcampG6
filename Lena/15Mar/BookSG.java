package exercise53;

public class BookSG extends GoodsSGA implements Taxable{
	private String author;
	
	public BookSG() {
		// TODO Auto-generated constructor stub
	}
	
	BookSG(String des, double pr, int quant, String author){
		super(des, pr, quant);
		this.author = author;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" author: "+author;
	}
	
	public double calculateTax(){
		return getPrice() * taxRate ;
	}
	
	public void display() {
		System.out.println(toString()+"\nTax is: "+calculateTax());
	}
}
