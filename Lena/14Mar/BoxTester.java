package exercise33;

public class BoxTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box = new Box(2.5, 5.0, 6.0);
		Box box2 = new Box(2.5, 5.0, 6.0);
		Box box3 = new Box(box2);
		Box box4 = new Box(box2.biggerBox(box2));
		Box box5 = new Box(box2.smallerBox(box2));
		
		
		System.out.println("Area: "+box.area()+" volume: "+box.volume());
		System.out.println("length: "+box.getLength()+" height: "+box.getHeight()+" width: "+box.getWidth());
	
		System.out.println("Area: "+box2.area2()+" volume: "+box2.volume());
		System.out.println("top area: "+ box2.topArea());
		
		System.out.println("Area: "+box3.area()+" volume: "+box3.volume());
		System.out.println("length: "+box3.getLength()+" height: "+box3.getHeight()+" width: "+box3.getWidth());
		
		System.out.println("Area: "+box4.area()+" volume: "+box4.volume());
		System.out.println("length: "+box4.getLength()+" height: "+box4.getHeight()+" width: "+box4.getWidth());
		
		System.out.println("Area: "+box5.area()+" volume: "+box5.volume());
		System.out.println("length: "+box5.getLength()+" height: "+box5.getHeight()+" width: "+box5.getWidth());
	}

}
