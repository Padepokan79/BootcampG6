public class ArrayIntro{
	public static void main(String[] args) {
		String[] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
		int[] nomberCantik = { 2899, 7892, 5070, 3392, 1515, 1130 };

	for (String p : planets ) {
		System.out.println(p + "\t" + p.toUpperCase());	
	}

	for (int a : nomberCantik) {
		System.out.println("Nomber Cantik = " +a);
	}

	}
}