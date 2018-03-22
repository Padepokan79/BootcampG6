package progExercises33;
public class BoxTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(2.5, 5.0, 6.0);
		
		System.out.println("Area: " + box.area() + " volume: " + box.volume());
		System.out.println("topArea: " + box.topArea());
		System.out.println("length: " + box.getLength() + " height: " + box.getHeight() + " width: " + box.getWidth());
		
		Box bigBox = box.biggerBox(box);
		System.out.println("Area: " + bigBox.area() + " volume: " + bigBox.volume());
		System.out.println(box.nests(bigBox));
	}

}
