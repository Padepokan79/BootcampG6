package simpleCircle;

public class Circle {
	private final double DEFAULT_RADIUS = 8;
	private final String DEFAULT_COLOR = "Blue";
	private final double PHI = 3.14;
	
	private double radius;
	private String color;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		setRadius(DEFAULT_RADIUS);
		setColor(DEFAULT_COLOR);
	}
	
	public Circle(double radius) {
		setRadius(radius);
		setColor(DEFAULT_COLOR);
	}
	
	public Circle(double radius, String color) {
		setRadius(radius);
		setColor(color);
	}
	
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return PHI*radius*radius;
	}
	
	public double getCircumference() {
		return PHI*radius*2;
	}
	
	public String toString() {
		return "\nradius= "+radius+"\ncolor= "+color+"\narea= "+getArea()+"\nCircumference= "+getCircumference()+"\n";
	}
	
	
}
