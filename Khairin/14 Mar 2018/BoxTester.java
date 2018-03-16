
public class BoxTester {

	public static void main(String[] args) {
		Box box = new Box(2.5,5.0,6.0);
		Box box2 = new Box(3.0,  2.5, 4.0);
		Box box3 = new Box(5.0);
		Box box4 = new Box(box2.biggerBox(box2));
		
		//EXERCISE 1
		System.out.println("Area: " + box.area() + " volume: " + box.volume());
		System.out.println("length: " + box.getLength() + " height: " + box.getHeight() + " width: " + box.getWidth() );
	
		//EXERCISE 2
		System.out.println("\nArea: " + box2.area() + " volume: " + box2.volume());
		System.out.println("Top Area: " + box2.getTopArea() + " Face Area: " + box2.getFaceArea() + " Side Area: " + box2.getSideArea());
	
		//EXERCISE 3
		System.out.println("\nArea: " + box3.area() + " volume: " + box3.volume());
		System.out.println("Side: " + box3.getLength());
		
		//EXERCISE 4
		System.out.println("\nArea: " + box4.area() + " volume: " + box4.volume() );
		System.out.println("25% larger box:");
		System.out.println("Side: " + box4.getLength());
	}

}
