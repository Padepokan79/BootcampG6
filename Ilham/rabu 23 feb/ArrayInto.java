// Ilham galang 23 02 2018
public class ArrayInto {
	public static void main(String[] args) {
		String[] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
		int[] nilai = {7,8,9,8,7,9,6,5};

		for (String p : planets) {
			System.out.println(p + "\t" + p.toUpperCase());	
		}
		for (int n : nilai) {
			System.out.println("Nilai : " + n);
		}
	}
}