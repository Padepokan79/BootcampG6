package main;

public class Circle {
	
	public final double PHI = 3.14;
	private final double RADIUS = 8.0;
	private final String COLOR = "Blue";
	
	private double radius;
	private String color;
	
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
	
	public String toString() {
		return "\nYour Circle is " + color + " with " + radius + " Radius.";
	}
	
	public double getArea() {
		return radius * radius * PHI;
	}
	
	public double getCircumference() {
		return radius * 2 * PHI;
	}
	
	Circle (double radius) {
		this.radius = radius;
		color = COLOR;
	}
	
	Circle (double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	Circle () {
		radius = RADIUS;
		color = COLOR;
	}
	
}
