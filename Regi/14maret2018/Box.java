package progExercises33;

public class Box {
	
	// Instance Variables
	private double width;
	private double height;
	private double length;
	
	// Constructors
	Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	Box(double side) {
		width = side;
		height = side;
		length = side;
	}
	
	Box(Box oldBox) {
		this.width = oldBox.width;
		this.height = oldBox.height;
		this.length = oldBox.length;
	}
	
	// Methods
	double volume() {
		return getWidth() * getHeight() * getLength();
	}

	double area() {
		return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
	}
	
	public double faceArea() {
		return getWidth() * getHeight();
	}
	
	public double topArea() {
		return getWidth() * getLength();
	}
	
	public double sideArea() {
		return getLength() * getHeight();
	}

	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public Box biggerBox(Box oldBox) {
		return new Box(1.25 * oldBox.getWidth(), 1.25 * oldBox.getHeight(), 1.25 * oldBox.getLength());
	}
	
	public boolean nests(Box outsideBox) {
		return this.width <= outsideBox.width
				&& this.height <= outsideBox.height
				&& this.length <= outsideBox.length;
	}

}
	