public class SoalNo15{
	public static void main(String[] args) {
		int [] numbers = {3,-4,2,1,0,-8,-12,11,200,-34,21};

		System.out.println("15. Tampilkan hanya bilangan negatif!\n");

		System.out.println("Array numbers: ");
		for (int i : numbers ) {
			System.out.print(i+" ");
		}
		System.out.println("\nBilangan negatif array numbers");
		for(int i : numbers){
			if(i<0){
				System.out.print(i+" ");
			}
		}
	}
}