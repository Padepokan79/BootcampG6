
public class Box {
	private double width, height, length, side;
	
	public Box(double width, double height, double length) {
		this.width=width;
		this.height=height;
		this.length=length;
	}
	
	public Box(double side) {
		this.width=side;
		this.height=side;
		this.length=side;
	}
	
	//EXERCISE 3
	public Box(Box oldBox) { //Tipe data Box (double) dan parameter side dari constructor Box
		this.width=oldBox.width;
		this.height=oldBox.height;
		this.length=oldBox.length;
	}
	
	//EXERCISE 1
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	double getLength() {
		return length;
	}
	
	double getSide() {
		return side;
	}
	
	double area() {
		return 2*(width*length+width*height+length*height);
	}
	
	double volume() {
		return width*height*length; 
	}
	
	//EXERCISE 2
	private double faceArea() {
		return width*length;
	}
	private double topArea() {
		return width*height;
	}
	private double sideArea() {
		return length*height;
	}
	
	public double getFaceArea() {
		return faceArea();
	}
	public double getTopArea() {
		return topArea();
	}
	public double getSideArea() {
		return sideArea();
	}
	
	double areaTwo() {
		return 2*faceArea() + 2*topArea() + 2*sideArea();
	}
	
	//EXERCISE 4
	public Box biggerBox(Box oldBox) {
		return new Box(1.25*oldBox.getWidth() + 1.25*oldBox.getHeight() + 1.25*getLength());
	}
	
	public Box smallerBox(Box oldBox) {
		return new Box(0.75*oldBox.getWidth() + 0.75*oldBox.getHeight() + 0.75*oldBox.getLength());
	}
	
	
}
