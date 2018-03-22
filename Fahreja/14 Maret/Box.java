
public class Box {
	private double width, height, length, side;
	
	public Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}
	public Box(double side) {
		this.width = side;
		this.length = side;
		this.height = side;
	}
	
	public Box(Box Box) {
		this.width = Box.width;
		this.length = Box.length;
		this.height = Box.height; 
	}
	
	double volume() {
		return length * width * height;
	}
	double area() {
		return 2*faceArea()+ 2*topArea()+ 2*sideArea();
	}
	
	private double topArea() {
		return length*height;
	}
	
	private double faceArea() {
		return width*height;
	}
	
	private double sideArea() {
		return length*width;
	}
	
	public double getHeight() {
		return height;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	public double getSide() {
		return side;
	}
	public double getTopArea() {
		return topArea();
	}
	
	public Box biggerBox(Box Box) {
		return new Box (1.25*Box.width, 1.25*Box.height, 1.25*Box.length);
	}
		
}
