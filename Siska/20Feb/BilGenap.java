public class BilGenap{
	public static void main (String []args){
	

	System.out.println ("Bilangan Genap 1-20 adalah ");
	for (int bil = 2; bil <= 20; bil = bil + 2) {
	System.out.println (bil);
	}

	System.out.println ("\nBilangan Ganjil 20-40 adalah ");
	for (int bi = 21; bi <= 40; bi = bi + 2) {
	System.out.println (bi);
	}
	
	System.out.println ("\nBilangan habis dibagi 3 dan habis dibagi 5. 30-90 adalah ");
	for (int bi = 30; bi <= 90; bi++) {
		if (bi % 3  == 0 && bi % 5 == 0 )
	System.out.println (bi);
	}
	}
}