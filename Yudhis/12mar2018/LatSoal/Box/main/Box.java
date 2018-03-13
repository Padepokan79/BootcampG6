package main;

public class Box {
	
	// Instances variable	
	double width, height, length;

	// Constructors
	Box (double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	Box (double side) {
		this.width = side;
		this.height = side;
		this.length = side;
	}
	
	Box (Box box) {
		this.width = box.width;
		this.height = box.height;
		this.length = box.length;
	}
	
	Box () {
		
	}
	
	// Methods
	public Box biggerBox (Box oldBox) {
		return new Box(1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.length());
	}
	
	public double length() {
		return this.length;
	}
	
	public double height() {
		return this.height;
	}
	
	public double width() {
		return this.width;
	}
	
	double volume () {
		return width() * height() * length();
	}
	
	public double faceArea () {
		return width() * height();
	}
	
	public double topArea () {
		return width() * length();
	}
	
	public double sideArea () {
		return length() * height();
	}
	
	double area () {
		return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
	}
	
}
