public class Circle {
	final double RADIUS = 8;
	final String COLOR = "Blue";
	
	private double radius ;
	private String color ;
	
	public Circle (double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public Circle (double radius) {
		this.radius = radius;
	}
	public Circle(){
		
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	private double luas() {
		return Math.PI * radius * radius;
	}
	private double luasDefault() {
		return Math.PI * RADIUS * RADIUS;
	}
	
	private double keliling() {
		return 2*(Math.PI*radius);
	}
	private double kelilingDefault() {
		return 2*(Math.PI*RADIUS);
	}
	
	public String toStringSatu () {
		return "Your Circle is "+COLOR+" with radius "+RADIUS+"\nArea : "+luasDefault()+"\nCircum Ference : "+kelilingDefault();
	}
	public String toStringDua () {
		return "Your Circle is "+COLOR+" with radius "+radius;
	}
	public String toStringTiga () {
		return "Your Circle is "+color+" with radius "+radius;
	}
	
	public double getArea() {
		return luas();
	}
	public double getCircumference() {
		return keliling();
	}
}
