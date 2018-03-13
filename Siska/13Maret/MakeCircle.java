
public class MakeCircle {
	private final double defRADIUS = 8;
	private final String defCOLOR = "Blue";
	final double pi = 3.14;
	private double radius;
	private String color;
	private double area;
	private double circumference;
	
	MakeCircle (double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	
	MakeCircle (double radius){
		this.radius = radius;
	}
	
	MakeCircle(){
		radius = defRADIUS;
		color = defCOLOR;
	}
	
	double getradius () {
		return radius;
	}
	void setradius (double radius) {
		this.radius = radius;
	}
	
	String getcolor () {
		return color;
	}
	void setcolor (String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Circle[radius=" + radius + ",color=" + color + "]";
	}
	double getarea() {
		return pi*radius*radius;
	}
	double getcircumference() {
		return 2*pi*radius;
	}
}
