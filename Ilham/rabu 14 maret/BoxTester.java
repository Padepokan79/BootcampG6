
public class BoxTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(2.5, 5.0, 6.0);
		
		System.out.println("Area: " + box.area() + " volume: " + box.volume());
		System.out.println("Length: " + box.getLength() + " height: " + box.getHeight() + " width: " + box.getWidth());
		
		Box box2 = new Box(box.biggerBox(box));

		System.out.println("Area: " + box2.area() + " volume: " + box2.volume());
		System.out.println("Length: " + box2.getLength() + " height: " + box2.getHeight() + " width: " + box2.getWidth());
		
		Box box3 = new Box(box.smallerBox(box));

		System.out.println("Area: " + box3.area() + " volume: " + box3.volume());
		System.out.println("Length: " + box3.getLength() + " height: " + box3.getHeight() + " width: " + box3.getWidth());
		
	}

}
