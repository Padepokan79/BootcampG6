package main;

public class BoxTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Box box = new Box(2.5, 5.0, 6.0);
		Box box2 = new Box(4.0);
		Box box3 = new Box(box2);
		Box box4 = new Box(box2.biggerBox(box2));

		// box
	    System.out.println("Area: "  + box.area() + " volume: " + box.volume());
	    System.out.println("topArea: " + box.topArea());
	    System.out.println("Height : " + box.height());
	    System.out.println("Width : " + box.width());
	    System.out.println("Length : " + box.length());
	    
	    // box3
	    System.out.println("Area: "  + box3.area() + " volume: " + box3.volume());
	    System.out.println("Height : " + box3.height());
	    System.out.println("Width : " + box3.width());
	    System.out.println("Length : " + box3.length());
	    
	    // box4
	    System.out.println("Area: "  + box4.area() + " volume: " + box4.volume());
	    System.out.println("Height : " + box4.height());
	    System.out.println("Width : " + box4.width());
	    System.out.println("Length : " + box4.length());
	    
	}

}
