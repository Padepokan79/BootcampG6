
public class Circle {
	final double RADIUS = 8.0;
	final String COLOR = "Blue";
	
	private double radius = RADIUS;
	private String color = COLOR;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color; 
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	private double luas () {
		return Math.PI*(getRadius()*getRadius());
	}
	
	private double keliling() {
		return Math.PI*2*getRadius();
	}
	
	public String toStringSatu() {
		return "Your Circle is " + COLOR + " with radius " + RADIUS + "\nArea: " + luas() + "\nCircumference: " + keliling() + "\n";	
	}
	
	public String toStringDua() {
		return "Your Circle is " + COLOR + " with radius " + getRadius() + "\nArea: " + luas() + "\nCircumference: " + keliling() + "\n";
	}
	
	public String toStringTiga() {
		return "Your Circle is " + getColor() + " with radius " + getRadius() + "\nArea: " + luas() + "\nCircumference: " + keliling() + "\n";
	}
	
	

}
