
public class Box {
	private double width, height, length, side;	
	
	public Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	public Box(Box oldBox) {
		this.width = oldBox.width;
		this.height = oldBox.height;
		this.length = oldBox.length;
	}
	
	public Box(double side) {
		this.side = side;
	}

	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getLength() {
		return length;
	}
	
	public double volume() {
		return width*height*length;
	}
	
	private double faceArea() {
		return width*height;
	}
	
	private double topArea() {
		return height*length;
	}
	
	private double sideArea() {
		return length*width;
	}
	
	public double area() {
		return 2*(faceArea())+(topArea())+(sideArea());
	}
	
	public Box biggerBox(Box oldBox) {
		return new Box(1.25 * oldBox.getWidth(),1.25 * oldBox.getHeight(), 1.25 * oldBox.getLength());
	}

	public Box smallerBox(Box oldBox) {
		return new Box(0.75 * oldBox.getWidth(), 0.75 * oldBox.getHeight(), 0.75 * oldBox.getLength());
	}
}
