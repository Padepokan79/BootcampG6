package exercise35;

public class Jam {
	private String contents, date;
	private int capacity;
	
	public Jam() {
		// TODO Auto-generated constructor stub
	}
	public Jam(String contents, String date, int size) {
		this.contents = contents;
		this.date = date;
		capacity = size;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public int getCapacity() {
		return capacity;
	}
	public String getContents() {
		return contents;
	}
	
	public boolean empty() {
		return (capacity == 0);
	}
	
	public void spread ( int amount) {
		if(!empty()) {
			System.out.println("Spreading "+amount+" fluid ounces of "+ contents);
			if(amount <= capacity) {
				capacity = capacity - amount;
			}
			else {
				capacity = 0;
			}
		}
		else {
			System.out.println("No jam in the Jar!");
		}
	}
	
	public void print() {
		System.out.println(contents+"  "+date+"  "+capacity+" fl. oz.");
	}
}
