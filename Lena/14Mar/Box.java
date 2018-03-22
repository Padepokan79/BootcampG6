package exercise33;

public class Box {
	private double width, height, length;
	
	public Box() {
		// TODO Auto-generated constructor stub
	}
	public Box(double side) {
		this.width=side;
		this.height=side;
		this.length=side;
	}
	public Box(double width, double height, double length) {
		this.width=width;
		this.height=height;
		this.length=length;
	}
	public Box(Box oldBox) {
		this.width=oldBox.width;
		this.length=oldBox.length;
		this.height=oldBox.height;
	}
	public Box biggerBox(Box oldBox) {
		return new Box(1.25*oldBox.width, 1.25*oldBox.height, 1.25*oldBox.length);
	}
	public Box smallerBox(Box oldBox) {
		return new Box(0.75*oldBox.width, 0.75*oldBox.height, 0.75*oldBox.length);
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
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
	
	public double volume() {
		return height*width*length;
	}

	public double area() {
		return 2*(length*width+length*height+width*height);
	}

	public double topArea() {
		return length*width;
	}
	
	public double faceArea() {
		return length*height;
	}
	
	public double sideArea() {
		return width*height;
	}
	
	public double area2() {
		return 2*faceArea()+2*topArea()+2*sideArea();
	}
}
