public class PergantianNilai{
	public static void main(String[] args) {
		int a, b, c, d;

		a = 30;
		b = 12;

		c = a;
		d = b;

		b = c;
		a = d;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}