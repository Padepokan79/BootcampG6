import java.util.Scanner;

public class TestCircle {
	public static void main(String[] args) {
		Scanner nilai = new Scanner(System.in);
		Circle bulat = new Circle();
		int pilih;
		do {
			System.out.println("Simple Circle \n");
			System.out.println("1. Default Circle.");
			System.out.println("2. Circle with Radius");
			System.out.println("3. Circle with Radius and Color");
			System.out.println("0. Exit");
			System.out.print(">");
			pilih = nilai.nextInt();
			
			if (pilih == 1) {
				System.out.println(bulat.toStringSatu());
				System.out.println("");
				
			}else if (pilih == 2) {
				System.out.println("Input radius : ");
				bulat.setRadius(nilai.nextDouble());
				System.out.println(bulat.toStringDua());
				System.out.println("Area : "+bulat.getArea());
				System.out.println("Circum Ference : "+bulat.getCircumference());
				System.out.println("");
				
			}else if (pilih == 3) {
				System.out.println("Input radius :");
				bulat.setRadius(nilai.nextDouble());
				System.out.println("Input Color : ");
				bulat.setColor(nilai.next());
				System.out.println(bulat.toStringTiga());
				System.out.println("Area : "+bulat.getArea());
				System.out.println("Circum Ference : "+bulat.getCircumference());
				System.out.println("");
				
			}else {
				System.out.println("WRONG WRONG WRONG");
			}
		}while(pilih !=0);
	}
}
