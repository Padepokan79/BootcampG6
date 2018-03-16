
public class TestBox {
	public static void main(String[] args) {
		Box box  = new Box(2.5,5.0,6.0);
		Box box2 = new Box(4.0);
		Box box3 = new Box(box2.biggerBox(box2));
		
		System.out.println("Area : "+box.area()+" Volume : "+box.volume());
		System.out.println("Length: "+box.getLength()+" Height : "+box.getHeight()+" Width : "+box.getWidth());
		
		System.out.println("Area : "+box2.area()+" Volume : "+box2.volume());
		System.out.println("Length: "+box2.getLength()+" Height : "+box2.getHeight()+" Width : "+box2.getWidth());
		
		
		System.out.println("Area : "+box3.area()+" Volume : "+box3.volume());
		System.out.println("Length: "+box3.getLength()+" Height : "+box3.getHeight()+" Width : "+box3.getWidth());
	}
}
