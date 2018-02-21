public class PergantianNilai{
	public static void main(String[] args) {

		//inisialisasi
		int a=30;
		int b=12;
		//int temp;

		System.out.println("a = "+a);
		System.out.println("b = "+b);

		//proses
		/*temp=a;
		a=b;
		b=temp;*/

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}