package main;

public class Jam {
	// Instances Variables
	String contents;
	String date;
	int capacity;
	
	// Constructors
	public Jam(String contents, String date, int size) {
		// TODO Auto-generated constructor stub
		this.contents = contents;
		this.date = date;
		capacity = size;
	}
	
	// Methods
	// check if the jar is empty
	public boolean empty() {
		return (capacity == 0);
	}
	
	// remove some jam --- spread an amount of it on toast
	public void spread(int fluidOz) {
		if (!empty()) {
			if (fluidOz <= capacity) {
				System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
				
				capacity = capacity - fluidOz;
			} else {
				System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
				
				capacity = 0;
			}
		} else {
			System.out.println("No jam in the Jar!");
		}
	}
	
	// print info about the jar
	public void print() {
		System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
	}
}
