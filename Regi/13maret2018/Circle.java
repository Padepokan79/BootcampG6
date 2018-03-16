
public class Circle {  
   public final double DEF_RADIUS = 8;
   public final String DEF_COLOR  = "Blue";
   
   private double radius;
   private String color;
   
   public Circle() {
      this.radius = DEF_RADIUS;
      this.color  = DEF_COLOR;
   }
   
   public Circle(double radius) {
      this.radius = radius;
      this.color = DEF_COLOR;
   }
   
   public Circle(double radius, String color) {
      this.radius = radius;
      this.color = color;
   }
   
   public double getRadius() {
      return this.radius;
   }
   
   public void setRadius(double radius) {
      this.radius = radius;
   }
   
   public String getColor() {
      return this.color;
   }
   
   public void setColor(String color) {
      this.color = color;
   }
 
   public String toString() {
      return "\nCircle [radius = " + radius + ", color = " + color + ", area = " + getArea() + ", circumference = " + getCircumference() + "]";
   }
 
   public double getArea() {
      return radius * radius * Math.PI;
   }
 
   public double getCircumference() {
      return 2 * radius * Math.PI;
   }
}