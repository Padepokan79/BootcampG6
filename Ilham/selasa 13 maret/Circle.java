
public class Circle {
	final double DEFAULTRADIUS = 8;
	final String DEFAULTCOLOR = "Bule";
	private double radius;
	private String color;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		this.radius = this.DEFAULTRADIUS;
		this.color = this.DEFAULTCOLOR;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.color = this.DEFAULTCOLOR;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {
		return "Your Circle is " + color + " with Radius " + radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
		
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
}
